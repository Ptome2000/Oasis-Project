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

WebUI.callTestCase(findTestCase('ESO/Age Valitadion/A000 - Age Validation'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('ESO/Page_Age_Verification/input_Age Verification_month'), CustomKeywords.'helpers.getTodayDate.month'())

WebUI.sendKeys(findTestObject('ESO/Page_Age_Verification/input_Age Verification_day'), CustomKeywords.'helpers.getTodayDate.day'())

WebUI.sendKeys(findTestObject('ESO/Page_Age_Verification/input_Age Verification_year'), CustomKeywords.'helpers.getTodayDate.UnderYear'())

WebUI.click(findTestObject('ESO/Page_Age_Verification/button_Submit'))

WebUI.verifyElementVisible(findTestObject('Object Repository/ESO/Page_Age_Verification/h4_Access Denied'))

