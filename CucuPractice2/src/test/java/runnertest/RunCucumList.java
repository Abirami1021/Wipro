package runnertest;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/feature/loglist.feature",
        glue = "stepdefenitions",
        plugin = {"pretty", "html:target/datalist-report.html"},
        monochrome = true
)
public class RunCucumList {
}
