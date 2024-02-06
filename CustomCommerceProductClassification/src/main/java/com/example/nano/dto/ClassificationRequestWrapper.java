package com.example.nano.dto;

import java.util.List;

import com.example.nano.model.ClassNode;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ClassificationRequestWrapper {
	private ClassNodeRequest classNodeRequest;
	private List<String> steps;
	
	public static ClassNode buildClassNode(ClassificationRequestWrapper request) {
		// @formatter:off
		ClassNode classNode = ClassNodeRequest.buildClassNode(request.getClassNodeRequest());
		classNode.setPreviousSteps(request.getSteps());
		return classNode;
		// @formatter:on
	}
}
