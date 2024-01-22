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
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('ESO/Forum Validation/Forum Page Validation'), [:], FailureHandling.STOP_ON_FAILURE)

int index = 0

while (index <= 2) {
    //String xpath = '//div[@id="universal-nav"]/div/div/div[6]/div/div/div/div[' + String.valueOf(index) + ']/a'
    if (index == 0) {
        WebUI.click(findTestObject('ESO/Page_Forum/a_Dev Tracker'))
    } else if (index == 1) {
        WebUI.click(findTestObject('ESO/Page_Forum/a_Recent'))
    } else {
        WebUI.click(findTestObject('ESO/Page_Forum/a_Unanswered'))
    }
    
    switch (true) {
        case 'Dev Tracker':
            break
        case 'Recent Discussions':
            break
        case 'Unanswered Questions':
            break
        default:
            throw new com.kms.katalon.core.exception.StepFailedException('Unknown Page found in the Forum')
    }
}

