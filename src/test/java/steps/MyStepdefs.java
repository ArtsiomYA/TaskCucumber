package steps;

import io.cucumber.java.en.Then;
import pages.BasicPage;

public class MyStepdefs {
    BasicPage basicPage = new BasicPage();

    @Then("Click {string} button")
    public void clickButton(String arg0) {
        basicPage.clickButton(arg0);
    }

    @Then("Click Log in button span")
    public void clickLogInButtonSpan() {
        basicPage.clickButtonSpan();
    }

    @Then("Content with {string} visible")
    public void contentWithVisible(String arg0) {
        basicPage.contentIsVisible(arg0);
    }
}
