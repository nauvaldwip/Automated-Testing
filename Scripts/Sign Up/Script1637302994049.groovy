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

WebUI.navigateToUrl('http://automationpractice.com/index.php')

WebUI.click(findTestObject('Object Repository/Sign Up/Page_My Store/a_Sign in'))

WebUI.setText(findTestObject('Object Repository/Sign Up/Page_Login - My Store/input_Email address_email_create'), 'testing@yahoo.co.id')

WebUI.click(findTestObject('Object Repository/Sign Up/Page_Login - My Store/span_Create an account'))

WebUI.click(findTestObject('Object Repository/Sign Up/Page_Login - My Store/input_Mr_id_gender'))

WebUI.setText(findTestObject('Object Repository/Sign Up/Page_Login - My Store/input__customer_firstname'), 'Nauval')

WebUI.setText(findTestObject('Object Repository/Sign Up/Page_Login - My Store/input__customer_lastname'), 'Muhammad Dwiputra')

WebUI.setEncryptedText(findTestObject('Object Repository/Sign Up/Page_Login - My Store/input__passwd'), 'JltEQgaE0YE=')

WebUI.selectOptionByValue(findTestObject('Object Repository/Sign Up/Page_Login - My Store/select_-12345678910111213141516171819202122_51e29d'), 
    '21', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sign Up/Page_Login - My Store/select_-JanuaryFebruaryMarchAprilMayJuneJul_702766'), 
    '7', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sign Up/Page_Login - My Store/select_-20212020201920182017201620152014201_28b437'), 
    '1999', true)

WebUI.click(findTestObject('Object Repository/Sign Up/Page_Login - My Store/input_July_newsletter'))

WebUI.click(findTestObject('Object Repository/Sign Up/Page_Login - My Store/div_Receive special offers from our partners'))

WebUI.click(findTestObject('Object Repository/Sign Up/Page_Login - My Store/input_Sign up for our newsletter_optin'))

WebUI.setText(findTestObject('Object Repository/Sign Up/Page_Login - My Store/input_Company_company'), 'PT. Testing')

WebUI.setText(findTestObject('Object Repository/Sign Up/Page_Login - My Store/input__address1'), 'JL. Suka')

WebUI.setText(findTestObject('Object Repository/Sign Up/Page_Login - My Store/input_Address (Line 2)_address2'), 'RT 10 / RW 99')

WebUI.setText(findTestObject('Object Repository/Sign Up/Page_Login - My Store/input__city'), 'Bekasi')

WebUI.selectOptionByValue(findTestObject('Object Repository/Sign Up/Page_Login - My Store/select_-AlabamaAlaskaArizonaArkansasCalifor_c52141'), 
    '32', true)

WebUI.setText(findTestObject('Object Repository/Sign Up/Page_Login - My Store/input__postcode'), '17121')

WebUI.setText(findTestObject('Object Repository/Sign Up/Page_Login - My Store/textarea_Additional information_other'), 'Ini hanya testing')

WebUI.setText(findTestObject('Object Repository/Sign Up/Page_Login - My Store/input_Home phone_phone'), '02199568302')

WebUI.setText(findTestObject('Object Repository/Sign Up/Page_Login - My Store/input__phone_mobile'), '085123456789')

WebUI.click(findTestObject('Object Repository/Sign Up/Page_Login - My Store/span_Register'))

WebUI.click(findTestObject('Object Repository/Sign Up/Page_My account - My Store/span_Home'))

WebUI.click(findTestObject('Object Repository/Sign Up/Page_My Store/a_Sign out'))

WebUI.closeBrowser()

WebUI.setText(findTestObject('Object Repository/Sign Up/Page_Login - My Store/input_Email address_email_create'), 'testing@yahoo.co.id')

WebUI.click(findTestObject('Object Repository/Sign Up/Page_Login - My Store/span_Create an account'))

WebUI.closeBrowser()

