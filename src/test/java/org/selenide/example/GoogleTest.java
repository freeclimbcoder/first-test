package org.selenide.example;


import com.codeborne.selenide.Configuration;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleTest {
    @Test
    public void name() throws Exception {

    }
    public void userCanSearchWithGoogle(){
        Configuration.browser = "chrome";
        open("http://google.com");
        $(By.name("q")).setValue("cat").pressEnter();
        $$("#ires li.g").shouldHaveSize(10);
        $("#ires li.g").shouldHave("cat");
    }

}
