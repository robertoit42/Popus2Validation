package Popus2Tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = { "src/test/resources/features" }, glue = {"Popus2.Definitions"}  , tags = {"@tag1"}) 


public class RunnersFeature {

}

