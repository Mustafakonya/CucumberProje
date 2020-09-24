@urunarama
Feature: Amazon Arama

  Background: Oncesinde Calisacak Method(BeforeMethod)
    Given Kullanici amazon sayfasina gider


  @amazon
  Scenario: TC02_Kullanici amazonda arama yapar
    And headphones aramasi yapar
    Then sonuc sayisini ekrana yazdirir

    @amazoncamera
  Scenario: TC03_Kullanici amazonda arama yapar
    And camera aramasi yapar
    Then sonuc sayisini ekrana yazdirir

