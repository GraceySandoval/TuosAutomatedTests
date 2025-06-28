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
WebUI.setViewPortSize(1026,736)
WebUI.navigateToUrl('https://tuos-test.simpacc.ca/')

WebUI.setText(findTestObject('Object Repository/CreateEstimate/Page_Login - Codx.Auth/input_Login_Username'), 'simpaccone')

WebUI.setEncryptedText(findTestObject('Object Repository/CreateEstimate/Page_Login - Codx.Auth/input_Login_Password'), '/66HFEO0NguWtf4vZpQeQQ==')

WebUI.click(findTestObject('Object Repository/CreateEstimate/Page_Login - Codx.Auth/button_Login'))

WebUI.click(findTestObject('Object Repository/CreateEstimate/Page_Tuos/svg'))

WebUI.click(findTestObject('Object Repository/CreateEstimate/Page_Tuos/svg_1'))

WebUI.click(findTestObject('Object Repository/CreateEstimate/Page_Tuos/a_Estimate and Quotes'))

WebUI.click(findTestObject('Object Repository/CreateEstimate/Page_Tuos/div_Create Estimate'))

WebUI.selectOptionByValue(findTestObject('Object Repository/CreateEstimate/Page_Tuos/select_RyanBushZIRKELS SOLUTIONS INCBushSteve'), 
    '81', true)

WebUI.click(findTestObject('Object Repository/CreateEstimate/Page_Tuos/svg_1_2'))

WebUI.click(findTestObject('Object Repository/CreateEstimate/Page_Tuos/svg_Save_lgw-6 lgh-6 mdw-6 mdh-6 w-5 h-5'))

WebUI.selectOptionByValue(findTestObject('Object Repository/CreateEstimate/Page_Tuos/select_CarSonyAlcoholSamsungChicken'), 
    '28', true)

WebUI.click(findTestObject('Object Repository/CreateEstimate/Page_Tuos/span_Add Item'))

WebUI.click(findTestObject('Object Repository/CreateEstimate/Page_Tuos/svg_1_2_3'))

WebUI.click(findTestObject('Object Repository/CreateEstimate/Page_Tuos/svg_Save_lgw-6 lgh-6 mdw-6 mdh-6 w-5 h-5'))

WebUI.selectOptionByValue(findTestObject('Object Repository/CreateEstimate/Page_Tuos/select_CarSonyAlcoholSamsungChicken_1'), 
    '9', true)

WebUI.click(findTestObject('Object Repository/CreateEstimate/Page_Tuos/input_SubTotal_block w-full bg-white text-x_ec7ca8'))

WebUI.click(findTestObject('Object Repository/CreateEstimate/Page_Tuos/input_SubTotal_block w-full bg-white text-x_ec7ca8'))

WebUI.setText(findTestObject('Object Repository/CreateEstimate/Page_Tuos/input_SubTotal_block w-full bg-white text-x_ec7ca8_1'), 
    '10')

WebUI.click(findTestObject('Object Repository/CreateEstimate/Page_Tuos/div_Subtotal55.00DiscountGST (16)0.80Total _8969a7'))

WebUI.doubleClick(findTestObject('Object Repository/CreateEstimate/Page_Tuos/input_Discount_discount'))

WebUI.setText(findTestObject('Object Repository/CreateEstimate/Page_Tuos/input_Discount_discount'), '5')

WebUI.click(findTestObject('Object Repository/CreateEstimate/Page_Tuos/div_Item NameDescriptionQuantityPriceTaxSub_ddb8ba'))

WebUI.click(findTestObject('Object Repository/CreateEstimate/Page_Tuos/button_Save'))

WebUI.click(findTestObject('Object Repository/CreateEstimate/Page_Tuos/a_2'))

WebUI.closeBrowser()

WebUI.navigateToUrl('https://tuos-test.simpacc.ca/#/revenue-and-collections/estimates-and-quotes/create')

