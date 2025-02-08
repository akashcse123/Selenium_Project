package com.seleniumwebautomation;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;
    
    private By loginButtonMenu = By.xpath("//a[@href='/login']");
    private By usernameField = By.xpath("//form[@action='/login']//child::input[@type='email']");
    private By passwordField = By.xpath("//form[@action='/login']//child::input[@type='password']");
    private By loginButton = By.xpath("//button[text()='Login']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys("akashk@gmail.com");
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys("Akash@12331");
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
    
    public void clickOnLoginButton() {
    	
    	driver.findElement(loginButtonMenu).click();
    }
}
