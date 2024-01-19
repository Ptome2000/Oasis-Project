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

WebUI.callTestCase(findTestCase('ESO/ValidateHomePage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/ESO/Page_Home/a_Classes'))

WebUI.verifyElementVisible(findTestObject('Object Repository/ESO/Page_Classes/p_As an Arcanist, knowledge is the key to p_8adf88'))

WebUI.verifyElementVisible(findTestObject('Object Repository/ESO/Page_Classes/p_When playing as a Necromancer, death itse_f83820'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/ESO/Page_Classes/p_As a Warden, Tamriels beasts and wilds ar_e8b270'))

WebUI.verifyElementVisible(findTestObject('Object Repository/ESO/Page_Classes/p_With the Dragonknight, you bring ruin in _d8e65a'))

WebUI.verifyElementVisible(findTestObject('Object Repository/ESO/Page_Classes/p_When wielding the full strength of the So_1999cc'))

WebUI.verifyElementVisible(findTestObject('Object Repository/ESO/Page_Classes/p_As a Nightblade, all of Tamriel fears you_fc86e3'))

WebUI.verifyElementVisible(findTestObject('Object Repository/ESO/Page_Classes/p_When playing a Templar, youll always ligh_bef873'))

