package stepdefinitions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import linkedinlearning.cucumbercourse.BillCalculationHelper;

public class ScenarioOutlineSteps {
	int intialBillAmount;
	double TaxRate;
	@Given("I have a Customer")
	public void i_have_a_Customer() {
	   
	}

	@Given("user enters intial bill amount as {int}")
	public void user_enters_intial_bill_amount_as(Integer intialBillAmount) {
	   this.intialBillAmount=intialBillAmount;
	   System.out.println("InitialBillAmount: "+intialBillAmount);
	}

	@Given("Sales Tax Rate is {int} Percent")
	public void sales_Tax_Rate_is_Percent(Integer TaxRate) {
	  this.TaxRate=TaxRate;
	  System.out.println("Tax rate: "+TaxRate);
	}

	@Then("final bill amount calculate is {int}")
	public void final_bill_amount_calculate_is(Integer expectedValue) {
		double SystemCalcValue=BillCalculationHelper.CalculateBillForCustomer(this.intialBillAmount,this.TaxRate);
		   System.out.println("Expected Value: "+expectedValue);
		   System.out.println("System Calculated Value: "+SystemCalcValue);
		   assertTrue(expectedValue==SystemCalcValue);
	}

	@Given("Sales Tax Rate is {double} Percent")
	public void sales_Tax_Rate_is_Percent(Double TaxRate) {
	  this.TaxRate=TaxRate;
	  System.out.println("Tax rate: "+TaxRate);
	}
	
	public void invokeWebPage(Double expectedValue) {
		System.setProperty("webdriver.chorme.driver","C:\\chromedriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8080/BasicWebsite/Index.jsp");
		WebElement BillAmountTextBox=driver.findElement(By.id("billamount"));
		WebElement TaxrateTextBox=driver.findElement(By.id("taxrate"));
		WebElement Button=driver.findElement(By.id("mybutton"));
		BillAmountTextBox.sendKeys(Integer.toString(intialBillAmount));
		TaxrateTextBox.sendKeys(Double.toString(TaxRate));
		Button.click();
//		WebElement Header1Element=driver.findElementByXPath("//h1");
//		System.out.println(Header1Element.getText());
//		boolean Matched=Header1Element.getText().contains("Final Bill Amount is: $"+expectedValue.toString());
//		System.out.println(Matched);
		
	}

	@Then("final bill amount calculate is {double}")
	public void final_bill_amount_calculate_is(Double expectedValue) {
	   double SystemCalcValue=BillCalculationHelper.CalculateBillForCustomer(this.intialBillAmount,this.TaxRate);
	   System.out.println("Expected Value: "+expectedValue);
	   System.out.println("System Calculated Value: "+SystemCalcValue);
	   assertTrue(expectedValue==SystemCalcValue);
	  // invokeWebPage(expectedValue);
	}



}
