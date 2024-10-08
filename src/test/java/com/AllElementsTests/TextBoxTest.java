package com.AllElementsTests;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.AllElements.BasePage.BasePage;
import com.AllElementsPages.HomePage;
import com.AllElementsPages.Textbox;

public class TextBoxTest extends BasePage {
	//BasePage basePage;
	Textbox tb;
	HomePage homepage;

	public TextBoxTest() {
		super();
		//code
		
	}

	@BeforeMethod
	public void Setup() throws InterruptedException {
		initialization();
		tb=new Textbox(driver);
	}
	
	@Test
	public void TextboxformTest() throws InterruptedException {
		tb.Textboxform();
		String textboxformValidation=tb.Textboxform();
		Assert.assertEquals(textboxformValidation, tb.username);
	}
		
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
