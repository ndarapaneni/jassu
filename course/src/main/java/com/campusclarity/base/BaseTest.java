package com.campusclarity.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.campusclarity.utilities.PropUtils;
import com.campusclaritycourse.tests.ThinkAboutItTest;

public class BaseTest {
	protected static WebDriver driver;
	Properties commonProps = new Properties();
	Properties prologueprops = new Properties();
	Properties sexInCollegeprops = new Properties();
	Properties healthyRelationShipsprops = new Properties();
	Properties partyingSmartprops = new Properties();
	Properties sexualViolenceprops = new Properties();
	Properties epilogueprops = new Properties();
	
	private Logger logger = Logger.getLogger(ThinkAboutItTest.class);
	WebDriverWait wait;
	String pageTitle;
	protected PropUtils objUtils;

	@BeforeClass
	public void setUp() throws InterruptedException, IOException {
		PropertyConfigurator.configure("log4j.properties");
		driver = new FirefoxDriver();
		objUtils = new PropUtils(driver);
		File commonPropFile = new File(PropUtils.commonProps);
		File prologueFile = new File(PropUtils.prologueprops);
		File sexInCollegeFile = new File(PropUtils.sexInCollegeprops);
		File healthyRelationShipsFile = new File(PropUtils.healthyRelationShipsprops);
		File partyingSmartFile = new File(PropUtils.partyingSmartprops);
		File sexualViolenceFile = new File(PropUtils.sexualViolenceprops);
		File epilogueFile = new File(PropUtils.epilogueprops);
		
		FileInputStream commonPropStream = null;
		FileInputStream prologuePropStream = null;
		FileInputStream sexInCollegePropStream = null;
		FileInputStream healthyRelationShipsPropStream = null;
		FileInputStream partyingSmartPropStream = null;
		FileInputStream sexualViolencePropStream = null;
		FileInputStream epiloguePropStream = null;

		try {
			commonPropStream = new FileInputStream(commonPropFile);
			commonProps.load(commonPropStream);
			
			prologuePropStream = new FileInputStream(prologueFile);
			prologueprops.load(prologuePropStream);
			
			sexInCollegePropStream = new FileInputStream(sexInCollegeFile);
			sexInCollegeprops.load(sexInCollegePropStream);
			
			healthyRelationShipsPropStream = new FileInputStream(healthyRelationShipsFile);
			healthyRelationShipsprops.load(healthyRelationShipsPropStream);
			
			partyingSmartPropStream = new FileInputStream(partyingSmartFile);
			partyingSmartprops.load(partyingSmartPropStream);
			
			sexualViolencePropStream = new FileInputStream(sexualViolenceFile);
			sexualViolenceprops.load(sexualViolencePropStream);
			
			epiloguePropStream = new FileInputStream(epilogueFile);
			epilogueprops.load(epiloguePropStream);
			
			driver.get(commonProps.getProperty("baseUrl"));
			driver.manage().window().maximize();
		} catch (FileNotFoundException e) {
			logger.info("Exception while reading file" + e);
		}
	}

	public WebDriver getDriver() {
		return driver;
	}

	public PropUtils getObjUtils() {
		return objUtils;
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
