$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("testOPKalendarzBrakUprawnien.feature");
formatter.feature({
  "line": 1,
  "name": "test kalendarza opłaty mocowej zgodnie z uprawnieniami użytkownika",
  "description": "",
  "id": "test-kalendarza-opłaty-mocowej-zgodnie-z-uprawnieniami-użytkownika",
  "keyword": "Feature"
});
formatter.before({
  "duration": 12791172600,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "uzytkownik nie posiada uprawnien do edytowania, przegladanie kalendarza",
  "description": "",
  "id": "test-kalendarza-opłaty-mocowej-zgodnie-z-uprawnieniami-użytkownika;uzytkownik-nie-posiada-uprawnien-do-edytowania,-przegladanie-kalendarza",
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
  "name": "uzytkownik wybiera opcje menu Użytkownicy",
  "keyword": "And "
});
formatter.step({
  "line": 5,
  "name": "uzytkownik ustawia uprawnienia dotyczące możliwości edycji kalendarza dla uzytkownika Z4100542",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "uzytkownik wybiera opcje menu Kalendarz opłaty mocowej",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "uzytkownik odczytuje godziny mocowe",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "uzytkownik zgodnie z uprawnieniami nie posiada mozliwosci edycji",
  "keyword": "And "
});
formatter.step({
  "line": 9,
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
  "duration": 3368650600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Użytkownicy",
      "offset": 30
    }
  ],
  "location": "SelectMenu.użytkownikOtwieraZakładkęPPE(String)"
});
formatter.result({
  "duration": 1100740000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Z4100542",
      "offset": 86
    }
  ],
  "location": "KalendarzBrakUprawnien.uzytkownikUstawiaUprawnieniaDotycząceMożliwościEdycjiKalendarzaDlaUzytkownikaZ(String)"
});
formatter.result({
  "duration": 4057792100,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#POWER_FEE_MANAGEMENT\"}\n  (Session info: chrome\u003d80.0.3987.122)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027MAKSYMILIAN1\u0027, ip: \u002710.255.0.64\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.5\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.122, chrome: {chromedriverVersion: 79.0.3945.36 (3582db32b3389..., userDataDir: C:\\Users\\MAKSYM~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:55873}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: bc6ea1c282496bdca3e0fb2845fd780a\n*** Element info: {Using\u003did, value\u003dPOWER_FEE_MANAGEMENT}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat cucumber.test.KalendarzOplatyMocowej.KalendarzBrakUprawnien.uzytkownikUstawiaUprawnieniaDotycząceMożliwościEdycjiKalendarzaDlaUzytkownikaZ(KalendarzBrakUprawnien.java:39)\r\n\tat ✽.And uzytkownik ustawia uprawnienia dotyczące możliwości edycji kalendarza dla uzytkownika Z4100542(testOPKalendarzBrakUprawnien.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Kalendarz opłaty mocowej",
      "offset": 30
    }
  ],
  "location": "SelectMenu.użytkownikOtwieraZakładkęPPE(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "KalendarzBrakUprawnien.uzytkownikOdczytujeGodzinyMocowe()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "KalendarzBrakUprawnien.uzytkownikZgodnieZUprawnieniamiNiePosiadaMozliwosciEdycji()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login.zamknieciePrzegladarki()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("testOPKalendarzEdycjaUstawyMocowej.feature");
formatter.feature({
  "line": 1,
  "name": "test kalendarza opłaty mocowej zgodnie z uprawnieniami użytkownika",
  "description": "",
  "id": "test-kalendarza-opłaty-mocowej-zgodnie-z-uprawnieniami-użytkownika",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8900003800,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "uzytkownik wykonuje zmiany w kalendarzu opłaty mocowej w przyszłości",
  "description": "",
  "id": "test-kalendarza-opłaty-mocowej-zgodnie-z-uprawnieniami-użytkownika;uzytkownik-wykonuje-zmiany-w-kalendarzu-opłaty-mocowej-w-przyszłości",
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
  "name": "uzytkownik wybiera opcje menu Użytkownicy",
  "keyword": "And "
});
formatter.step({
  "line": 5,
  "name": "uzytkownik ustawia uprawnienia dotyczące edycji kalendarza dla uzytkownika na  Z4100542 \u0027Edycja Ustawy Mocowej\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "uzytkownik wybiera opcje menu Kalendarz opłaty mocowej",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "uzytkownik edytuje godziny mocowe zgodnie ze swoimi uprawnieniami",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "uzytkownik potwierdza wprowadzone zmiany",
  "keyword": "And "
});
formatter.step({
  "line": 9,
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
  "duration": 5993078100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Użytkownicy",
      "offset": 30
    }
  ],
  "location": "SelectMenu.użytkownikOtwieraZakładkęPPE(String)"
});
formatter.result({
  "duration": 3065975400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": " Z4100542",
      "offset": 78
    }
  ],
  "location": "KalendarzEdycjaUstawyMocowej.uzytkownikUstawiaUprawnieniaDotycząceEdycjiKalendarzaDlaUzytkownikaNaEdycjaUstawyMocowej(String)"
});
formatter.result({
  "duration": 4421749400,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#POWER_FEE_MANAGEMENT\"}\n  (Session info: chrome\u003d80.0.3987.122)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027MAKSYMILIAN1\u0027, ip: \u002710.255.0.64\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.5\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.122, chrome: {chromedriverVersion: 79.0.3945.36 (3582db32b3389..., userDataDir: C:\\Users\\MAKSYM~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:55937}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: d503cabd8056ffa8063e3ac99eed4b5b\n*** Element info: {Using\u003did, value\u003dPOWER_FEE_MANAGEMENT}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat cucumber.test.KalendarzOplatyMocowej.KalendarzEdycjaUstawyMocowej.uzytkownikUstawiaUprawnieniaDotycząceEdycjiKalendarzaDlaUzytkownikaNaEdycjaUstawyMocowej(KalendarzEdycjaUstawyMocowej.java:37)\r\n\tat ✽.And uzytkownik ustawia uprawnienia dotyczące edycji kalendarza dla uzytkownika na  Z4100542 \u0027Edycja Ustawy Mocowej\u0027(testOPKalendarzEdycjaUstawyMocowej.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Kalendarz opłaty mocowej",
      "offset": 30
    }
  ],
  "location": "SelectMenu.użytkownikOtwieraZakładkęPPE(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "KalendarzEdycjaUstawyMocowej.uzytkownikEdytujeGodzinyMocoweZgodnieZeSwoimiUprawnieniami()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "KalendarzEdycjaUstawyMocowej.uzytkownikPotwierdzaWprowadzoneZmiany()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login.zamknieciePrzegladarki()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("testOPKalendarzZaawansowanaEdycjaUstawyMocowej.feature");
