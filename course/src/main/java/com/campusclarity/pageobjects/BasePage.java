package com.campusclarity.pageobjects;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.campusclarity.utilities.PropUtils;

public class BasePage {

	private static final Logger logger = Logger.getLogger(BasePage.class);
	WebDriver driver;
	PropUtils objUtils;
	WebDriverWait wait;
	String pageTitle;

	public BasePage(WebDriver argDriver) throws IOException {
		this.driver = argDriver;
	}

	public BasePage(WebDriver argDriver, PropUtils argUtils) {
		this.driver = argDriver;
		this.objUtils = argUtils;
	}

	public boolean verifyHomePageTitle() {
		driver.get(PropUtils.commonUsed.getProperty("baseUrl"));
		driver.manage().window().maximize();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			logger.info("Interrupted exception in verifyHomePageTitle", e);
			return false;
		}
		return driver.getTitle().contains(PropUtils.commonUsed.getProperty("expectedPageTitle").trim());
	}

	public LoginPage clickLogin() {
		try {
			driver.findElement(By.xpath(PropUtils.commonUsed.getProperty("loginToTrainingButton"))).click();
		} catch (Exception e) {
			logger.info("Cannot navigate to Login Page", e);
		}
		return new LoginPage(driver, objUtils);
	}

}
