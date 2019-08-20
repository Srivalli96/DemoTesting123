package stepdefinatn;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import junit.framework.TestCase;


@RunWith(Cucumber.class)
@CucumberOptions(features= "Features", glue= {"stepdefinatn"}, tags= {"@FunTest"} )


public class Junitsd extends TestCase {

}
