Feature: US1009 Kullanici Liste olarak verilen ürünleri amazonda aratir

  #Amazon anasayfaya gidip Nutella, java , Apple,Samsung,LG icin  arama yapip
  #aram sonuclarinin arana kelimeleri icerdigini test edin

  Scenario Outline: TC17 Kullanici liste olarak arama testi yapabilmeli

    Given Kullanici "amazonUrl" anasayfaya gider
    Then Arama cubuguna "<istenenKelime>" yazip aratir
    Then Arama sonuclarinin "<istenenKelime>" icerdigini test eder
    Then Sayfayi kapatir

    Examples:
    |istenenKelime|
    |Nutella      |
    |java         |
    |Apple        |
    |Samsung      |
    |LG           |
