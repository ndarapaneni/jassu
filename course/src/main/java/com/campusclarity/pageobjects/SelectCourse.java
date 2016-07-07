package com.campusclarity.pageobjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.campusclarity.utilities.CommonUtils;
import com.campusclarity.utilities.PropUtils;

public class SelectCourse {

	private static final Logger logger = Logger.getLogger(SelectCourse.class);
	WebDriver driver;
	PropUtils objUtils;
	WebDriverWait wait;
	String pageTitle;

	public SelectCourse(WebDriver argDriver) {
			this.driver = argDriver;
		}

	public SelectCourse(WebDriver argDriver, PropUtils argUtils) {
			this.driver = argDriver;
			this.objUtils = argUtils;
		}
	public String getCommonUedProperty(String propKey) {
		return PropUtils.commonUsed.getProperty(propKey);
	}

	
	public void selectCourse() throws InterruptedException {
		try {
			Thread.sleep(2000);
			CommonUtils.findAndClickElementByXPath(driver, getCommonUedProperty("startThinkAboutItCourse"));
			
		} catch (Exception e) {
			logger.info("Not able to start the course", e);
			driver.quit();
		}
		Thread.sleep(2000);
	}

}
