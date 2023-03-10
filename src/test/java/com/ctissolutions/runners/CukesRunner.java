package com.ctissolutions.runners;

import io.cucumber.junit.*;
import org.junit.runner.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                //"pretty",
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
        },
        features = "src/test/resources/features",
        glue = "com/ctissolutions/step_definitions",
        dryRun = false,
        tags = "",
        publish = false

)
public class CukesRunner {
}