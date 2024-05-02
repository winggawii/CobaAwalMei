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

//Script dengan value menggunakan inputan statis (tembak data)
//WebUI.openBrowser("https://dev.admin-pickme.metrodataacademy.id/login")
//WebUI.maximizeWindow()
//WebUI.setText(findTestObject('Object Repository/Login_Logout/Page_Login Page/input_Username_username'), "admin")
//WebUI.setText(findTestObject('Object Repository/Login_Logout/Page_Login Page/input_Kata Sandi_password'), "test1234")
//WebUI.click(findTestObject('Object Repository/Login_Logout/Page_Login Page/button_LOGIN'))
//WebUI.verifyElementPresent(findTestObject('Object Repository/Login_Logout/Page_Home/h1_Selamat Datang'), 3)

//Script dengan value menggunakan global variabel
WebUI.openBrowser(GlobalVariable.URL)
WebUI.maximizeWindow()	
WebUI.setText(findTestObject('Object Repository/Login_Logout/Page_Login Page/input_Username_username'), GlobalVariable.Username)
WebUI.setText(findTestObject('Object Repository/Login_Logout/Page_Login Page/input_Kata Sandi_password'), GlobalVariable.Password)
WebUI.click(findTestObject('Object Repository/Login_Logout/Page_Login Page/button_LOGIN'))
WebUI.verifyElementPresent(findTestObject('Object Repository/Login_Logout/Page_Home/h1_Selamat Datang'), GlobalVariable.Delay)

/* Contoh apabila proses ingin di skip
 * not_run:WebUI.verifyElementPresent(findTestObject('Object Repository/Login_Logout/Page_Home/h1_Selamat Datang'), 3)
 * */

//WebUI.verifyTextNotPresent("Login unsuccessfully", false)