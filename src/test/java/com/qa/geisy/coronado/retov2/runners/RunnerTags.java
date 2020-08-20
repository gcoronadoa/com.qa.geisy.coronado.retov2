package com.qa.geisy.coronado.retov2.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/objeto_extraviado.feature",
        tags = "@historia",
        glue = "com.qa.geisy.coronado.retov2.stepdefinitions",
        snippets = SnippetType.CAMELCASE )


public class RunnerTags {
}
