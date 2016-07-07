package com.campusclarity.pageobjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.campusclarity.utilities.CommonUtils;
import com.campusclarity.utilities.PropUtils;

public class Prologue {
	private static final Logger logger = Logger.getLogger(Prologue.class);
	WebDriver driver;
	PropUtils objUtils;
	WebDriverWait wait;
	String pageTitle;
	String nextBtnXPath = getCommonUedProperty("NextBtn");
	String student = getCommonUedProperty("sublink1");

	public Prologue(WebDriver argDriver) {
		this.driver = argDriver;
	}

	public Prologue(WebDriver argDriver, PropUtils argUtils) {
		this.driver = argDriver;
		this.objUtils = argUtils;
	}

	public String getCommonUedProperty(String propKey) {
		return PropUtils.commonUsed.getProperty(propKey);
	}

	public String getPrologueProperty(String propKey) {
		return PropUtils.prologue.getProperty(propKey);
	}

	public boolean verifyWelcomeTitle() throws InterruptedException {
		CommonUtils.findAndClickElementByXPath(driver, getPrologueProperty("enableAccessibilityMode"));
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getPrologueProperty("expectedWelcomeTitle"),
				getPrologueProperty("prologueWelcomeTitle"));
	}

	public boolean verifyAndClickNextButton() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyAndClickNextButton(driver, getCommonUedProperty("NextBtn"));

	}

	public boolean verifyThinkAboutItTitle() {
		return CommonUtils.verifyTitle(driver, getPrologueProperty("expectedThinkAboutItTitle"),
				getPrologueProperty("prologueThinkAboutItTitle"));
	}

	public void waitForVideo() {
		CommonUtils.waitForVideo(driver, nextBtnXPath);
	}

	public boolean verifyWelcomeLetterTitle() {
		return CommonUtils.verifyTitle(driver, getPrologueProperty("expectedWelcomeLetterTitle"),
				getPrologueProperty("prologueWelcomeLetterTitle"));
	}

	public boolean verifyHowTheCourseWorksTitle() {
		return CommonUtils.verifyTitle(driver, getPrologueProperty("expectedHowTheCourseWorksTitle"),
				getPrologueProperty("prologueHowTheCourseWorksTitle"));
	}

	public boolean verifyMeetOrientationGroupTitle() throws InterruptedException {
		Thread.sleep(1000);
		CommonUtils.waitToBePresent(driver, 5000, getPrologueProperty("prologueMeetOrientationBeginBtn"));
		CommonUtils.findAndClickElementByXPath(driver, getPrologueProperty("prologueMeetOrientationBeginBtn"));
		return CommonUtils.verifyTitle(driver, getPrologueProperty("expectedMeetOrientationGroupTitle"),
				getPrologueProperty("prologueMeetOrientationGroupTitle"));
	}

	public boolean clickAndVerifyMaddieTitle() throws InterruptedException {
		Thread.sleep(2000);
		CommonUtils.waitToBePresent(driver, 5000, getCommonUedProperty("sublink1"));
		CommonUtils.findAndClickElementByXPath(driver, getCommonUedProperty("sublink1"));
		logger.info("Able to click Maddie");
		Thread.sleep(2000);
		return CommonUtils.verifyTitle(driver, getPrologueProperty("expectedMaddieSnowTitle"),
				getPrologueProperty("prologueMaddieSnowTitle"));
	}

	public void waitForSubVideo() {
		CommonUtils.waitForSubVideo(driver, student);
	}

	public boolean clickAndVerifyAlexTitle() {
		try {
			Thread.sleep(2000);
			CommonUtils.waitToBePresent(driver, 5000, getCommonUedProperty("sublink2"));
			WebElement alex = driver.findElement(By.xpath(getCommonUedProperty("sublink2")));
			Actions actions = new Actions(driver);
			CommonUtils.clickSurrounding(actions, alex);
			logger.info("Able to click Alex");
			Thread.sleep(2000);

			return CommonUtils.verifyTitle(driver, getPrologueProperty("expectedAlexBrownTitle"),
					getPrologueProperty("prologueAlexBrownTitle"));
		} catch (InterruptedException e) {
			logger.info("exception in clickAndVerifyAlexTitle", e);
		}
		return false;
	}

	public boolean clickAndVerifyTomTitle() {
		try {
			Thread.sleep(2000);
			CommonUtils.waitToBePresent(driver, 5000, getCommonUedProperty("sublink3"));
			WebElement tom = driver.findElement(By.xpath(getCommonUedProperty("sublink3")));
			Actions actions = new Actions(driver);
			CommonUtils.clickSurrounding(actions, tom);
			logger.info("Able to click Tom");
			Thread.sleep(2000);

			return CommonUtils.verifyTitle(driver, getPrologueProperty("expectedTomBatakTitle"),
					getPrologueProperty("prologueTomBatakTitle"));

		} catch (InterruptedException e) {
			logger.info("exception in clickAndVerifyTomTitle", e);
		}
		return false;
	}

	public boolean clickAndVerifyNoraTitle() {
		try {
			Thread.sleep(3000);
			CommonUtils.waitToBePresent(driver, 5000, getCommonUedProperty("sublink4"));
			WebElement nora = driver.findElement(By.xpath(getCommonUedProperty("sublink4")));
			Actions actions = new Actions(driver);
			CommonUtils.clickSurrounding(actions, nora);
			logger.info("Able to click Nora");
			Thread.sleep(3000);

			return CommonUtils.verifyTitle(driver, getPrologueProperty("expectedNoraShermTitle"),
					getPrologueProperty("prologueNoraShermTitle"));

		} catch (InterruptedException e) {
			logger.info("exception in clickAndVerifyNoraTitle", e);
		}
		return false;
	}

	public void answerShareLittleAboutYouQuestions() {
		CommonUtils.answerShareLittleAboutYouQuestions(driver, getCommonUedProperty("q1"), 2);
		CommonUtils.answerShareLittleAboutYouQuestions(driver, getCommonUedProperty("q2"), 3);
		CommonUtils.answerShareLittleAboutYouQuestions(driver, getCommonUedProperty("q3"), 1);
	}

	public void waitToSubmitShareLittleAboutYou() throws InterruptedException {
		Thread.sleep(1000);
		CommonUtils.waitToSubmitShareLittleAboutYou(driver, getCommonUedProperty("submitBtn"), getCommonUedProperty("doneBtn"));
	}

	public boolean verifyComingUpTitle() {
		return CommonUtils.verifyTitle(driver, getPrologueProperty("expectedComingUpTitle"),
				getPrologueProperty("prologueComingUpTitle"));
	}

	public SexInCollege continueToNextPage() {
		return new SexInCollege(driver, objUtils);
	}
}
