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
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.Keys as Keys

import internal.GlobalVariable


public class WidgetsCustomKeywords {

	@Keyword
	def widgetsDatePicker() {
		WebUI.click(findTestObject('Object Repository/Widgets_Test8/Page_ToolsQA/datePicker_Input'))
		WebUI.selectOptionByValue(findTestObject('Object Repository/Forms_Test6_objects/Page_ToolsQA/monthpicker_Select'), "9", false)
		WebUI.selectOptionByValue(findTestObject('Object Repository/Forms_Test6_objects/Page_ToolsQA/yearpicker_Select'), "1991", false)
		WebUI.click(findTestObject('Object Repository/Widgets_Test8/Page_ToolsQA/dayPickerWidgets_Select'))

		WebUI.click(findTestObject('Object Repository/Widgets_Test8/Page_ToolsQA/dateAndTimePicker_Input'))

		WebUI.click(findTestObject('Object Repository/Widgets_Test8/Page_ToolsQA/monthWidgetsPicker_Dropdown'))
		WebUI.click(findTestObject('Object Repository/Widgets_Test8/Page_ToolsQA/monthWidgetsPicker_Select'))

		WebUI.click(findTestObject('Object Repository/Widgets_Test8/Page_ToolsQA/yearWidgetsPicker_Dropdown'))

		for (int i = 0; i < 30; i++) {
			WebUI.click(findTestObject('Object Repository/Widgets_Test8/Page_ToolsQA/yearDownSelect_Button'))
		}

		WebUI.click(findTestObject('Object Repository/Widgets_Test8/Page_ToolsQA/yearWidgetsPicker_Select'))
		WebUI.click(findTestObject('Object Repository/Widgets_Test8/Page_ToolsQA/datDayWidgetsPicker_Select'))

		WebUI.click(findTestObject('Object Repository/Widgets_Test8/Page_ToolsQA/timeWidgetsPicker_Select'))
	}

	@Keyword
	def moveSlider(int val){
		WebDriver driver = DriverFactory.getWebDriver()
		WebElement slider = driver.findElement(By.xpath("//input[@type='range']"));

		for(int i=1; i<=val; i++) {
			slider.sendKeys(Keys.ARROW_RIGHT);
		}
	}

	@Keyword
	def selectMenu(String val, sone, c1, c2) {
		Robot rb = new Robot()

		WebUI.click(findTestObject('Object Repository/Widgets10_Test/Page_ToolsQA/selectValue_Dropdown'))
		WebUI.setText(findTestObject('Object Repository/Widgets10_Test/Page_ToolsQA/selectValue_Input'), val)
		rb.keyPress(KeyEvent.VK_ENTER)

		WebUI.click(findTestObject('Object Repository/Widgets10_Test/Page_ToolsQA/selectOne_Dropdown'))
		WebUI.setText(findTestObject('Object Repository/Widgets10_Test/Page_ToolsQA/selectOne_Input'), sone)
		rb.keyPress(KeyEvent.VK_ENTER)

		WebUI.click(findTestObject('Object Repository/Widgets10_Test/Page_ToolsQA/oldSelect_Dropdown'))
		WebUI.click(findTestObject('Object Repository/Widgets10_Test/Page_ToolsQA/oldViolet'))

		WebUI.click(findTestObject('Object Repository/Widgets10_Test/Page_ToolsQA/multiSelect_Dropdown'))
		WebUI.setText(findTestObject('Object Repository/Widgets10_Test/Page_ToolsQA/multiSelect_Input'), c1)
		rb.keyPress(KeyEvent.VK_ENTER)
		WebUI.setText(findTestObject('Object Repository/Widgets10_Test/Page_ToolsQA/multiSelect_Input'), c2)
		rb.keyPress(KeyEvent.VK_ENTER)
	}
}

