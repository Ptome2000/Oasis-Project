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

WebUI.setText(findTestObject('Object Repository/Musiys/Page_MUSISYS - New Edition/input_Nome'), 'Iscte')

WebUI.setText(findTestObject('Object Repository/Musiys/Page_MUSISYS - New Edition/input_Localidade'), 'Lisboa')

WebUI.setText(findTestObject('Object Repository/Musiys/Page_MUSISYS - New Edition/input_Local'), 'Campo Grande')

WebUI.setText(findTestObject('Object Repository/Musiys/Page_MUSISYS - New Edition/input_Lotacao'), '200')

WebUI.setText(findTestObject('Object Repository/Musiys/Page_MUSISYS - New Edition/input_Palcos'), '2')

WebUI.setText(findTestObject('Object Repository/Musiys/Page_MUSISYS - New Edition/input_Data_Inicio'), '02/07/2026')

WebUI.setText(findTestObject('Object Repository/Musiys/Page_MUSISYS - New Edition/input_Data_Fim'), '10/07/2026')

WebUI.click(findTestObject('Object Repository/Musiys/Page_MUSISYS - New Edition/button_Insert'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Musiys/Page_MUSISYS - New Edition/table_line'), 0)

