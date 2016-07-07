package com.campusclaritycourse.tests;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.campusclarity.base.BaseTest;
import com.campusclarity.pageobjects.BasePage;
import com.campusclarity.pageobjects.Epilogue;
import com.campusclarity.pageobjects.HealthyRelationShips;
import com.campusclarity.pageobjects.HomePage;
import com.campusclarity.pageobjects.LoginPage;
import com.campusclarity.pageobjects.PartyingSmart;
import com.campusclarity.pageobjects.Prologue;
import com.campusclarity.pageobjects.SexInCollege;
import com.campusclarity.pageobjects.SexualViolence;
import com.campusclarity.utilities.PropUtils;

public class ThinkAboutItTest extends BaseTest {
	private static final Logger logger = Logger.getLogger(ThinkAboutItTest.class);

	private BasePage basePage;
	private LoginPage loginPage;
	private HomePage homePage;
	private Prologue prologue;
	private SexInCollege sexInCollege;
	private HealthyRelationShips healthyRelationships;
	private PartyingSmart partyingSmart;
	private SexualViolence sexualViolence;
	private Epilogue epilogue;

	@Test
	public void testBasePage() {
		logger.info("Home page test...");
		basePage = new BasePage(driver, objUtils);
		Assert.assertTrue(basePage.verifyHomePageTitle(), "Home page title doesn't match");
		loginPage = basePage.clickLogin();
	}

	@Test(dependsOnMethods = { "testBasePage" })
	public void testLoginPage() {
		logger.info("Login page test...");
		Assert.assertTrue(loginPage.verifyPageTitle(), "Login page title doesn't match");
		Assert.assertTrue(loginPage.verifyEmailAddress(PropUtils.commonUsed.getProperty("email")), "Invalid Email");
		Assert.assertTrue(loginPage.verifyLogin(PropUtils.commonUsed.getProperty("passwordToEnter")), "Invalid Password");
		homePage = loginPage.clickContinue();
	}

	@Test(dependsOnMethods = { "testLoginPage" })
	public void testHomePage() throws InterruptedException {
		logger.info("Home page test...");
		Assert.assertTrue(homePage.verifySelectCourse(), "Course doesn't exist");
		prologue = homePage.continueToNextPage();
		
	}

	@Test(dependsOnMethods = { "testHomePage" })
	public void testPrologueSection() throws InterruptedException {
		Thread.sleep(15000);
		  logger.info("Prologue Section test...");
		  Assert.assertTrue(prologue.verifyWelcomeTitle(),"Title doesn't match");
		  Assert.assertTrue(prologue.verifyAndClickNextButton(),"Next button doesn't exist");
		  Assert.assertTrue(prologue.verifyThinkAboutItTitle(),"Title doesn't match");
		  prologue.waitForVideo();
		  Assert.assertTrue(prologue.verifyAndClickNextButton(),"Next button doesn't exist");
		  Assert.assertTrue(prologue.verifyWelcomeLetterTitle(),"Title doesn't match");
		  Assert.assertTrue(prologue.verifyAndClickNextButton(),"Next button doesn't exist");
		  Assert.assertTrue(prologue.verifyHowTheCourseWorksTitle(),"Title doesn't match"); 
		  prologue.waitForVideo();
		  Assert.assertTrue(prologue.verifyAndClickNextButton(),"Next button doesn't exist");
		  Assert.assertTrue(prologue.verifyMeetOrientationGroupTitle(),"Title doesn't match");
		  Assert.assertTrue(prologue.clickAndVerifyMaddieTitle(),"Title doesn't match"); 
		  prologue.waitForSubVideo();
		  Assert.assertTrue(prologue.clickAndVerifyAlexTitle(),"Title doesn't match");
		  prologue.waitForSubVideo();
		  Assert.assertTrue(prologue.clickAndVerifyTomTitle(),"Title doesn't match"); 
		  prologue.waitForSubVideo();
		  Assert.assertTrue(prologue.clickAndVerifyNoraTitle(),"Title doesn't match"); 
		  prologue.waitForSubVideo();
		  Assert.assertTrue(prologue.verifyAndClickNextButton(),"Next button doesn't exist");
		  prologue.answerShareLittleAboutYouQuestions();
		  prologue.waitToSubmitShareLittleAboutYou();  
		  Assert.assertTrue(prologue.verifyComingUpTitle(),"Title doesn't match");
		  Assert.assertTrue(prologue.verifyAndClickNextButton(),"Next button doesn't exist"); 
		  sexInCollege =prologue.continueToNextPage();
		  
		  }
		  
