package com.campusclarity.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class PropUtils {
	WebDriver driver;
	public static Properties commonUsed = new Properties();
	public static Properties prologue = new Properties();
	public static Properties sexInCollege = new Properties();
	public static Properties healthyRelationShips = new Properties();
	public static Properties partyingSmart = new Properties();
	public static Properties sexualViolence = new Properties();
	public static Properties epilogue = new Properties();
	public static String commonProps = "commonUsed.properties";
	public static String prologueprops = "prologue.properties";
	public static String sexInCollegeprops = "sexInCollege.properties";
	public static String healthyRelationShipsprops = "healthyRelationShips.properties";
	public static String partyingSmartprops = "partyingSmart.properties";
	public static String sexualViolenceprops = "sexualViolence.properties";
	public static String epilogueprops = "epilogue.properties";
	
	private static final Logger logger = Logger.getLogger(PropUtils.class);
	
	FileInputStream commonUsedFile = new FileInputStream(new File(commonProps));
	FileInputStream prologueFile = new FileInputStream(new File(prologueprops));
	FileInputStream sexInCollegeFile = new FileInputStream(new File(sexInCollegeprops));
	FileInputStream healthyRelationShipsFile = new FileInputStream(new File(healthyRelationShipsprops));
	FileInputStream partyingSmartFile = new FileInputStream(new File(partyingSmartprops));
	FileInputStream sexualViolenceFile = new FileInputStream(new File(sexualViolenceprops));
	FileInputStream epilogueFile = new FileInputStream(new File(epilogueprops));

	public PropUtils(WebDriver driver) throws IOException {
		this.driver = driver;
		commonUsed.load(commonUsedFile);
		prologue.load(prologueFile);
		sexInCollege.load(sexInCollegeFile);
		healthyRelationShips.load(healthyRelationShipsFile);
		partyingSmart.load(partyingSmartFile);
		sexualViolence.load(sexualViolenceFile);
		epilogue.load(epilogueFile);
	}

}
