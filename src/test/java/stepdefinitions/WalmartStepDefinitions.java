package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.WalmartPage;


public class WalmartStepDefinitions {
      WalmartPage walmartPage = new WalmartPage();
    @Given("Kullanici walmartta aramakutusuna {string} yazar ve arar")
    public void kullanici_walmartta_aramakutusuna_yazar_ve_arar(String string) {
        walmartPage.aramaKutusu.sendKeys(string + Keys.ENTER);
    }

    @Then("walmartta sonuc sayisini ekrana yazdirir")
    public void walmartta_sonuc_sayisini_ekrana_yazdirir() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(walmartPage.sonucSayisi.getText());
    }



}
