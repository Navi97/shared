package sharedrepostory;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= {"json:src/test/java/sharedres/output.json"})
public class runshared {
	

}
