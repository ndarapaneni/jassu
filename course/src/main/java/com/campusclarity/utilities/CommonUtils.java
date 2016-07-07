package com.campusclarity.utilities;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtils {
	private static Logger logger = Logger.getLogger(PropUtils.class);

	public static boolean verifyPageTitle(WebDriver driver, String expectedTitle) throws InterruptedException {
		Thread.sleep(1000);
		String pageTitle = driver.getTitle();
		if (pageTitle.contains(expectedTitle)) {
			return true;
		}
		return false;
	}

	public static boolean verifyAndClickNextButton(WebDriver driver, String nextBtn) throws InterruptedException {
		waitToBePresent(driver, 3000, nextBtn);
		WebElement nextBtnElem = driver.findElement(By.xpath(nextBtn));
		if (nextBtnElem.isDisplayed()) {
			waitToBeClickable(driver, 9000, nextBtn);
			nextBtnElem.click();
			logger.info("Successfully showed Next button");
			Thread.sleep(3000);
			return true;
		} else {
			logger.info("Next button not present");
		}
		return false;
	}

	public static void waitForVideo(WebDriver driver, String nextBtn) {
		try {
			while (true) {
				WebElement button = driver.findElement(By.xpath(nextBtn));
				String enabled = button.getAttribute("aria-label");
				if (enabled.equals("Next")) {
					break;
				}
			}
			Thread.sleep(1000);
		} catch (Exception e) {
			logger.info("Failure on Video Page" + e);
		}
	}

	public static boolean verifyAndClickNextSlide(WebDriver driver, String nextSlide) throws InterruptedException {
		waitToBePresent(driver, 3000, nextSlide);
		WebElement nextBtnElem = driver.findElement(By.xpath(nextSlide));
		if (nextBtnElem.isDisplayed()) {
			waitToBeClickable(driver, 9000, nextSlide);
			nextBtnElem.click();
			logger.info("Successfully showed Next Slide");
			Thread.sleep(3000);
			return true;
		} else {
			logger.info("Next Slide is not present");
		}
		return false;
	}

	public static void waitForSubVideo(WebDriver driver, String student) {
		try {
			while (true) {
				waitToBePresent(driver, 9000, student);
				WebElement button = driver.findElement(By.xpath(student));
				if (button.isDisplayed()) {
					break;
				}

			}
		} catch (Exception e) {
			logger.info("Failure on Video Page" + e);
		}
	}

	public static void waitForVideoToComplete(WebDriver driver, String nextSlide) {
		try {
			while (true) {
				WebElement button = driver.findElement(By.xpath(nextSlide));
				String enabled = button.getAttribute("aria-label");
				if (enabled.equals("Next Slide")) {
					break;
				}
			}
			Thread.sleep(1000);
		} catch (Exception e) {
			logger.info("Failure on Video Page" + e);
		}
	}

	public static void waitToBePresent(WebDriver driver, int waitTime, String xPathStr) {
		WebDriverWait wait1 = new WebDriverWait(driver, waitTime);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xPathStr)));
	}

	public static void waitToBeClickable(WebDriver driver, int waitTime, String xPathStr) {
		WebDriverWait wait1 = new WebDriverWait(driver, waitTime);
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathStr)));

	}
	public static void waitToBeClickableByCSS(WebDriver driver, int waitTime, String cSSSec) {
		WebDriverWait wait1 = new WebDriverWait(driver, waitTime);
		wait1.until(ExpectedConditions.elementToBeClickable(By.cssSelector(cSSSec)));

	}
	

	public static void clickSurrounding(Actions actions, WebElement element) {
		for (int xOffset = 0; xOffset <= 100; xOffset = xOffset + 10) {
			for (int yOffset = 0; yOffset <= 100; yOffset = yOffset + 10) {
				actions.moveToElement(element);
				actions.moveByOffset(xOffset, yOffset);
				actions.click();
				try {
					actions.perform();
					return;
				} catch (Exception e) {
					// do nothing
				}
			}
		}

		logger.info("element not clickable");
	}

	public static void answerShareLittleAboutYouQuestions(WebDriver driver, String selectID, int index) {
		try {
			Thread.sleep(3000);
			Select selectByIndex = new Select(driver.findElement(By.xpath(selectID)));
			selectByIndex.selectByIndex(index);
		} catch (Exception e) {
			logger.info("Failure in selecting dropdown options" + e);
		}
	}

	public static void waitToSubmitShareLittleAboutYou(WebDriver driver, String submit, String done) {
		try {
			Thread.sleep(3000);
			driver.findElement(By.xpath(submit)).click();
			logger.info("Able to click on Submit button");
		} catch (Exception e) {
			logger.info("Not able to click on Submit button" + e);
		}
		try {
			Thread.sleep(3000);
			driver.findElement(By.xpath(done)).click();
			logger.info("Able to click on Done button");
		} catch (Exception e) {
			logger.info("Not able to click on Done button" + e);
		}

	}

	public static void clickVerifyAndCloseATab(WebDriver driver, String clickTab, String closeTab) {
		try {
			Thread.sleep(3000);
			waitToBeClickable(driver, 6000, clickTab);
			driver.findElement(By.xpath(clickTab)).click();
			logger.info("Success");
		} catch (Exception e) {
			logger.info("Failed" + e);
		}
		try {
			Thread.sleep(3000);
			waitToBeClickable(driver, 6000, closeTab);
			driver.findElement(By.xpath(closeTab)).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			logger.info("Failed" + e);
		}
	}

	public static boolean clickTabsInsideAPage(WebDriver driver, String tab, String expectedPageTitle,
			String ActualPageTitle) throws InterruptedException {
		try {
			Thread.sleep(3000);
			waitToBeClickable(driver, 6000, tab);
			driver.findElement(By.xpath(tab)).click();
			logger.info("successfully clicked tab");
		} catch (InterruptedException e) {
			logger.info("Cannot click on tab", e);
		}
		try {
			Thread.sleep(3000);
			String expectedTitle = expectedPageTitle;
			WebElement element = driver.findElement(By.xpath(ActualPageTitle));
			String actualTitle = element.getText();
			return actualTitle.contains(expectedTitle);
		} catch (InterruptedException e) {
			logger.info("exception in verifying Title", e);
		}
		return false;

	}

	public static void clickFlipcards(WebDriver driver, String clickcard) {
		try {
			Thread.sleep(3000);
			waitToBeClickable(driver, 6000, clickcard);
			driver.findElement(By.xpath(clickcard)).click();
		} catch (InterruptedException e) {
			logger.info("exception in clickFlipcards", e);
		}

	}

	public static void waitForQuestionToAppear(WebDriver driver, String source) {
		try {
			Thread.sleep(3000);
			CommonUtils.waitToBePresent(driver, 6000, source);
		} catch (Exception e) {
			logger.info("Failure on Video Page" + e);
		}
	}

	public static void VerifyDragandDropFunctionality(WebDriver driver, String source, String destination)
			throws InterruptedException {
		try {
			Thread.sleep(3000);
			WebElement element = driver.findElement(By.xpath(source));
			WebElement target = driver.findElement(By.xpath(destination));
			(new Actions(driver)).dragAndDrop(element, target).build().perform();
			logger.info("Success in VerifyDragandDropFunctionalityF");
		} catch (Exception e) {
			logger.info("Exception in VerifyDragandDropFunctionality", e);
		}
	}

	public static void VerifydragAndDropAnswer(WebDriver driver, String submit, String tryAgain, String nextDialog)
			throws InterruptedException {
		Thread.sleep(3000);
		waitToBeClickable(driver, 6000, submit);
		driver.findElement(By.xpath(submit)).click();
		try {
			
			driver.findElement(By.xpath(nextDialog)).click();
		} catch (Exception e) {
			
			driver.findElement(By.xpath(tryAgain)).click();
		}

	}
	
	// Wait until the video is complete and pause button is displayed
	public static void waitBAVideoToComplete(WebDriver driver, String pauseBtn) {
		try {
			while (true) {
				Thread.sleep(3000);
				WebElement button = driver.findElement(By.xpath(pauseBtn));
				String enabled = button.getAttribute("aria-label");
				if (enabled.equals("Press Shift-Enter to Play Video")) {
					break;
				}
			}
		} catch (Exception e) {
			logger.info("Failure on Video Page" + e);
		}
	}

	// answer a question with wrong option and then with correction option
	public static void answerQuestions(WebDriver driver, String selectAns, String tryAgainBtn, String anotherAns,
			String next) throws InterruptedException {
		try {
			Thread.sleep(3000);
			waitToBeClickable(driver, 6000, selectAns);
			driver.findElement(By.xpath(selectAns)).click();
			WebElement tryBtn = driver.findElement(By.xpath(tryAgainBtn));
			if (tryBtn.isDisplayed()) {
				tryBtn.click();
				waitToBeClickable(driver, 6000, anotherAns);
				driver.findElement(By.xpath(anotherAns)).click();
				Thread.sleep(3000);
				waitToBeClickable(driver, 6000, next);
				driver.findElement(By.xpath(next)).click();
			} else {
				Thread.sleep(3000);
				waitToBeClickable(driver, 6000, next);
				driver.findElement(By.xpath(next)).click();
			}
		} catch (InterruptedException e) {
			logger.info("exception occured", e);
		}

	}

	public static void selectAnsForQues(WebDriver driver, String selectAns, String tryAgainBtn, String anotherAns,
			String nextBtn) throws InterruptedException {
		try {
			Thread.sleep(3000);
			waitToBeClickable(driver, 6000, selectAns);
			driver.findElement(By.xpath(selectAns)).click();
			Thread.sleep(2000);
			WebElement tryBtn = driver.findElement(By.xpath(tryAgainBtn));
			if (tryBtn.isDisplayed()) {
				tryBtn.click();
				Thread.sleep(2000);
				waitToBeClickable(driver, 6000, anotherAns);
				driver.findElement(By.xpath(anotherAns)).click();
				Thread.sleep(2000);
				waitToBeClickable(driver, 6000, nextBtn);
				driver.findElement(By.xpath(nextBtn)).click();
			} else {
				Thread.sleep(2000);
				waitToBeClickable(driver, 6000, nextBtn);
				driver.findElement(By.xpath(nextBtn)).click();
			}
		} catch (InterruptedException e) {
			logger.info("exception occured", e);
		}

	}

	public static void answerNumQuestions(WebDriver driver, String tryAgainXPath, String nextQuesXPath, String ansXPath,
			int numQ) throws InterruptedException {
		for (int i = 0; i < numQ; i++) {
			Thread.sleep(3000);
			boolean correctAns = false;
			while (!correctAns) {
				waitToBeClickable(driver, 6000, ansXPath);
				driver.findElement(By.xpath(ansXPath)).click();
				try {
					waitToBeClickable(driver, 6000, nextQuesXPath);
					driver.findElement(By.xpath(nextQuesXPath)).click();
					correctAns = true;
				} catch (Exception e) {
					waitToBeClickable(driver, 6000, tryAgainXPath);
					driver.findElement(By.xpath(tryAgainXPath)).click();
				}
			}
		}
	}

	public static void findAndClickElementByXPath(WebDriver driver, String xPath) throws InterruptedException, WebDriverException {
		Thread.sleep(2000);
		waitToBeClickable(driver, 6000, xPath);
		driver.findElement(By.xpath(xPath)).click();
		Thread.sleep(1000);
	}

	public static boolean verifyTitle(WebDriver driver, String expectedTitle, String actualTitleXPath) {
		try {
			Thread.sleep(2000);
			waitToBePresent(driver, 9000,actualTitleXPath);
			WebElement element = driver.findElement(By.xpath(actualTitleXPath));
			String actualTitle = element.getText();
			if (actualTitle.contains(expectedTitle)) {
				return true;
			}
		} catch (InterruptedException e) {
			logger.info("exception in verifyTitle", e);
		}
		return false;
	}

	public static void VerifyHorizontalscrollbar(WebDriver driver, String scrollElementCSS)
			throws InterruptedException {
		Thread.sleep(3000);
		WebElement scrollElement = driver.findElement(By.cssSelector(scrollElementCSS));
		Actions builder = new Actions(driver);
		Action scrollToBottom = builder.dragAndDropBy(scrollElement, 2000, 0).build();
		scrollToBottom.perform();
		Thread.sleep(2000);
	}

	public static void VerifyVerticalscrollbar(WebDriver driver, String scrollElementCSS) throws InterruptedException {
		Thread.sleep(3000);
		WebElement scrollElement = driver.findElement(By.cssSelector(scrollElementCSS));
		Actions builder = new Actions(driver);
		Action scrollToBottom = builder.dragAndDropBy(scrollElement, 0, 2000).build();
		scrollToBottom.perform();
		Thread.sleep(2000);
		
	}

}
