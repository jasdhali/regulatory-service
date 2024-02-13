package com.example.nano.config;

import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieModule;
import org.kie.api.runtime.KieContainer;
import org.kie.internal.io.ResourceFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DroolsConfiguration {
	
	private final static Logger logger = LoggerFactory.getLogger(DroolsConfiguration.class);

	@Value("${rams.prodclass.azure.blobstorage}")
	private String prodclassBlobStorage;

	@Value("${rams.prodclass.azure.container}")
	private String prodclassBlobFolder;
	
	@Value("${rams.prodclass.rule-files}")
	private String[] allProdClassRuleFiles;
	
	//@Bean
	public KieContainer kieContainer() {
		KieServices kieServices = KieServices.Factory.get();

		KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
		
		for (String classRuleFile: allProdClassRuleFiles) {
			loadClassificationRules(kieFileSystem, classRuleFile );
		}
		
		KieBuilder kieBuilder = kieServices.newKieBuilder(kieFileSystem);
		kieBuilder.buildAll();
		KieModule kieModule = kieBuilder.getKieModule();

		return kieServices.newKieContainer(kieModule.getReleaseId());
	}
	/*
	private void loadClassificationRules(KieFileSystem kieFileSystem, String ruleFileName) {
		try {
			kieFileSystem.write(ResourceFactory
					.newUrlResource(new URL(prodclassBlobStorage + prodclassBlobFolder + "/" + ruleFileName)));
			logger.info("Classification rules loaded successfully {} ", ruleFileName);
		} catch (MalformedURLException urlException) {
			logger.info("Issue in loading rules from Blob storage {} ", ruleFileName);
		}
	}*/
	private void loadClassificationRules(KieFileSystem kieFileSystem, String ruleFileName) {
			kieFileSystem.write(ResourceFactory
					.newClassPathResource( "class-rules/" + ruleFileName ));
			logger.info("Classification rules loaded successfully {} ", ruleFileName);		
	}
}