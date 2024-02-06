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

WebUI.navigateToUrl('https://account.elderscrollsonline.com/en-us/agegate?URL=%2fen-us%2fregister%2faccount-information')

WebUI.callTestCase(findTestCase('ESO/Age Valitadion/A002 - Valid Age'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ESO/Page_Login/Page_Register/input_useremail'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ESO/Page_Login/Page_Register/input_useremail_confirmation'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ESO/Page_Login/Page_Register/input_userpassword'))

WebUI.verifyElementVisible(findTestObject('ESO/Page_Login/Page_Register/input_userpassword_confirmation'))

WebUI.verifyElementVisible(findTestObject('ESO/Page_Login/Page_Register/input_userscreen_name'))

WebUI.verifyElementVisible(findTestObject('ESO/Page_Login/Page_Register/input_usersecret_answer'))

WebUI.takeScreenshotAsCheckpoint('Register_Form', FailureHandling.OPTIONAL)

