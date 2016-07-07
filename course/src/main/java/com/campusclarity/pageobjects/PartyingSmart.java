package com.campusclarity.pageobjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.campusclarity.utilities.CommonUtils;
import com.campusclarity.utilities.PropUtils;

public class PartyingSmart {

	private static final Logger logger = Logger.getLogger(SexInCollege.class);
	WebDriver driver;
	PropUtils objUtils;
	WebDriverWait wait;
	String pageTitle;
	String nextBtnXPath = PropUtils.commonUsed.getProperty("NextBtn");
	String nextSlideXPath = PropUtils.commonUsed.getProperty("nextSlide");

	public PartyingSmart(WebDriver argDriver) {
		this.driver = argDriver;
	}

	public PartyingSmart(WebDriver argDriver, PropUtils argUtils) {
		this.driver = argDriver;
		this.objUtils = argUtils;
	}

	public String getCommonUedProperty(String propKey) {
		return PropUtils.commonUsed.getProperty(propKey);
	}

	public String getPartyingSmartProperty(String propKey) {
		return PropUtils.partyingSmart.getProperty(propKey);
	}

	public boolean verifyPSBurnedOutIntroductionTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getPartyingSmartProperty("expectedBOIntroductionTitle"),
				getPartyingSmartProperty("psBOIntroductionTitle"));
	}

	public boolean verifyAndClickNextSlide() throws InterruptedException {
		Thread.sleep(2000);
		return CommonUtils.verifyAndClickNextSlide(driver, getCommonUedProperty("nextSlide"));
	}

	public boolean verifyPSBOMaddieDormRoomTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getPartyingSmartProperty("expectedMaddieDormRoomTitle"),
				getPartyingSmartProperty("psBOMaddieDormRoomTitle"));
	}

	public void waitForVideoToComplete() {
		CommonUtils.waitForVideoToComplete(driver, nextSlideXPath);
	}

	public boolean verifyPSBOSomeTimeLaterTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getPartyingSmartProperty("expectedBOSomeTimeLaterTitle"),
				getPartyingSmartProperty("psBOSomeTimeLaterTitle"));
	}

	public boolean verifyPSBOJustAfterClassTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getPartyingSmartProperty("expectedBOJustAfterClassTitle"),
				getPartyingSmartProperty("psBOJustAfterClassTitle"));
	}

	public boolean verifyPSBOAtthePartyTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getPartyingSmartProperty("expectedBOAtthePartyTitle"),
				getPartyingSmartProperty("psBOAtthePartyTitle"));
	}

	public boolean verifyPSBOOffCampusPartyTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getPartyingSmartProperty("expectedBOOffCampusPartyTitle"),
				getPartyingSmartProperty("psBOOffCampusPartyTitle"));
	}

	public boolean verifyPSBOSummaryTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getPartyingSmartProperty("expectedBOSummaryTitle"),
				getPartyingSmartProperty("psBOSummaryTitle"));
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
		CommonUtils.waitToSubmitShareLittleAboutYou(driver, getCommonUedProperty("submitBtn"),
				getCommonUedProperty("doneBtn"));
	}

	public boolean verifyPSIntroductionTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getPartyingSmartProperty("expectedPSIntroductionTitle"),
				getPartyingSmartProperty("psIntroductionTitle"));
	}

	public boolean verifyPSCollegeExperienceTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getPartyingSmartProperty("expectedCollegeExperienceTitle"),
				getPartyingSmartProperty("psCollegeExperienceTitle"));
	}

	public void waitForVideo() {
		CommonUtils.waitForVideo(driver, nextBtnXPath);
	}

	public boolean verifyPSPartyingRightTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getPartyingSmartProperty("expectedPartyingRightTitle"),
				getPartyingSmartProperty("psPartyingRightTitle"));
	}

	public boolean verifyPSAlcoholIdentityTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getPartyingSmartProperty("expectedAlcoholIdentityTitle"),
				getPartyingSmartProperty("psAlcoholIdentityTitle"));
	}

	public void verifySubTabsAndClose() {
		CommonUtils.clickVerifyAndCloseATab(driver, getCommonUedProperty("sublink1"), getCommonUedProperty("closeBtn"));
		CommonUtils.clickVerifyAndCloseATab(driver, getCommonUedProperty("sublink2"), getCommonUedProperty("closeBtn"));
		CommonUtils.clickVerifyAndCloseATab(driver, getCommonUedProperty("sublink3"), getCommonUedProperty("closeBtn"));
	}

	public boolean verifyPSEquallyImportantTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getPartyingSmartProperty("expectedEquallyImportantTitle"),
				getPartyingSmartProperty("psEquallyImportantTitle"));
	}

	public void answerShareLittleAboutYouFourQuestions() {
		CommonUtils.answerShareLittleAboutYouQuestions(driver, getCommonUedProperty("q1"), 2);
		CommonUtils.answerShareLittleAboutYouQuestions(driver, getCommonUedProperty("q2"), 3);
		CommonUtils.answerShareLittleAboutYouQuestions(driver, getCommonUedProperty("q3"), 1);
		CommonUtils.answerShareLittleAboutYouQuestions(driver, getCommonUedProperty("q4"), 3);
	}

	public void waitToSubmitFourAnswersOfShareLittleAboutYou() {
		CommonUtils.waitToSubmitShareLittleAboutYou(driver, getPartyingSmartProperty("psShareSubBtn"),
				getPartyingSmartProperty("psShareDoneBtn"));
	}

	public boolean verifyPSBartendersBestAdviceTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getPartyingSmartProperty("expectedBartendersBestAdviceTitle"),
				getPartyingSmartProperty("psBartendersBestAdviceTitle"));
		
	}

	public boolean clickAndverifyBAVideo1Title() throws InterruptedException {
		Thread.sleep(1000);
		CommonUtils.findAndClickElementByXPath(driver, getPartyingSmartProperty("psBartendersVideo1"));
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getPartyingSmartProperty("expectedWhatIsInYourDrinkTitle"),
				getPartyingSmartProperty("psBAWhatIsInYourDrinkTitle"));
	}

	public void waitForVideoToCompleteInBestAdvicePage() throws InterruptedException {
		Thread.sleep(1000);
		CommonUtils.waitBAVideoToComplete(driver, getPartyingSmartProperty("videoPauseBtn"));
		CommonUtils.findAndClickElementByXPath(driver, getPartyingSmartProperty("slideNextQues"));
		Thread.sleep(1000);
	}

	public void answerQuestions() throws InterruptedException {
		Thread.sleep(2000);
		CommonUtils.answerQuestions(driver, getCommonUedProperty("sublink2"), getPartyingSmartProperty("baTryAgainBtn"),
				getCommonUedProperty("sublink1"), getPartyingSmartProperty("slideNextQues"));
		Thread.sleep(2000);
		CommonUtils.answerQuestions(driver, getCommonUedProperty("sublink2"), getPartyingSmartProperty("baTryAgainBtn"),
				getCommonUedProperty("sublink3"), getCommonUedProperty("NextBtn"));
		Thread.sleep(1000);

	}

	public boolean clickAndverifyBAVideo2Title() throws InterruptedException {
		Thread.sleep(1000);
		CommonUtils.findAndClickElementByXPath(driver, getPartyingSmartProperty("psBartendersVideo2"));
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getPartyingSmartProperty("expectedWhatTheBuzzTitle"),
				getPartyingSmartProperty("psBAWhatTheBuzzTitle"));
	}

	public void waitForVideo2ToCompleteInBestAdvicePage() throws InterruptedException {
		Thread.sleep(1000);
		CommonUtils.waitBAVideoToComplete(driver, getPartyingSmartProperty("videoPauseBtn"));
		CommonUtils.findAndClickElementByXPath(driver, getPartyingSmartProperty("slideNextQues"));
		Thread.sleep(1000);
	}

	public void answerVideo2Questions() throws InterruptedException {
		Thread.sleep(2000);
		CommonUtils.answerQuestions(driver, getCommonUedProperty("sublink1"), getPartyingSmartProperty("baTryAgainBtn"),
				getCommonUedProperty("sublink2"), getPartyingSmartProperty("slideNextQues"));
		Thread.sleep(2000);
		CommonUtils.answerQuestions(driver, getCommonUedProperty("sublink1"), getPartyingSmartProperty("baTryAgainBtn"),
				getCommonUedProperty("sublink3"), getCommonUedProperty("NextBtn"));
		Thread.sleep(1000);

	}

	public boolean clickAndverifyBAVideo3Title() throws InterruptedException {
        Thread.sleep(1000);
		CommonUtils.findAndClickElementByXPath(driver, getPartyingSmartProperty("psBartendersVideo3"));
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getPartyingSmartProperty("expectedStayingSafeTitle"),
				getPartyingSmartProperty("psBAStayingSafeTitle"));
	}

	public void waitForVideo3ToCompleteInBestAdvicePage() throws InterruptedException {

		CommonUtils.waitBAVideoToComplete(driver, getPartyingSmartProperty("videoPauseBtn"));
		CommonUtils.findAndClickElementByXPath(driver, getPartyingSmartProperty("slideNextQues"));
		Thread.sleep(1000);
	}

	public void answerVideo3Questions() throws InterruptedException {
		Thread.sleep(2000);
		CommonUtils.answerQuestions(driver, getCommonUedProperty("sublink1"), getPartyingSmartProperty("baTryAgainBtn"),
				getCommonUedProperty("sublink2"), getPartyingSmartProperty("slideNextQues"));
		Thread.sleep(2000);
		CommonUtils.answerQuestions(driver, getCommonUedProperty("sublink1"), getPartyingSmartProperty("baTryAgainBtn"),
				getCommonUedProperty("sublink2"), getCommonUedProperty("NextBtn"));
		Thread.sleep(1000);

	}

	public boolean beginAndVerifyDialoguesDrinkingTitle() throws InterruptedException {
		Thread.sleep(2000);
		CommonUtils.findAndClickElementByXPath(driver, getPartyingSmartProperty("psDialogueDrinkingBeginBtn"));
		return CommonUtils.verifyTitle(driver, getPartyingSmartProperty("expectedDialoguesDrinkingTitle"),
				getPartyingSmartProperty("psDialoguesDrinkingTitle"));
	}

	public void respondAndDragAndDropDDQuestions1() throws InterruptedException {
		CommonUtils.findAndClickElementByXPath(driver, getPartyingSmartProperty("psDDRespondBtn"));
		CommonUtils.VerifyDragandDropFunctionality(driver, getCommonUedProperty("source3"),
				getCommonUedProperty("destination"));
		CommonUtils.VerifydragAndDropAnswer(driver, getCommonUedProperty("subBtn"), getPartyingSmartProperty("psDDTtryAgainBtn"),
				getPartyingSmartProperty("psDDNextDialog"));
		CommonUtils.VerifyDragandDropFunctionality(driver, getCommonUedProperty("source2"),
				getCommonUedProperty("destination"));
		CommonUtils.VerifydragAndDropAnswer(driver, getCommonUedProperty("subBtn"), getPartyingSmartProperty("psDDTtryAgainBtn"),
				getPartyingSmartProperty("psDDNextDialog"));
	}

	public void respondAndDragAndDropDDQuestions2() throws InterruptedException {
		CommonUtils.findAndClickElementByXPath(driver, getPartyingSmartProperty("psDDRespondBtn"));
		CommonUtils.VerifyDragandDropFunctionality(driver, getCommonUedProperty("source2"),
				getCommonUedProperty("destination"));
		CommonUtils.VerifydragAndDropAnswer(driver, getCommonUedProperty("subBtn"), getPartyingSmartProperty("psDDTtryAgainBtn"),
				getPartyingSmartProperty("psDDNextDialog"));
		CommonUtils.VerifyDragandDropFunctionality(driver, getCommonUedProperty("source3"),
				getCommonUedProperty("destination"));
		CommonUtils.VerifydragAndDropAnswer(driver, getCommonUedProperty("subBtn"), getPartyingSmartProperty("psDDTtryAgainBtn"),
				getPartyingSmartProperty("psDDNextDialog"));
	}

	public void respondAndDragAndDropDDQuestions3() throws InterruptedException {
		CommonUtils.findAndClickElementByXPath(driver, getPartyingSmartProperty("psDDRespondBtn"));
		CommonUtils.VerifyDragandDropFunctionality(driver, getCommonUedProperty("source2"),
				getCommonUedProperty("destination"));
		CommonUtils.VerifydragAndDropAnswer(driver, getCommonUedProperty("subBtn"), getPartyingSmartProperty("psDDTtryAgainBtn"),
				getPartyingSmartProperty("psDDNextDialog"));
		CommonUtils.VerifyDragandDropFunctionality(driver, getCommonUedProperty("source3"),
				getCommonUedProperty("destination"));
		CommonUtils.VerifydragAndDropAnswer(driver, getCommonUedProperty("subBtn"), getPartyingSmartProperty("psDDTtryAgainBtn"),
				getPartyingSmartProperty("psDDNextDialog"));
	}

	public void respondAndDragAndDropDDQuestions4() throws InterruptedException {
		CommonUtils.findAndClickElementByXPath(driver, getPartyingSmartProperty("psDDRespondBtn"));
		CommonUtils.VerifyDragandDropFunctionality(driver, getCommonUedProperty("source2"),
				getCommonUedProperty("destination"));
		CommonUtils.VerifydragAndDropAnswer(driver, getCommonUedProperty("subBtn"), getPartyingSmartProperty("psDDTtryAgainBtn"),
				getPartyingSmartProperty("psDDNextDialog"));
		CommonUtils.VerifyDragandDropFunctionality(driver, getCommonUedProperty("source1"),
				getCommonUedProperty("destination"));
		CommonUtils.VerifydragAndDropAnswer(driver, getCommonUedProperty("subBtn"), getPartyingSmartProperty("psDDTtryAgainBtn"),
				getPartyingSmartProperty("psDDNextDialog"));
	}

	public boolean verifyPSAvoidingPartyingFoulsTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getPartyingSmartProperty("expectedAvoidPartyFoulsTitle"),
				getPartyingSmartProperty("psAvoidPartyFoulsTitle"));
	}

	public boolean verifyPSPSSBeforePartyTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getPartyingSmartProperty("expectedBeforePartyTitle"),
				getPartyingSmartProperty("psPSSBeforePartyTitle"));
	}

	public boolean verifyPSPSSDuringThePartyTitle() throws InterruptedException {
		CommonUtils.findAndClickElementByXPath(driver, getPartyingSmartProperty("psPSSDuringPartyTab"));
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getPartyingSmartProperty("expectedDuringPartyTitle"),
				getPartyingSmartProperty("psPSSDuringPartyTitle"));
	}

	public boolean verifyPSPSSAfterThePartyTitle() throws InterruptedException {
		CommonUtils.findAndClickElementByXPath(driver, getPartyingSmartProperty("psPSSAfterPartyTab"));
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getPartyingSmartProperty("expectedAfterPartyTitle"),
				getPartyingSmartProperty("psPSSAfterPartyTitle"));
	}

	public boolean verifyPSANightOutTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getPartyingSmartProperty("expectedANightOutTitle"),
				getPartyingSmartProperty("psANightOutTitle"));
	}
	public void waitForVideoToCompleteInNightOutPage() throws InterruptedException {

		CommonUtils.waitBAVideoToComplete(driver, getPartyingSmartProperty("videoPauseBtn"));
		Thread.sleep(1000);
	}

	public boolean verifyPSRecognizingAlcoholPoisoningTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getPartyingSmartProperty("expectedAlcoholPoisoningTitle"),
				getPartyingSmartProperty("psAlcoholPoisoningTitle"));
	}

	public boolean clickAndVerifySymptomsTitle() throws InterruptedException {
		CommonUtils.findAndClickElementByXPath(driver, getPartyingSmartProperty("psRAPSymptomsLink"));
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getPartyingSmartProperty("expectedSymptomsTitle"),
				getPartyingSmartProperty("psRAPSymptomsTitle"));
	}

	public void waitForSubVideoToComplete(WebDriver driver) {
		try {
			while (true) {
				CommonUtils.waitToBePresent(driver, 5000, getPartyingSmartProperty("psRAPSymptomsLink"));
				WebElement button = driver.findElement(By.xpath(getPartyingSmartProperty("psRAPSymptomsLink")));
				if (button.isDisplayed()) {
					break;
				}

			}
		} catch (Exception e) {
			logger.info("Failure on Video Page" + e);
		}
	}

	public boolean clickAndVerifyWhatToDoTitle() throws InterruptedException {
		CommonUtils.findAndClickElementByXPath(driver, getPartyingSmartProperty("psRAPWhatToDoLink"));
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getPartyingSmartProperty("expectedWhatToDoTitle"),
				getPartyingSmartProperty("psRAPWhatToDoTitle"));
	}

	public boolean clickAndVerifyBacchusManeuverTitle() throws InterruptedException {
		CommonUtils.findAndClickElementByXPath(driver, getPartyingSmartProperty("psRAPBacchusManeuverLink"));
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getPartyingSmartProperty("expectedBacchusPositionTitle"),
				getPartyingSmartProperty("psRAPBacchusPositionTitle"));
	}

	public boolean verifyPSBloodAlcoholCalTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getPartyingSmartProperty("expectedBloodAlcoholCalTitle"),
				getPartyingSmartProperty("psBloodAlcoholCalTitle"));
	}

	public boolean verifyBacApparatus(WebDriver driver) {
		try {
			CommonUtils.findAndClickElementByXPath(driver, getPartyingSmartProperty("psDiscoverThresholdBeginBtn"));
			CommonUtils.findAndClickElementByXPath(driver, getPartyingSmartProperty("psOneFemale"));
			CommonUtils.findAndClickElementByXPath(driver, getPartyingSmartProperty("psSecondBeers"));
			CommonUtils.findAndClickElementByXPath(driver, getPartyingSmartProperty("psThirdWeight"));
			CommonUtils.findAndClickElementByXPath(driver, getPartyingSmartProperty("psThirdTimeDrinking"));
			CommonUtils.findAndClickElementByXPath(driver, getPartyingSmartProperty("psBACSubmitBtnTitle"));
			return true;
		} catch (Exception e) {
			logger.info("exception in verifyBacApparatus", e);
		}
		return false;

	}

	public boolean verifyPSMixingDrugsTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getPartyingSmartProperty("expectedMixingDrugsTitle"),
				getPartyingSmartProperty("psMixingDrugsTitle"));
	}

	public boolean verifyPSTheDrugDealTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getPartyingSmartProperty("expectedDrugDealTitle"),
				getPartyingSmartProperty("psDrugDealTitle"));
	}

	public boolean verifyPSEffectsOnTheBodyTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getPartyingSmartProperty("expectedEffectsOnTheBodyTitle"),
				getPartyingSmartProperty("psEffectsOnTheBodyTitle"));
	}

	public void verifyAllSubstanceOfEffectonTheBody(WebDriver driver, String Substance, String backToMenu) {
		try {
			Thread.sleep(1000);
			CommonUtils.findAndClickElementByXPath(driver, Substance);
			Thread.sleep(2000);
			CommonUtils.findAndClickElementByXPath(driver, backToMenu);
		} catch (InterruptedException e) {
			logger.info("exception in verifyAllSubstanceOfEffectonTheBody", e);
		}

	}

	public boolean verifyPSAlcoholDrugPolicyTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getPartyingSmartProperty("expectedAlcoholDrugPolocyTitle"),
				getPartyingSmartProperty("psAlcoholDrugPolocyTitle"));
	}

	// Policy acknowledgement page
	public void policyAcknoledgement() {
		try {
			Thread.sleep(1000);
			CommonUtils.findAndClickElementByXPath(driver, getCommonUedProperty("ReadPolicyBtn"));
			Thread.sleep(2000);
			CommonUtils.findAndClickElementByXPath(driver, getCommonUedProperty("ClosePolicyBtn"));
		} catch (InterruptedException e) {
			logger.info("exception in policyAcknoledgement", e);
		}
		try {
			Thread.sleep(1000);
			WebElement element = driver.findElement(By.xpath(getCommonUedProperty("EnterThisName")));
			String name = element.getText();
			Thread.sleep(1000);
			driver.findElement(By.xpath(getCommonUedProperty("PolicyEnterName"))).sendKeys(name);
			CommonUtils.findAndClickElementByXPath(driver, getCommonUedProperty("PolicySubmitBtn"));
		} catch (InterruptedException e) {
			logger.info("exception in policyAcknoledgement", e);
		}
	}

	public boolean verifyPSCopingWithStressTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getPartyingSmartProperty("expectedCopingWithStressTitle"),
				getPartyingSmartProperty("psCopingWithStressTitle"));
	}

	public boolean verifyPSSelfMedicatingTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getPartyingSmartProperty("expectedSelfMedicatingTitle"),
				getPartyingSmartProperty("psSelfMedicatingTitle"));
	}

	public boolean verifyPSShroomsTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getPartyingSmartProperty("expectedShroomsTitle"),
				getPartyingSmartProperty("psShroomsTitle"));
	}

	public boolean verifyPSPSKCTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getPartyingSmartProperty("expectedPSKnowledgeCheckTitle"),
				getPartyingSmartProperty("psPSKnowledgeCheckTitle"));
	}

	public void psKCFirstQuestion() throws InterruptedException {
		Thread.sleep(2000);
		CommonUtils.findAndClickElementByXPath(driver, getCommonUedProperty("sublink1"));
		Thread.sleep(2000);
		CommonUtils.findAndClickElementByXPath(driver, getPartyingSmartProperty("psPSKCBeginBtn"));
		try {
			Thread.sleep(2000);
			driver.findElement(By.xpath(getPartyingSmartProperty("psPSKCOption2"))).click();
			Thread.sleep(2000);
			if (driver.findElement(By.xpath(getCommonUedProperty("tryAgainbtn"))).isDisplayed()) {
				driver.findElement(By.xpath(getCommonUedProperty("tryAgainbtn"))).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath(getPartyingSmartProperty("psPSKCOption1"))).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath(getCommonUedProperty("nxtDialogBtn"))).click();
			} else {
				Thread.sleep(2000);
				driver.findElement(By.xpath(getCommonUedProperty("nxtDialogBtn"))).click();
			}
		} catch (InterruptedException e) {
			logger.info("exception occured", e);
		}
	}

	public void psKCSecondQuestion() throws InterruptedException {
		Thread.sleep(1000);
		CommonUtils.findAndClickElementByXPath(driver, getCommonUedProperty("sublink2"));
		Thread.sleep(2000);
		CommonUtils.findAndClickElementByXPath(driver, getPartyingSmartProperty("psPSKCCouchCrasherBeginBtn"));
		CommonUtils.waitForSubVideo(driver, getCommonUedProperty("sublink1"));
		CommonUtils.findAndClickElementByXPath(driver, getCommonUedProperty("sublink1"));
		CommonUtils.waitForSubVideo(driver, getCommonUedProperty("sublink1"));
		CommonUtils.findAndClickElementByXPath(driver, getCommonUedProperty("sublink1"));
		CommonUtils.waitForSubVideo(driver, getCommonUedProperty("sublink3"));
		CommonUtils.findAndClickElementByXPath(driver, getCommonUedProperty("sublink3"));
		CommonUtils.waitForSubVideo(driver, getCommonUedProperty("sublink1"));
		CommonUtils.findAndClickElementByXPath(driver, getCommonUedProperty("sublink1"));
		CommonUtils.waitForSubVideo(driver, getPartyingSmartProperty("psPSKCCouchCrasherFinishBtn"));
		CommonUtils.findAndClickElementByXPath(driver, getPartyingSmartProperty("psPSKCCouchCrasherFinishBtn"));
	}

	// Ques3
	public void PSKCThirdQuestion() throws InterruptedException {
		Thread.sleep(1000);
		CommonUtils.findAndClickElementByXPath(driver, getCommonUedProperty("sublink3"));
		Thread.sleep(2000);
		CommonUtils.findAndClickElementByXPath(driver, getPartyingSmartProperty("psPSKCDDInstructionBeginBtn"));
		CommonUtils.waitBAVideoToComplete(driver, getPartyingSmartProperty("psKCVideoPauseBtn"));
		CommonUtils.VerifyDragandDropFunctionality(driver, getCommonUedProperty("source1"),
				getCommonUedProperty("destination"));
		CommonUtils.VerifydragAndDropAnswer(driver, getCommonUedProperty("subBtn"), getCommonUedProperty("tryAgainbtn"),
				getCommonUedProperty("nxtDialogBtn"));
		CommonUtils.VerifyDragandDropFunctionality(driver, getCommonUedProperty("source3"),
				getCommonUedProperty("destination"));
		CommonUtils.VerifydragAndDropAnswer(driver, getCommonUedProperty("subBtn"), getCommonUedProperty("tryAgainbtn"),
				getCommonUedProperty("nxtDialogBtn"));
		CommonUtils.VerifyDragandDropFunctionality(driver, getCommonUedProperty("source2"),
				getCommonUedProperty("destination"));
		CommonUtils.VerifydragAndDropAnswer(driver, getCommonUedProperty("subBtn"), getCommonUedProperty("tryAgainbtn"),
				getCommonUedProperty("nxtDialogBtn"));
		Thread.sleep(1000);
	}

	// Ques4
	public void PSKCFourthQuestion() throws InterruptedException {
		Thread.sleep(3000);
		CommonUtils.findAndClickElementByXPath(driver, getCommonUedProperty("sublink4"));
		Thread.sleep(2000);
		CommonUtils.findAndClickElementByXPath(driver, getPartyingSmartProperty("psPSKCDrivingHomeInstructionBeginBtn"));
		try {
			Thread.sleep(2000);
			driver.findElement(By.xpath(getPartyingSmartProperty("psPSKCOption1"))).click();
			Thread.sleep(2000);
			if (driver.findElement(By.xpath(getCommonUedProperty("tryAgainbtn"))).isDisplayed()) {
				driver.findElement(By.xpath(getCommonUedProperty("tryAgainbtn"))).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath(getPartyingSmartProperty("psPSKCOption2"))).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath(getCommonUedProperty("nxtDialogBtn"))).click();
			} else {
				Thread.sleep(2000);
				driver.findElement(By.xpath(getCommonUedProperty("nxtDialogBtn"))).click();
			}
		} catch (InterruptedException e) {
			logger.info("exception occured", e);
		}
	}

	// Ques5
	public void PSKCFifthQuestion() throws InterruptedException {
		Thread.sleep(3000);
		CommonUtils.findAndClickElementByXPath(driver, getCommonUedProperty("sublink5"));
		Thread.sleep(2000);
		CommonUtils.findAndClickElementByXPath(driver, getPartyingSmartProperty("psPSKCFailedPhysicsInstructionBeginBtn"));
		try {
			Thread.sleep(2000);
			driver.findElement(By.xpath(getPartyingSmartProperty("psPSKCOption1"))).click();
			Thread.sleep(2000);
			if (driver.findElement(By.xpath(getCommonUedProperty("tryAgainbtn"))).isDisplayed()) {
				driver.findElement(By.xpath(getCommonUedProperty("tryAgainbtn"))).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath(getPartyingSmartProperty("psPSKCOption3"))).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath(getCommonUedProperty("nxtDialogBtn"))).click();
			} else {
				Thread.sleep(2000);
				driver.findElement(By.xpath(getCommonUedProperty("nxtDialogBtn"))).click();
			}
		} catch (InterruptedException e) {
			logger.info("exception occured", e);
		}
	}

	// Ques6
	public void PSKCSixthQuestion() throws InterruptedException {
		Thread.sleep(3000);
		CommonUtils.findAndClickElementByXPath(driver, getCommonUedProperty("sublink6"));
		Thread.sleep(2000);
		CommonUtils.findAndClickElementByXPath(driver, getPartyingSmartProperty("psPSKCHallwayBlockageInstructionBeginBt"));
		try {
			Thread.sleep(2000);
			driver.findElement(By.xpath(getPartyingSmartProperty("psPSKCOption1"))).click();
			Thread.sleep(2000);
			if (driver.findElement(By.xpath(getCommonUedProperty("tryAgainbtn"))).isDisplayed()) {
				driver.findElement(By.xpath(getCommonUedProperty("tryAgainbtn"))).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath(getPartyingSmartProperty("psPSKCOption3"))).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath(getCommonUedProperty("nxtDialogBtn"))).click();
			} else {
				Thread.sleep(2000);
				driver.findElement(By.xpath(getCommonUedProperty("nxtDialogBtn"))).click();
			}
		} catch (InterruptedException e) {
			logger.info("exception occured", e);
		}
	}

	public boolean verifyPSAlcoholSexualViolenceTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getPartyingSmartProperty("expectedAlcoholSexualViolenceTitle"),
				getPartyingSmartProperty("psAlcoholSexualViolenceTitle"));
	}

	public boolean verifyPSSummaryTitle() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyTitle(driver, getPartyingSmartProperty("expectedpsSummaryTitle"),
				getPartyingSmartProperty("psSummaryTitle"));
	}

	public void answerDrugDealQuestions() throws InterruptedException {
		int numQ = Integer.parseInt(getPartyingSmartProperty("psDDNumQues"));
		for (int i = 0; i < numQ; i++) {
			Thread.sleep(3000);
			boolean correctAns = false;
			while (!correctAns) {
				CommonUtils.findAndClickElementByXPath(driver, getPartyingSmartProperty("psDDOption2"));
				Thread.sleep(1000);

				try {
					if (driver.findElement(By.xpath(getPartyingSmartProperty("psDDTryAgainBtn"))).isDisplayed()) {
						driver.findElement(By.xpath(getPartyingSmartProperty("psDDTryAgainBtn"))).click();

					} else if (driver.findElement(By.xpath(getPartyingSmartProperty("psDDNextQuesBtn"))).isDisplayed()) {
						Thread.sleep(2000);
						driver.findElement(By.xpath(getPartyingSmartProperty("psDDNextQuesBtn"))).click();
						correctAns=true;
					} 

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	public void psGoodEffortDialogBox() throws InterruptedException{
		Thread.sleep(2000);
		CommonUtils.waitToBeClickableByCSS(driver, 6000, getPartyingSmartProperty("psGoodEffortCloseBtn"));
		driver.findElement(By.cssSelector(PropUtils.partyingSmart.getProperty("psGoodEffortCloseBtn"))).click();
	}

	public SexualViolence continueToNextPage() {
		return new SexualViolence(driver, objUtils);
	}

}