formatter.feature({
  "line": 1,
  "name": "test kalendarza opłaty mocowej zgodnie z uprawnieniami użytkownika",
  "description": "",
  "id": "test-kalendarza-opłaty-mocowej-zgodnie-z-uprawnieniami-użytkownika",
  "keyword": "Feature"
});
formatter.before({
  "duration": 11897128500,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "uzytkownik wykonuje zmiany w kalendarzu opłaty mocowej w przeszłości oraz przyszłości",
  "description": "",
  "id": "test-kalendarza-opłaty-mocowej-zgodnie-z-uprawnieniami-użytkownika;uzytkownik-wykonuje-zmiany-w-kalendarzu-opłaty-mocowej-w-przeszłości-oraz-przyszłości",
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
  "name": "uzytkownik wybiera opcje menu Użytkownicy",
  "keyword": "And "
});
formatter.step({
  "line": 5,
  "name": "uzytkownik ustawia uprawnienia edycji kalendarza dla uzytkownika Z4100542 na \u0027Zaawansowana Edycja Ustawy Mocowej\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "uzytkownik wybiera opcje menu Kalendarz opłaty mocowej",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "uzytkownik edytuje godziny mocowe w przyszłości zgodnie ze swoimi uprawnieniami",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "uzytkownik potwierdza wprowadzone zmiany w kalendarzu",
  "keyword": "And "
});
formatter.step({
  "line": 9,
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
  "duration": 3340700800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Użytkownicy",
      "offset": 30
    }
  ],
  "location": "SelectMenu.użytkownikOtwieraZakładkęPPE(String)"
});
formatter.result({
  "duration": 1388974400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Z4100542",
      "offset": 65
    }
  ],
  "location": "KalendarzZaawansowanaEdycjaUstawyMocowej.uzytkownikUstawiaUprawnieniaDotycząceMożliwościEdycjiKalendarzaDlaUzytkownikaZNaZaawansowanaEdycjaUstawyMocowej(String)"
});
formatter.result({
  "duration": 4240296500,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#POWER_FEE_MANAGEMENT\"}\n  (Session info: chrome\u003d80.0.3987.122)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027MAKSYMILIAN1\u0027, ip: \u002710.255.0.64\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.5\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.122, chrome: {chromedriverVersion: 79.0.3945.36 (3582db32b3389..., userDataDir: C:\\Users\\MAKSYM~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:56019}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 127c5fae7db537b6f50c01c36586fa40\n*** Element info: {Using\u003did, value\u003dPOWER_FEE_MANAGEMENT}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat cucumber.test.KalendarzOplatyMocowej.KalendarzZaawansowanaEdycjaUstawyMocowej.uzytkownikUstawiaUprawnieniaDotycząceMożliwościEdycjiKalendarzaDlaUzytkownikaZNaZaawansowanaEdycjaUstawyMocowej(KalendarzZaawansowanaEdycjaUstawyMocowej.java:40)\r\n\tat ✽.And uzytkownik ustawia uprawnienia edycji kalendarza dla uzytkownika Z4100542 na \u0027Zaawansowana Edycja Ustawy Mocowej\u0027(testOPKalendarzZaawansowanaEdycjaUstawyMocowej.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Kalendarz opłaty mocowej",
      "offset": 30
    }
  ],
  "location": "SelectMenu.użytkownikOtwieraZakładkęPPE(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "KalendarzZaawansowanaEdycjaUstawyMocowej.uzytkownikEdytujeGodzinyMocoweWPrzyszłościZgodnieZeSwoimiUprawnieniami()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "KalendarzZaawansowanaEdycjaUstawyMocowej.uzytkownikPotwierdzaWprowadzoneZmianyWKalendarzu()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login.zamknieciePrzegladarki()"
});
formatter.result({
  "status": "skipped"
});
});