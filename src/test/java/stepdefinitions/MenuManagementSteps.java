package stepdefinitions;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import linkedinlearning.cucumbercourse.RestaurantMenu;
import linkedinlearning.cucumbercourse.RestaurantMenuItem;

public class MenuManagementSteps {
	RestaurantMenuItem NewMenuItem;
	RestaurantMenu LocationMenu=new RestaurantMenu();
	String ErrorMessage;
	public MenuManagementSteps() {
		super();
		System.out.println("Constructor called");
	}
	@Given("I have a menu item with name {string} and price {int}")
	public void i_have_a_menu_item_with_name_and_price(String newmenuItemname, Integer price) {
	    // Write code here that turns the phrase above into concrete actions
		
		NewMenuItem=new RestaurantMenuItem(newmenuItemname,"new item",price);
		System.out.println("Step 1");
	}

	@When("I add that menu item")
	public void i_add_that_menu_item() {
	    // Write code here that turns the phrase above into concrete actions
		try {
			LocationMenu.AddMenuItems(NewMenuItem);
		}
		catch(IllegalArgumentException ex) {
			ErrorMessage=ex.getMessage();
		}
			 	   
	    System.out.println("Step 2");
	}



	@Then("Menu Item with name {string} should be added")
	public void menu_Item_with_name_should_be_added(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    boolean Exists=LocationMenu.DoesItemExist(NewMenuItem);
	    System.out.println("Step 3");
	}
	
	@Then("I should see an error message with value {string}")
	public void i_should_see_an_error_message_with_value(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("error");
		System.out.println(ErrorMessage);
	    assertEquals("Duplicate Item",ErrorMessage);
	}

}
