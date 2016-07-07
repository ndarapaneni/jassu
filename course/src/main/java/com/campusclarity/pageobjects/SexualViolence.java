package com.campusclarity.pageobjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.campusclarity.utilities.CommonUtils;
import com.campusclarity.utilities.PropUtils;

public class SexualViolence {
	private static final Logger logger = Logger.getLogger(SexInCollege.class);
	WebDriver driver;
	PropUtils objUtils;
	WebDriverWait wait;
	String pageTitle;
	String nextBtnXPath = PropUtils.commonUsed.getProperty("NextBtn");
	String nextSlideXPath = PropUtils.commonUsed.getProperty("nextSlide");

	public SexualViolence(WebDriver argDriver) {
		this.driver = argDriver;
	}

	public String getSexualViolenceProperty(String propKey) {
		return PropUtils.sexualViolence.getProperty(propKey);
	}

	public String getCommonUedProperty(String propKey) {
		return PropUtils.commonUsed.getProperty(propKey);
	}

	public SexualViolence(WebDriver argDriver, PropUtils argUtils) {
		this.driver = argDriver;
		this.objUtils = argUtils;
	}

	public boolean verifySVBFIntroductionTitle() {
		return CommonUtils.verifyTitle(driver, getSexualViolenceProperty("expectedsvBFIntroductionTitle"),
				getSexualViolenceProperty("svBFIntroductionTitle"));
	}

	public boolean verifyAndClickNextSlide() throws InterruptedException {
		Thread.sleep(1000);
		return CommonUtils.verifyAndClickNextSlide(driver, getCommonUedProperty("nextSlide"));
	}

	public boolean verifySVBFBeerPongTitle() {
		return CommonUtils.verifyTitle(driver, getSexualViolenceProperty("expectedsvBFBeerPongTitle"),
				getSexualViolenceProperty("svBFBeerPongTitle"));
	}

	public void waitForVideoToComplete() {
		CommonUtils.waitForVideoToComplete(driver, nextSlideXPath);
	}

	public boolean verifySVBFLaterNightTitle() {
		return CommonUtils.verifyTitle(driver, getSexualViolenceProperty("expectedsvBFLaterNightTitle"),
				getSexualViolenceProperty("svBFLaterNightTitle"));
	}

	public boolean verifySVBFLaterOnTitle() {
		return CommonUtils.verifyTitle(driver, getSexualViolenceProperty("expectedsvBFLaterOnTitle"),
				getSexualViolenceProperty("svBFLaterOnTitle"));
	}

	public boolean verifySVBFAlexDormTitle() {
		return CommonUtils.verifyTitle(driver, getSexualViolenceProperty("expectedsvBFAlexDormTitle"),
				getSexualViolenceProperty("svBFAlexDormTitle"));
	}

	public boolean verifySVBFNextMorningTitle() {
		return CommonUtils.verifyTitle(driver, getSexualViolenceProperty("expectedsvBFNextMorningTitle"),
				getSexualViolenceProperty("svBFNextMorningTitle"));
	}

	public boolean verifySVBFMarissaAptTitle() {
		return CommonUtils.verifyTitle(driver, getSexualViolenceProperty("expectedsvBFMarissaAptTitle"),
				getSexualViolenceProperty("svBFMarissaAptTitle"));
	}

	public boolean verifySVBFMeanwhileTitle() {
		return CommonUtils.verifyTitle(driver, getSexualViolenceProperty("expectedsvBFMeanwhileTitle"),
				getSexualViolenceProperty("svBFMeanwhileTitle"));
	}

	public boolean verifySVBFSummaryTitle() {
		return CommonUtils.verifyTitle(driver, getSexualViolenceProperty("expectedsvBFSummaryTitle"),
				getSexualViolenceProperty("svBFSummaryTitle"));
	}

	public boolean verifyAndClickNextButton() throws InterruptedException {
		Thread.sleep(2000);
		return CommonUtils.verifyAndClickNextButton(driver, getCommonUedProperty("NextBtn"));
	}

