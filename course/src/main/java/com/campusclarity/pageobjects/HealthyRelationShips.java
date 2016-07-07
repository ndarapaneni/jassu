package com.campusclarity.pageobjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.campusclarity.utilities.CommonUtils;
import com.campusclarity.utilities.PropUtils;

public class HealthyRelationShips {
	private static final Logger logger = Logger.getLogger(SexInCollege.class);
	WebDriver driver;
	PropUtils objUtils;
	WebDriverWait wait;
	String pageTitle;
	String nextBtnXPath = PropUtils.commonUsed.getProperty("NextBtn");
	String nextSlideXPath = PropUtils.commonUsed.getProperty("nextSlide");

	public HealthyRelationShips(WebDriver argDriver) {
		this.driver = argDriver;
	}

	public HealthyRelationShips(WebDriver argDriver, PropUtils argUtils) {
		this.driver = argDriver;
		this.objUtils = argUtils;
	}
	
	public String getCommonUedProperty(String propKey) {
		return PropUtils.commonUsed.getProperty(propKey);
	}

	public String getHealthyRelationShipsProperty(String propKey) {
		return PropUtils.healthyRelationShips.getProperty(propKey);
	}

	public boolean verifyTimeBombIntroductionTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getHealthyRelationShipsProperty("expectedTBIntroductionTitle"),
				getHealthyRelationShipsProperty("hrTBIntroductionTitle"));	
	}
	public boolean verifyAndClickNextSlide() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyAndClickNextSlide(driver, getCommonUedProperty("nextSlide"));
	}
	public boolean verifyTimeBombAlexDormTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getHealthyRelationShipsProperty("expectedTBAlexDorm"),
				getHealthyRelationShipsProperty("hrTBAlexDormTitle"));	
	}
	public void waitForVideoToComplete() {
		CommonUtils.waitForVideoToComplete(driver, nextSlideXPath);
	}

	public boolean verifyTimeBombWeekLaterTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getHealthyRelationShipsProperty("expectedTBWeekLaterTitle"),
				getHealthyRelationShipsProperty("hrTBWeekLaterTitle"));	
	}
	public boolean verifyTimeBombCafeteriaTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getHealthyRelationShipsProperty("expectedTBCafeteriaTitle"),
				getHealthyRelationShipsProperty("hrTBCafeteriaTitle"));	
	}
	public boolean verifyTimeBombWeeksLaterTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getHealthyRelationShipsProperty("expectedTBWeeksLaterTitle"),
				getHealthyRelationShipsProperty("hrTBWeeksLaterTitle"));	
	}
	public boolean verifyTimeBombTylerApartmentTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getHealthyRelationShipsProperty("expectedTBTylerApartmentTitle"),
				getHealthyRelationShipsProperty("hrTBTylerApartmentTitle"));	
	}
	public boolean verifyTimeBombSummaryTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getHealthyRelationShipsProperty("expectedTBSummaryTitle"),
				getHealthyRelationShipsProperty("hrTBSummaryTitle"));	
	}
	public boolean verifyAndClickNextButton() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyAndClickNextButton(driver, getCommonUedProperty("NextBtn"));
	}

	public void answerShareLittleAboutYouTwoQuestions() throws InterruptedException {
		Thread.sleep(1000);
		CommonUtils.answerShareLittleAboutYouQuestions(driver, getCommonUedProperty("q1"), 2);
		CommonUtils.answerShareLittleAboutYouQuestions(driver, getCommonUedProperty("q2"), 3);
	}

	public void waitToSubmitAnswersOfShareLittleAboutYou() {
		CommonUtils.waitToSubmitShareLittleAboutYou(driver, getCommonUedProperty("submitBtn"),
				getCommonUedProperty("doneBtn"));
	}

	public boolean verifyhrIntroductionTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getHealthyRelationShipsProperty("expectedIntroductionTitle"),
				getHealthyRelationShipsProperty("hrIntroductionTitle"));
	}
	public boolean verifyhrSomethingNotQuiteRightTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getHealthyRelationShipsProperty("expectedSomethingNotQuiteRightTitle"),
				getHealthyRelationShipsProperty("hrSomethingNotQuiteRightTitle"));
	}
	public void waitForVideo() {
		CommonUtils.waitForVideo(driver, nextBtnXPath);
	}
	public boolean verifyhrAboutHealthyRelationshipsTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getHealthyRelationShipsProperty("expectedAboutHealthyRelationshipsTitle"),
				getHealthyRelationShipsProperty("hrAboutHealthyRelationshipsTitle"));
	}
	public boolean verifyhrKnowThyselfTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getHealthyRelationShipsProperty("expectedKnowThyselfTitle"),
				getHealthyRelationShipsProperty("hrKnowThyselfTitle"));
	}
	public boolean verifyhrMakingsofGoodRelationshipTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getHealthyRelationShipsProperty("expectedMakingsofGoodRelationshipTitle"),
				getHealthyRelationShipsProperty("hrMakingsofGoodRelationshipTitle"));
	}
	public boolean verifyhrAreYouinBadRelationshipTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getHealthyRelationShipsProperty("expectedAreYouinBadRelationshipTitle"),
				getHealthyRelationShipsProperty("hrAreYouinBadRelationshipTitle"));
	}
	public boolean verifyhrWarningSignsTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getHealthyRelationShipsProperty("expectedWarningSignsTitle"),
				getHealthyRelationShipsProperty("hrWarningSignsTitle"));
	}
	public boolean verifyhrAbusiveRelationshipsTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getHealthyRelationShipsProperty("expectedAbusiveRelationshipsTitle"),
				getHealthyRelationShipsProperty("hrAbusiveRelationshipsTitle"));
	}
	public boolean verifyhrUnderstandRelationshipViolenceTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getHealthyRelationShipsProperty("expectedUnderstandRelationshipViolenceTitle"),
				getHealthyRelationShipsProperty("hrUnderstandRelationshipViolenceTitle"));
	}
	public boolean verifyhrImportantLegalTermsTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getHealthyRelationShipsProperty("expectedImportantLegalTermsTitle"),
				getHealthyRelationShipsProperty("hrImportantLegalTermsTitle"));
	}
	public void verifySubTabsAndClose() {

		CommonUtils.clickVerifyAndCloseATab(driver, getHealthyRelationShipsProperty("hrLegalterm1"),getCommonUedProperty("closeBtn"));
		CommonUtils.clickVerifyAndCloseATab(driver, getHealthyRelationShipsProperty("hrLegalterm2"),getCommonUedProperty("closeBtn"));
		CommonUtils.clickVerifyAndCloseATab(driver, getHealthyRelationShipsProperty("hrLegalterm3"),getCommonUedProperty("closeBtn"));
	}

	public boolean verifyhrCyberstalkingTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getHealthyRelationShipsProperty("expectedCyberstalkingTitle"),
				getHealthyRelationShipsProperty("hrCyberstalkingTitle"));
	}
	public void clickFlipcards() {
		CommonUtils.clickFlipcards(driver, getHealthyRelationShipsProperty("clickImg1"));
		CommonUtils.clickFlipcards(driver, getHealthyRelationShipsProperty("clickImg2"));
		CommonUtils.clickFlipcards(driver, getHealthyRelationShipsProperty("clickImg3"));
	}

	public boolean verifyhrRespondingToTroubleTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getHealthyRelationShipsProperty("expectedRespondingToTroubleTitle"),
				getHealthyRelationShipsProperty("hrRespondingToTroubleTitle"));
	}
	public boolean verifyhrHelpingFriendTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getHealthyRelationShipsProperty("expectedHelpingFriendTitle"),
				getHealthyRelationShipsProperty("hrHelpingFriendTitle"));
	}
	public boolean verifyhrRelationshipsinPerilTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getHealthyRelationShipsProperty("expectedRelationshipsinPerilTitle"),
				getHealthyRelationShipsProperty("hrRelationshipsinPerilTitle"));
	}
	//click a tab wait for video to complete and appear the drag and drop sort question to answer
	public void clickSubVideoOneInAPage() throws InterruptedException {
		CommonUtils.clickTabsInsideAPage(driver, getHealthyRelationShipsProperty("story1"),
				getHealthyRelationShipsProperty("expectedLaurenAndOliviaTitle"),
				getHealthyRelationShipsProperty("hrLaurenAndOliviaTitle"));
		CommonUtils.waitForQuestionToAppear(driver, getCommonUedProperty("source1"));
		CommonUtils.VerifyDragandDropFunctionality(driver, getCommonUedProperty("source3"),
				getCommonUedProperty("destination"));
		CommonUtils.VerifydragAndDropAnswer(driver, getCommonUedProperty("subBtn"),
				getCommonUedProperty("tryAgainbtn"), getCommonUedProperty("nxtDialogBtn"));
		CommonUtils.VerifyDragandDropFunctionality(driver, getCommonUedProperty("source2"),
				getCommonUedProperty("destination"));
		CommonUtils.VerifydragAndDropAnswer(driver, getCommonUedProperty("subBtn"),
				getCommonUedProperty("tryAgainbtn"), getCommonUedProperty("nxtDialogBtn"));
		Thread.sleep(2000);
	}
	//click a tab wait for video to complete and appear the drag and drop sort question to answer
	public void clickSubVideoTwoInAPage() throws InterruptedException {
		CommonUtils.clickTabsInsideAPage(driver, getHealthyRelationShipsProperty("story2"),
				getHealthyRelationShipsProperty("expectedbenAndKeishaTitle"),
				getHealthyRelationShipsProperty("hrbenAndKeishaTitle"));
		CommonUtils.waitForQuestionToAppear(driver, getCommonUedProperty("source1"));
		CommonUtils.VerifyDragandDropFunctionality(driver, getCommonUedProperty("source3"),
				getCommonUedProperty("destination"));
		CommonUtils.VerifydragAndDropAnswer(driver, getCommonUedProperty("subBtn"),
				getCommonUedProperty("tryAgainbtn"), getCommonUedProperty("nxtDialogBtn"));
		CommonUtils.VerifyDragandDropFunctionality(driver, getCommonUedProperty("source1"),
				getCommonUedProperty("destination"));
		CommonUtils.VerifydragAndDropAnswer(driver, getCommonUedProperty("subBtn"),
				getCommonUedProperty("tryAgainbtn"), getCommonUedProperty("nxtDialogBtn"));
		Thread.sleep(2000);
	}
	//click a tab wait for video to complete and appear the drag and drop sort question to answer	
	public void clickSubVideoThreeInAPage() throws InterruptedException {
		CommonUtils.clickTabsInsideAPage(driver, getHealthyRelationShipsProperty("story3"),
				getHealthyRelationShipsProperty("expectedkatrinaAndJoshTitle"),
				getHealthyRelationShipsProperty("hrkatrinaAndJoshTitle"));
		CommonUtils.waitForQuestionToAppear(driver, getCommonUedProperty("source1"));
		CommonUtils.VerifyDragandDropFunctionality(driver, getCommonUedProperty("source1"),
				getCommonUedProperty("destination"));
		CommonUtils.VerifydragAndDropAnswer(driver, getCommonUedProperty("subBtn"),
				getCommonUedProperty("tryAgainbtn"), getCommonUedProperty("nxtDialogBtn"));
		CommonUtils.VerifyDragandDropFunctionality(driver, getCommonUedProperty("source3"),
				getCommonUedProperty("destination"));
		CommonUtils.VerifydragAndDropAnswer(driver, getCommonUedProperty("subBtn"),
				getCommonUedProperty("tryAgainbtn"), getCommonUedProperty("nxtDialogBtn"));
		Thread.sleep(2000);

	}
	public boolean verifyhrSummaryTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getHealthyRelationShipsProperty("expectedhrSummaryTitle"),
				getHealthyRelationShipsProperty("hrSummaryTitle"));
	}
	//click  tabs inside a page 
	public void verifyClickabilityOfTabs() throws InterruptedException {
		Thread.sleep(1000);
		CommonUtils.findAndClickElementByXPath(driver, getHealthyRelationShipsProperty("hrAYIABRCriticism"));
		Thread.sleep(1000);
		CommonUtils.findAndClickElementByXPath(driver, getHealthyRelationShipsProperty("hrAYIABRExternalConcern"));
		Thread.sleep(1000);
		CommonUtils.findAndClickElementByXPath(driver, getHealthyRelationShipsProperty("hrAYIABRTrust"));
	}
	public PartyingSmart continueToNextPage() {
		return new PartyingSmart(driver, objUtils);
	}

}
