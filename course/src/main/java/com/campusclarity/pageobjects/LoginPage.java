package com.campusclarity.pageobjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.campusclarity.utilities.PropUtils;

public class LoginPage {

	private static final Logger logger = Logger.getLogger(LoginPage.class);
	WebDriver driver;
	PropUtils objUtils;
	WebDriverWait wait;
	String pageTitle;

	public LoginPage(WebDriver argDriver) {
		this.driver = argDriver;
	}

	public LoginPage(WebDriver argDriver, PropUtils argUtils) {
		this.driver = argDriver;
		this.objUtils = argUtils;
	}

	public boolean verifyPageTitle() {
		String expectedPageTitle = PropUtils.commonUsed.getProperty("expectedPageTitle") + " : Login";
		return driver.getTitle().contains(expectedPageTitle);
	}

	public boolean verifyEmailAddress(String enterEmail) {
		try {
			StringBuilder errorMessage = new StringBuilder();
			driver.findElement(By.xpath(PropUtils.commonUsed.getProperty("emailAddress"))).sendKeys(enterEmail);
			driver.findElement(By.xpath(PropUtils.commonUsed.getProperty("continue1"))).click();
			WebElement errorMsg;
			if (!driver.findElements(By.xpath(PropUtils.commonUsed.getProperty("invalidEmailMessage"))).isEmpty()) {
				errorMsg = driver.findElement(By.xpath(PropUtils.commonUsed.getProperty("invalidEmailMessage")));
				if (errorMsg.isDisplayed()) {
					errorMessage.append("Not a valid email address");
					if (!errorMsg.getText().equals("Email address is required")) {
						errorMessage.append(": error message doesn't match expected message: ").append(errorMsg);
					}
					throw new RuntimeException(errorMessage.toString());
				}
			}
			WebElement passwordField = driver.findElement(By.xpath(PropUtils.commonUsed.getProperty("password")));
			if (passwordField.isDisplayed()) {
				return true;
			}
		} catch (Exception e) {
			logger.info("exception in verifyEmailAddress", e);
			return false;
		}
		return false;
	}

	public boolean verifyLogin(String password) {
		StringBuilder errorMessage = new StringBuilder();
		try {
			driver.findElement(By.xpath(PropUtils.commonUsed.getProperty("password"))).sendKeys(password);
			driver.findElement(By.xpath(PropUtils.commonUsed.getProperty("continue2"))).click();
			WebElement errorMsg;
			if (!driver.findElements(By.xpath(PropUtils.commonUsed.getProperty("invalidPasswordMessage"))).isEmpty()) {
				errorMsg = driver.findElement(By.xpath(PropUtils.commonUsed.getProperty("invalidPasswordMessage")));
				if (errorMsg.isDisplayed()) {
					errorMessage.append("Not a valid password");
					if (!errorMsg.getText().equals(
							"The email or password you entered wasn't recognized. Please try again or contact your administrator.")) {
						errorMessage.append(": error message doesn't match expected message: ").append(errorMsg);
					}
				}
			}
			String pageTitle = driver.getTitle();
			String expectedPageTitle = PropUtils.commonUsed.getProperty("expectedPageTitle") + " : My Courses";
			if (expectedPageTitle.equals(pageTitle)) {
				return true;
			} else {
				errorMessage.append("pageTitle doesn't match expected: ").append(pageTitle);
			}
			throw new RuntimeException(errorMessage.toString());
		} catch (Exception e) {
			logger.info("exception in verifyLogin", e);
			return false;
		}
	}

	public HomePage clickContinue() {
		try {
			driver.findElement(By.xpath(PropUtils.commonUsed.getProperty("continue2"))).click();
		} catch (Exception e) {
			logger.info("Cannot navigate to Login Page", e);
		}
		return new HomePage(driver);
	}

}