	public void answerShareLittleAboutYouTwoQuestions() {
		CommonUtils.answerShareLittleAboutYouQuestions(driver, PropUtils.commonUsed.getProperty("q1"), 2);
		CommonUtils.answerShareLittleAboutYouQuestions(driver, PropUtils.commonUsed.getProperty("q2"), 3);
	}

	public void waitToSubmitAnswersOfShareLittleAboutYou() {
		CommonUtils.waitToSubmitShareLittleAboutYou(driver, PropUtils.commonUsed.getProperty("submitBtn"),
				PropUtils.commonUsed.getProperty("doneBtn"));
	}

	public boolean verifySVIntroductionTitle() {
		return CommonUtils.verifyTitle(driver, getSexualViolenceProperty("expectedsvIntroductionTitle"),
				getSexualViolenceProperty("svIntroductionTitle"));
	}

	public boolean verifySVBiggestMistakeTitle() {
		return CommonUtils.verifyTitle(driver, getSexualViolenceProperty("expectedsvBiggestMistakeTitle"),
				getSexualViolenceProperty("svBiggestMistakeTitle"));
	}

	public void waitForVideo() {
		CommonUtils.waitForVideo(driver, nextBtnXPath);
	}

	public boolean verifySVDefiningConsentTitle() {
		return CommonUtils.verifyTitle(driver, getSexualViolenceProperty("expectedsvDefiningConsentTitle"),
				getSexualViolenceProperty("svDefiningConsentTitle"));
	}

	public boolean verifySVImportantLegalTermsTitle() {
		return CommonUtils.verifyTitle(driver, getSexualViolenceProperty("expectedImportantLegalTermsTitle"),
				getSexualViolenceProperty("svImportantLegalTermsTitle"));
	}

	public void verifySVLTConsent() throws InterruptedException {
		CommonUtils.findAndClickElementByXPath(driver, getSexualViolenceProperty("svILTConsent"));
		CommonUtils.verifyTitle(driver, getSexualViolenceProperty("expectedSVILTConsentTitle"),
				getSexualViolenceProperty("svILTConsentTitle"));
		CommonUtils.findAndClickElementByXPath(driver, getSexualViolenceProperty("svILTAffirmativeConsent"));
		CommonUtils.verifyTitle(driver, getSexualViolenceProperty("expectedSVILTAffirmativeConsentTitle"),
				getSexualViolenceProperty("svILTAffirmativeConsentTitle"));
		CommonUtils.findAndClickElementByXPath(driver, getSexualViolenceProperty("svILTCloseBtn"));
	}

	public void verifySVLTSexualAssault() throws InterruptedException {
		CommonUtils.findAndClickElementByXPath(driver, getSexualViolenceProperty("svILTSexualAssault"));
		CommonUtils.verifyTitle(driver, getSexualViolenceProperty("expectedSVILTSexualAssaultTitle"),
				getSexualViolenceProperty("svILTSexualAssaultTitle"));
		CommonUtils.findAndClickElementByXPath(driver, getSexualViolenceProperty("svILTSexualBattery"));
		CommonUtils.verifyTitle(driver, getSexualViolenceProperty("expectedSVILTSexualBatteryTitle"),
				getSexualViolenceProperty("svILTSexualBatteryTitle"));
		CommonUtils.findAndClickElementByXPath(driver, getSexualViolenceProperty("svILTDisorderlyConduct"));
		CommonUtils.verifyTitle(driver, getSexualViolenceProperty("expectedSVILTDisorderlyConductTitle"),
				getSexualViolenceProperty("svILTDisorderlyConductTitle"));
		CommonUtils.findAndClickElementByXPath(driver, getSexualViolenceProperty("svILTReportingLaws"));
		CommonUtils.verifyTitle(driver, getSexualViolenceProperty("expectedSVILTReportingLawsTitle"),
				getSexualViolenceProperty("svILTReportingLawsTitle"));
		Thread.sleep(2000);
		CommonUtils.findAndClickElementByXPath(driver, getSexualViolenceProperty("svILTCloseBtn"));
	}

