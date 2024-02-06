package com.example.nano.controller;


import org.slf4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.nano.config.ResponseSchema;
import com.example.nano.config.RestEndpointConfig;
import com.example.nano.dto.ClassNodeRequest;
import com.example.nano.dto.ClassificationRequestWrapper;
import com.example.nano.model.ClassNode;
import com.example.nano.service.ProdClassificationService;
import com.example.nano.util.ResponseUtil;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;

/**
 * 
 * @author Jaspal Dhaliwal
 *
 */

@RestController
@RequestMapping(RestEndpointConfig.PROD_CLASSIFICATION)
@RequiredArgsConstructor
public class ProdClassificationController {

	private static final String CLASS_NODE_REQUEST = "ClassNodeRequest >> {} ";
	private final ProdClassificationService prodClassificationService;

	//@Log
	private Logger logger;

	/**
	 * Gets a rule based on node supplied as criteria (with additional search
	 * attributes)
	 * 
	 * @param node
	 * @return
	 */
	@Operation( summary ="Gets a rule based on node supplied as criteria (with additional search attributes)")
	@PostMapping(RestEndpointConfig.CLASSIFICATION_ATTR)
	public ResponseEntity<ResponseSchema<ClassNode>> getClassificationUsingAttributes(
			@RequestBody ClassNodeRequest classNodeRequest) {
		logger.info(CLASS_NODE_REQUEST, classNodeRequest);
		return new ResponseEntity<>(ResponseUtil.buildSuccessResponse(
				prodClassificationService.getNode(classNodeRequest), new ResponseSchema<ClassNode>()), HttpStatus.OK);

	}

	@PostMapping(RestEndpointConfig.CLASSIFICATION_ATTR_LEVEL)
	@Operation( summary ="Gets a custom rule request and serves matching rules.")
	public ResponseEntity<ResponseSchema<ClassNode>> getClassificationUsingAttributesWrapper(
			@RequestBody ClassificationRequestWrapper classNodeRequestWrapper) {
		logger.info(CLASS_NODE_REQUEST, classNodeRequestWrapper);
		return new ResponseEntity<>(
				ResponseUtil.buildSuccessResponse(prodClassificationService.getNode(classNodeRequestWrapper),
						new ResponseSchema<ClassNode>()),
				HttpStatus.OK);
	}



}