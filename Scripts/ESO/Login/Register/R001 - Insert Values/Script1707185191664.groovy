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

WebUI.callTestCase(findTestCase('ESO/Login/Register/R000 - Register Form'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('ESO/Page_Login/Page_Register/input_userscreen_name'), User)

WebUI.setText(findTestObject('ESO/Page_Login/Page_Register/input_useremail'), Email)

WebUI.setText(findTestObject('ESO/Page_Login/Page_Register/input_useremail_confirmation'), Email)

WebUI.setText(findTestObject('ESO/Page_Login/Page_Register/input_userpassword'), Password)

WebUI.setText(findTestObject('ESO/Page_Login/Page_Register/input_userpassword_confirmation'), Password)

WebUI.selectOptionByValue(findTestObject('Page_Register/select_What is the last name of your favori_c3a5d2'), '9', true)

