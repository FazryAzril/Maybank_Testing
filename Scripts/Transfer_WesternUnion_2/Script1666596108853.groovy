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

WebUI.navigateToUrl('https://www.maybank2u.com.my/home/m2u/common/login.do')

WebUI.maximizeWindow()

WebUI.setEncryptedText(findTestObject('Object Repository/Transfer_WesternUnion_2/Page_Maybank2u  Maybank Malaysia/input_Humanising Financial Services_username'), 
    'LGXnShav6GDMnxZaKQvoqA==')

WebUI.click(findTestObject('Object Repository/Transfer_WesternUnion_2/Page_Maybank2u  Maybank Malaysia/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/Transfer_WesternUnion_2/Page_Maybank2u  Maybank Malaysia/button_YES'))

WebUI.setEncryptedText(findTestObject('Object Repository/Transfer_WesternUnion_2/Page_Maybank2u  Maybank Malaysia/input_Hello_my-password-input'), 
    'Dx6KzivYYGdNT5j6uHfplA==')

WebUI.click(findTestObject('Object Repository/Transfer_WesternUnion_2/Page_Maybank2u  Maybank Malaysia/button_LOGIN_1'))

WebUI.click(findTestObject('Object Repository/Transfer_WesternUnion_2/Page_Maybank2u  Maybank Malaysia/a_PAY  TRANSFER'))

WebUI.click(findTestObject('Object Repository/Transfer_WesternUnion_2/Page_Maybank2u  Maybank Malaysia/span_x'))

WebUI.click(findTestObject('Object Repository/Transfer_WesternUnion_2/Page_Maybank2u  Maybank Malaysia/div_TRANSFER'))

WebUI.click(findTestObject('Object Repository/Transfer_WesternUnion_2/Page_Maybank2u  Maybank Malaysia/img_Own Accounts_RenderDesktopDropdown---ca_a128e1'))

WebUI.click(findTestObject('Object Repository/Transfer_WesternUnion_2/Page_Maybank2u  Maybank Malaysia/div_Overseas (FTT, Western Union, Visa Dire_0a4974'))

WebUI.setText(findTestObject('Object Repository/Transfer_WesternUnion_2/Page_Maybank2u  Maybank Malaysia/input_ASNB Accounts_PayFromToContainer---pa_1bae3d'), 
    'Indonesia')

WebUI.click(findTestObject('Object Repository/Transfer_WesternUnion_2/Page_Maybank2u  Maybank Malaysia/div_Indonesia'))

WebUI.setText(findTestObject('Object Repository/Transfer_WesternUnion_2/Page_Maybank2u  Maybank Malaysia/input_RM_CustomInputGroup---textInput---1X4_77e864'), 
    '10')

WebUI.click(findTestObject('Object Repository/Transfer_WesternUnion_2/Page_Maybank2u  Maybank Malaysia/button_Compare'))

WebUI.click(findTestObject('Object Repository/Transfer_WesternUnion_2/Page_Maybank2u  Maybank Malaysia/button_TRANSFERRM15.00'))

WebUI.click(findTestObject('Object Repository/Transfer_WesternUnion_2/Page_Maybank2u  Maybank Malaysia/a_RECIPIENTS DETAILS'))

WebUI.setText(findTestObject('Object Repository/Transfer_WesternUnion_2/Page_Maybank2u  Maybank Malaysia/input_First Name_benFirstName'), 
    'Desy Mandasari')

WebUI.setText(findTestObject('Object Repository/Transfer_WesternUnion_2/Page_Maybank2u  Maybank Malaysia/input_Last Name_benLastName'), 
    'Untung')

WebUI.setText(findTestObject('Object Repository/Transfer_WesternUnion_2/Page_Maybank2u  Maybank Malaysia/input_Phone No_benContactNationalNo'), 
    '083144268997')

WebUI.setText(findTestObject('Object Repository/Transfer_WesternUnion_2/Page_Maybank2u  Maybank Malaysia/input_Receiver Country  Code_RenderSearchab_209348'), 
    'Indonesia')

WebUI.click(findTestObject('Object Repository/Transfer_WesternUnion_2/Page_Maybank2u  Maybank Malaysia/span_Indonesia'))

WebUI.setText(findTestObject('Object Repository/Transfer_WesternUnion_2/Page_Maybank2u  Maybank Malaysia/textarea_Jalan Sempurna Lubuk Pakam'), 
    'Jalan Sempurna Lubuk Pakam')

WebUI.setText(findTestObject('Object Repository/Transfer_WesternUnion_2/Page_Maybank2u  Maybank Malaysia/input_Postal Code_benPostalCode'), 
    '20517')

WebUI.setText(findTestObject('Object Repository/Transfer_WesternUnion_2/Page_Maybank2u  Maybank Malaysia/input_City (Destination)_benCity'), 
    'Medan')

WebUI.setText(findTestObject('Object Repository/Transfer_WesternUnion_2/Page_Maybank2u  Maybank Malaysia/input_State_benState'), 
    'Sumatera Utara')

WebUI.setText(findTestObject('Object Repository/Transfer_WesternUnion_2/Page_Maybank2u  Maybank Malaysia/input_Receiver Country  Code_RenderSearchab_209348'), 
    'Indonesia')

WebUI.click(findTestObject('Object Repository/Transfer_WesternUnion_2/Page_Maybank2u  Maybank Malaysia/span_Indonesia'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Transfer_WesternUnion_2/Page_Maybank2u  Maybank Malaysia/p_Money withdrawn from your insured deposit_747020'))

