package DEV.Carvago_Login;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class LoginWithoutLoginInformation {
    @Test
    public void LoginCarvago() {

        //Admin login
        open ("https://dev.carvagotest.com/");
        $(By.name("username"),1).setValue("test");
        $(By.name("password"),1).setValue("CarTest2022").pressEnter();

        //sleep function could be disabled with quick and stable internet connection

        //Enable if bad Internet connection
        //sleep(4000);

        //open login popup
        $("[data-test-id='Navigation-item-signIn']").click();

        //Enable if bad Internet connection
        //sleep(4000);

        //Fill Username
        $(By.id("username")).click();

        //Fill password
        $(By.id("password")).click();

        //Enable if bad Internet connection
        //sleep(2000);

        //Check error description
        $(new Selectors.ByText("Je vyžadován email")).shouldBe(Condition.exist);

        //Fill email
        $(By.id("username")).setValue("lukas.sitter@špatný-email.com");

        //Click on password
        $(By.id("password")).click();

        //Check error description
        $(new Selectors.ByText("Je vyžadováno heslo pro přihlášení")).shouldBe(Condition.exist);

        //Wait little bit
        sleep(2000);

        //close window
        closeWebDriver();
    }
}