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

import internal.GlobalVariable

public class WidgetsCustomKeywords {
	
	@Keyword
	def widgetsDatePicker() {
		Robot rb = new Robot()
		WebUI.click(findTestObject('Object Repository/Widgets_Test8/Page_ToolsQA/datePicker_Input'))
		WebUI.selectOptionByValue(findTestObject('Forms_Test6_objects/Page_ToolsQA/monthpicker_Select'), "9", false)
		WebUI.selectOptionByValue(findTestObject('Forms_Test6_objects/Page_ToolsQA/yearpicker_Select'), "1991", false)
		WebUI.click(findTestObject('Object Repository/Widgets_Test8/Page_ToolsQA/dayPickerWidgets_Select'))
		
		WebUI.click(findTestObject('Object Repository/Widgets_Test8/Page_ToolsQA/dateAndTimePicker_Input'))
		
		WebUI.click(findTestObject('Widgets_Test8/Page_ToolsQA/monthWidgetsPicker_Dropdown'))
		WebUI.click(findTestObject('Object Repository/Widgets_Test8/Page_ToolsQA/monthWidgetsPicker_Select'))

		WebUI.click(findTestObject('Widgets_Test8/Page_ToolsQA/yearWidgetsPicker_Dropdown'))
		
		for (int i = 0; i < 30; i++) {
			WebUI.click(findTestObject('Object Repository/Widgets_Test8/Page_ToolsQA/yearDownSelect_Button'))
		}
		
		WebUI.click(findTestObject('Object Repository/Widgets_Test8/Page_ToolsQA/yearWidgetsPicker_Select'))
		WebUI.click(findTestObject('Object Repository/Widgets_Test8/Page_ToolsQA/datDayWidgetsPicker_Select'))

		WebUI.click(findTestObject('Object Repository/Widgets_Test8/Page_ToolsQA/timeWidgetsPicker_Select'))

	}
}
