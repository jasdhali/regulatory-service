package com.example.nano.model;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.CharMatcher;

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
public class ClassNode {
	private String market;
	private String level;
	@JsonIgnore
	private String parent; 
	@JsonIgnore
	@ToString.Exclude
	private ClassNode parentRef;
	private String vitalCharacteristic;
	@ToString.Exclude
	private String explanatoryText;
	private String classificationNotes;
	@Builder.Default
	private VitalCharacteristicType characteristicType = VitalCharacteristicType.Option;
	private String classificationCode;
	private String intrimClass;
	@JsonIgnore
	private String intrimRule;
	@JsonIgnore
	private String keyWords;
	@Builder.Default
	private List<ClassNode> children = new ArrayList<>();

	@JsonIgnore
	private String successor;
	@JsonProperty("successor")
	private String successorVal;
	private String notes;
	private String ruleRef;
	private String characteristics;
	private List<String> previousSteps;
	private String multiSelect;
	private List<String> andRules;
	private boolean terminating;
	private boolean multiIVDRDevices;
	private boolean highestClassOverride;
	@JsonIgnore
	private String salience;
	@JsonIgnore
	private String activationGroup;
	private String classOverride;
	@JsonIgnore
	private Integer delta; 

	public void addChildNode(ClassNode node) {
		node.setParentRef(this);
		this.children.add(node);

		if (this.getMultiSelect() == null && node.getMultiSelect() != null)
			this.setMultiSelect(node.getMultiSelect());
	}

	public void addChildNode(List<ClassNode> nodes) {
		if (nodes != null) {
			nodes.stream().forEach(element -> element.setParentRef(this));
			this.children.addAll(nodes);
			Collections.sort(this.children, (a, b) -> b.getSubLevel().compareTo(a.getSubLevel()));
		}
	}

	public ClassNode(String level, VitalCharacteristicType characteristicType, String vitalCharacteristic) {
		super();
		this.level = level;
		this.vitalCharacteristic = vitalCharacteristic;
		this.characteristicType = characteristicType;
	}

	@JsonIgnore
	public ClassNode getQueryObject() {
		return ClassNode.builder().level(this.getLevel()).characteristicType(this.getCharacteristicType())
				.vitalCharacteristic(this.getVitalCharacteristic()).market(this.getMarket()).build();
	}

	public boolean excludeFromSearch(String srchAttr) {
		return (vitalCharacteristic != null && vitalCharacteristic.indexOf(srchAttr) >= 0)
				|| (explanatoryText != null && explanatoryText.indexOf(srchAttr) >= 0);
	}

	public boolean contains(String strToCheck) {
		String[] arr = this.getVitalCharacteristic().split(" ");
		for (String s : arr) {
			if (s.equals(strToCheck))
				return true;
		}
		return false;
	}

	public boolean contains(List<String> strToCheck) {
		for (String e : strToCheck) {
			if (contains(e))
				return true;
		}
		return false;
	}

	public String getUniqueRuleId() {
		if (andRules == null || andRules.isEmpty())
			return level;
		else {
			if (andRules.contains(level))
				return String.join(",", andRules);
			else
				andRules.add(0, level);
		}
		return String.join(",", andRules);
	}

	public ClassNode(ClassNode classNode) {
		this.setLevel(classNode.getLevel());
		this.setMarket(classNode.getMarket());
		this.setVitalCharacteristic(classNode.getVitalCharacteristic());
		this.setCharacteristicType(classNode.getCharacteristicType());
		this.setClassificationCode(classNode.getClassificationCode());
		this.setClassificationNotes(classNode.getClassificationNotes());
		this.setExplanatoryText(classNode.getExplanatoryText());
		this.setHighestClassOverride(classNode.isHighestClassOverride());
		this.setRuleRef(classNode.getRuleRef());
		this.setAndRules(classNode.getAndRules());
	}

	public boolean classNotesNull() {
		return this.getClassificationCode() == null || this.getClassificationNotes() == null;
	}

	public void setSuccessorVal(String successorVal) {
		if (successorVal.startsWith("if") || successorVal.startsWith("If") || successorVal.startsWith("End")) {
			this.successorVal = null;
		} else {
			this.successorVal = successorVal;
		}

	}

	@JsonIgnore
	public void setActivationGroup(String activationGroup, int addThisToSalience) {
		this.activationGroup = activationGroup;
		if (activationGroup != null && !"".equals(activationGroup)) {
			StringBuilder sbLevelAndAndRules = new StringBuilder();
			sbLevelAndAndRules.append(level.replace("-", ""));
			if (andRules != null && !andRules.isEmpty()) {
				andRules.forEach(e -> sbLevelAndAndRules.append(e.replace("-", "")));
			}
			Integer salienceVal = Integer.parseInt(sbLevelAndAndRules.toString().trim() + ("" + addThisToSalience));
			setSalience("" + (salienceVal));
		}
	}

	@JsonIgnore
	public void setActivationGroup(String activationGroup) {
		this.activationGroup = activationGroup;
		if (activationGroup != null && !"".equals(activationGroup)) {
			StringBuilder sbLevelAndAndRules = new StringBuilder();
			sbLevelAndAndRules.append(level.replace("-", ""));
			if (andRules != null && !andRules.isEmpty()) {
				andRules.forEach(e -> sbLevelAndAndRules.append(e.replace("-", "")));
			}
			Integer salienceVal = Integer.parseInt(sbLevelAndAndRules.toString().trim());
			setSalience("" + salienceVal);
		}
	}

	@JsonIgnore
	public Integer getSubLevel() {
		if (this.getLevel() == null || this.getLevel().indexOf('-') == -1)
			return 0;
		return Integer.valueOf(this.getLevel().substring(this.getLevel().indexOf('-'), this.getLevel().length()));
	}

	@JsonIgnore
	public Integer getMainLevel() {
		if (CharMatcher.is('-').countIn(this.getLevel()) == 1) {
			if (this.getLevel() == null || this.getLevel().indexOf('-') == -1)
				return 0;
			return Integer.valueOf(this.getLevel().substring(this.getLevel().indexOf('-'), this.getLevel().length()));
		} else
			return null;

	}

	@Override
	public String toString() {
		return "ClassNode [level=" + level + ", parent=" + parent + ", classificationCode=" + classificationCode + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((andRules == null) ? 0 : andRules.hashCode());
		result = prime * result + ((level == null) ? 0 : level.hashCode());
		result = prime * result + ((salience == null) ? 0 : salience.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClassNode other = (ClassNode) obj;
		if (andRules == null) {
			if (other.andRules != null)
				return false;
		} else if (!andRules.equals(other.andRules))
			return false;
		if (level == null) {
			if (other.level != null)
				return false;
		} else if (!level.equals(other.level))
			return false;
		if (salience == null) {
			if (other.salience != null)
				return false;
		} else if (!salience.equals(other.salience))
			return false;
		return true;
	}
}
