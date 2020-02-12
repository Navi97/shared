package sharedrepostory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class shred {
	@Given("I enter 50 in the calculater")
    public void I_enter_50_in_the_calculater() {
  	  System.out.println("I enter 50 in the calculater");
    }
    
    @And("I press add")
    public void  I_press_add() {
  	  System.out.println(" I press add");
    }
    
    @And("I have entered 50 in the calculater")
    public void I_have_entered_50_in_the_calculater() {
  	  System.out.println("I have entered 50 in the calculater");
  	  
    }
    
   @When("I press equal symbol")
   public void I_press_equal_symbol() {
  	 System.out.println("I press equal symbol");
   }
   
  @Then("The result should be 100 on the screen")
  public void The_result_should_be_100_on_the_screen() {
  	System.out.println("The result should be 100 on the screen");
  }
}
