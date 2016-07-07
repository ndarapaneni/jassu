package com.campusclarity.pageobjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.campusclarity.utilities.CommonUtils;
import com.campusclarity.utilities.PropUtils;

public class SexInCollege {
	private static final Logger logger = Logger.getLogger(SexInCollege.class);
	WebDriver driver;
	PropUtils objUtils;
	WebDriverWait wait;
	String pageTitle;
	String nextBtnXPath = PropUtils.commonUsed.getProperty("NextBtn");
	String nextSlideXPath = PropUtils.commonUsed.getProperty("nextSlide");

	public SexInCollege(WebDriver argDriver) {
		this.driver = argDriver;
	}

	public SexInCollege(WebDriver argDriver, PropUtils argUtils) {
		this.driver = argDriver;
		this.objUtils = argUtils;
	}
	public String getCommonUedProperty(String propKey) {
		return PropUtils.commonUsed.getProperty(propKey);
	}

	public String getSexInCollegeProperty(String propKey) {
		return PropUtils.sexInCollege.getProperty(propKey);
	}

	public boolean verifyMixedSignalsIntroductionTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getSexInCollegeProperty("expectedMSIntroductionTitle"),
				getSexInCollegeProperty("sicMixedSignalsIntroductionTitle"));	
	}
	public boolean verifyAndClickNextSlide() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyAndClickNextSlide(driver, getCommonUedProperty("nextSlide"));
	}

	public boolean verifyMixedSignalsAtThePartyTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getSexInCollegeProperty("expectedMSAtThePartyTitle"),
				getSexInCollegeProperty("sicMSAtThePartyTitle"));
	}
	public void waitForVideoToComplete() {
		CommonUtils.waitForVideoToComplete(driver, nextSlideXPath);
	}
	public boolean verifyMixedSignalsSaturdayAfternoonTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getSexInCollegeProperty("expectedMSSaturdayAfternoonTitle"),
				getSexInCollegeProperty("sicMSSaturdayAfternoonTitle"));
	}
	public boolean verifyMixedSignalsOutShoppingHauteClappyTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getSexInCollegeProperty("expectedMSOutShoppingHauteClappyTitle"),
				getSexInCollegeProperty("sicMSOutShoppingHauteClappyTitle"));
	}
	public boolean verifyMixedSignalsACoupleWeeksLaterTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getSexInCollegeProperty("expectedMSCoupleWeeksLaterTitle"),
				getSexInCollegeProperty("sicMSCoupleWeeksLaterTitle"));
	}
	public boolean verifyMixedSignalsAtTheCafeTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getSexInCollegeProperty("expectedMSAtTheCafeTitle"),
				getSexInCollegeProperty("sicMSAtTheCafeTitle"));
	}
	public boolean verifyMixedSignalsLetsGoBackTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getSexInCollegeProperty("expectedMSLetsGoBackTitle"),
				getSexInCollegeProperty("sicMSLetsGoBackTitle"));
	}
		
	// Write the Same method "verifyMixedSignalsAtThePartyTitle"
	public boolean verifyMixedSignalsAfterThePartyTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getSexInCollegeProperty("expectedMSAfterThePartyTitle"),
				getSexInCollegeProperty("sicMSAfterThePartyTitle"));
	}
	public boolean verifyMixedSignalsVideoGamesTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getSexInCollegeProperty("expectedMSVideoGamesTitle"),
				getSexInCollegeProperty("sicMSVideoGamesTitle"));
	}
	public boolean verifyMixedSignalsSummaryTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getSexInCollegeProperty("expectedMSSummaryTitle"),
				getSexInCollegeProperty("sicMSSummaryTitle"));
	}
	public boolean verifyAndClickNextButton() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyAndClickNextButton(driver, getCommonUedProperty("NextBtn"));
	}
	public void answerShareLittleAboutYouTwoQuestions() {
		CommonUtils.answerShareLittleAboutYouQuestions(driver, getCommonUedProperty("q1"), 2);
		CommonUtils.answerShareLittleAboutYouQuestions(driver, getCommonUedProperty("q2"), 3);
	}

	public void waitToSubmitAnswersOfShareLittleAboutYou() {
		CommonUtils.waitToSubmitShareLittleAboutYou(driver,getCommonUedProperty("submitBtn"),
				getCommonUedProperty("doneBtn"));
	}

	public boolean verifySexInCollegeIntroductionTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getSexInCollegeProperty("expectedIntroductionTitle"),
				getSexInCollegeProperty("sicIntroductionTitle"));
	}
	public boolean verifySexInCollegeHookingUpTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getSexInCollegeProperty("expectedHookingUpTitle"),
				getSexInCollegeProperty("sicHookingUpTitle"));
	}
	public void waitForVideo() {
		CommonUtils.waitForVideo(driver, nextBtnXPath);
	}

	public boolean verifySexInCollegeWhatIsHookingUpTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getSexInCollegeProperty("expectedWhatisHookingUpTitle"),
				getSexInCollegeProperty("sicWhatisHookingUpTitle"));
	}
	public void answerShareLittleAboutYouSixQuestions() {
		CommonUtils.answerShareLittleAboutYouQuestions(driver, getCommonUedProperty("q1"), 2);
		CommonUtils.answerShareLittleAboutYouQuestions(driver, getCommonUedProperty("q2"), 3);
		CommonUtils.answerShareLittleAboutYouQuestions(driver, getCommonUedProperty("q3"), 1);
		CommonUtils.answerShareLittleAboutYouQuestions(driver, getCommonUedProperty("q4"), 3);
		CommonUtils.answerShareLittleAboutYouQuestions(driver, getCommonUedProperty("q5"), 1);
		CommonUtils.answerShareLittleAboutYouQuestions(driver, getCommonUedProperty("q6"), 3);
	}

	public void waitToSubmitSixAnswersOfShareLittleAboutYou() {
		CommonUtils.waitToSubmitShareLittleAboutYou(driver, getSexInCollegeProperty("submitShareAboutYouBtn"),
				getSexInCollegeProperty("clickShareAboutYouDoneBtn"));
	}

	public boolean verifySexInCollegePressureExpectationsTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getSexInCollegeProperty("expectedPressureExpectationsTitle"),
				getSexInCollegeProperty("sicPressureExpectationsTitle"));	
	}
	public void verifySubTabsAndClose() throws InterruptedException {
		Thread.sleep(2000);
		CommonUtils.clickVerifyAndCloseATab(driver, getCommonUedProperty("sublink1"),
				getCommonUedProperty("closeBtn"));
		Thread.sleep(3000);
		CommonUtils.clickVerifyAndCloseATab(driver, getCommonUedProperty("sublink2"),
				getCommonUedProperty("closeBtn"));
		Thread.sleep(3000);
		CommonUtils.clickVerifyAndCloseATab(driver, getCommonUedProperty("sublink3"),
				getCommonUedProperty("closeBtn"));
		
	}

	public boolean verifySexInCollegeAwkwardMomentsTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getSexInCollegeProperty("expectedAwkwardMomentsTitle"),
				getSexInCollegeProperty("sicAwkwardMomentsTitle"));		
	}
	public boolean verifySexInCollegeWhyKeepDoingItTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getSexInCollegeProperty("expectedWhyKeepDoingItTitle"),
				getSexInCollegeProperty("sicWhyKeepDoingItTitle"));	
	}
	public boolean verifySexInCollegeSystemicProblemsTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getSexInCollegeProperty("expectedSystemicProblemsTitle"),
				getSexInCollegeProperty("sicSystemicProblemsTitle"));	
	}
	public boolean verifySexInCollegeDatingAfterCollegeTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getSexInCollegeProperty("expectedDatingAfterCollegeTitle"),
				getSexInCollegeProperty("sicDatingAfterCollegeTitle"));	
	}
	public boolean verifySexInCollegeSummaryTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getSexInCollegeProperty("expectedMSummaryTitle"),
				getSexInCollegeProperty("sicSummaryTitle"));	
	}
	public HealthyRelationShips continueToNextPage() {
		return new HealthyRelationShips(driver, objUtils);
	}

}
