package com.e2eTest.automation.step_definitions;

import org.junit.jupiter.api.Assertions;

import com.e2eTest.automation.page_objects.LoginPage;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.SetUp;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {

	ConfigFileReader configFileReader;
	LoginPage loginPage;

	public LoginStepDefinition() {

		configFileReader = new ConfigFileReader();
		loginPage = new LoginPage();

	}

	@Given("Je me connecte sur l application Orange")
	public void jeMeConnecteSurLApplicationOrange() throws InterruptedException {

		SetUp.getDriver().get(configFileReader.getProperty("home.url"));
		Thread.sleep(10000);
	}

	@When("Je saisie un username {string}")
	public void jeSaisieUnUsername(String username) {
		loginPage.filUsername(username);

	}

	@When("Je saisie un password {string}")
	public void jeSaisieUnPassword(String password) {
		loginPage.filPassword(password);

	}

	@When("Je clique sur le bouton Login")
	public void jeCliqueSurLeBoutonLogin() {
		loginPage.clickBtnLogin();

	}

	@Then("Redirection vers la page Dashboard {string}")
	public void redirectionVersLaPageDashboard(String title) throws InterruptedException {
		Thread.sleep(10000);
		String txtPage = loginPage.getDashboardTitle();
		Assertions.assertEquals(title, txtPage);

	}

}
