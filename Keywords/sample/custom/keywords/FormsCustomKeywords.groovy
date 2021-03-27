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
import org.openqa.selenium.Keys as Keys
import java.awt.Robot as Robot

import java.awt.event.KeyEvent as KeyEvent

import internal.GlobalVariable

public class FormsCustomKeywords {

	@Keyword
	def inputDetailsPracticeForm(String fname, lname, email, number) {
		Robot rb = new Robot()
		WebUI.setText(findTestObject('Elements_Test3_objects/Page_ToolsQA/firstname_Input_Field'), fname)
		WebUI.setText(findTestObject('Elements_Test3_objects/Page_ToolsQA/lastname_Input_Field'), lname)
		WebUI.setText(findTestObject('Elements_Test3_objects/Page_ToolsQA/email_Input_Field'), email)
		WebUI.click(findTestObject('Object Repository/Elements_Test6_objects/Page_ToolsQA/gender_Other_Radio'))
		WebUI.setText(findTestObject('Object Repository/Elements_Test6_objects/Page_ToolsQA/number_Input_Field'), number)

		WebUI.scrollToPosition(0, 400)

		WebUI.click(findTestObject('Object Repository/Elements_Test6_objects/Page_ToolsQA/dob_Input_Field'))
		WebUI.selectOptionByValue(findTestObject('Elements_Test6_objects/Page_ToolsQA/monthpicker_Select'), "7", false)
		WebUI.selectOptionByValue(findTestObject('Elements_Test6_objects/Page_ToolsQA/yearpicker_Select'), "1985", false)
		WebUI.click(findTestObject('Object Repository/Elements_Test6_objects/Page_ToolsQA/daypicker_Select'))
		WebUI.setText(findTestObject('Object Repository/Elements_Test6_objects/Page_ToolsQA/subjects_Input_Field'), "English")
		rb.keyPress(KeyEvent.VK_ENTER)
		WebUI.click(findTestObject('Object Repository/Elements_Test6_objects/Page_ToolsQA/hobbies_Reading_Check'))
		WebUI.uploadFile(findTestObject('Object Repository/Elements_Test6_objects/Page_ToolsQA/upload_Picture_Button'), 'C:\\Users\\wahu\\Desktop\\sampleFile.jpg')
		WebUI.setText(findTestObject('Object Repository/Elements_Test1_objects/Page_ToolsQA/textarea_Current Address'), "BGC")
		WebUI.click(findTestObject('Object Repository/Elements_Test6_objects/Page_ToolsQA/state_Dropdown'))
		rb.keyPress(KeyEvent.VK_ENTER)
		WebUI.click(findTestObject('Object Repository/Elements_Test6_objects/Page_ToolsQA/city_Dropdown'))
		rb.keyPress(KeyEvent.VK_ENTER)
		
		WebUI.click(findTestObject('Elements_Test3_objects/Page_ToolsQA/submit_Button'))
	}

	@Keyword
	def validateSubmittedDetailsInForm(String name, email, gender, num, dob, pic) {
		String verifyStudnameInfo = 'Object Repository/Elements_Test6_objects/Page_ToolsQA/studName_Info'
		String verifyEmailInfo = 'Object Repository/Elements_Test6_objects/Page_ToolsQA/email_Info'
		String verifyGenderInfo = 'Object Repository/Elements_Test6_objects/Page_ToolsQA/gender_Info'
		String verifyNumInfo = 'Object Repository/Elements_Test6_objects/Page_ToolsQA/number_Info'
		String verifyDobInfo = 'Object Repository/Elements_Test6_objects/Page_ToolsQA/dob_Info'
		String verifyPicInfo = 'Object Repository/Elements_Test6_objects/Page_ToolsQA/pic_Info'

		WebUI.verifyElementText(findTestObject(verifyStudnameInfo), name)
		WebUI.verifyElementText(findTestObject(verifyEmailInfo), email)
		WebUI.verifyElementText(findTestObject(verifyGenderInfo), gender)
		WebUI.verifyElementText(findTestObject(verifyNumInfo), num)
		WebUI.verifyElementText(findTestObject(verifyDobInfo), dob)
		WebUI.verifyElementText(findTestObject(verifyPicInfo), pic)
	}
}
