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

WebUI.click(findTestObject('Object Repository/Elements_Test1_objects/Page_ToolsQA/TextBox_button'))

CustomKeywords.'sample.custom.keywords.ElementsCustomKeywords.submitDetails'(
	"Vincent John Roa",
	"abc@gmail.com",
	"sjdm bulacan", 
    "sjdm bulacan")

WebUI.scrollToPosition(0, 500)

WebUI.click(findTestObject('Object Repository/Elements_Test1_objects/Page_ToolsQA/button_Submit'))

CustomKeywords.'sample.custom.keywords.ElementsCustomKeywords.validateSubmittedDetails'(
	"Vincent John Roa",
	"abc@gmail.com", 
    "sjdm bulacan",
	"sjdm bulacan")

WebUI.closeBrowser()

