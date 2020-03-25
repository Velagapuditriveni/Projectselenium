package com.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/feature/Testcase.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@TC01_Jainbook,@TC02_Jainbook,@TC03_Jainbook,@TC04_Jainbook"},
		//tags= {"@Jainbook_agencyrunnerFeature"},
		glue = {"com.Stepdefinition"},
		monochrome = true
		)
public class Jainbook_agencyrunner {

}
