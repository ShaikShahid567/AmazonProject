package Pages;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import  DriverFactory.DriverFactory;

public class Scenario1_OR {

private WebDriver driver;
static String pp ,pp1,rp1,rp,cp1, cp;
static String toalprice;

public Scenario1_OR(WebDriver driver) {
	this.driver= driver;
}


private By searchbox = By.id("twotabsearchtextbox");
private By searchicon = By.xpath("//* [@type=\"submit\"]");
private By firstproduct = By.xpath("(//* [@class=\"s-image\"])[1]");
private By addcart = By.xpath("//*[@name=\"submit.add-to-cart\"]");
private By productprice = By.xpath("(//span[@class='a-price'])[1]");
private By opencart = By.xpath("//*[@id='nav-cart-count']");
private By cartprice = By.xpath("//*[@class=\"a-size-medium a-color-base sc-price sc-white-space-nowrap sc-product-price a-text-bold\"]");
private By subtotalprice = By.xpath("(//* [@class='a-size-medium a-color-base sc-price sc-white-space-nowrap'])[1]");
//"(//span[@class='a-price'])[1]"--> new line

public void searchBox(String s) throws InterruptedException {
	driver.findElement(searchbox).clear();
	Thread.sleep(20000);
	driver.findElement(searchbox).sendKeys(s);
}
public void searchIcon() throws InterruptedException {
	
	driver.findElement(searchicon).click();
}

public void firstProduct() throws InterruptedException {
	
	driver.findElement(firstproduct).click();
	Thread.sleep(3000);
}
public void productPrice() throws InterruptedException {
	String pagesource=driver.getPageSource();
	Pattern pattern=Pattern.compile("\\$\\d+\\.\\d+");
	
	Matcher matcher=pattern.matcher(pagesource);
	 
	 pp= driver.findElement(productprice).getText();
	 
	 rp= pp.replaceAll("\\n", ".");
	 
	 System.out.println("Product price= " +pp + " rp= " + rp);
	 Thread.sleep(4000);
	 

			while(matcher.find()) {
				String decimalvalue=matcher.group();
				Thread.sleep(3000);
				System.out.println(decimalvalue);
	   			if(rp.equals(decimalvalue)) {
				System.out.println("product price matched");
				break;
				}
	   			
				else {
					System.out.println("product price not matched" );
				}
				}
			}


public void productPrice1() throws InterruptedException {//for scenario3
	String pagesource1=driver.getPageSource();
	Pattern pattern1=Pattern.compile("\\$\\d+\\.\\d+");
	
	Matcher matcher1=pattern1.matcher(pagesource1);
	
	 pp1= driver.findElement(productprice).getText();
	 System.out.println("Product Price1 " +pp1);
 rp1= pp1.replaceAll("\\n", ".");
	 
	 System.out.println("Product price1= " +pp1 + " rp1= " + rp1);
	 Thread.sleep(4000);
	 

			while(matcher1.find()) {
				String decimalvalue1=matcher1.group();
				Thread.sleep(3000);
				System.out.println(decimalvalue1);
	   			if(rp1.equals(decimalvalue1)) {
				System.out.println("product price matched");
				break;
				}
	   			
				else {
					System.out.println("product price not matched" );
				}
				}
}

public void addCart() throws InterruptedException {
	
	driver.findElement(addcart).click();
}



public void openCart() {
	
	 driver.findElement(opencart).click();
}

public void cartPrice() {
	
	 cp= driver.findElement(cartprice).getText();
	 System.out.println(cp);
	 if(rp.equals(cp)) {
			System.out.println("Prices are identicals from product & Cart");
		}
		else {
			System.out.println("Prices are not identicals from product & Cart");
		}
}
	 
	 public void cartPrice1() {
			
		 cp1= driver.findElement(cartprice).getText();
		 System.out.println(cp1);
		 if(rp1.equals(cp1)) {
				System.out.println("Prices are identicals from product & Cart");
			}
		 
			else {
				System.out.println("Prices are not identicals from product & Cart");
			}
	
}
public void subtotalPrice() {
	
	String sp= driver.findElement(subtotalprice).getText();
	 System.out.println("subtotal: " + sp);
	BigDecimal bd= new BigDecimal (rp.replace("$", ""));
	BigDecimal bd1= new BigDecimal (rp1.replace("$", ""));
	
	BigDecimal totalPrice =bd.add(bd1);
	String s2= "$"+ totalPrice.toString(); 
	//System.out.println("s2 value: " + s2);
	 System.out.println("TotalPrice: $" + totalPrice);
		
	 if (s2.equals(sp)){//for scenario3
	
		System.out.println("TotalPrices of both products are identicals with Subtotal");
	}

	else {
		System.out.println("TotalPrices of both products are not identicals with Subtotal");
	}

}


}

