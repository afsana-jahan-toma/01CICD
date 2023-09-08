package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(features = {"src/test/resources/Feature/CustomerLogin.feature"},
        glue = {"StepDefination"},   monochrome = true,
        dryRun = false,
        plugin ={ "pretty","html:build/reports/Customer.html"
        })

@Test
class WebRunner extends AbstractTestNGCucumberTests{
}