		  @Test(dependsOnMethods = { "testPrologueSection" }) 
		  public void testSexInCollegeSection() throws InterruptedException {
		  Thread.sleep(2000); 
		  logger.info("Sex In College Section test...");
		  Assert.assertTrue(sexInCollege.verifyMixedSignalsIntroductionTitle(), "Title doesn't match");
		  Assert.assertTrue(sexInCollege.verifyAndClickNextSlide(),"Next slide doesn't exist");
		  Assert.assertTrue(sexInCollege.verifyMixedSignalsAtThePartyTitle(),"Title doesn't match"); 
		  sexInCollege.waitForVideoToComplete();
		  Assert.assertTrue(sexInCollege.verifyAndClickNextSlide(),"Next slide doesn't exist");
		  Assert.assertTrue(sexInCollege.verifyMixedSignalsSaturdayAfternoonTitle(), "Title doesn't match");
		  Assert.assertTrue(sexInCollege.verifyAndClickNextSlide(),"Next slide doesn't exist");
		  Assert.assertTrue(sexInCollege.verifyMixedSignalsOutShoppingHauteClappyTitle(),"Title doesn't match"); 
		  sexInCollege.waitForVideoToComplete();
		  Assert.assertTrue(sexInCollege.verifyAndClickNextSlide(),"Next slide doesn't exist"); 
		  Assert.assertTrue(sexInCollege.verifyMixedSignalsACoupleWeeksLaterTitle(), "Title doesn't match");
		  Assert.assertTrue(sexInCollege.verifyAndClickNextSlide(),"Next slide doesn't exist");
		  Assert.assertTrue(sexInCollege.verifyMixedSignalsAtTheCafeTitle(),"Title doesn't match"); 
		  sexInCollege.waitForVideoToComplete();
		  Assert.assertTrue(sexInCollege.verifyAndClickNextSlide(),"Next slide doesn't exist");
		  Assert.assertTrue(sexInCollege.verifyMixedSignalsLetsGoBackTitle(),"Title doesn't match");
		  Assert.assertTrue(sexInCollege.verifyAndClickNextSlide(),"Next slide doesn't exist");
		  Assert.assertTrue(sexInCollege.verifyMixedSignalsAtThePartyTitle(),"Title doesn't match"); 
		  sexInCollege.waitForVideoToComplete();
		  Assert.assertTrue(sexInCollege.verifyAndClickNextSlide(),"Next slide doesn't exist");
		  Assert.assertTrue(sexInCollege.verifyMixedSignalsAfterThePartyTitle(), "Title doesn't match");
		  Assert.assertTrue(sexInCollege.verifyAndClickNextSlide(), "Next slide doesn't exist");
		  Assert.assertTrue(sexInCollege.verifyMixedSignalsVideoGamesTitle(),"Title doesn't match"); 
		  sexInCollege.waitForVideoToComplete();
		  Assert.assertTrue(sexInCollege.verifyAndClickNextSlide(), "Next slide doesn't exist");
		  Assert.assertTrue(sexInCollege.verifyMixedSignalsSummaryTitle(),"Title doesn't match");
		  Assert.assertTrue(sexInCollege.verifyAndClickNextButton(),"Next button doesn't exist");
	      sexInCollege.answerShareLittleAboutYouTwoQuestions();
		  sexInCollege.waitToSubmitAnswersOfShareLittleAboutYou();
		  Assert.assertTrue(sexInCollege.verifySexInCollegeIntroductionTitle(), "Title doesn't match");
		  Assert.assertTrue(sexInCollege.verifyAndClickNextButton(), "Next button doesn't exist");
		  Assert.assertTrue(sexInCollege.verifySexInCollegeHookingUpTitle(), "Title doesn't match"); 
		  sexInCollege.waitForVideo();
		  Assert.assertTrue(sexInCollege.verifyAndClickNextButton(), "Next button doesn't exist");
		  Assert.assertTrue(sexInCollege.verifySexInCollegeWhatIsHookingUpTitle(), "Title doesn't match"); 
		  sexInCollege.waitForVideo();
		  Thread.sleep(2000);
		  Assert.assertTrue(sexInCollege.verifyAndClickNextButton(), "Next button doesn't exist");
		  sexInCollege.answerShareLittleAboutYouSixQuestions();
		  sexInCollege.waitToSubmitSixAnswersOfShareLittleAboutYou(); 
		  Assert.assertTrue(sexInCollege.verifySexInCollegePressureExpectationsTitle(), "Title doesn't match"); 
		  sexInCollege.verifySubTabsAndClose();
		  Assert.assertTrue(sexInCollege.verifyAndClickNextButton(), "Next button doesn't exist");
		  Assert.assertTrue(sexInCollege.verifySexInCollegeAwkwardMomentsTitle(), "Title doesn't match"); 
		  sexInCollege.waitForVideo();
		  Assert.assertTrue(sexInCollege.verifyAndClickNextButton(), "Next button doesn't exist");
		  Assert.assertTrue(sexInCollege.verifySexInCollegeWhyKeepDoingItTitle(), "Title doesn't match"); 
		  sexInCollege.waitForVideo();
		  Assert.assertTrue(sexInCollege.verifyAndClickNextButton(), "Next button doesn't exist"); 
		  Assert.assertTrue(sexInCollege.verifySexInCollegeSystemicProblemsTitle(), "Title doesn't match");
		  sexInCollege.waitForVideo();
		  Assert.assertTrue(sexInCollege.verifyAndClickNextButton(),"Next button doesn't exist");
		  Assert.assertTrue(sexInCollege.verifySexInCollegeDatingAfterCollegeTitle(), "Title doesn't match");
		  sexInCollege.waitForVideo();
		  Assert.assertTrue(sexInCollege.verifyAndClickNextButton(),"Next button doesn't exist");   
		  Assert.assertTrue(sexInCollege.verifySexInCollegeSummaryTitle(), "Title doesn't match");
		  Assert.assertTrue(sexInCollege.verifyAndClickNextButton(),"Next button doesn't exist");   
		  healthyRelationships = sexInCollege.continueToNextPage();
		  
		  }
		  
