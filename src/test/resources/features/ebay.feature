@ebayarama
  Feature: Ebayda Arama
    Scenario Outline: TC06_kullanici ebayda urun arar.
      Given kullanici "http://ebay.com" sayfasina gider
      And Kullanici ebayda aramakutusuna "<kelimeler>" yazar ve arar
      Then ebay sonuc sayisini ekrana yazdirir
      Examples: Kelimeler
        | kelimeler |
      |araba        |
      |bebek arabasi|
      |bisiklet     |
