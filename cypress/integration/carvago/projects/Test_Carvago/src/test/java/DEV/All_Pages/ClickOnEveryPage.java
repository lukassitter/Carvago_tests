package DEV.All_Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class ClickOnEveryPage {
    @Test
    public void Carvago() {

        Configuration.timeout=20000;
        Configuration.startMaximized = true;

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

        //Click on "Znacka/model"
        $(By.id("makeModel")).click();

        sleep(1000);

        //Click on "Skoda"
        $(By.xpath("/html/body/div[1]/div/main/div/div[1]/div[3]/div[2]/div/div[1]/div")).click();

        sleep(1000);

        //Click on "vše"
        $(By.xpath("/html/body/div[1]/div/main/div/div[1]/div[3]/div[1]/label")).click();

        sleep(1000);

        //Click on "Skoda"
        $(By.xpath("/html/body/div[1]/div/main/div/div[2]/section/div/div[2]/a[1]/div")).click();

        sleep(1000);

        //Check if the car is skoda
        $(By.xpath("/html/body/div[1]/div/main/div/section/div/div/div[1]/div[1]/div/div[1]/div[1]/div/div[2]/div[1]/div[2]")).shouldHave(text("Skoda"));

        sleep(1000);

        //Click on carvago. on the top left
        $("[data-test-id='Web-logo']").click();

        sleep(1000);

        //Click on "Zjistit více"
        $(By.xpath("/html/body/div[1]/div/main/div[4]/div/div/div[1]/a/button/div[1]")).click();

        sleep(3000);

        //Click on "Služby"
        $(By.xpath("/html/body/div[1]/div/header/div[2]/div[2]/nav/ul/li[6]/div")).click();

        sleep(1000);

        //Click on "Dovoz"
        $(By.xpath("/html/body/div[1]/div/header/div[2]/div[2]/nav/ul/li[6]/div[2]/div/div/div/div[2]/div/a[1]")).click();
        //Click on "Dovoz"

        sleep(3000);

        //Click on "Služby"
        $(By.xpath("/html/body/div[1]/div/header/div[2]/div[2]/nav/ul/li[6]/div")).click();

        sleep(1000);

        //Click on "Financování"
        $(By.xpath("/html/body/div[1]/div/header/div[2]/div[2]/nav/ul/li[6]/div[2]/div/div/div/div[2]/div/a[3]")).click();

        sleep(3000);

        //Click on "Služby"
        $(By.xpath("/html/body/div[1]/div/header/div[2]/div[2]/nav/ul/li[6]/div")).click();

        sleep(1000);

        //Click on "CarAudit"
        $(By.xpath("/html/body/div[1]/div/header/div[2]/div[2]/nav/ul/li[6]/div[2]/div/div/div/div[2]/div/a[2]")).click();

        sleep(2000);

        //Click on "Můj profil"
        $(By.xpath("/html/body/div[1]/div/header/div[2]/div[2]/nav/ul/li[7]/a")).click();

        sleep(2000);

        //Click on "Oblíbená auta"
        $("[data-test-id='ProfileSideMenu-favourite']").click();

        sleep(2000);

        //Click on "Moje auta"
        $("[data-test-id='ProfileSideMenu-my-cars']").click();

        sleep(2000);

        //Click on "Hitlist"
        $("[data-test-id='ProfileSideMenu-hitlist']").click();

        sleep(2000);

        //Click on detail of "Můj profil"
        $("[data-test-id='ProfileSideMenu-profile']").click();

        sleep(1000);

        //Click on "O nás"
        $(By.xpath("/html/body/div[1]/div/footer/nav/div[1]/div[2]/div[3]/div[2]/div[1]/a")).click();

        sleep(1000);

        //Click on "Více o nabídce pro dealery"
        $(By.xpath("/html/body/div[1]/div/footer/nav/div[1]/div[2]/div[3]/div[2]/div[1]/a")).click();

        sleep(1000);

        //Click on detail of "Obchodní podmínky"
        $("[data-test-id='Footer-link-terms']").click();

        //Wait little bit
        sleep(2000);

        //Click on "Koupit auto"
        $("[data-test-id='Navigation-item-buy-car']").click();

        //Click on language
        $("[data-test-id='Navigation-lang-menu']").click();

        sleep(1000);

        //change to DE
        $(By.xpath("/html/body/div[1]/div/header/div[2]/div[2]/nav/ul/li[8]/div[1]/div/div/div/div/div[2]/div/a[2]")).click();

        //Check that it changed to DE
        $(new Selectors.ByText("Erweiterte Suche")).shouldBe(Condition.exist);

        //Click on language
        $("[data-test-id='Navigation-lang-menu']").click();

        sleep(1000);

        //change to DE
        $(By.xpath("/html/body/div[1]/div/header/div[2]/div[2]/nav/ul/li[8]/div[1]/div/div/div/div/div[2]/div/a[1]")).click();

        //Check that it changed to DE
        $(new Selectors.ByText("Detailed search")).shouldBe(Condition.exist);

        //Click on language
        $("[data-test-id='Navigation-lang-menu']").click();

        sleep(1000);

        //change back to Czech
        $(By.xpath("/html/body/div[1]/div/header/div[2]/div[2]/nav/ul/li[8]/div[1]/div/div/div/div/div[2]/div/a[1]")).click();

        //Changed back to Czech language
        $(new Selectors.ByText("Pokročilé hledání")).shouldBe(Condition.exist);

        //Wait little bit
        sleep(1000);

        //close window
        closeWebDriver();

    }
}