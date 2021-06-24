package steps;

import config.UserConfig;
import io.cucumber.java.en.Then;
import pages.SignInPage;

public class SignInPageDef {
    SignInPage sign = new SignInPage();

    @Then("Input login")
    public void inputLogin() {
        sign.inputLogin(UserConfig.USER_LOGIN);
    }

    @Then("Input password")
    public void inputPassword() {
        sign.inputPassword(UserConfig.USER_PASSWORD);
    }
}
