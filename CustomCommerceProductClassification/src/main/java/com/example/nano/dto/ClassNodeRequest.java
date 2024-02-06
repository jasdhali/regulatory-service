package com.example.nano.dto;

import java.util.List;

import com.example.nano.model.ClassNode;
import com.example.nano.model.VitalCharacteristicType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class ClassNodeRequest {

	private String market;
	private String level;
	private String vitalCharacteristic;
	private VitalCharacteristicType characteristicType;
	private List<String> previousSteps;
	private boolean highestClassOverride;
	private boolean terminating;
	private boolean multiDevice;

	public static ClassNode buildClassNode(ClassNodeRequest request) {
		// @formatter:off
		return ClassNode
						.builder()
						.market(request.getMarket())
						.level(request.getLevel())						
						.vitalCharacteristic(request.getVitalCharacteristic())
						.characteristicType(request.getCharacteristicType())
						.previousSteps(request.getPreviousSteps())
						.terminating(request.isTerminating())
						.highestClassOverride(request.isHighestClassOverride())
						.multiIVDRDevices( request.isMultiDevice())
						.build();
		// @formatter:on
	}
}
