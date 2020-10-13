package DEV.Carvago_Login;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import data.RandomString;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class LoginWithWrongPassword {
    @Test
    public void Carvago() {

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
        $(By.id("username")).setValue("lukas.sitter@carvago.com");

        //Fill password
        $(By.id("password")).setValue(RandomString.getStringByFormat(10, RandomString.LETTERS_AND_NUMBERS)).pressEnter();

        //Check error description
        $(new Selectors.ByText("Invalid username and password combination")).shouldBe(Condition.exist);

        //Wait little bit
        sleep(2000);

        //close window
        closeWebDriver();
    }
}
