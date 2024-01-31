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

WebUI.verifyCheckpoint(findCheckpoint('Checkpoints/Companions'), false)

WebUI.callTestCase(findTestCase('ESO/Misc Tests/Open ESO Page'), [:], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'helpers.Misc.OpenSearchBar'()

WebUI.setText(findTestObject('ESO/Page_Home/Search Bar/inputsearchBox'), Character_Name)

//WebUI.sendKeys(findTestObject('ESO/Page_Home/Search Bar/inputsearchBox'), Keys.chord(Keys.ENTER))
WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('ESO/Page_Home/Search Bar/div_Character suggestion'), 0)

WebUI.click(findTestObject('ESO/Page_Home/Search Bar/a_Character suggestion'))

WebUI.callTestCase(findTestCase('ESO/Age Valitadion/A002 - Valid Age'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent(Character_Name.toUpperCase(), false)

WebUI.verifyTextPresent('MEET THE CHARACTER', false)

//WebUI.verifyElementText(findTestObject('ESO/Page_Meet the Character/h1_Meet the Character'), 'MEET THE CHARACTER-' + Companion_Name.toUpperCase())
WebUI.closeBrowser()

