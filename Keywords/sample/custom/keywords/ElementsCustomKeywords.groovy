package sample.custom.keywords

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.apache.commons.lang.RandomStringUtils
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.RestRequestObjectBuilder
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.testobject.impl.HttpTextBodyContent
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS


public class ElementsCustomKeywords {

	@Keyword
	def inputDetails(String username, email, cadd, padd) {
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
	def validateSubmittedDetails(String username, email, cadd, padd) {
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
	def validateResultFromCheckboxes(String com, v, classif, gen, ex) {
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

	@Keyword
	def updateAndValidateAldenRecord(String lastName,age,salary) {
		KeywordLogger log = new KeywordLogger()
		//Get old records for comparison
		String oldLastName = WebUI.getText(findTestObject('Elements_Test3_objects/Page_ToolsQA/alden_LastName_Record'))
		String oldAge = WebUI.getText(findTestObject('Elements_Test3_objects/Page_ToolsQA/alden_Age_Record'))
		String oldSalary = WebUI.getText(findTestObject('Elements_Test3_objects/Page_ToolsQA/alden_Salary_Record'))

		//Edit/input updated details
		WebUI.click(findTestObject('Object Repository/Elements_Test3_objects/Page_ToolsQA/edit_Pencil_Icon'))
		WebUI.clearText(findTestObject('Elements_Test3_objects/Page_ToolsQA/lastname_Input_Field'))
		WebUI.setText(findTestObject('Elements_Test3_objects/Page_ToolsQA/lastname_Input_Field'), lastName)
		WebUI.clearText(findTestObject('Elements_Test3_objects/Page_ToolsQA/age_Input_Field'))
		WebUI.setText(findTestObject('Elements_Test3_objects/Page_ToolsQA/age_Input_Field'), age)
		WebUI.clearText(findTestObject('Elements_Test3_objects/Page_ToolsQA/salary_Input_Field'))
		WebUI.setText(findTestObject('Elements_Test3_objects/Page_ToolsQA/salary_Input_Field'), salary)

		//Submit updated details
		WebUI.click(findTestObject('Elements_Test3_objects/Page_ToolsQA/submit_Button'))

		//Validation/comparison of updated details
		String newLastName = WebUI.getText(findTestObject('Elements_Test3_objects/Page_ToolsQA/alden_LastName_Record'))
		String newAge = WebUI.getText(findTestObject('Elements_Test3_objects/Page_ToolsQA/alden_Age_Record'))
		String newSalary = WebUI.getText(findTestObject('Elements_Test3_objects/Page_ToolsQA/alden_Salary_Record'))

		if(oldLastName != newLastName && oldAge != newAge && oldSalary != newSalary) {
			log.logInfo("Updated details successfully!")
		} else {
			KeywordUtil.markFailed("Unable to update accordingly!")
		}
	}

	@Keyword
	def addNewTableRecords(int numOfRecords) {
		for (int i = 0; i < numOfRecords; i++) {
			String charset = (("abcdefghijklmnopqrstuvwxyz"))
			String randomString = RandomStringUtils.random(5, charset.toCharArray())

			WebUI.click(findTestObject('Object Repository/Elements_Test3_objects/Page_ToolsQA/add_NewRecord_Button'))

			WebUI.setText(findTestObject('Elements_Test3_objects/Page_ToolsQA/firstname_Input_Field'), randomString)
			WebUI.setText(findTestObject('Elements_Test3_objects/Page_ToolsQA/lastname_Input_Field'), randomString)
			WebUI.setText(findTestObject('Elements_Test3_objects/Page_ToolsQA/email_Input_Field'), randomString + "@gmail.com")
			WebUI.setText(findTestObject('Elements_Test3_objects/Page_ToolsQA/age_Input_Field'), "20")
			WebUI.setText(findTestObject('Elements_Test3_objects/Page_ToolsQA/salary_Input_Field'), "20000")
			WebUI.setText(findTestObject('Elements_Test3_objects/Page_ToolsQA/department_Input_Field'), "Science" + randomString)

			WebUI.click(findTestObject('Elements_Test3_objects/Page_ToolsQA/submit_Button'))

		}

	}

	@Keyword
	def verifyResponseCodes(String x) {
		KeywordLogger log = new KeywordLogger()
		Thread.sleep(3000)

		String response = WebUI.getText(findTestObject('Object Repository/Elements_Test4_objects/Page_ToolsQA/link_Response_Container'))

		if (response.contains(x)) {
			log.logInfo("Response code is "+x+"")
		} else {
			KeywordUtil.markFailed("Incorrect response code" + response)
		}
	}

	@Keyword
	def uploadFile() {
		WebUI.uploadFile(findTestObject('Object Repository/Elements_Test5_objects/Page_ToolsQA/chooseFile_Button'), 'C:\\Users\\wahu\\Desktop\\sampleFile.jpg')
	}

	@Keyword
	def downloadFile() {
		WebUI.click(findTestObject('Object Repository/Elements_Test5_objects/Page_ToolsQA/download_Button'))
		Thread.sleep(5000)
		File filename = new File('C:\\Users\\wahu\\Downloads\\sampleFile.jpeg')
		filename.delete();
	}

	@Keyword
	def clickHomeVerifyResponse(int rcode) {
		String requestMethod = "GET"
		
		WebUI.click(findTestObject('Object Repository/Elements_Test4_objects/Page_ToolsQA/homeNewTab_Link'))
		WebUI.switchToWindowIndex(1)
		String url = WebUI.getUrl()
		
		RequestObject ro = new RequestObject()
		ro.setRestUrl(url)
		ro.setRestRequestMethod(requestMethod)
		
		ResponseObject respObj = WS.sendRequest(ro)
		WS.verifyResponseStatusCode(respObj, rcode)
		WebUI.closeWindowIndex(1)
		WebUI.switchToWindowIndex(0)
	}
	
	@Keyword
	def clickHomeHomeFO6yoVerifyResponse(int rcode) {
		String requestMethod = "GET"
		
		WebUI.click(findTestObject('Object Repository/Elements_Test4_objects/Page_ToolsQA/homeFNewTab_Link'))
		WebUI.switchToWindowIndex(1)
		String url = WebUI.getUrl()
		
		RequestObject ro = new RequestObject()
		ro.setRestUrl(url)
		ro.setRestRequestMethod(requestMethod)
		
		ResponseObject respObj = WS.sendRequest(ro)
		WS.verifyResponseStatusCode(respObj, rcode)
		
		WebUI.closeWindowIndex(1)
		WebUI.switchToWindowIndex(0)
		
	}

}
