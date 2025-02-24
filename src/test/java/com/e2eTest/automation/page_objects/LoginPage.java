package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.SetUp;

public class LoginPage extends BasePage {
	/* Retrieve element */
	@FindBy(how = How.NAME, using = "username")
	private static WebElement username;

	@FindBy(how = How.NAME, using = "password")
	private static WebElement password;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Login']")
	private static WebElement btnLogin;

	@FindBy(how = How.XPATH, using = "//h6[normalize-space()='Dashboard']")
	private static WebElement menu_dashboard;

	/* Constructor */
	public LoginPage() {
		super(SetUp.getDriver());
	}

	/* Methods */
	public void filUsername(String name) {
		username.sendKeys(name);
	}

	public void filPassword(String pswd) {
		password.sendKeys(pswd);
	}

	public void clickBtnLogin() {
		btnLogin.click();
	}
	public String getDashboardTitle() {
		return menu_dashboard.getText();
		
	}

}
