@urunarama1 @amazon
  Feature: Amazon Urun Arama
    Scenario: TC04_kullanici amazonda urun aramasi yapar
      Given Kullanici amazon sayfasina gider
      And Kullanici aramakutusuna "drone" yazar ve arar
      Then sonuc sayisini ekrana yazdirir