	public boolean verifySVConsentMatchTitle() {
		return CommonUtils.verifyTitle(driver, getSexualViolenceProperty("expectedSVConsentMatchTitle"),
				getSexualViolenceProperty("svConsentMatchTitle"));
	}

	public void verifyConsentMatchQues() throws InterruptedException {
		CommonUtils.VerifyDragandDropFunctionality(driver, getSexualViolenceProperty("match1"), getSexualViolenceProperty("drop3"));
		CommonUtils.VerifyDragandDropFunctionality(driver, getSexualViolenceProperty("match2"), getSexualViolenceProperty("drop1"));
		CommonUtils.VerifyDragandDropFunctionality(driver, getSexualViolenceProperty("match3"), getSexualViolenceProperty("drop2"));
		CommonUtils.findAndClickElementByXPath(driver, getSexualViolenceProperty("matchSubmitBtn"));
		CommonUtils.findAndClickElementByXPath(driver, getSexualViolenceProperty("clickMatch1"));
		CommonUtils.findAndClickElementByXPath(driver, getSexualViolenceProperty("clickMatch2"));
		CommonUtils.findAndClickElementByXPath(driver, getSexualViolenceProperty("clickMatch3"));

	}

	public void clickConsentMatchNextBtn() throws InterruptedException {
		CommonUtils.findAndClickElementByXPath(driver, getSexualViolenceProperty("matchNextBtn"));
	}

	public void clickConsentMatchNotEarnedPopUp() throws InterruptedException {
		CommonUtils.findAndClickElementByXPath(driver, getSexualViolenceProperty("notEarnedBtn"));
	}

	public boolean verifySVAcquaintanceAssaultTitle() {
		return CommonUtils.verifyTitle(driver, getSexualViolenceProperty("expectedsvAcquaintanceAssaultTitle"),
				getSexualViolenceProperty("svAcquaintanceAssaultTitle"));
	}

	public boolean verifySVSexualViolenceinCollegeTitle() {
		return CommonUtils.verifyTitle(driver, getSexualViolenceProperty("expectedsvSVInCollegeTitle"),
				getSexualViolenceProperty("svSVInCollegeTitle"));
	}

	public boolean verifySVStagesOfAcquaintanceAssaultTitle() {
		return CommonUtils.verifyTitle(driver, getSexualViolenceProperty("expectedSVStagesOfAcquaintanceAssault"),
				getSexualViolenceProperty("svStagesOfAcquaintanceAssault"));
	}

	public void clickAndVerifyTitlesOfAcquaintanceAssaultStages() throws InterruptedException {
		CommonUtils.clickVerifyAndCloseATab(driver, getCommonUedProperty("sublink1"), getCommonUedProperty("closeBtn"));
		CommonUtils.clickVerifyAndCloseATab(driver, getCommonUedProperty("sublink2"), getCommonUedProperty("closeBtn"));
		CommonUtils.clickVerifyAndCloseATab(driver, getCommonUedProperty("sublink3"), getCommonUedProperty("closeBtn"));
		CommonUtils.clickVerifyAndCloseATab(driver, getCommonUedProperty("sublink4"), getCommonUedProperty("closeBtn"));
	}

	public boolean verifySVSubtleMistakesTitle() {
		return CommonUtils.verifyTitle(driver, getSexualViolenceProperty("expectedsvSubtleMistakesTitle"),
				getSexualViolenceProperty("svSubtleMistakesTitle"));
	}

	public boolean verifySVSexualCoercionTitle() {
		return CommonUtils.verifyTitle(driver, getSexualViolenceProperty("expectedsvSexualCoercionTitle"),
				getSexualViolenceProperty("svSexualCoercionTitle"));
	}

	public boolean verifySVRecognizeSexualCoercionTitle() {
		return CommonUtils.verifyTitle(driver, getSexualViolenceProperty("expectedRecognizeSexualCoercion"),
				getSexualViolenceProperty("svRecognizeSexualCoercionTitle"));
	}

