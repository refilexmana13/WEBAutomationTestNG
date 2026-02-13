package com.Refi;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(
        features = "src/test/resources/login.feature",
        glue = { "com.Refi.stepDef"},
        plugin = {"pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json",
                "junit:target/cucumber-reports/cucumber.xml"
        }
)

@Test
public class Runner extends AbstractTestNGCucumberTests {

}
