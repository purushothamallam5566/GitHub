package com.Runner.in;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="./src/test/resources/feature",
glue={"com.stepDefinition.in","com.Hook.in"},
publish=true,
plugin={"pretty","html:target/CucumberReports.html"}
		)
public class MyRunner extends AbstractTestNGCucumberTests{
	public Object[][] scenario()
	{
		return super.scenarios();
	}
}
