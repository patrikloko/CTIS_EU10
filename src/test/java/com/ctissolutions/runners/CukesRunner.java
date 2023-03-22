package com.ctissolutions.runners;

import io.cucumber.junit.*;
import org.junit.runner.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                //"pretty",
                "json:target/cucumber-report.json",
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
        },
      features = "/Users/cemil/IdeaProjects/CTIS_EU10/src/test/resources/features/SearchBoxFilter.feature",
        glue = "com/ctissolutions/step_definitions",
        dryRun = false,
        tags = "@wip",
        publish = false

)
public class CukesRunner {
}