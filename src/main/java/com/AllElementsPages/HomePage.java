package com.AllElementsPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AllElements.BasePage.BasePage;

public class HomePage extends BasePage{
	WebDriver driver;

	@FindBy(xpath="//div[contains(text(),'Elements')]")
	WebElement Elements;
	
	@FindBy(xpath="//ul[@class='menu-list']/li[@id='item-0']/span[text()='Text Box']")
	WebElement TextBox;
	
	@FindBy(xpath="//ul[@class='menu-list']//li//span[text()='Check Box']")
	WebElement CheckBox;
	
	@FindBy(xpath="//div[contains(text(),'Radio Button')]")
	WebElement RadioButton;
	
	@FindBy(xpath="//div[contains(text(),'Forms')]")
	WebElement Forms;
	
	@FindBy(xpath="//div[contains(text(),'Practice Form')]")
	WebElement PracticeForm;
	
	@FindBy(xpath="//div[contains(text(),'Alerts, Frame & Windows')]")
	WebElement AlertsFrameWindows;
	
	@FindBy(xpath="//div[contains(text(),'Widgets')]")
	WebElement Widgets;
	
	@FindBy(xpath="//div[contains(text(),'Interactions')]")
	WebElement Interactions;
	
	@FindBy(xpath="//div[contains(text(),'Book Store Application')]")
	WebElement BookStoreApplication;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	// click on Elements
	
	public String clickonElements() {
		Elements.click();
		return TextBox.getText();
	}
	
	// click on Forms
	
	public String clickonForms() {
		Forms.click();
		return PracticeForm.getText();
	}
	
	public void clickOnTextBox()
	{
	TextBox.click();
	}
	public void clickOnCheckbox() {
		CheckBox.click();
	}
	
	
	
	 

}
