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
import helpers.VariableCollections as VariableCollections

WebUI.openBrowser('google.com')

WebUI.maximizeWindow()

//Header of the browser window
String header = WebUI.getWindowTitle()

//Number of the current window tab
int tab = WebUI.getWindowIndex()

//VariableCollections.map.put("tabVariable", tab) //	Another way to pass arguments between tests
WebUI.delay(3)

WebUI.callTestCase(findTestCase('Browser Operations/003 - JavaScript Operations'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Browser Operations/004 - Switching Operations'), [('tab') : tab], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Browser Operations/005 - Closing Operations'), [('tab') : tab], FailureHandling.STOP_ON_FAILURE)