	public void AnsRecognizeSexualCoercion() throws InterruptedException {
		// First Question
		CommonUtils.VerifyDragandDropFunctionality(driver, getCommonUedProperty("source2"),
				getCommonUedProperty("destination"));
		CommonUtils.VerifydragAndDropAnswer(driver, getCommonUedProperty("subBtn"), getSexualViolenceProperty("svRSCTryAgainBtn"),
				getSexualViolenceProperty("svRSCNextBtn"));
		CommonUtils.VerifyDragandDropFunctionality(driver, getCommonUedProperty("source1"),
				getCommonUedProperty("destination"));
		CommonUtils.VerifydragAndDropAnswer(driver, getCommonUedProperty("subBtn"), getSexualViolenceProperty("svRSCTryAgainBtn"),
				getSexualViolenceProperty("svRSCNextBtn"));
		// Second Question
		CommonUtils.VerifyDragandDropFunctionality(driver, getCommonUedProperty("source2"),
				getCommonUedProperty("destination"));
		CommonUtils.VerifydragAndDropAnswer(driver, getCommonUedProperty("subBtn"), getSexualViolenceProperty("svRSCTryAgainBtn"),
				getSexualViolenceProperty("svRSCNextBtn"));
		CommonUtils.VerifyDragandDropFunctionality(driver, getCommonUedProperty("source3"),
				getCommonUedProperty("destination"));
		CommonUtils.VerifydragAndDropAnswer(driver, getCommonUedProperty("subBtn"), getSexualViolenceProperty("svRSCTryAgainBtn"),
				getSexualViolenceProperty("svRSCNextBtn"));
		// Third Question
		CommonUtils.VerifyDragandDropFunctionality(driver, getCommonUedProperty("source1"),
				getCommonUedProperty("destination"));
		CommonUtils.VerifydragAndDropAnswer(driver, getCommonUedProperty("subBtn"), getSexualViolenceProperty("svRSCTryAgainBtn"),
				getSexualViolenceProperty("svRSCNextBtn"));
		CommonUtils.VerifyDragandDropFunctionality(driver, getCommonUedProperty("source2"),
				getCommonUedProperty("destination"));
		CommonUtils.VerifydragAndDropAnswer(driver, getCommonUedProperty("subBtn"), getSexualViolenceProperty("svRSCTryAgainBtn"),
				getCommonUedProperty("NextBtn"));

	}

	public boolean verifySVDialoguesSexualViolenceTitle() {
		return CommonUtils.verifyTitle(driver, getSexualViolenceProperty("expectedsvDialoguesSexualViolenceTitle"),
				getSexualViolenceProperty("svDialoguesSexualViolenceTitle"));
	}

