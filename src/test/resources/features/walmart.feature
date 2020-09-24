@walmart
  Feature: Walmart Test
   Scenario Outline: TC08_Walmart Coklu Urun Arama Testi
     Given kullanici "https://walmart.com" sayfasina gider
     And Kullanici walmartta aramakutusuna "<urunler>" yazar ve arar
     Then walmartta sonuc sayisini ekrana yazdirir
     Examples: Test Verileri
       | urunler |
     |calculator|
     |watch     |
     |flower    |
