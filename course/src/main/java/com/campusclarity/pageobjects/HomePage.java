package com.campusclarity.pageobjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.campusclarity.utilities.PropUtils;

public class HomePage {
	private static final Logger logger = Logger.getLogger(HomePage.class);
	WebDriver driver;
	PropUtils objUtils;
	WebDriverWait wait;
	String pageTitle;

	public HomePage(WebDriver argDriver) {
		this.driver = argDriver;
	}

	public HomePage(WebDriver argDriver, PropUtils argUtils) {
		this.driver = argDriver;
		this.objUtils = argUtils;
	}

	public boolean verifySelectCourse() {
		try {
			Thread.sleep(2000);
			driver.findElement(By.xpath(PropUtils.commonUsed.getProperty("startThinkAboutItCourse"))).click();
			logger.info("starting the course");
			Thread.sleep(2000);
			return true;
		} catch (Exception e) {
			logger.info("Not able to start the course", e);
			return false;
		}
	}

	public Prologue continueToNextPage() {
		return new Prologue(driver, objUtils);
	}

	
}