	public void respondAndDragAndDropDDQuestions() throws InterruptedException {
		// Question1
		CommonUtils.findAndClickElementByXPath(driver, getSexualViolenceProperty("svDSVRespondBtn"));
		Thread.sleep(1000);
		CommonUtils.VerifyDragandDropFunctionality(driver, getCommonUedProperty("source2"),
				getCommonUedProperty("destination"));
		CommonUtils.VerifydragAndDropAnswer(driver, getCommonUedProperty("subBtn"), getSexualViolenceProperty("svDSVTryAgainBtn"),
				getSexualViolenceProperty("svDSVNextBtn"));
		CommonUtils.VerifyDragandDropFunctionality(driver, getCommonUedProperty("source3"),
				getCommonUedProperty("destination"));
		CommonUtils.VerifydragAndDropAnswer(driver, getCommonUedProperty("subBtn"), getSexualViolenceProperty("svDSVTryAgainBtn"),
				getSexualViolenceProperty("svDSVNextBtn"));
		// Question2
		CommonUtils.findAndClickElementByXPath(driver, getSexualViolenceProperty("svDSVRespondBtn"));
		Thread.sleep(1000);
		CommonUtils.VerifyDragandDropFunctionality(driver, getCommonUedProperty("source2"),
				getCommonUedProperty("destination"));
		CommonUtils.VerifydragAndDropAnswer(driver, getCommonUedProperty("subBtn"), getSexualViolenceProperty("svDSVTryAgainBtn"),
				getSexualViolenceProperty("svDSVNextBtn"));
		CommonUtils.VerifyDragandDropFunctionality(driver, getCommonUedProperty("source3"),
				getCommonUedProperty("destination"));
		CommonUtils.VerifydragAndDropAnswer(driver, getCommonUedProperty("subBtn"), getSexualViolenceProperty("svDSVTryAgainBtn"),
				getSexualViolenceProperty("svDSVNextBtn"));
		// Question2
		CommonUtils.findAndClickElementByXPath(driver, getSexualViolenceProperty("svDSVRespondBtn"));
		Thread.sleep(1000);
		CommonUtils.VerifyDragandDropFunctionality(driver, getCommonUedProperty("source2"),
				getCommonUedProperty("destination"));
		CommonUtils.VerifydragAndDropAnswer(driver, getCommonUedProperty("subBtn"), getSexualViolenceProperty("svDSVTryAgainBtn"),
				getSexualViolenceProperty("svDSVNextBtn"));
		CommonUtils.VerifyDragandDropFunctionality(driver, getCommonUedProperty("source3"),
				getCommonUedProperty("destination"));
		CommonUtils.VerifydragAndDropAnswer(driver, getCommonUedProperty("subBtn"), getSexualViolenceProperty("svDSVTryAgainBtn"),
				getCommonUedProperty("NextBtn"));
	}

	public boolean verifySVPartyFoulTitle() {
		return CommonUtils.verifyTitle(driver, getSexualViolenceProperty("expectedsvPartyFoulTitle"),
				getSexualViolenceProperty("svPartyFoulTitle"));
	}

	public boolean verifySVBeingAByStanderTitle() {
		return CommonUtils.verifyTitle(driver, getSexualViolenceProperty("expectedsvBeingAByStanderTitle"),
				getSexualViolenceProperty("svBeingAByStanderTitle"));
	}

	public boolean verifySVByStanderInterventionTitle() {
		return CommonUtils.verifyTitle(driver, getSexualViolenceProperty("expectedsvBystanderInterventionTitle"),
				getSexualViolenceProperty("svBystanderInterventionTitle"));
	}

	public void VerifyHorizontalscrollbar() throws InterruptedException {
		CommonUtils.VerifyHorizontalscrollbar(driver, getSexualViolenceProperty("svScrollCSS"));
	}

	public boolean verifySVKeepingOptionsOpenTitle() {
		return CommonUtils.verifyTitle(driver, getSexualViolenceProperty("expectedsvKeepOptionsOpenTitle"),
				getSexualViolenceProperty("svKeepOptionsOpenTitle"));
	}

	public boolean verifySVAftermathOfAssaultTitle() {
		return CommonUtils.verifyTitle(driver, getSexualViolenceProperty("expectedsvAfterMathofAssaultTitle"),
				getSexualViolenceProperty("svAfterMathofAssaultTitle"));
	}

	public boolean verifySVHelpingAFriendTitle() {
		return CommonUtils.verifyTitle(driver, getSexualViolenceProperty("expectedsvHelpingAFriendTitle"),
				getSexualViolenceProperty("svHelpingAFriendTitle"));
	}

	public boolean verifySVASurvivorReactionsTitle() {
		return CommonUtils.verifyTitle(driver, getSexualViolenceProperty("expectedsvSurvivorsReactionTitle"),
				getSexualViolenceProperty("svSurvivorsReactionTitle"));
	}

