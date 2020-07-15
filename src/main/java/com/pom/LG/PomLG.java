package com.pom.LG;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.LG.AutoConstant;
import com.generics.LG.ExcelLibrary;



public class PomLG implements AutoConstant
{
	@FindBy(id="username")    //Declaration
	private WebElement usernameTextField;
	
	@FindBy(name="pwd")
	private WebElement passwordTextField;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepMeLoggedIn;
	
    @FindBy(id="loginButton")
    private WebElement loginButton;
    
    @FindBy(xpath="//a[contains(text(),'Forgot')]")
    private WebElement forgotPasswordLink;
    
    @FindBy(xpath="//a[.='actiTIME Inc.']")
    private WebElement actiTimeIncLink;
    
    public PomLG(WebDriver driver)//initialization
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void loginMethod() throws IOException  //Utilization
    {
    	usernameTextField.sendKeys(ExcelLibrary.getcellvalue(excel_path,sheetname,1,0));
    	passwordTextField.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheetname, 1, 1));
    	keepMeLoggedIn.click();
    	loginButton.click();
    	
    }
   
   public void forgotPasswordMethod()
    {
    	forgotPasswordLink.click();
    }
    
    public void actiTimeIncMethod()
    {
    	actiTimeIncLink.click();
    }
}
