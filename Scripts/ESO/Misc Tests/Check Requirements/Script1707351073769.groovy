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
import groovy.swing.LookAndFeelHelper as LookAndFeelHelper
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Windows.startApplicationWithTitle('D:\\SteamLibrary\\steamapps\\common\\Zenimax Online\\The Elder Scrolls Online\\game\\client\\ESORequirementChecker.exe', 
    '')

String titlebar = Windows.getText(findWindowsObject('Object Repository/ESO/Requirements_App/TitleBar'))

WebUI.verifyMatch(titlebar, 'ESORequirementChecker', false)

String result = Windows.getText(findWindowsObject('Object Repository/ESO/Requirements_App/Result'))

if (WebUI.verifyMatch(result, 'Your system does not meet the minium requirements for The Elder Scrolls Online', false)) {
    CustomKeywords.'helpers.Misc.logMessage'('Requirements not met', 'warning')
} else {
    CustomKeywords.'helpers.Misc.logMessage'('Requirements are met', 'passed')
}

Windows.closeApplication()
