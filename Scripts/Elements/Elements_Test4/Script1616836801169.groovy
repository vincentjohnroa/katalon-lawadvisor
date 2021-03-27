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

CustomKeywords.'sample.custom.keywords.GeneralCustomKeywords.openDemoQa'()

CustomKeywords.'sample.custom.keywords.GeneralCustomKeywords.viewElementsScreen'()

WebUI.scrollToPosition(0, 500)

WebUI.click(findTestObject('Object Repository/Elements_Test4_objects/Page_ToolsQA/Links_button'))

WebUI.scrollToPosition(0, 200)

WebUI.click(findTestObject('Object Repository/Elements_Test4_objects/Page_ToolsQA/created_API_Link'))
CustomKeywords.'sample.custom.keywords.ElementsCustomKeywords.verifyResponseCodes'("201")

WebUI.click(findTestObject('Object Repository/Elements_Test4_objects/Page_ToolsQA/nocontent_API_Link'))
CustomKeywords.'sample.custom.keywords.ElementsCustomKeywords.verifyResponseCodes'("204")

WebUI.click(findTestObject('Object Repository/Elements_Test4_objects/Page_ToolsQA/moved_API_Link'))
CustomKeywords.'sample.custom.keywords.ElementsCustomKeywords.verifyResponseCodes'("301")

WebUI.click(findTestObject('Object Repository/Elements_Test4_objects/Page_ToolsQA/badrequest_API_Link'))
CustomKeywords.'sample.custom.keywords.ElementsCustomKeywords.verifyResponseCodes'("400")

WebUI.click(findTestObject('Object Repository/Elements_Test4_objects/Page_ToolsQA/unauthorized_API_Link'))
CustomKeywords.'sample.custom.keywords.ElementsCustomKeywords.verifyResponseCodes'("401")

WebUI.click(findTestObject('Object Repository/Elements_Test4_objects/Page_ToolsQA/forbidden_API_Link'))
CustomKeywords.'sample.custom.keywords.ElementsCustomKeywords.verifyResponseCodes'("403")

WebUI.click(findTestObject('Object Repository/Elements_Test4_objects/Page_ToolsQA/notFound_API_Link'))
CustomKeywords.'sample.custom.keywords.ElementsCustomKeywords.verifyResponseCodes'("404")

WebUI.closeBrowser() 

//WORK IN PROGRESS