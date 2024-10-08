package com.AllElementsPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AllElements.BasePage.BasePage;

public class Textbox extends BasePage{
	HomePage HP;
	WebDriver driver;
	
	@FindBy(xpath="//h1[text()='Text Box']")
	WebElement TextBoxTitle;
	
	@FindBy(id="userName")
	public WebElement username;
	
	@FindBy(id="userEmail")
	WebElement Email;
	
	@FindBy(id="currentAddress")
	WebElement currentAddress;
	
	@FindBy(id="permanentAddress")
	WebElement permanentAddress;
	
	@FindBy(id="submit")
	WebElement TextBoxsubmitButton;
	
	@FindBy(xpath="//div//p[@id='name']")
	WebElement VerifyTextBoxform;
	
	public Textbox(WebDriver driver) {
	//	System.out.println("Constructor driver "+driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public String Textboxform() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("driver--->"+driver);
		HP=new HomePage(driver);
		HP.TextBox.click();
		username.sendKeys("Jagadeesh Uppala");
		Email.sendKeys("ujkgoud@gmail.com");
		currentAddress.sendKeys("Hyderabad");
		permanentAddress.sendKeys("Andhra pradeesh");
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",TextBoxsubmitButton );
		TextBoxsubmitButton.click();
		String getstringtext=VerifyTextBoxform.getText();
		System.out.println(getstringtext);
		return VerifyTextBoxform.getText();

	}

}
