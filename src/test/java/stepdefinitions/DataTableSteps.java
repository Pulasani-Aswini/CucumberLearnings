package stepdefinitions;

import java.util.List;
import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableSteps {
	@Given("I placed an order for the following items")
	public void i_placed_an_order_for_the_following_items(io.cucumber.datatable.DataTable dataTable) {
/*	    List<String> BillData=dataTable.asList(String.class); //@ListOfString code
	    for(String BillItem:BillData) {
	    	System.out.println(BillItem);
	    } */
		
		
/*		List<List<String>> BillData=dataTable.asLists(); //@ListofListofStrings Code
		for(List<String> BillItems:BillData) {
			for(String BillItem:BillItems) {
				System.out.println(BillItem);
			}
		}  */
		
		List<Map<String,String>>Billdata=dataTable.asMaps();
		for(Map<String,String> BillItems: Billdata) {
			for(Map.Entry<String, String> BillItem:BillItems.entrySet()) {
				System.out.println("Key: "+BillItem.getKey());
				System.out.println("Value: "+BillItem.getValue());
			}
		}
	}

	@When("I generate the bill")
	public void i_generate_the_bill() {
	    // Write code here that turns the phrase above into concrete actions
	 
	}

	@Then("a bill for ${int} should be generated")
	public void a_bill_for_$_should_be_generated(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	  
	}


}
