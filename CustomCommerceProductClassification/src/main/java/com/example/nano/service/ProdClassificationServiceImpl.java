package com.example.nano.service;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.nano.dto.ClassNodeRequest;
import com.example.nano.dto.ClassificationRequestWrapper;
import com.example.nano.model.ClassNode;

import lombok.extern.java.Log;

/**
 * 
 * @author Jaspal Dhaliwal
 *
 */
@Service
public class ProdClassificationServiceImpl implements ProdClassificationService {

	private static final String EU_IVDR = "EU IVDR";
	private static final String EU_MDR = "EU MDR";
	private static final String EXCLUDE = "EXCLUDE";
	private static final String INCLUDE = "INCLUDE";
	private static final String RATIONALE = "rationale";
	private static final int CLASSIFICATION_ADD_ON = 5;
	private static final int CLASSIFICATION_RATIONALE_ON = 6;
	private KieContainer kieContainer = null;

	private static final String USER_NAME = "user_name";
	private static final String ACCOUNT_OWNER = "Account Owner";
	private static final String USER_EMAIL = "user_email";
	private static final String USER_ID = "user_id";
	private static final String ACCOUNT_NAME = "account_name";
	private static final String ACCOUNT_ID = "account_id";
	private static final String DEVICE_NAME = "device_name";
	private static final String CLASS_CODE = "class_code";
	private static final String CLASS_DETAILS = "class_details";
	private static final String SUBJECT = "subject";
	private static final String AMOUNT = "amount";

	//@Log
	private Logger logger;

	@Override
	public ClassNode getNode(ClassNode node) {
		KieSession kieSession = null;
		// kieContainer.newKieSession();
		kieSession.insert(node);
		kieSession.fireAllRules();
		kieSession.dispose();
		return node;
	}

	@Override
	public ClassNode getNode(ClassNodeRequest classNodeRequest) {
		return getNode(ClassNodeRequest.buildClassNode(classNodeRequest));
	}

	@Override
	public ClassNode getNode(ClassificationRequestWrapper classNodeRequestWrapper) {
		return getNode(ClassificationRequestWrapper.buildClassNode(classNodeRequestWrapper));
	}

	class ProdClassificationServiceUtil {
		private ClassNode rootNodeObject;
		private ClassNode deepMatchingNode;

		public ProdClassificationServiceUtil(ClassNode rootNodeObject) {
			this.rootNodeObject = rootNodeObject;
		}

		public ClassNode getDeepMatchingNode() {
			return deepMatchingNode;
		}

		public ClassNode processAndFilterRulesMatchingKeywords(List<String> attributes) {
			traverseMassageFilterRule(rootNodeObject, attributes);
			return deepMatchingNode;
		}

		private void traverseMassageFilterRule(ClassNode nodeObject, List<String> attributes) {

			if (!isClassificationFoundInNode(nodeObject) && nodeObject.getChildren() != null
					&& !nodeObject.getChildren().isEmpty() && deepMatchingNode == null) {

				List<ClassNode> childWithMatchingKeywords = nodeObject.getChildren().stream()
						.filter(child -> child.contains(attributes)).collect(Collectors.toList());

				if (childWithMatchingKeywords.isEmpty()) {
					deepMatchingNode = getNode((new ClassNode(nodeObject)).getQueryObject());
				} else if (!childWithMatchingKeywords.isEmpty() && childWithMatchingKeywords.size() == 1
						&& isClassificationFoundInNode(childWithMatchingKeywords.get(0))) {
					deepMatchingNode = childWithMatchingKeywords.get(0);
				} else {
					for (ClassNode clsNode : childWithMatchingKeywords) {
						ClassNode childOfChild = getNode((new ClassNode(clsNode)).getQueryObject());
						clsNode.setChildren(childOfChild.getChildren());

						if ((clsNode.getLevel() != null && !isClassificationFoundInNode(clsNode))
								&& clsNode.contains(attributes))
							traverseMassageFilterRule(clsNode, attributes);
					}
				}
			} else
				deepMatchingNode = getNode((new ClassNode(nodeObject)).getQueryObject());
		}

		private boolean isClassificationFoundInNode(ClassNode classNode) {
			return (classNode.getClassificationNotes() != null && classNode.getClassificationNotes().length() > 0
					&& classNode.getClassificationCode() != null);
		}

	}

}