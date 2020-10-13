package DEV.Currency;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class CZKtoEUR {
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
        $(By.id("username")).setValue("eddie.colm@andsee.org");

        //Fill password
        $(By.id("password")).setValue("eddie.colm@andsee.org").pressEnter();

        //Text from successful login visible
        $(new Selectors.ByText("Pokročilé hledání")).shouldBe(Condition.exist);

        //Wait little bit
        sleep(1000);

        //Click on CZK
        $("[data-test-id='Navigation-currency-menu']").click();

        //Click on CZK
        $("[data-test-id='Navigation-currency-item-CZK']").click();

        //Check that changing language was successful
        $(new Selectors.ByText("Pokročilé hledání")).shouldBe(Condition.exist);

        sleep(3000);

    }
}