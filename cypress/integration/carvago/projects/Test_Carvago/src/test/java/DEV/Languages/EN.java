package DEV.Languages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class EN {
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

        //Click on language
        $("[data-test-id='Navigation-lang-menu']").click();

        sleep(1000);

        //change to EN
        $(By.xpath("/html/body/div[1]/div/header/div[2]/div[2]/nav/ul/li[8]/div[1]/div/div/div/div/div[2]/div/a[1]")).click();

        //Check that it changed to EN
        $(new Selectors.ByText("Detailed search")).shouldBe(Condition.exist);

        //Wait little bit
        sleep(1000);

        //close window
        closeWebDriver();

    }
}