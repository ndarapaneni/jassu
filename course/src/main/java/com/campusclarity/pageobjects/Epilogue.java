package com.campusclarity.pageobjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.campusclarity.utilities.CommonUtils;
import com.campusclarity.utilities.PropUtils;

public class Epilogue {
	private static final Logger logger = Logger.getLogger(SexInCollege.class);
	WebDriver driver;
	PropUtils objUtils;
	WebDriverWait wait;
	String pageTitle;
	String nextBtnXPath = PropUtils.commonUsed.getProperty("NextBtn");
	String nextSlideXPath = PropUtils.commonUsed.getProperty("nextSlide");

	public Epilogue(WebDriver argDriver) {
		this.driver = argDriver;
	}
	public Epilogue(WebDriver argDriver, PropUtils argUtils) {
		this.driver = argDriver;
		this.objUtils = argUtils;
	}

	public String getEpilogueProperty(String propKey) {
		return PropUtils.epilogue.getProperty(propKey);
	}

	public String getCommonUedProperty(String propKey) {
		return PropUtils.commonUsed.getProperty(propKey);
	}
	public boolean verifyEpilogueYourFeedbackTitle() {
		return CommonUtils.verifyTitle(driver, getEpilogueProperty("expectedEpilogueYourFeedbackTitle"),
				getEpilogueProperty("epilogueYourFeedbackTitle"));
	}
	
	public void selectFeedbackOptionsFromDropdownList() throws InterruptedException{
		CommonUtils.answerShareLittleAboutYouQuestions(driver, getCommonUedProperty("feedbackQues1"), 2);
		CommonUtils.answerShareLittleAboutYouQuestions(driver, getCommonUedProperty("feedbackQues2"), 1);
		CommonUtils.answerShareLittleAboutYouQuestions(driver, getCommonUedProperty("feedbackQues3"), 3);
		CommonUtils.answerShareLittleAboutYouQuestions(driver, getCommonUedProperty("feedbackQues4"), 4);
		CommonUtils.answerShareLittleAboutYouQuestions(driver, getCommonUedProperty("feedbackQues5"), 1);
		CommonUtils.answerShareLittleAboutYouQuestions(driver, getCommonUedProperty("feedbackQues6"), 3);
		Thread.sleep(1000);
		driver.findElement(By.xpath(getCommonUedProperty("feedbackCommentBox"))).sendKeys("Enter any Comment");
		CommonUtils.findAndClickElementByXPath(driver, getCommonUedProperty("feedbackSubmitBtn"));
	}
	public boolean verifyAndClickNextButton() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyAndClickNextButton(driver, getCommonUedProperty("NextBtn"));
	}
	public boolean verifyEpilogueCourseCompleteTitle() {
		return CommonUtils.verifyTitle(driver, getEpilogueProperty("expectedEpilogueCourseCompleteTitle"),
				getEpilogueProperty("epilogueCourseCompleteTitle"));
	}
	
}
