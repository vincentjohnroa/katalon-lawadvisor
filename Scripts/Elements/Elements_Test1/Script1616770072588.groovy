import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demoqa.com/')

WebUI.scrollToPosition(0, 300)

WebUI.click(findTestObject('Object Repository/Elements_Test1_objects/Page_ToolsQA/div_Elements'))

WebUI.click(findTestObject('Object Repository/Elements_Test1_objects/Page_ToolsQA/li_Text Box'))


//Submit details
WebUI.setText(findTestObject('Object Repository/Elements_Test1_objects/Page_ToolsQA/input_Full Name_userName'), 'Vincent John Roa')

WebUI.setText(findTestObject('Object Repository/Elements_Test1_objects/Page_ToolsQA/input_Email_userEmail'), 'abc@gmail.com')

WebUI.setText(findTestObject('Object Repository/Elements_Test1_objects/Page_ToolsQA/textarea_Current Address_currentAddress'),
	'sjdm bulacan')

WebUI.setText(findTestObject('Object Repository/Elements_Test1_objects/Page_ToolsQA/textarea_Permanent Address_permanentAddress'),
	'sjdm bulacan')

WebUI.scrollToPosition(0, 500)

WebUI.click(findTestObject('Object Repository/Elements_Test1_objects/Page_ToolsQA/button_Submit'))


//Validations of submitted details
WebUI.verifyElementText(findTestObject('Object Repository/Elements_Test1_objects/Page_ToolsQA/p_NameVincent John Roa'), 'Name:Vincent John Roa')

WebUI.verifyElementText(findTestObject('Object Repository/Elements_Test1_objects/Page_ToolsQA/p_Emailabcgmail.com'), 'Email:abc@gmail.com')

WebUI.verifyElementText(findTestObject('Object Repository/Elements_Test1_objects/Page_ToolsQA/p_Current Address sjdm bulacan'), 'Current Address :sjdm bulacan')

WebUI.verifyElementText(findTestObject('Object Repository/Elements_Test1_objects/Page_ToolsQA/p_Permananet Address sjdm bulacan'), 'Permananet Address :sjdm bulacan')

WebUI.closeBrowser()