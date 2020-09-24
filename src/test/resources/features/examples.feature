@teknolojikarama
  Feature: Amazon Birden Fazla Arama
   Scenario Outline: TC05_kullanici amazonda urun arar
     Given Kullanici amazon sayfasina gider
     And Kullanici aramakutusuna "<urunler>" yazar ve arar
     Then sonuc sayisini ekrana yazdirir
     Examples: Urun Isimleri
       | urunler |
       |headphones|
       |camera    |
       |drone     |
       |pencil    |
       |tv        |
       |java      |
       |sponge    |
       |mouse     |


