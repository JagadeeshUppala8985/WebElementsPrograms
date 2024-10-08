package com.AllElementsTests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.AllElements.BasePage.BasePage;
import com.AllElementsPages.Checkbox;
import com.AllElementsPages.HomePage;

public class CheckBoxTest extends BasePage {
	Checkbox checkbox;
	HomePage homepage;

	public CheckBoxTest() {
		super();
	}
	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();
	}
	@Test
	public void EnterYourCheckBoxName() {
		homepage= new HomePage(driver);
		homepage.clickOnCheckbox();
		checkbox=new Checkbox(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", checkbox.ExpandAll );
		checkbox.ExpandAll.click();
		String out = checkbox.entercheckboxvalue("Office");
		

		
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
