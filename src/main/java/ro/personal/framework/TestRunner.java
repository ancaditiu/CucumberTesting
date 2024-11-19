package ro.personal.framework;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = "steps", tags = "@smoke")                                                                // glue nu stiu inca ce face ca merge si fara el - de investigat
public class TestRunner {

}