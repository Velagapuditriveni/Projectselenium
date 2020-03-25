$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/feature/Testcase.feature");
formatter.feature({
  "line": 2,
  "name": "Jainbook Website",
  "description": "",
  "id": "jainbook-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@jainbookagency"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "",
  "description": "Login to the jainbookagency",
  "id": "jainbook-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@TC01_Jainbook"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "the user launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the user open the jainbookagency Home page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the user login using username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "click on the login button user nagivate to the next page",
  "keyword": "Then "
});
formatter.match({
  "location": "Jainbook_Login.the_user_launch_the_chrome_application()"
});
formatter.result({
  "duration": 24510644543,
  "status": "passed"
});
formatter.match({
  "location": "Jainbook_Login.the_user_open_the_jainbookagency_Home_page()"
});
formatter.result({
  "duration": 5528697137,
  "status": "passed"
});
formatter.match({
  "location": "Jainbook_Login.the_user_login_using_username_and_password()"
});
formatter.result({
  "duration": 25508988771,
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003ca href\u003d\"/booksearch.aspx\"\u003e...\u003c/a\u003e is not clickable at point (539, 111). Other element would receive the click: \u003cdiv class\u003d\"modal fade in\" id\u003d\"waitdiv\" tabindex\u003d\"-1\" role\u003d\"dialog\" aria-labelledby\u003d\"myModalLabel\" aria-hidden\u003d\"true\" style\u003d\"display: block;\"\u003e...\u003c/div\u003e\n  (Session info: chrome\u003d80.0.3987.149)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:48\u0027\nSystem info: host: \u0027TRIVENI\u0027, ip: \u0027192.168.1.35\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_211\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.149, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: C:\\Users\\triveni\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:51440}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: a57db181156374d3077b63fb4a75d662\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat com.pages.Jainbook_Loginpage.LoginDetails(Jainbook_Loginpage.java:73)\r\n\tat com.Stepdefinition.Jainbook_Login.the_user_login_using_username_and_password(Jainbook_Login.java:30)\r\n\tat ✽.Then the user login using username and password(src/main/resources/feature/Testcase.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Jainbook_Login.click_on_the_login_button_user_nagivate_to_the_next_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 11,
  "name": "",
  "description": "Login and  reset the page",
  "id": "jainbook-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@TC02_Jainbook"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "user launchs the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "the user open the jainbookagency and login into the page",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "the user  enters book name in the text box and click on reset",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "the user logout from the page and close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Jainbook_Areset.user_launchs_the_chrome_application()"
});
formatter.result({
  "duration": 7929604239,
  "status": "passed"
});
formatter.match({
  "location": "Jainbook_Areset.the_user_open_the_jainbookagency_and_login_into_the_page()"
});
formatter.result({
  "duration": 4096119088,
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d80.0.3987.149)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:48\u0027\nSystem info: host: \u0027TRIVENI\u0027, ip: \u0027192.168.1.35\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_211\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.149, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: C:\\Users\\triveni\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:51526}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 335a8846d327a6edebfe389f12bedf04\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:277)\r\n\tat com.pages.Jainbook_Aresetpage.LoginPage(Jainbook_Aresetpage.java:51)\r\n\tat com.Stepdefinition.Jainbook_Areset.the_user_open_the_jainbookagency_and_login_into_the_page(Jainbook_Areset.java:23)\r\n\tat ✽.When the user open the jainbookagency and login into the page(src/main/resources/feature/Testcase.feature:14)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Jainbook_Areset.the_user_enters_book_name_in_the_text_box_and_click_on_reset()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Jainbook_Areset.the_user_logout_from_the_page_and_close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 18,
  "name": "",
  "description": "Login and  Search book",
  "id": "jainbook-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@TC03_Jainbook"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "user launches the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "the user clicks advanced search",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "the user fills the form",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "user clicks the search button then the user gets the searched book",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "Jainbook_Advancesearch.the_user_clicks_advanced_search()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Jainbook_Advancesearch.the_user_fills_the_form()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Jainbook_Advancesearch.user_clicks_the_search_button_then_the_user_gets_the_searched_book()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 27,
  "name": "",
  "description": "Login and Add to cart",
  "id": "jainbook-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 26,
      "name": "@TC04_Jainbook"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "the user clicks add to cart",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "the user gets the cart details",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Jainbook_Addtocart.launch_the_chrome_application()"
});
formatter.result({
  "duration": 23892261719,
  "status": "passed"
});
formatter.match({
  "location": "Jainbook_Addtocart.the_user_clicks_add_to_cart()"
});
formatter.result({
  "duration": 11743349666,
  "status": "passed"
});
formatter.match({
  "location": "Jainbook_Addtocart.the_user_gets_the_cart_details()"
});
formatter.result({
  "duration": 8768407806,
  "status": "passed"
});
formatter.match({
  "location": "Jainbook_Addtocart.close_the_browser()"
});
formatter.result({
  "duration": 4038463674,
  "status": "passed"
});
});