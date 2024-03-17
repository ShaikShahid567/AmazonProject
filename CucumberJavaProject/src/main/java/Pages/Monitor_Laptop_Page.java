package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import  DriverFactory.DriverFactory;

public class Monitor_Laptop_Page {

private WebDriver driver;
static String pp ,  cp;

public Monitor_Laptop_Page(WebDriver driver) {
	this.driver= driver;
}

private By searchbox = By.id("twotabsearchtextbox");
private By searchicon = By.xpath("//* [@type=\"submit\"]");
private By firstproduct = By.xpath("(//* [@class=\"s-image\"])[1]");
private By addcart = By.xpath("//*[@name=\"submit.add-to-cart\"]");
private By productprice = By.xpath("(//*[@class='a-price-whole'])[1]");
private By opencart = By.xpath("//*[@id='nav-cart-count']");
private By cartprice = By.xpath("//*[@class=\"a-size-medium a-color-base sc-price sc-white-space-nowrap sc-product-price a-text-bold\"]");
private By subtotalprice = By.xpath("(//* [@class='a-size-medium a-color-base sc-price sc-white-space-nowrap'])[1]");

//*[@class="a-size-medium a-color-base sc-price sc-white-space-nowrap sc-product-price a-text-bold"]

//(//* [@class='a-size-medium a-color-base sc-price sc-white-space-nowrap'])[1]

//*[@id="add-to-cart-button"]
//*[@name="submit.add-to-cart"]
public void searchBox(String s) {
	
	driver.findElement(searchbox).sendKeys(s);
}
public void searchIcon() {
	driver.findElement(searchicon).click();
}

public void firstProduct() throws InterruptedException {
	
	driver.findElement(firstproduct).click();
	Thread.sleep(5000);
}

public void addCart() throws InterruptedException {
	
	driver.findElement(addcart).click();
}

public void productPrice() {
	
	 pp= driver.findElement(productprice).getText();
	 System.out.println(pp);
}

public void openCart() {
	
	 driver.findElement(opencart).click();
}

public void cartPrice() {
	
	 cp= driver.findElement(cartprice).getText();
	 System.out.println(cp);
	 if(pp.equals(cp)) {
			System.out.println("Prices are identicals from product & Cart");
		}

		else {
			System.out.println("Prices are not identicals from product & Cart");
		}
	
}
public void subtotalPrice() {
	
	String sp= driver.findElement(subtotalprice).getText();
	 System.out.println(sp);
	if(pp.equals(sp)) {
		System.out.println("Prices are identicals from product & Subtotal");
	}

	else {
		System.out.println("Prices are not identicals from product & Subtotal");
	}

}


}

