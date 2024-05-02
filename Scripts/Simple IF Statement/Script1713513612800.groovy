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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys


WebUI.openBrowser(GlobalVariable.URL)
WebUI.maximizeWindow()


//Pengggunaan if statement dengan drag-drop object
//if (GlobalVariable.Username == "admins") {
//	WebUI.setText(findTestObject('Object Repository/Login_Logout/Page_Login Page/input_Username_username'), "berhasil", FailureHandling.STOP_ON_FAILURE)
//} else {
//  WebUI.focus(findTestObject('Object Repository/Login_Logout/Page_Login Page/input_Kata Sandi_password'), FailureHandling.STOP_ON_FAILURE)
//  WebUI.setText(findTestObject('Object Repository/Login_Logout/Page_Login Page/input_Kata Sandi_password'), "1234", FailureHandling.STOP_ON_FAILURE)
//}


//Penggunaan if statement dengan initiate Test Objek di Script General
//TestObject FieldUserName = findTestObject('Object Repository/Login_Logout/Page_Login Page/input_Username_username')
//TestObject FieldPassword = findTestObject('Object Repository/Login_Logout/Page_Login Page/input_Kata Sandi_password')
//
//if (GlobalVariable.Username == "admins") {
//	WebUI.setText(FieldUserName, "berhasil", FailureHandling.STOP_ON_FAILURE) //pake error handling
//	WebUI.setText(FieldUserName, "user terdaftar") //tanpa error handling
//} else {
//	WebUI.setText(FieldPassword, "1234", FailureHandling.STOP_ON_FAILURE) //pake error handling
//	WebUI.setText(FieldUserName, "user tidak terdaftar") //tanpa error handling
//}


//Penggunaan if statement dengan Variabel dan Global Variabel
if (GlobalVariable.Username == "admins") {
	WebUI.setText(Coba, "user terdaftar")
} else {
	WebUI.setText(GlobalVariable.ObjectPassword, "12")
	/* Notes:
	 * untuk kebutuhan variabel dan global variabel nya tetap menggunankan tipe data Test Object
	 */
}


//WebUI.verifyEqual(FieldUserName, 'user terdaftar')
//WebUI.verifyLessThan(10, 12)

WebUI.delay(GlobalVariable.Delay)
WebUI.closeBrowser()