	public void verifyLinksInASurvivorReactionsPage() throws InterruptedException {

		try {
			CommonUtils.findAndClickElementByXPath(driver, getSexualViolenceProperty("link1"));
			Thread.sleep(2000);
			CommonUtils.findAndClickElementByXPath(driver, getSexualViolenceProperty("link1Close"));
		} catch (WebDriverException e) {
			logger.info("element not clickable at xPath: " + getSexualViolenceProperty("link1"));
		}

		Thread.sleep(1000);
		try {
			CommonUtils.findAndClickElementByXPath(driver, getSexualViolenceProperty("link2"));
			Thread.sleep(2000);
			CommonUtils.findAndClickElementByXPath(driver, getSexualViolenceProperty("link2Close"));
		} catch (WebDriverException e) {
			logger.info("element not clickable at xPath: " + getSexualViolenceProperty("link2"));
		}
		Thread.sleep(1000);
		try {
			CommonUtils.findAndClickElementByXPath(driver, getSexualViolenceProperty("link3"));
			Thread.sleep(2000);
			CommonUtils.findAndClickElementByXPath(driver, getSexualViolenceProperty("link3Close"));
		} catch (WebDriverException e) {
			logger.info("element not clickable at xPath: " + getSexualViolenceProperty("link3"));
		}
		Thread.sleep(1000);
	}

	public boolean verifySVDmitryExperienceTitle() {
		return CommonUtils.verifyTitle(driver, getSexualViolenceProperty("expectedsvDmitryExperienceTitle"),
				getSexualViolenceProperty("svDmitryExperienceTitle"));
	}

	public boolean verifySVTitleIXTitle() {
		return CommonUtils.verifyTitle(driver, getSexualViolenceProperty("expectedsvTitleIXTitle"),
				getSexualViolenceProperty("svTitleIXTitle"));
	}

	public void verifySVTitleIXOfficeTitle() throws InterruptedException {
		CommonUtils.clickTabsInsideAPage(driver, getSexualViolenceProperty("svTitleIXOffice"),
				getSexualViolenceProperty("expectedSVTitleIXOfficeTitle"), getSexualViolenceProperty("svTitleIXOfficeTitle"));

	}

	public boolean verifySVConductProceedingsTitle() {
		return CommonUtils.verifyTitle(driver, getSexualViolenceProperty("expectedsvConductProceedingsTitle"),
				getSexualViolenceProperty("svConductProceedingsTitle"));
	}

	public void clickAndVerifyConductProceedingTabs() throws InterruptedException {
		CommonUtils.clickTabsInsideAPage(driver, getSexualViolenceProperty("svStudentChoosesNotToReport"),
				getSexualViolenceProperty("expectedSVStudentChoosesNotToReportTitle"),
				getSexualViolenceProperty("svStudentChoosesNotToReportTitle"));
		Thread.sleep(2000);
		CommonUtils.findAndClickElementByXPath(driver, getCommonUedProperty("closeBtn"));
		CommonUtils.clickTabsInsideAPage(driver, getSexualViolenceProperty("svStudentChoosesToReport"),
				getSexualViolenceProperty("expectedSVStudentChoosesToReportTitle"),
				getSexualViolenceProperty("svStudentChoosesToReportTitle"));
		Thread.sleep(1000);
		CommonUtils.findAndClickElementByXPath(driver, getSexualViolenceProperty("subTab2"));
		Thread.sleep(1000);
		CommonUtils.findAndClickElementByXPath(driver, getSexualViolenceProperty("subTab3"));
		Thread.sleep(1000);
		CommonUtils.findAndClickElementByXPath(driver, getSexualViolenceProperty("subTab4"));
		Thread.sleep(2000);
		CommonUtils.findAndClickElementByXPath(driver, getCommonUedProperty("closeBtn"));
	}

	public boolean verifySVInterimMeasuresTitle() {
		return CommonUtils.verifyTitle(driver, getSexualViolenceProperty("expectedsvInterimMeasuresTitle"),
				getSexualViolenceProperty("svInterimMeasuresTitle"));
	}

	public boolean verifySVTypesOfSexualHarassmentTitle() {
		return CommonUtils.verifyTitle(driver, getSexualViolenceProperty("expectedsvTypesofSexualHarassmentTitle"),
				getSexualViolenceProperty("svTypesofSexualHarassmentTitle"));
	}

