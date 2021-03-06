package com.e2etests.utils;

import org.apache.xmlbeans.impl.inst2xsd.util.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class Common {
	
	protected static final Logger logger = LoggerFactory
			.getLogger(AbstractPage.class);

	// Go back
	public void goBack() throws Throwable {

		AbstractPage.driver.navigate().back();
	}

	// Refresh browser
	public void refreshBrowser() throws Throwable {

		AbstractPage.driver.navigate().refresh();
	}
	
	
	/**
	 * Select
	 */
	
//    public WebElement selectMethods (WebDriver driver, By locator, String method) {
//    	WebElement element ;
//        Select select = new Select(AbstractPage.driver.findElement(By.xpath("")));
//        select.selectByVisibleText("ESS");
//    	return element ;
//    	}
	
	
	/**
	 *
	 * Double Click
	 */
	public void doubleClick() {

		WebElement wE =  AbstractPage.driver.findElement(By.xpath(""));
		Actions act = new Actions(AbstractPage.driver);

		act.doubleClick(wE);
	}
	
	
	/**

	 * Scroll bottom of the Page

	 */
	public void scrollerFooter() throws Throwable {

		for (int second = 0;; second++) {
			if(second >=60){
				break;
			}
			((JavascriptExecutor) AbstractPage.driver).executeScript("window.scrollBy(0,400)", "");

		}
	}
	
}
