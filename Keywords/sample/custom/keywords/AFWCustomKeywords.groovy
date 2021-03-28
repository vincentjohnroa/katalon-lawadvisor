package sample.custom.keywords

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.util.KeywordUtil
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

import internal.GlobalVariable

public class AFWCustomKeywords {
	KeywordLogger log = new KeywordLogger()
	
	@Keyword
	def openNewTabAndValidate(String assertUrl, assertTitle) {
		WebUI.click(findTestObject('Object Repository/AFW_Test7_objects/Page_ToolsQA/newTab_Button'))
		WebUI.switchToWindowIndex(1)
		String url = WebUI.getUrl()

		if(url == assertUrl) {
			log.logInfo("URL is correct!")
		} else {
			KeywordUtil.markFailed("Incorrect url assertion!" + url)
		}
		
		WebUI.verifyElementText(findTestObject('AFW_Test7_objects/Page_ToolsQA/newTabWindow_Page'), assertTitle)
		
		WebUI.closeWindowIndex(1)
	}
	
	@Keyword
	def openNewWindowAndValidate(String assertUrl, assertTitle) {
		WebUI.switchToWindowIndex(0)
		WebUI.click(findTestObject('Object Repository/AFW_Test7_objects/Page_ToolsQA/newWindow_Button'))
		
		WebUI.switchToWindowIndex(1)
		String url = WebUI.getUrl()
		
		if(url == assertUrl) {
			log.logInfo("URL is correct!")
		} else {
			KeywordUtil.markFailed("Incorrect url assertion!" + url)
		}
		
		WebUI.verifyElementText(findTestObject('AFW_Test7_objects/Page_ToolsQA/newTabWindow_Page'), assertTitle)
		WebUI.closeWindowIndex(1)
	}
	
	@Keyword
	def openNewWindowMessageAndValidatePresentWindow() {
		WebUI.switchToWindowIndex(0)
		WebUI.click(findTestObject('Object Repository/AFW_Test7_objects/Page_ToolsQA/newWindowMessage_Button'))
		WebUI.closeWindowIndex(0)
		WebUI.delay(3)
		
		WebUI.switchToWindowIndex(0)
	}
	
}

