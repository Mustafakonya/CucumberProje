package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.EbayPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class EbayStepDefinitions {

    EbayPage ebayPage = new EbayPage();

    @Given("kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String string) {
       Driver.getDriver().get(string);
    }


    @Then("ebay sonuc sayisini ekrana yazdirir")
    public void ebay_sonuc_sayisini_ekrana_yazdirir() {
        System.out.println(ebayPage.sonucSayisi.getText());
    }

    @Given("Kullanici ebayda aramakutusuna {string} yazar ve arar")
    public void kullanici_ebayda_aramakutusuna_yazar_ve_arar(String string) {
        ebayPage.aramaKutusu.sendKeys(string + Keys.ENTER);
    }

}
