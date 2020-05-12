package tests;

import org.junit.runner.RunWith;
import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {//"E:\\batch246\\BDD-gmail\\src\\test\\resources\\features\\feature1.feature",
				//"E:\\batch246\\BDD-gmail\\src\\test\\resources\\features\\feature2.feature",
				"E:\\batch246\\sms4India-Cucumber\\src\\test\\resources\\features\\feature10.feature"
				},
		glue = {"glue"},
		monochrome = true,
		tags= {"@smoketest"},
		strict = true,
		plugin= {"pretty","html:target\\result"}
		)
public class CucumberTest {

}
