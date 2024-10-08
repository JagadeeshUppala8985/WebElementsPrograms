package com.AllElementsPages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.AllElements.BasePage.BasePage;

public class Checkbox extends BasePage {
    public WebDriver driver;
    String elementvalue;

    // Locating all checkboxes using the xpath
    @FindBy(xpath="//div[@class='check-box-tree-wrapper']//li[@class='rct-node rct-node-parent rct-node-expanded']//span[@class='rct-title']")
    List<WebElement> AllCheckBoxes;
    @FindBy(xpath="//button[@title='Expand all']")
    public WebElement ExpandAll;
    
    @FindBy(xpath="//span[@class='text-success']")
    WebElement ElementClicked;
    
    // Constructor for initializing the driver and elements
    public Checkbox(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    // Method to interact with checkboxes based on the provided value
    public String entercheckboxvalue(String value) {
    	
    	System.out.println("Enter into the loop");
        // Using enhanced for-loop for better readability
    	System.out.println("Number of checkboxes found: " + AllCheckBoxes.size());

        for (WebElement checkbox : AllCheckBoxes) {
            // Getting the visible text of each checkbox
            String checkboxText = checkbox.getText();
            
            // Printing the checkbox text for debugging
            System.out.println("Checkbox text: " + checkboxText);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 1000)");
            
            // If the checkbox text matches the input value, click on the checkbox
            if (checkboxText.equals(value)) {
                checkbox.click();  // Select the checkbox
                System.out.println("Clicked checkbox with value: " + value);
                elementvalue=ElementClicked.getText();
                break;  // Exit the loop after finding the checkbox
            }
        }
		return elementvalue;
        
        }
//    public void expandall() {
//    	ExpandAll.click();
//    }
}