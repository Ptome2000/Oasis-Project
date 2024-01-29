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

WebUI.openBrowser('https://www.elderscrollsonline.com/en-us/home')

String header = WebUI.getWindowTitle()

//Check if title matches the expected string
WebUI.verifyMatch(header, 'Home - The Elder Scrolls Online', true)

//Check if given Element is present
WebUI.verifyElementPresent(findTestObject('ESO/Page_Home/h2_LATEST NEWS'), 0)

//Check if given Element is clickable
WebUI.verifyElementClickable(findTestObject('ESO/Page_Home/button_ACCEPT ALL'))

//Check if given Element is visible on the entire webpage
WebUI.verifyElementVisible(findTestObject('ESO/Page_Home/a_The Elder Scrolls  Online'))

//Check if given Element is visisble in the viewport
WebUI.verifyElementInViewport(findTestObject('ESO/Page_Home/div_Policy'), 0)

WebUI.click(findTestObject('ESO/Page_Home/button_ACCEPT ALL'))

WebUI.refresh()

//Check if given Element is not present
WebUI.verifyElementNotPresent(findTestObject('ESO/Page_Home/button_ACCEPT ALL'), 0)

//Check if given Sring is present on the webpage
WebUI.verifyTextPresent('DISCOVER TAMRIEL', false)

//Check if given Element has the given String
WebUI.verifyElementText(findTestObject('ESO/Page_Home/a_Buy Now'), 'BUY NOW')

WebUI.closeBrowser()

