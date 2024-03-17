package StepDefinitions;

import org.openqa.selenium.WebDriver;

import DriverFactory.DriverFactory;
import Pages.All_Scenarios_OR;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import DriverFactory.ConfigReader;
public class Scenario1_2_Steps {
	
private All_Scenarios_OR  m1= new  All_Scenarios_OR(DriverFactory.getDriver());

	
	@Given("Open Amazon.com")
	public void open_amazon_com() throws InterruptedException {
	   
		DriverFactory.getDriver().get("https://www.amazon.com");
		//DriverFactory.getDriver().navigate().refresh();
		Thread.sleep(5000);
	}

	
	@When("In the Search field type {string}")
	public void in_the_search_field_type(String search) throws InterruptedException {
		m1.searchBox(search);
		System.out.println("clicked on search");
		
	}

	@Then("Press Enter")
	public void press_Enter() throws InterruptedException {
		m1.searchIcon();
		System.out.println("enter clicked successfully");
	   
	}

	
	@Then("Select the 1st item in the List")
	public void select_the_1st_item_in_the_list() throws InterruptedException {
		m1.productPrice();
		m1.firstProduct();
		System.out.println("Product price taken and product selected"); 
	}
	
	@Then("Add the item to cart by clicking on Add to Cart")
	public void add_the_item_to_cart_by_clicking_on_add_to_cart() throws InterruptedException {
	    m1.addCart();
	    System.out.println("Item added to Cart successfully");
	   
	}

	@Then("Open Cart from the top-left")
	public void open_cart_from_the_top_left() {
	   m1.openCart();
	   System.out.println("Cart clicked successfully");
	   
	}
	
	@Then("Verify that the price is identical to the product page")
	public void verify_that_the_price_is_identical_to_the_product_page() {
		m1.cartPrice();
		System.out.println("Product price is compared with cart price");
	}

	@Then("Verify that the sub total is identical to the product page")
	public void verify_that_the_sub_total_is_identical_to_the_product_page() {
		m1.subtotalPrice();
		System.out.println("Product price is compared with subtotal price");
	}


	
}
