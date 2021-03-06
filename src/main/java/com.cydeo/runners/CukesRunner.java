package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin ="html:target/cucumber-reports.html",
        features = "src/main/resources/features",
        glue = "com/cydeo/step_definitions",
        dryRun = false
)
public class CukesRunner {

}
