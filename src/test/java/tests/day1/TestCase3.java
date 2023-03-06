package tests.day1;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AutoTestCase;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TestCase3 extends TestBaseRapor {
    @Test
    public void test1() throws InterruptedException {
        extentTest=extentReports.createTest("Negatif login testi","gecersiz bilgilerle giris yapilabilmeli");
        AutoTestCase autoTestCase = new AutoTestCase();
        // 1. Launch browser
        // 2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigurationReader.getProperty("autoUrl"));
        extentTest.info("Sayfa urlsi yazildi");
        // 3. Verify that home page is visible successfully
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(autoTestCase.homeVisible.isEnabled());
        extentTest.info("home pagein visible olu olmadigini verify ettik");
        // 4. Click on 'Signup / Login' button
        autoTestCase.singUp.click();
        extentTest.info("sign uo button cliklendi");
        // 5. Verify 'Login to your account' is visible
        softAssert.assertTrue(autoTestCase.accountText.isDisplayed());
        extentTest.info(" logi to your account texinini goruldugu tst edildi");
        // 6. Enter incorrect email address and password
        autoTestCase.email.sendKeys("sevil@gmail");
        autoTestCase.password.sendKeys("123");
        extentTest.info("yanlis email ve passwor ile giris yapildi");
        // 7. Click 'login' button
        autoTestCase.login.click();
        extentTest.info("login button cliklendi");
        // 8. Verify error 'Your email or password is incorrect!' is visible
        softAssert.assertTrue(autoTestCase.incorrectText.isDisplayed());
        extentTest.info("incorrect password yazisinin ekranda gorulup gorulmedigi test edildi");
        softAssert.assertAll();
        extentTest.pass("Testimiz basariyla tamamlandi");
    }
}