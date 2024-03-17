package StepDefinitions;

import DriverFactory.DriverFactory;
import Pages.All_Scenarios_OR;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Scenario3_Steps {
	
	
private All_Scenarios_OR  m1= new  All_Scenarios_OR(DriverFactory.getDriver());

	
	@Given("Launch Amazon.com")
	public void launch_amazon_com() throws InterruptedException {
	   
		DriverFactory.getDriver().get("https://www.amazon.com");
		//DriverFactory.getDriver().navigate().refresh();
		Thread.sleep(10000);
	}

	
	@When("InSearch field type {string}")
	public void insearch_field_type(String search) throws InterruptedException {
		m1.searchBox(search);
		System.out.println("clicked on search");
		
		
	}

	@Then("PressEnter")
	public void pressEnter() throws InterruptedException {
		m1.searchIcon();
		System.out.println("enter clicked successfully");
	   
	}
	
	
	@Then("Select 1st item in the List")
	public void select_1st_item_in_the_list() throws InterruptedException {
		m1.productPrice();
		m1.firstProduct();
		System.out.println("Product price taken and product selected"); 
	}
	
	@Then("Add item to cart by clicking on Add to Cart")
	public void add_item_to_cart_by_clicking_on_add_to_cart() throws InterruptedException {
	    m1.addCart();
	    System.out.println("Item added to Cart successfully");
	   
	}
	/*
	 * @Then("Verify item total price is correct") public void
	 * verify_item_total_price_is_correct() { m1.cartPrice();
	 * System.out.println("HeadPhone Product price is matching with cart item price"
	 * ); }
	 */

	//-----------------------------------------------------2nd item---------
	@And("In the Search textbox type {string}")
	public void in_the_search_textbox_type(String search) throws InterruptedException {
		m1.searchBox(search);
		System.out.println("clicked on search");
		
	}
	@Then("Press Enterkey")
	public void press_Enterkey() throws InterruptedException {
		m1.searchIcon();
		System.out.println("enter clicked successfully");
	   
	}

	
	@Then("Select the first item in the List")
	public void select_the_first_item_in_the_list() throws InterruptedException {
		m1.productPrice1();
		m1.firstProduct();
		System.out.println("Product price taken and product selected"); 
	}
	
	@Then("Add the firstitem to cart by clicking on Add to Cart")
	public void add_the_firstitem_to_cart_by_clicking_on_add_to_cart() throws InterruptedException {
	    m1.addCart();
	    System.out.println("Item added to Cart successfully");
	   
	}
	
	@Then("Verify each item total price is correct")
	public void verify_each_item_total_price_is_correct() {
		m1.cartPrice1();
		System.out.println("Keyboard Product price is matching with cart item price");
	}

	@Then("Verify that the sub total is calculated correctly")
	public void verify_that_the_sub_total_is_calculated_correctly() {
		m1.subtotalPrice();
		System.out.println("Product price is compared with subtotal price");
	}


}
