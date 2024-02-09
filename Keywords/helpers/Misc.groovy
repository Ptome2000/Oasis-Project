package helpers

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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

import internal.GlobalVariable


public class Misc {

	@Keyword
	def LoginPage() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://account.elderscrollsonline.com/en-us/login')
	}
	
	@Keyword
	def logMessage(String message, String type) {
		
		KeywordUtil log = new KeywordUtil()
		
		switch(type.toLowerCase()) {
			case "warning": log.markWarning(message) 
				break
			case "passed": log.markPassed(message)
				break
			
			default:
				throw new IllegalArgumentException()
		}
		
		
	}

	@Keyword
	def OpenSearchBar() {
		//	Search bar doesn't always appear, try 5 times

		for (int i = 0; i <= 5; i++) {
			WebUI.click(findTestObject('Object Repository/ESO/Page_Home/Search Bar/i_fa fa-search'))
			boolean search = WebUI.verifyElementVisible(findTestObject('ESO/Page_Home/Search Bar/inputsearchBox'), FailureHandling.OPTIONAL)

			if (search) {
				break
			} else if (i == 5) {
				throw new com.kms.katalon.core.exception.StepFailedException()
			} else {
				WebUI.refresh()
			}
		}
	}
}
