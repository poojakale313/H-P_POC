package core.Hooks;
import core.generic.StepBase;
import core.generic.StepBase2;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * @ScriptName    : Hooks
 * @Description   : This class contains   
 * @Author: Digvijay Dusane(Aress) @Creation Date : 25 Dec 2017   @Modified Date:                       
 */
public class Hooks 
{
	public Scenario currentScenario;
	StepBase2 objStepBase2 = new StepBase2();
	@Before
	public void applyHook(Scenario scenario)
	{
		currentScenario = scenario;
		objStepBase2.setUp(scenario);
	}

//	@After
//	public void removeHook(Scenario scenario) 
//	{
//		objStepBase2.tearDown(scenario);
//	}	
}

