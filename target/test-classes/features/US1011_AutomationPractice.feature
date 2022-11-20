Feature: US1011 Automation Practice kullanici Olusturma testi
@wip
  Scenario: TC18 kullanici yeni kullanici oluturabilmeli

    Given Kullanici "automationUrl" anasayfaya gider
    And user signUp linkine tiklar
    And New user bölümüne name ve email adresi girer
    And SignUp butonuna basar
    And user kisisel bilgilerini ve iletisim bilgilerini girer
    And user Register butonuna basar
    Then hesap olustugunu dogrulayin