		  @Test(dependsOnMethods = { "testSexInCollegeSection" }) 
		  public void testHealthyRelationShipsSection() throws InterruptedException {
		  Thread.sleep(2000); 
		  logger.info("Healthy RelationShips test ....");
		  Assert.assertTrue(healthyRelationships.verifyTimeBombIntroductionTitle(), "Title doesn't match");
		  Assert.assertTrue(healthyRelationships.verifyAndClickNextSlide(), "Next slide doesn't exist");
		  Assert.assertTrue(healthyRelationships.verifyTimeBombAlexDormTitle(), "Title doesn't match");
		  healthyRelationships.waitForVideoToComplete();
		  Assert.assertTrue(healthyRelationships.verifyAndClickNextSlide(), "Next slide doesn't exist");
		  Assert.assertTrue(healthyRelationships.verifyTimeBombWeekLaterTitle(), "Title doesn't match");
		  Assert.assertTrue(healthyRelationships.verifyAndClickNextSlide(), "Next slide doesn't exist");
		  Assert.assertTrue(healthyRelationships.verifyTimeBombCafeteriaTitle(), "Title doesn't match");
		  healthyRelationships.waitForVideoToComplete();
		  Assert.assertTrue(healthyRelationships.verifyAndClickNextSlide(), "Next slide doesn't exist");
		  Assert.assertTrue(healthyRelationships.verifyTimeBombWeeksLaterTitle(), "Title doesn't match");
		  Assert.assertTrue(healthyRelationships.verifyAndClickNextSlide(), "Next slide doesn't exist"); 
		  Assert.assertTrue(healthyRelationships.verifyTimeBombTylerApartmentTitle(), "Title doesn't match");
		  healthyRelationships.waitForVideoToComplete();
		  Assert.assertTrue(healthyRelationships.verifyAndClickNextSlide(), "Next slide doesn't exist");
		  Assert.assertTrue(healthyRelationships.verifyTimeBombSummaryTitle(), "Title doesn't match");
		  Assert.assertTrue(healthyRelationships.verifyAndClickNextButton(), "Next button doesn't exist");
		  healthyRelationships.answerShareLittleAboutYouTwoQuestions();
		  healthyRelationships.waitToSubmitAnswersOfShareLittleAboutYou();
		  Assert.assertTrue(healthyRelationships.verifyhrIntroductionTitle(), "Title doesn't match");
		  Assert.assertTrue(healthyRelationships.verifyAndClickNextButton(), "Next button doesn't exist");
		  Assert.assertTrue(healthyRelationships.verifyhrSomethingNotQuiteRightTitle(), "Title doesn't match");
		  healthyRelationships.waitForVideo();
		  Assert.assertTrue(healthyRelationships.verifyAndClickNextButton(), "Next button doesn't exist"); 
		  Assert.assertTrue(healthyRelationships.verifyhrAboutHealthyRelationshipsTitle(), "Title doesn't match");
		  healthyRelationships.waitForVideo();
		  Assert.assertTrue(healthyRelationships.verifyAndClickNextButton(), "Next button doesn't exist");
		  Assert.assertTrue(healthyRelationships.verifyhrKnowThyselfTitle(), "Title doesn't match");
		  Assert.assertTrue(healthyRelationships.verifyAndClickNextButton(), "Next button doesn't exist");
		  Assert.assertTrue(healthyRelationships.verifyhrMakingsofGoodRelationshipTitle(), "Title doesn't match");
		  Assert.assertTrue(healthyRelationships.verifyAndClickNextButton(), "Next button doesn't exist"); 
		  Assert.assertTrue(healthyRelationships.verifyhrAreYouinBadRelationshipTitle(), "Title doesn't match");
		  healthyRelationships.verifyClickabilityOfTabs();
		  Assert.assertTrue(healthyRelationships.verifyAndClickNextButton(), "Next button doesn't exist");
		  Assert.assertTrue(healthyRelationships.verifyhrWarningSignsTitle(), "Title doesn't match"); 
		  healthyRelationships.waitForVideo();
		  Assert.assertTrue(healthyRelationships.verifyAndClickNextButton(), "Next button doesn't exist"); 
		  Assert.assertTrue(healthyRelationships.verifyhrAbusiveRelationshipsTitle(), "Title doesn't match");
		  Assert.assertTrue(healthyRelationships.verifyAndClickNextButton(), "Next button doesn't exist"); 
		  Assert.assertTrue(healthyRelationships.verifyhrUnderstandRelationshipViolenceTitle(), "Title doesn't match");
		  Assert.assertTrue(healthyRelationships.verifyAndClickNextButton(), "Next button doesn't exist"); 
		  Assert.assertTrue(healthyRelationships.verifyhrImportantLegalTermsTitle(), "Title doesn't match");
		  healthyRelationships.verifySubTabsAndClose();
		  Assert.assertTrue(healthyRelationships.verifyAndClickNextButton(), "Next button doesn't exist");
		  Assert.assertTrue(healthyRelationships.verifyhrCyberstalkingTitle(),"Title doesn't match"); 
		  healthyRelationships.clickFlipcards();
		  Assert.assertTrue(healthyRelationships.verifyAndClickNextButton(),"Next button doesn't exist"); 
		  Assert.assertTrue(healthyRelationships.verifyhrRespondingToTroubleTitle(), "Title doesn't match");
		  healthyRelationships.waitForVideo();
		  Assert.assertTrue(healthyRelationships.verifyAndClickNextButton(), "Next button doesn't exist");
		  Assert.assertTrue(healthyRelationships.verifyhrHelpingFriendTitle(), "Title doesn't match");
		  Assert.assertTrue(healthyRelationships.verifyAndClickNextButton(), "Next button doesn't exist"); 
		  Assert.assertTrue(healthyRelationships.verifyhrRelationshipsinPerilTitle(), "Title doesn't match");
		  healthyRelationships.clickSubVideoOneInAPage();
		  healthyRelationships.clickSubVideoTwoInAPage();
		  healthyRelationships.clickSubVideoThreeInAPage();
		  Assert.assertTrue(healthyRelationships.verifyAndClickNextButton(), "Next button doesn't exist");  
		  Assert.assertTrue(healthyRelationships.verifyhrSummaryTitle(), "Title doesn't match");
		  Assert.assertTrue(healthyRelationships.verifyAndClickNextButton(), "Next button doesn't exist");    
		  partyingSmart = healthyRelationships.continueToNextPage(); 
		  
		  }
		 
