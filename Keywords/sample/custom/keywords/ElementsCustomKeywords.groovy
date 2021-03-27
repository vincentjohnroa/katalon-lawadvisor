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

import internal.GlobalVariable


import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.common.WebUiCommonHelper

public class ElementsCustomKeywords {

	@Keyword
	def inputDetails(String username, String email, String cadd, String padd) {
		String inputUsernameField = 'Object Repository/Elements_Test1_objects/Page_ToolsQA/input_Username_Field'
		String inputEmailField = 'Object Repository/Elements_Test1_objects/Page_ToolsQA/input_Email_Field'
		String inputCurrentAddressField = 'Object Repository/Elements_Test1_objects/Page_ToolsQA/textarea_Current Address'
		String inputPermanentAddressField = 'Object Repository/Elements_Test1_objects/Page_ToolsQA/textarea_Permanent Address'

		WebUI.setText(findTestObject(inputUsernameField), username)
		WebUI.setText(findTestObject(inputEmailField), email)
		WebUI.setText(findTestObject(inputCurrentAddressField), cadd)
		WebUI.setText(findTestObject(inputPermanentAddressField), padd)
	}

	@Keyword
	def validateSubmittedDetails(String username, String email, String cadd, String padd) {
		String verifyUsernameDetails = 'Object Repository/Elements_Test1_objects/Page_ToolsQA/p_Name_Container'
		String verifyEmailDetails = 'Object Repository/Elements_Test1_objects/Page_ToolsQA/p_Email_Container'
		String verifyCurrentAddress = 'Object Repository/Elements_Test1_objects/Page_ToolsQA/p_Current Address_Container'
		String verifyPermanentAddress = 'Object Repository/Elements_Test1_objects/Page_ToolsQA/p_Permananet Address_Container'

		WebUI.verifyElementText(findTestObject(verifyUsernameDetails), "Name:"+username+"")
		WebUI.verifyElementText(findTestObject(verifyEmailDetails), "Email:"+email+"")
		WebUI.verifyElementText(findTestObject(verifyCurrentAddress), "Current Address :"+cadd+"")
		WebUI.verifyElementText(findTestObject(verifyPermanentAddress), "Permananet Address :"+padd+"")
	}

	@Keyword
	def tickCheckboxes(String a,b,c,d,e) {
		String tickCommands = "Object Repository/Elements_Test2_objects/Page_ToolsQA/"+a+"_checkbox"
		String tickVeu = "Object Repository/Elements_Test2_objects/Page_ToolsQA/"+b+"_checkbox"
		String tickClassified = "Object Repository/Elements_Test2_objects/Page_ToolsQA/"+c+"_checkbox"
		String tickGeneral = "Object Repository/Elements_Test2_objects/Page_ToolsQA/"+d+"_checkbox"
		String tickExcel = "Object Repository/Elements_Test2_objects/Page_ToolsQA/"+e+"_checkbox"

		WebUI.click(findTestObject(tickCommands))
		WebUI.click(findTestObject(tickVeu))
		WebUI.scrollToPosition(0, 500)
		WebUI.click(findTestObject(tickClassified))
		WebUI.click(findTestObject(tickGeneral))
		WebUI.click(findTestObject(tickExcel))
	}

	@Keyword
	def validateResultFromCheckboxes(String com, String v, String classif, String gen, String ex) {
		String verifyCommands = 'Object Repository/Elements_Test2_objects/Page_ToolsQA/SelectedCheckboxesResultCommands_container'
		String verifyVeu = 'Object Repository/Elements_Test2_objects/Page_ToolsQA/SelectedCheckboxesResultVeu_container'
		String verifyClassified = 'Object Repository/Elements_Test2_objects/Page_ToolsQA/SelectedCheckboxesResultClassified_container'
		String verifyGeneral = 'Object Repository/Elements_Test2_objects/Page_ToolsQA/SelectedCheckboxesResultGeneral_container'
		String verifyExcel = 'Object Repository/Elements_Test2_objects/Page_ToolsQA/SelectedCheckboxesResultExcel_container'

		WebUI.verifyElementText(findTestObject(verifyCommands), com)
		WebUI.verifyElementText(findTestObject(verifyVeu), v)
		WebUI.verifyElementText(findTestObject(verifyClassified), classif)
		WebUI.verifyElementText(findTestObject(verifyGeneral), gen)
		WebUI.verifyElementText(findTestObject(verifyExcel), ex)
	}
}



