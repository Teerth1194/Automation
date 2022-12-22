package com.AutomationPractice.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/HomepageFeature",
        glue = {"com.AutomationPractice.steps"},
        plugin = {"html:target/cucumber-html-report/cucumber.html", "json:target/cucumber.json"},
        dryRun = false
)

public class TestRunner {
}
