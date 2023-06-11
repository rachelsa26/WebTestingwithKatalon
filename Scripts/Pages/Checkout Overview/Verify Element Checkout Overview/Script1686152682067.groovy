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

WebUI.verifyElementVisible(findTestObject('Checkout-Overview/text_Checkout Overview'))

WebUI.verifyElementVisible(findTestObject('Checkout-Overview/text_QTY'))

WebUI.verifyElementVisible(findTestObject('Checkout-Overview/text_Description'))

WebUI.verifyElementVisible(findTestObject('Checkout-Overview/num-product'))

WebUI.verifyElementVisible(findTestObject('Checkout-Overview/product_name'))

WebUI.verifyElementVisible(findTestObject('Checkout-Overview/product-description'))

WebUI.verifyElementVisible(findTestObject('Checkout-Overview/product_price'))

WebUI.verifyElementVisible(findTestObject('Checkout-Overview/text_Payment Information'))

WebUI.verifyElementVisible(findTestObject('Checkout-Overview/payment-information'))

WebUI.verifyElementVisible(findTestObject('Checkout-Overview/text_Shipping Information'))

WebUI.verifyElementVisible(findTestObject('Checkout-Overview/shipping-detail'))

WebUI.verifyElementVisible(findTestObject('Checkout-Overview/text_Price Total'))

WebUI.verifyElementVisible(findTestObject('Checkout-Overview/total-price'))

WebUI.verifyElementVisible(findTestObject('Checkout-Overview/button_Cancel'))

WebUI.verifyElementVisible(findTestObject('Checkout-Overview/button_Finish'))

