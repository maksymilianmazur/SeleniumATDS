$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("testHarmonogramy.feature");
formatter.feature({
  "line": 1,
  "name": "test zakładki Procesor Danych",
  "description": "",
  "id": "test-zakładki-procesor-danych",
  "keyword": "Feature"
});
formatter.before({
  "duration": 13391271400,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "uzytkownik  włącza wszystkie podzakładki z zakładki Procesor danych",
  "description": "",
  "id": "test-zakładki-procesor-danych;uzytkownik--włącza-wszystkie-podzakładki-z-zakładki-procesor-danych",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "uzytkownik loguje sie do systemu Z4100542 oraz Jan123!#Pap",
  "keyword": "When "
});
formatter.step({
  "line": 4,
  "name": "uzytkownik wybiera opcje menu Harmonogramy",
  "keyword": "And "
});
formatter.step({
  "line": 5,
  "name": "uzytkownik wybiera harmonogram z listy",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "uzytkownik przechodzi przez podzakladki harmonogramow",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "uzytkownik zamyka przegladarke",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Z4100542",
      "offset": 33
    },
    {
      "val": "Jan123!#Pap",
      "offset": 47
    }
  ],
  "location": "Login.uzytkownikZalogujeSieDoSystemu(String,String)"
});
formatter.result({
  "duration": 4632103100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Harmonogramy",
      "offset": 30
    }
  ],
  "location": "SelectMenu.użytkownikOtwieraZakładkęPPE(String)"
});
formatter.result({
  "duration": 1995021700,
  "status": "passed"
});
formatter.match({
  "location": "HarmonogramTest.uzytkownikWybieraHarmonogramZListy()"
});
formatter.result({
  "duration": 1284585300,
  "status": "passed"
});
formatter.match({
  "location": "HarmonogramTest.uzytkownikPrzechodziPrzezPodzakladkiHarmonogramow()"
});
formatter.result({
  "duration": 661568700,
  "status": "passed"
});
formatter.match({
  "location": "Login.zamknieciePrzegladarki()"
});
formatter.result({
  "duration": 827650600,
  "status": "passed"
});
formatter.uri("testLogin.feature");
formatter.feature({
  "line": 1,
  "name": "sprawdzanie funkcjonalnosci logowania",
  "description": "",
  "id": "sprawdzanie-funkcjonalnosci-logowania",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10427215500,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "uzytkownik ma mozliwosc zalogowania",
  "description": "",
  "id": "sprawdzanie-funkcjonalnosci-logowania;uzytkownik-ma-mozliwosc-zalogowania",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "uzytkownik loguje sie do systemu Z4100542 oraz Jan123!#Pap",
  "keyword": "Then "
});
formatter.step({
  "line": 4,
  "name": "sprawdzenie poprawnosci logowania",
  "keyword": "And "
});
formatter.step({
  "line": 5,
  "name": "uzytkownik zamyka przegladarke",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Z4100542",
      "offset": 33
    },
    {
      "val": "Jan123!#Pap",
      "offset": 47
    }
  ],
  "location": "Login.uzytkownikZalogujeSieDoSystemu(String,String)"
});
formatter.result({
  "duration": 3286987900,
  "status": "passed"
});
formatter.match({
  "location": "Login.sprawdzeniePoprawnosciLogowania()"
});
formatter.result({
  "duration": 75255500,
  "status": "passed"
});
formatter.match({
  "location": "Login.zamknieciePrzegladarki()"
});
formatter.result({
  "duration": 788654200,
  "status": "passed"
});
formatter.uri("testMenu.feature");
formatter.feature({
  "line": 1,
  "name": "test menu",
  "description": "",
  "id": "test-menu",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10469542800,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "uzytkownik ma mozliwosc włączenia wszystkich zakładek menu",
  "description": "",
  "id": "test-menu;uzytkownik-ma-mozliwosc-włączenia-wszystkich-zakładek-menu",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "uzytkownik loguje sie do systemu Z4100542 oraz Jan123!#Pap",
  "keyword": "When "
});
formatter.step({
  "line": 4,
  "name": "użytkownik otwiera wszystkie zakładki",
  "keyword": "And "
});
formatter.step({
  "line": 5,
  "name": "uzytkownik zamyka przegladarke",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Z4100542",
      "offset": 33
    },
    {
      "val": "Jan123!#Pap",
      "offset": 47
    }
  ],
  "location": "Login.uzytkownikZalogujeSieDoSystemu(String,String)"
});
formatter.result({
  "duration": 3853409900,
  "status": "passed"
});
formatter.match({
  "location": "Menu.użytkownikOtwieraWszystkieZakładki()"
});
formatter.result({
  "duration": 29222294300,
  "status": "passed"
});
formatter.match({
  "location": "Login.zamknieciePrzegladarki()"
});
formatter.result({
  "duration": 722689700,
  "status": "passed"
});
formatter.uri("testPP.feature");
formatter.feature({
  "line": 1,
  "name": "test zakładki PP",
  "description": "",
  "id": "test-zakładki-pp",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10270634600,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "uzytkownik  włącza wszystkie podzakładki z zakładki PunktuPomiaru",
  "description": "",
  "id": "test-zakładki-pp;uzytkownik--włącza-wszystkie-podzakładki-z-zakładki-punktupomiaru",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "uzytkownik loguje sie do systemu Z4100542 oraz Jan123!#Pap",
  "keyword": "When "
});
formatter.step({
  "line": 4,
  "name": "uzytkownik wybiera opcje menu Punkty Pomiaru",
  "keyword": "And "
});
formatter.step({
  "line": 5,
  "name": "użytkownik wybiera PP z listy",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "użytkownik otwiera podzakładki z PP",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "uzytkownik zamyka przegladarke",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Z4100542",
      "offset": 33
    },
    {
      "val": "Jan123!#Pap",
      "offset": 47
    }
  ],
  "location": "Login.uzytkownikZalogujeSieDoSystemu(String,String)"
});
formatter.result({
  "duration": 3890023300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Punkty Pomiaru",
      "offset": 30
    }
  ],
  "location": "SelectMenu.użytkownikOtwieraZakładkęPPE(String)"
});
formatter.result({
  "duration": 2748379200,
  "status": "passed"
});
formatter.match({
  "location": "PPTest.użytkownikWybieraPPZListy()"
});
formatter.result({
  "duration": 9559259600,
  "status": "passed"
});
formatter.match({
  "location": "PPTest.użytkownikOtwieraPodzakładkiZPP()"
});
formatter.result({
  "duration": 13971115600,
  "status": "passed"
});
formatter.match({
  "location": "Login.zamknieciePrzegladarki()"
});
formatter.result({
  "duration": 700635000,
  "status": "passed"
});
formatter.uri("testPPE.feature");
formatter.feature({
  "line": 1,
  "name": "test zakładki PPE",
  "description": "",
  "id": "test-zakładki-ppe",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10565124300,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "uzytkownik  włącza wszystkie podzakładki z zakładki PunktPoboruEnergii",
  "description": "",
  "id": "test-zakładki-ppe;uzytkownik--włącza-wszystkie-podzakładki-z-zakładki-punktpoboruenergii",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "uzytkownik loguje sie do systemu Z4100542 oraz Jan123!#Pap",
  "keyword": "When "
});
formatter.step({
  "line": 4,
  "name": "uzytkownik wybiera opcje menu Punkty Poboru Energii",
  "keyword": "And "
});
formatter.step({
  "line": 5,
  "name": "użytkownik wybiera PPE z listy",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "użytkownik otwiera podzakładki z PPE",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "uzytkownik zamyka przegladarke",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Z4100542",
      "offset": 33
    },
    {
      "val": "Jan123!#Pap",
      "offset": 47
    }
  ],
  "location": "Login.uzytkownikZalogujeSieDoSystemu(String,String)"
});
formatter.result({
  "duration": 3659828100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Punkty Poboru Energii",
      "offset": 30
    }
  ],
  "location": "SelectMenu.użytkownikOtwieraZakładkęPPE(String)"
});
formatter.result({
  "duration": 1037407600,
  "status": "passed"
});
formatter.match({
  "location": "PPETest.użytkownikWybieraPPEZListy()"
});
formatter.result({
  "duration": 819386900,
  "status": "passed"
});
formatter.match({
  "location": "PPETest.użytkownikOtwieraPodzakładkiZPPE()"
});
formatter.result({
  "duration": 5778383100,
  "status": "passed"
});
formatter.match({
  "location": "Login.zamknieciePrzegladarki()"
});
formatter.result({
  "duration": 673646600,
  "status": "passed"
});
formatter.uri("testProcesorDanych.feature");
formatter.feature({
  "line": 1,
  "name": "test zakładki Procesor Danych",
  "description": "",
  "id": "test-zakładki-procesor-danych",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10927829600,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "uzytkownik  włącza wszystkie podzakładki z zakładki Procesor danych",
  "description": "",
  "id": "test-zakładki-procesor-danych;uzytkownik--włącza-wszystkie-podzakładki-z-zakładki-procesor-danych",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "uzytkownik loguje sie do systemu Z4100542 oraz Jan123!#Pap",
  "keyword": "When "
});
formatter.step({
  "line": 4,
  "name": "uzytkownik wybiera opcje menu Procesor danych",
  "keyword": "And "
});
formatter.step({
  "line": 5,
  "name": "uzytkownik wybiera licznik wirtualny oraz przechodzi przez jego podzakladki",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "uzytownik wybiera walidatory oraz przechodzi przez jego podzakladki",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "uzytkownik wybiera biblioteki oraz przechodzi przez jego podzakladki",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "uzytkownik zamyka przegladarke",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Z4100542",
      "offset": 33
    },
    {
      "val": "Jan123!#Pap",
      "offset": 47
    }
  ],
  "location": "Login.uzytkownikZalogujeSieDoSystemu(String,String)"
});
formatter.result({
  "duration": 4176521100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Procesor danych",
      "offset": 30
    }
  ],
  "location": "SelectMenu.użytkownikOtwieraZakładkęPPE(String)"
});
formatter.result({
  "duration": 1421237300,
  "status": "passed"
});
formatter.match({
  "location": "ProcesorDanychTest.uzytkownikWybieraLicznikWirtualnyOrazPrzechodziPrzezJegoPodzakladki()"
});
formatter.result({
  "duration": 1702576300,
  "status": "passed"
});
formatter.match({
  "location": "ProcesorDanychTest.uzytownikWybieraWalidatoryOrazPrzechodziPrzezJegoPodzakladki()"
});
formatter.result({
  "duration": 1146612600,
  "status": "passed"
});
formatter.match({
  "location": "ProcesorDanychTest.uzytkownikWybieraBibliotekiOrazPrzechodziPrzezJegoPodzakladki()"
});
formatter.result({
  "duration": 1122745300,
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003cdiv id\u003d\"topMenuArea\" class\u003d\"dropdown\" onclick\u003d\"topMenuSpinner.openSpinner(event,{posElem:this})\"\u003e...\u003c/div\u003e is not clickable at point (75, 12). Other element would receive the click: \u003cdiv style\u003d\"background: url(\u0026quot;js/MDM/jquery/images/ui-bg_diagonals-thick_20_666666_40x40.png\u0026quot;) 50% 50% repeat rgb(102, 102, 102); opacity: 0.5; position: absolute; z-index: 2; width: 1887px; height: 837px; top: 0px; left: 0px;\"\u003e\u003c/div\u003e\n  (Session info: chrome\u003d79.0.3945.130)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027MAKSYMILIAN1\u0027, ip: \u002710.255.0.64\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.5\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 79.0.3945.130, chrome: {chromedriverVersion: 79.0.3945.36 (3582db32b3389..., userDataDir: C:\\Users\\MAKSYM~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:55173}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 36e2119d6a32adb0ccd8b673c42558cb\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat cucumber.test.OgolneObiekty.ProcesorDanychTest.uzytkownikWybieraBibliotekiOrazPrzechodziPrzezJegoPodzakladki(ProcesorDanychTest.java:48)\r\n\tat ✽.And uzytkownik wybiera biblioteki oraz przechodzi przez jego podzakladki(testProcesorDanych.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Login.zamknieciePrzegladarki()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("testSiec.feature");
formatter.feature({
  "line": 1,
  "name": "test zakładki Sieć",
  "description": "",
  "id": "test-zakładki-sieć",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10586334100,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "uzytkownik  włącza wszystkie podzakładki z zakładki Sieć",
  "description": "",
  "id": "test-zakładki-sieć;uzytkownik--włącza-wszystkie-podzakładki-z-zakładki-sieć",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "uzytkownik loguje sie do systemu Z4100542 oraz Jan123!#Pap",
  "keyword": "When "
});
formatter.step({
  "line": 4,
  "name": "uzytkownik wybiera opcje menu Sieć",
  "keyword": "And "
});
formatter.step({
  "line": 5,
  "name": "użytkownik wybiera nazwe z listy",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "użytkownik otwiera podzakładki z Sieci",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "uzytkownik zamyka przegladarke",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Z4100542",
      "offset": 33
    },
    {
      "val": "Jan123!#Pap",
      "offset": 47
    }
  ],
  "location": "Login.uzytkownikZalogujeSieDoSystemu(String,String)"
});
formatter.result({
  "duration": 3476092200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sieć",
      "offset": 30
    }
  ],
  "location": "SelectMenu.użytkownikOtwieraZakładkęPPE(String)"
});
formatter.result({
  "duration": 1590670600,
  "status": "passed"
});
formatter.match({
  "location": "SiecTest.użytkownikWybieraNazweZListy()"
});
formatter.result({
  "duration": 5652968500,
  "status": "passed"
});
formatter.match({
  "location": "SiecTest.użytkownikOtwieraPodzakładkiZSieci()"
});
formatter.result({
  "duration": 991237800,
  "status": "passed"
});
formatter.match({
  "location": "Login.zamknieciePrzegladarki()"
});
formatter.result({
  "duration": 691448200,
  "status": "passed"
});
});