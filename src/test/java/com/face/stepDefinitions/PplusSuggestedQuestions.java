package com.face.stepDefinitions;

import org.junit.Assert;

import com.face.pageFactory.PplusSuggestedQuestionsPage;

import core.generic.Utilities;
import core.generic.WrapperFunctions;
import cucumber.api.java.en.Then;

public class PplusSuggestedQuestions {
	// Local variables
	private Utilities objUtilities = new Utilities();
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();

	private PplusSuggestedQuestionsPage objPplusSuggestedQuestionsPage = new PplusSuggestedQuestionsPage();
	
	@Then("^Select first question$")
	public void selectFirstQuestion(){
		Assert.assertTrue(objPplusSuggestedQuestionsPage.selectFirstQuestion());
	}

	@Then("^Select second question$")
	public void selectSecondQuestion(){
		Assert.assertTrue(objPplusSuggestedQuestionsPage.selectSecondQuestion());
	}

	@Then("^Select third question$")
	public void selectThirdQuestion(){
		Assert.assertTrue(objPplusSuggestedQuestionsPage.selectThirdQuestion());
	}
}
