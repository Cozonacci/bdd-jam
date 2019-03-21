package org.testingsol.jam.acceptanceTests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "org.testingsol.jam.stepDefs",
        plugin = "io.cucumber.pro.JsonReporter:all",
        features = "src/test/resources/")
public class RunCucumberTest {
}
