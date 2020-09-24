package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class AmazonStepDefinitions {

    AmazonPage amazonPage = new AmazonPage();

    @Given("Kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigurationReader.getProperty("amazon_link"));
    }

    @Given("headphones aramasi yapar")
    public void headphones_aramasi_yapar() {
        amazonPage.aramaKutusu.sendKeys(ConfigurationReader.getProperty("amazon_kelime") + Keys.ENTER);
    }

    @Then("sonuc sayisini ekrana yazdirir")
    public void sonuc_sayisini_ekrana_yazdirir() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(amazonPage.sonucSayisi.getText());
    }

    @Given("camera aramasi yapar")
    public void camera_aramasi_yapar() {
       amazonPage.aramaKutusu.sendKeys("camera" + Keys.ENTER);
    }

    @Given("Kullanici aramakutusuna {string} yazar ve arar")
    public void kullanici_aramakutusuna_yazar_ve_arar(String string) {
       amazonPage.aramaKutusu.sendKeys(string + Keys.ENTER);
    }




}
