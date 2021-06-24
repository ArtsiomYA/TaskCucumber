package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class SignInPage {
    private SelenideElement inputEmail = $(By.xpath("//input[@id='email']"));
    private SelenideElement passwordInput = $(By.xpath("//input[@id='password']"));

    public void inputLogin(String text) {
        this.inputEmail.val(text);
    }

    public void inputPassword(String text) {
        this.passwordInput.val(text);
    }
}