	 @Test(dependsOnMethods = { "testHealthyRelationShipsSection" })
	     public void testPartyingSmartSection() throws InterruptedException {
		 Thread.sleep(2000);
    	 logger.info("Partying Smart test ....");
	     Assert.assertTrue(partyingSmart.verifyPSBurnedOutIntroductionTitle(), "Title doesn't match");
		 Assert.assertTrue(partyingSmart.verifyAndClickNextSlide(), "Next Slide doesn't exist");
		 Assert.assertTrue(partyingSmart.verifyPSBOMaddieDormRoomTitle(), "Title doesn't match"); 
		 partyingSmart.waitForVideoToComplete();
		 Assert.assertTrue(partyingSmart.verifyAndClickNextSlide(),"Next Slide doesn't exist");
		 Assert.assertTrue(partyingSmart.verifyPSBOSomeTimeLaterTitle(),"Title doesn't match");
		 Assert.assertTrue(partyingSmart.verifyAndClickNextSlide(), "Next Slide doesn't exist");
		 Assert.assertTrue(partyingSmart.verifyPSBOJustAfterClassTitle(), "Title doesn't match"); 
         partyingSmart.waitForVideoToComplete();
		 Assert.assertTrue(partyingSmart.verifyAndClickNextSlide(), "Next Slide doesn't exist");
		 Assert.assertTrue(partyingSmart.verifyPSBOAtthePartyTitle(), "Title doesn't match");
		 Assert.assertTrue(partyingSmart.verifyAndClickNextSlide(), "Next Slide doesn't exist");
		 Assert.assertTrue(partyingSmart.verifyPSBOOffCampusPartyTitle(),"Title doesn't match"); 
		 partyingSmart.waitForVideoToComplete();
		 Assert.assertTrue(partyingSmart.verifyAndClickNextSlide(), "Next Slide doesn't exist");
		 Assert.assertTrue(partyingSmart.verifyPSBOSummaryTitle(), "Title doesn't match");
		 Assert.assertTrue(partyingSmart.verifyAndClickNextButton(), "Next button doesn't exist");
		 partyingSmart.answerShareLittleAboutYouTwoQuestions();
		 partyingSmart.waitToSubmitAnswersOfShareLittleAboutYou();
		 Assert.assertTrue(partyingSmart.verifyPSIntroductionTitle(), "Title doesn't match");
		 Assert.assertTrue(partyingSmart.verifyAndClickNextButton(), "Next button doesn't exist");
		 Assert.assertTrue(partyingSmart.verifyPSCollegeExperienceTitle(), "Title doesn't match"); 
		 partyingSmart.waitForVideo();
		 Assert.assertTrue(partyingSmart.verifyAndClickNextButton(), "Next button doesn't exist");
		 Assert.assertTrue(partyingSmart.verifyPSPartyingRightTitle(),"Title doesn't match"); 
		 partyingSmart.waitForVideo();
		 Assert.assertTrue(partyingSmart.verifyAndClickNextButton(), "Next button doesn't exist");
		 Assert.assertTrue(partyingSmart.verifyPSAlcoholIdentityTitle(), "Title doesn't match"); 
		 partyingSmart.verifySubTabsAndClose();
		 Assert.assertTrue(partyingSmart.verifyAndClickNextButton(), "Next button doesn't exist");
		 Assert.assertTrue(partyingSmart.verifyPSEquallyImportantTitle(), "Title doesn't match"); 
	     partyingSmart.waitForVideo();  
		 Assert.assertTrue(partyingSmart.verifyAndClickNextButton(), "Next button doesn't exist");
		 partyingSmart.answerShareLittleAboutYouFourQuestions();
		 partyingSmart.waitToSubmitFourAnswersOfShareLittleAboutYou();
		 Assert.assertTrue(partyingSmart.verifyPSBartendersBestAdviceTitle(), "Title doesn't match");
		 partyingSmart.clickAndverifyBAVideo1Title();
	     partyingSmart.waitForVideoToCompleteInBestAdvicePage();
		 partyingSmart.answerQuestions();
		 partyingSmart.clickAndverifyBAVideo2Title();
		 partyingSmart.waitForVideo2ToCompleteInBestAdvicePage();
		 partyingSmart.answerVideo2Questions();
		 partyingSmart.clickAndverifyBAVideo3Title();
		 partyingSmart.waitForVideo3ToCompleteInBestAdvicePage();
		 partyingSmart.answerVideo3Questions();
		 Assert.assertTrue(partyingSmart.verifyAndClickNextButton(), "Next button doesn't exist");          
		 Assert.assertTrue(partyingSmart.beginAndVerifyDialoguesDrinkingTitle(), "Title doesn't match");
		 partyingSmart.respondAndDragAndDropDDQuestions1();
		 partyingSmart.respondAndDragAndDropDDQuestions2();
		 partyingSmart.respondAndDragAndDropDDQuestions3();
		 partyingSmart.respondAndDragAndDropDDQuestions4();  
		 Assert.assertTrue(partyingSmart.verifyPSAvoidingPartyingFoulsTitle(), "Title doesn't match"); 
		 partyingSmart.waitForVideo();
		 Assert.assertTrue(partyingSmart.verifyAndClickNextButton(), "Next button doesn't exist");
		 Assert.assertTrue(partyingSmart.verifyPSPSSBeforePartyTitle(), "Title doesn't match");
		 Assert.assertTrue(partyingSmart.verifyPSPSSDuringThePartyTitle(), "Title doesn't match");
		 Assert.assertTrue(partyingSmart.verifyPSPSSAfterThePartyTitle(), "Title doesn't match");
		 Assert.assertTrue(partyingSmart.verifyAndClickNextButton(), "Next button doesn't exist");
		 Assert.assertTrue(partyingSmart.verifyPSANightOutTitle(), "Title doesn't match"); 
		 partyingSmart.waitForVideoToCompleteInNightOutPage();
		 Assert.assertTrue(partyingSmart.verifyAndClickNextButton(), "Next button doesn't exist"); 
		 Assert.assertTrue(partyingSmart.verifyPSRecognizingAlcoholPoisoningTitle(), "Title doesn't match");
		 Assert.assertTrue(partyingSmart.clickAndVerifySymptomsTitle(), "Title doesn't match");
		 partyingSmart.waitForSubVideoToComplete(driver);
		 Assert.assertTrue(partyingSmart.clickAndVerifyWhatToDoTitle(), "Title doesn't match");
		 partyingSmart.waitForSubVideoToComplete(driver);
		 Assert.assertTrue(partyingSmart.clickAndVerifyBacchusManeuverTitle(), "Title doesn't match");
		 partyingSmart.waitForSubVideoToComplete(driver);
		 Assert.assertTrue(partyingSmart.verifyAndClickNextButton(), "Next button doesn't exist");
		 Assert.assertTrue(partyingSmart.verifyPSBloodAlcoholCalTitle(), "Title doesn't match"); 
		 partyingSmart.verifyBacApparatus(driver);
		 Assert.assertTrue(partyingSmart.verifyAndClickNextButton(), "Next button doesn't exist");
		 Assert.assertTrue(partyingSmart.verifyPSMixingDrugsTitle(), "Title doesn't match"); 
		 partyingSmart.waitForVideo();
		 Assert.assertTrue(partyingSmart.verifyAndClickNextButton(), "Next button doesn't exist");   
		 Assert.assertTrue(partyingSmart.verifyPSTheDrugDealTitle(), "Title doesn't match"); 
		 partyingSmart.answerDrugDealQuestions();  
		 partyingSmart.psGoodEffortDialogBox(); 
		 Assert.assertTrue(partyingSmart.verifyAndClickNextButton(), "Next button doesn't exist");   
		 Assert.assertTrue(partyingSmart.verifyPSEffectsOnTheBodyTitle(), "Title doesn't match");
		 partyingSmart.verifyAllSubstanceOfEffectonTheBody(driver, PropUtils.partyingSmart.getProperty("psEOBCannabis"), 
				 PropUtils.partyingSmart.getProperty("psEOBBackToMenuBtn"));
		 partyingSmart.verifyAllSubstanceOfEffectonTheBody(driver, PropUtils.partyingSmart.getProperty("psEOBEcstasy"),  
				 PropUtils.partyingSmart.getProperty("psEOBBackToMenuBtn"));
		 partyingSmart.verifyAllSubstanceOfEffectonTheBody(driver, PropUtils.partyingSmart.getProperty("psEOBHallucinogens"),
				 PropUtils.partyingSmart.getProperty("psEOBBackToMenuBtn"));
		 partyingSmart.verifyAllSubstanceOfEffectonTheBody(driver, PropUtils.partyingSmart.getProperty("psEOBAlcohol"),
				 PropUtils.partyingSmart.getProperty("psEOBBackToMenuBtn"));
		 partyingSmart.verifyAllSubstanceOfEffectonTheBody(driver, PropUtils.partyingSmart.getProperty("psEOBStimulants"), 
				 PropUtils.partyingSmart.getProperty("psEOBBackToMenuBtn"));
		 partyingSmart.verifyAllSubstanceOfEffectonTheBody(driver, PropUtils.partyingSmart.getProperty("psEOBopiates"), 
				 PropUtils.partyingSmart.getProperty("psEOBBackToMenuBtn"));
		 Assert.assertTrue(partyingSmart.verifyAndClickNextButton(), "Next button doesn't exist");
		 Assert.assertTrue(partyingSmart.verifyPSAlcoholDrugPolicyTitle(),"Title doesn't match"); 
		 partyingSmart.policyAcknoledgement();
		 Assert.assertTrue(partyingSmart.verifyAndClickNextButton(), "Next button doesn't exist");
		 Assert.assertTrue(partyingSmart.verifyPSCopingWithStressTitle(), "Title doesn't match"); 
		 partyingSmart.waitForVideo();
		 Assert.assertTrue(partyingSmart.verifyAndClickNextButton(), "Next button doesn't exist");
		 Assert.assertTrue(partyingSmart.verifyPSSelfMedicatingTitle(), "Title doesn't match"); 
		 partyingSmart.waitForVideo();
		 Assert.assertTrue(partyingSmart.verifyAndClickNextButton(), "Next button doesn't exist");
		 Assert.assertTrue(partyingSmart.verifyPSShroomsTitle(), "Title doesn't match"); 
		 partyingSmart.waitForVideo();
		 Assert.assertTrue(partyingSmart.verifyAndClickNextButton(), "Next button doesn't exist"); 
		 Assert.assertTrue(partyingSmart.verifyPSPSKCTitle(), "Title doesn't match");
		 partyingSmart.psKCFirstQuestion();
		 partyingSmart.psKCSecondQuestion();
		 partyingSmart.PSKCThirdQuestion();   
		 partyingSmart.PSKCFourthQuestion();
		 partyingSmart.PSKCFifthQuestion();
		 partyingSmart.PSKCSixthQuestion();
		Assert.assertTrue(partyingSmart.verifyAndClickNextButton(), "Next button doesn't exist");
		Assert.assertTrue(partyingSmart.verifyPSAlcoholSexualViolenceTitle(), "Title doesn't match");
		partyingSmart.waitForVideo();
		Assert.assertTrue(partyingSmart.verifyAndClickNextButton(), "Next button doesn't exist");  
		Assert.assertTrue(partyingSmart.verifyPSSummaryTitle(), "Title doesn't match");
		Assert.assertTrue(partyingSmart.verifyAndClickNextButton(), "Next button doesn't exist"); 
		sexualViolence = partyingSmart.continueToNextPage(); 
	}
	
