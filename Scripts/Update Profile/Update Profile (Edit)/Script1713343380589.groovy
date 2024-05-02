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
import internal.GlobalVariable

import org.codehaus.groovy.ast.Variable
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('Object Repository/Login_Logout/Page_Home/button_Husny Murabok'))
WebUI.focus(findTestObject('Object Repository/Update_Profile/Page_Home/a_Perbarui Profil'))
WebUI.delay(GlobalVariable.Delay)
WebUI.click(findTestObject('Object Repository/Update_Profile/Page_Home/a_Perbarui Profil'))
WebUI.setText(findTestObject('Object Repository/Update_Profile/Page_Update Profile/input_Nama Depan_firstName'), FirstName)
WebUI.delay(GlobalVariable.Delay)
WebUI.setText(findTestObject('Object Repository/Update_Profile/Page_Update Profile/input_Nama Belakang_lastName'), LastName)
WebUI.delay(GlobalVariable.Delay)
WebUI.focus(findTestObject('Object Repository/Update_Profile/Page_Update Profile/button_Perbarui'))
WebUI.click(findTestObject('Object Repository/Update_Profile/Page_Update Profile/button_Perbarui'))
WebUI.click(findTestObject('Object Repository/Update_Profile/Page_Update Profile/button_Simpan'))
WebUI.click(findTestObject('Object Repository/Update_Profile/Page_Update Profile/button_OK'))