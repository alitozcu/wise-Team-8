package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutoTestCase {
    public AutoTestCase(){
        PageFactory.initElements(Driver.getDriver(),this);    }
    @FindBy(xpath = "//a[@style='color: orange;']")
    public WebElement homeVisible;
    @FindBy(xpath = "//a[@href='/login']")
    public WebElement singUp;
    @FindBy(xpath = "//a[@href='/login']")
    public WebElement accountText;
    @FindBy(xpath = "//input[@*='login-email']")
    public WebElement email;
    @FindBy(xpath = "//input[@*='login-password']")
    public WebElement password;
    @FindBy(xpath = "//button[@*='login-button']")
    public WebElement login;
    @FindBy(xpath = "//p[.='Your email or password is incorrect!']")
    public WebElement incorrectText;
}