	@Test(dependsOnMethods = { "testPartyingSmartSection" })
	 public void testSexualViolenceSection() throws InterruptedException {
	 	Thread.sleep(2000);
	    logger.info("Sexual Violence test ....");
	    Assert.assertTrue(sexualViolence.verifySVBFIntroductionTitle(), "Title doesn't match");
	    Assert.assertTrue(sexualViolence.verifyAndClickNextSlide(), "Next slide doesn't exist");
	   	Assert.assertTrue(sexualViolence.verifySVBFBeerPongTitle(), "Title doesn't match"); 
	   	sexualViolence.waitForVideoToComplete();
	    Assert.assertTrue(sexualViolence.verifyAndClickNextSlide(), "Next slide doesn't exist"); 
	    Assert.assertTrue(sexualViolence.verifySVBFLaterNightTitle(), "Title doesn't match");
	    Assert.assertTrue(sexualViolence.verifyAndClickNextSlide(),"Next slide doesn't exist");
		Assert.assertTrue(sexualViolence.verifySVBFBeerPongTitle(), "Title doesn't match"); 
	   	sexualViolence.waitForVideoToComplete();
	    Assert.assertTrue(sexualViolence.verifyAndClickNextSlide(), "Next slide doesn't exist"); 
	    Assert.assertTrue(sexualViolence.verifySVBFLaterOnTitle(), "Title doesn't match"); 
	    Assert.assertTrue(sexualViolence.verifyAndClickNextSlide(),"Next slide doesn't exist"); 
	    Assert.assertTrue(sexualViolence.verifySVBFAlexDormTitle(), "Title doesn't match");
	    sexualViolence.waitForVideoToComplete();
	   	Assert.assertTrue(sexualViolence.verifyAndClickNextSlide(),"Next slide doesn't exist");
	   	Assert.assertTrue(sexualViolence.verifySVBFNextMorningTitle(),"Title doesn't match"); 
	   	Assert.assertTrue(sexualViolence.verifyAndClickNextSlide(),"Next slide doesn't exist");
	    Assert.assertTrue(sexualViolence.verifySVBFMarissaAptTitle(), "Title doesn't match");
	    sexualViolence.waitForVideoToComplete();
	   	Assert.assertTrue(sexualViolence.verifyAndClickNextSlide(), "Next slide doesn't exist");
	    Assert.assertTrue(sexualViolence.verifySVBFMeanwhileTitle(), "Title doesn't match"); 
	    Assert.assertTrue(sexualViolence.verifyAndClickNextSlide(), "Next slide doesn't exist");
	    Assert.assertTrue(sexualViolence.verifySVBFAlexDormTitle(), "Title doesn't match");
	    sexualViolence.waitForVideoToComplete();
	   	Assert.assertTrue(sexualViolence.verifyAndClickNextSlide(),"Next slide doesn't exist");
	    Assert.assertTrue(sexualViolence.verifySVBFSummaryTitle(), "Title doesn't match");
	    Assert.assertTrue(sexualViolence.verifyAndClickNextButton(),"Next button doesn't exist");
	    sexualViolence.answerShareLittleAboutYouTwoQuestions();
	    sexualViolence.waitToSubmitAnswersOfShareLittleAboutYou();
	   	Assert.assertTrue(sexualViolence.verifySVIntroductionTitle(), "Title doesn't match");
	    Assert.assertTrue(sexualViolence.verifyAndClickNextButton(),"Next button doesn't exist");
	    Assert.assertTrue(sexualViolence.verifySVBiggestMistakeTitle(), "Title doesn't match");
	    sexualViolence.waitForVideo();
	    Assert.assertTrue(sexualViolence.verifyAndClickNextButton(),"Next button doesn't exist");
	    Assert.assertTrue(sexualViolence.verifySVDefiningConsentTitle(), "Title doesn't match");
	    sexualViolence.waitForVideo();
	    Assert.assertTrue(sexualViolence.verifyAndClickNextButton(),"Next button doesn't exist");
	    Assert.assertTrue(sexualViolence.verifySVImportantLegalTermsTitle(), "Title doesn't match");
	    sexualViolence.verifySVLTConsent();
	    sexualViolence.verifySVLTSexualAssault();
	    Assert.assertTrue(sexualViolence.verifyAndClickNextButton(),"Next button doesn't exist");       
	    Assert.assertTrue(sexualViolence.verifySVConsentMatchTitle(), "Title doesn't match");
	    sexualViolence.verifyConsentMatchQues();
	    sexualViolence.clickConsentMatchNextBtn();
	    sexualViolence.verifyConsentMatchQues();
	    sexualViolence.clickConsentMatchNextBtn();
	    sexualViolence.verifyConsentMatchQues();
	    sexualViolence.clickConsentMatchNextBtn();
	    sexualViolence.verifyConsentMatchQues();
	    sexualViolence.clickConsentMatchNextBtn();
	    sexualViolence.clickConsentMatchNotEarnedPopUp();
	    Assert.assertTrue(sexualViolence.verifyAndClickNextButton(),"Next button doesn't exist");
	    Assert.assertTrue(sexualViolence.verifySVAcquaintanceAssaultTitle(), "Title doesn't match");
	    sexualViolence.waitForVideo();
	    Assert.assertTrue(sexualViolence.verifyAndClickNextButton(),"Next button doesn't exist");
	    Assert.assertTrue(sexualViolence.verifySVSexualViolenceinCollegeTitle(), "Title doesn't match");
	    sexualViolence.waitForVideo();
	    Assert.assertTrue(sexualViolence.verifyAndClickNextButton(),"Next button doesn't exist");
	    Assert.assertTrue(sexualViolence.verifySVStagesOfAcquaintanceAssaultTitle(), "Title doesn't match");
	    sexualViolence.clickAndVerifyTitlesOfAcquaintanceAssaultStages();
	    Assert.assertTrue(sexualViolence.verifyAndClickNextButton(),"Next button doesn't exist");
	    Assert.assertTrue(sexualViolence.verifySVSubtleMistakesTitle(), "Title doesn't match");
	    sexualViolence.waitForVideo();
	    Assert.assertTrue(sexualViolence.verifyAndClickNextButton(),"Next button doesn't exist");
	    Assert.assertTrue(sexualViolence.verifySVSexualCoercionTitle(), "Title doesn't match");
	    sexualViolence.waitForVideo();
	    Assert.assertTrue(sexualViolence.verifyAndClickNextButton(),"Next button doesn't exist");  
	    Assert.assertTrue(sexualViolence.verifySVRecognizeSexualCoercionTitle(), "Title doesn't match");
	    sexualViolence.AnsRecognizeSexualCoercion(); 
	    Assert.assertTrue(sexualViolence.verifySVDialoguesSexualViolenceTitle(), "Title doesn't match");
	    sexualViolence.respondAndDragAndDropDDQuestions();
	    Assert.assertTrue(sexualViolence.verifySVPartyFoulTitle(), "Title doesn't match");
	    sexualViolence.waitForVideo();
	    Assert.assertTrue(sexualViolence.verifyAndClickNextButton(),"Next button doesn't exist");
	    Assert.assertTrue(sexualViolence.verifySVBeingAByStanderTitle(), "Title doesn't match");
	    sexualViolence.waitForVideo();
	    Assert.assertTrue(sexualViolence.verifyAndClickNextButton(),"Next button doesn't exist");
	    Assert.assertTrue(sexualViolence.verifySVByStanderInterventionTitle(), "Title doesn't match");
	    sexualViolence.VerifyHorizontalscrollbar();
	    Assert.assertTrue(sexualViolence.verifyAndClickNextButton(),"Next button doesn't exist");
	    Assert.assertTrue(sexualViolence.verifySVKeepingOptionsOpenTitle(), "Title doesn't match");
	    sexualViolence.waitForVideo();
	    Assert.assertTrue(sexualViolence.verifyAndClickNextButton(),"Next button doesn't exist");
	    Assert.assertTrue(sexualViolence.verifySVAftermathOfAssaultTitle(), "Title doesn't match");
	    sexualViolence.VerifyHorizontalscrollbar();
	    Assert.assertTrue(sexualViolence.verifyAndClickNextButton(),"Next button doesn't exist");
	    Assert.assertTrue(sexualViolence.verifySVHelpingAFriendTitle(), "Title doesn't match");
	    sexualViolence.waitForVideo();
	    Assert.assertTrue(sexualViolence.verifyAndClickNextButton(),"Next button doesn't exist");  
        Assert.assertTrue(sexualViolence.verifySVASurvivorReactionsTitle(), "Title doesn't match");
	    sexualViolence.verifyLinksInASurvivorReactionsPage();   
	    Assert.assertTrue(sexualViolence.verifyAndClickNextButton(),"Next button doesn't exist");    
	    Assert.assertTrue(sexualViolence.verifySVDmitryExperienceTitle(), "Title doesn't match");
	    sexualViolence.waitForVideo();
	    Assert.assertTrue(sexualViolence.verifyAndClickNextButton(),"Next button doesn't exist");
	    Assert.assertTrue(sexualViolence.verifySVTitleIXTitle(), "Title doesn't match");
	    sexualViolence.verifySVTitleIXOfficeTitle();
	    Assert.assertTrue(sexualViolence.verifyAndClickNextButton(),"Next button doesn't exist");
	    Assert.assertTrue(sexualViolence.verifySVConductProceedingsTitle(), "Title doesn't match");
	    sexualViolence.clickAndVerifyConductProceedingTabs();
	    Assert.assertTrue(sexualViolence.verifyAndClickNextButton(),"Next button doesn't exist");
	    Assert.assertTrue(sexualViolence.verifySVInterimMeasuresTitle(), "Title doesn't match");
	    Assert.assertTrue(sexualViolence.verifyAndClickNextButton(),"Next button doesn't exist");   
	    Assert.assertTrue(sexualViolence.verifySVTypesOfSexualHarassmentTitle(), "Title doesn't match");
	    sexualViolence.VerifyVerticalscrollbar();
	    Assert.assertTrue(sexualViolence.verifyAndClickNextButton(),"Next button doesn't exist");
	    Assert.assertTrue(sexualViolence.verifySVSexualHarassmentTitle(), "Title doesn't match");
	    Assert.assertTrue(sexualViolence.verifyAndClickNextButton(),"Next button doesn't exist");
	    Assert.assertTrue(sexualViolence.verifySVUnwelcomeSexualConductTitle(), "Title doesn't match");
	    sexualViolence.verifySVHostileEnvironment();
	    Assert.assertTrue(sexualViolence.verifyAndClickNextButton(),"Next button doesn't exist"); 
	    Assert.assertTrue(sexualViolence.verifySVSexualMisconductPolicyTitle(), "Title doesn't match");
	    sexualViolence.policyAcknoledgement();
	    Assert.assertTrue(sexualViolence.verifyAndClickNextButton(),"Next button doesn't exist");
	    Assert.assertTrue(sexualViolence.verifySVIsThisSexualHarassmentTitle(), "Title doesn't match");
	    sexualViolence.clickCards();
	    Assert.assertTrue(sexualViolence.verifyAndClickNextButton(),"Next button doesn't exist");
	    Assert.assertTrue(sexualViolence.verifySVCounterstrikeTitle(), "Title doesn't match");
	    sexualViolence.selectAnsForQuesInCounterstrike();  
	    Assert.assertTrue(sexualViolence.verifySVKnowledgeCheckTitle(), "Title doesn't match");
	    sexualViolence.selectAnsForKnowledgeCheckQuestion();
	    Assert.assertTrue(sexualViolence.verifyAndClickNextButton(),"Next button doesn't exist");
	    Assert.assertTrue(sexualViolence.verifySVSummaryTitle(), "Title doesn't match");
	    Assert.assertTrue(sexualViolence.verifyAndClickNextButton(),"Next button doesn't exist");
	    epilogue = sexualViolence.continueToNextPage();
	 }
	
	@Test(dependsOnMethods = { "testSexualViolenceSection" })
	 public void testEpilogueSection() throws InterruptedException {
	 	Thread.sleep(2000);
	    logger.info("Epilogue test ....");
	    Assert.assertTrue(epilogue.verifyEpilogueYourFeedbackTitle(), "Title doesn't match");
	    epilogue.selectFeedbackOptionsFromDropdownList();
	    Assert.assertTrue(epilogue.verifyAndClickNextButton(),"Next button doesn't exist");
	    Assert.assertTrue(epilogue.verifyEpilogueCourseCompleteTitle(), "Title doesn't match");
	}
}
