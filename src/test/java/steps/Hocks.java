package steps;

import io.cucumber.java.Before;

import static com.codeborne.selenide.Selenide.*;

public class Hocks {

    @Before
    public void openUrl() {
        open("https://grinfer.com/home");
    }


}
