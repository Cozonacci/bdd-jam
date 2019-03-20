import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"io.cucumber.pro.JsonReporter"},
        features = "src/test/resources/Hello.feature")
public class RunCucumberTest {
}