	public void VerifyVerticalscrollbar() throws InterruptedException {
		CommonUtils.VerifyVerticalscrollbar(driver, getSexualViolenceProperty("svVerticalScrollCSS"));
	}

	public boolean verifySVSexualHarassmentTitle() {
		return CommonUtils.verifyTitle(driver, getSexualViolenceProperty("expectedsvSexualHarassmentTitle"),
				getSexualViolenceProperty("svSexualHarassmentTitle"));
	}

	public boolean verifySVUnwelcomeSexualConductTitle() {
		return CommonUtils.verifyTitle(driver, getSexualViolenceProperty("expectedsvSexualHarassmentTitle"),
				getSexualViolenceProperty("svSexualHarassmentTitle"));
	}

	public void verifySVHostileEnvironment() throws InterruptedException {
		CommonUtils.clickTabsInsideAPage(driver, getSexualViolenceProperty("svHostileEnviroment"),
				getSexualViolenceProperty("expectedSVHostileEnvironmentTitle"), getSexualViolenceProperty("svUSHHostileEnvironmentTitle"));

	}

	public boolean verifySVSexualMisconductPolicyTitle() {
		return CommonUtils.verifyTitle(driver, getSexualViolenceProperty("expectedSVSexualMisconductPolicyTitle"),
				getSexualViolenceProperty("svSVSexualMisconductPolicyTitle"));
	}

	public void policyAcknoledgement() {
		try {
			Thread.sleep(1000);
			CommonUtils.findAndClickElementByXPath(driver, PropUtils.commonUsed.getProperty("ReadPolicyBtn"));
			Thread.sleep(2000);
			CommonUtils.findAndClickElementByXPath(driver, PropUtils.commonUsed.getProperty("ClosePolicyBtn"));
		} catch (InterruptedException e) {
			logger.info("exception in policyAcknoledgement", e);
		}
		try {
			Thread.sleep(1000);
			WebElement element = driver.findElement(By.xpath(PropUtils.commonUsed.getProperty("EnterThisName")));
			String name = element.getText();
			Thread.sleep(1000);
			driver.findElement(By.xpath(PropUtils.commonUsed.getProperty("PolicyEnterName"))).sendKeys(name);
			CommonUtils.findAndClickElementByXPath(driver, PropUtils.commonUsed.getProperty("PolicySubmitBtn"));
		} catch (InterruptedException e) {
			logger.info("exception in policyAcknoledgement", e);
		}
	}

	public boolean verifySVIsThisSexualHarassmentTitle() {
		return CommonUtils.verifyTitle(driver, getSexualViolenceProperty("expectedsvIsSexualHarassmentTitle"),
				getSexualViolenceProperty("svIsSexualHarassmentTitle"));
	}

	public void clickCards() throws InterruptedException {
		CommonUtils.findAndClickElementByXPath(driver, getSexualViolenceProperty("svSHTab1"));
		CommonUtils.findAndClickElementByXPath(driver, getSexualViolenceProperty("svSHTab2"));
		CommonUtils.findAndClickElementByXPath(driver, getSexualViolenceProperty("svSHTab3"));
		CommonUtils.findAndClickElementByXPath(driver, getSexualViolenceProperty("svSHTab4"));
		CommonUtils.findAndClickElementByXPath(driver, getSexualViolenceProperty("svSHTab5"));
		CommonUtils.findAndClickElementByXPath(driver, getSexualViolenceProperty("svSHTab6"));
	}

	public boolean verifySVCounterstrikeTitle() {
		return CommonUtils.verifyTitle(driver, getSexualViolenceProperty("expectedsvCounterstrikeTitle"),
				getSexualViolenceProperty("svCounterstrikeTitle"));
	}

	public void selectAnsForQuesInCounterstrike() throws InterruptedException {
		CommonUtils.selectAnsForQues(driver, getSexualViolenceProperty("Options1"), getCommonUedProperty("tryAgainbtn"),
				getSexualViolenceProperty("Options3"), getCommonUedProperty("NextBtn"));
	}

