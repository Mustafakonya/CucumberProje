@birdenfazlaexample
  Feature: Amazonda Urun Arama
  Scenario Outline: TC07_kullanici amazonda dropdown ve aramakutusu kullanarak arama yapar
    Given kullanici "http://amazon.com" sayfasina gider
    And kullanici dropdownda <kategori>" secer
    And Kullanici aramakutusuna "<urunismi>" yazar ve arar
    Then sonuc sayisini ekrana yazdirir
    Examples: Test Verileri
      | kategori | urunismi |
    |Automotive|phone holder|
    |Baby      |stroller    |
    |Books     |Miserables  |

