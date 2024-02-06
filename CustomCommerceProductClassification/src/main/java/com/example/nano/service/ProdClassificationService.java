package com.example.nano.service;

import com.example.nano.dto.ClassNodeRequest;
import com.example.nano.dto.ClassificationRequestWrapper;
import com.example.nano.model.ClassNode;

/**
 * 
 * @author Jaspal Dhaliwal
 *
 */

public interface ProdClassificationService {

	ClassNode getNode(ClassNode node);

	ClassNode getNode(ClassNodeRequest classNodeRequest);

	ClassNode getNode(ClassificationRequestWrapper classNodeRequestWrapper);

}