	public boolean verifySVKnowledgeCheckTitle() {
		return CommonUtils.verifyTitle(driver, getSexualViolenceProperty("expectedsvSVKCTitle"), getSexualViolenceProperty("svSVKCTitle"));
	}

	public void selectAnsForKnowledgeCheckQuestion() throws InterruptedException {
		// ques1
		CommonUtils.findAndClickElementByXPath(driver, getCommonUedProperty("sublink1"));
		CommonUtils.findAndClickElementByXPath(driver, getSexualViolenceProperty("svSVKCBeginBtn"));
		CommonUtils.selectAnsForQues(driver, getSexualViolenceProperty("Options2"), getCommonUedProperty("tryAgainbtn"),
				getSexualViolenceProperty("Options1"), getSexualViolenceProperty("svSVKCContinueBtn"));
		Thread.sleep(5000);
		// ques2
		CommonUtils.findAndClickElementByXPath(driver, getCommonUedProperty("sublink2"));
		CommonUtils.findAndClickElementByXPath(driver, getSexualViolenceProperty("svSVKCBeginBtn"));
		CommonUtils.selectAnsForQues(driver, getSexualViolenceProperty("Options1"), getCommonUedProperty("tryAgainbtn"),
				getSexualViolenceProperty("Options2"), getSexualViolenceProperty("svSVKCContinueBtn"));
		Thread.sleep(5000);
		// ques3
		CommonUtils.findAndClickElementByXPath(driver, getCommonUedProperty("sublink3"));
		CommonUtils.findAndClickElementByXPath(driver, getSexualViolenceProperty("svSVKCBeginBtn"));
		CommonUtils.selectAnsForQues(driver, getSexualViolenceProperty("Options2"), getCommonUedProperty("tryAgainbtn"),
				getSexualViolenceProperty("Options3"), getSexualViolenceProperty("svSVKCContinueBtn"));
		Thread.sleep(5000);
		// ques4
		CommonUtils.findAndClickElementByXPath(driver, getCommonUedProperty("sublink4"));
		Thread.sleep(5000);
		CommonUtils.findAndClickElementByXPath(driver, getSexualViolenceProperty("svSVKCBeginBtn"));
		CommonUtils.selectAnsForQues(driver, getSexualViolenceProperty("Options2"), getCommonUedProperty("tryAgainbtn"),
				getSexualViolenceProperty("Options3"), getSexualViolenceProperty("svSVKCContinueBtn"));
		Thread.sleep(5000);
		// ques5
		CommonUtils.findAndClickElementByXPath(driver, getCommonUedProperty("sublink5"));
		Thread.sleep(5000);
		CommonUtils.findAndClickElementByXPath(driver, getSexualViolenceProperty("svSVKCBeginBtn"));
		CommonUtils.selectAnsForQues(driver, getSexualViolenceProperty("Options2"), getCommonUedProperty("tryAgainbtn"),
				getSexualViolenceProperty("Options1"), getSexualViolenceProperty("svSVKCContinueBtn"));
		Thread.sleep(5000);
		// ques6
		CommonUtils.findAndClickElementByXPath(driver, getCommonUedProperty("sublink6"));
		Thread.sleep(5000);
		CommonUtils.findAndClickElementByXPath(driver, getSexualViolenceProperty("svSVKCBeginBtn"));
		CommonUtils.selectAnsForQues(driver, getSexualViolenceProperty("Options1"), getCommonUedProperty("tryAgainbtn"),
				getSexualViolenceProperty("Options2"), getSexualViolenceProperty("svSVKCContinueBtn"));
		Thread.sleep(1000);
	}

	public boolean verifySVSummaryTitle() {
		return CommonUtils.verifyTitle(driver, getSexualViolenceProperty("expectedsvSummaryTitle"),
				getSexualViolenceProperty("svSummaryTitle"));
	}

	public Epilogue continueToNextPage() {
		return new Epilogue(driver, objUtils);

	}
}
