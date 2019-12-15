$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("google-text-search.feature");
formatter.feature({
  "line": 1,
  "name": "Google search",
  "description": "",
  "id": "google-search",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "user can search any keyword",
  "description": "",
  "id": "google-search;user-can-search-any-keyword",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "an open browser with google.com",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "a keyword \u003ckeyword\u003e is entered in input field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the first one should contain \u003cexpectedWord\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "close browser",
  "keyword": "And "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "google-search;user-can-search-any-keyword;",
  "rows": [
    {
      "cells": [
        "keyword",
        "expectedWord"
      ],
      "line": 10,
      "id": "google-search;user-can-search-any-keyword;;1"
    },
    {
      "cells": [
        "karol",
        "karol"
      ],
      "line": 11,
      "id": "google-search;user-can-search-any-keyword;;2"
    },
    {
      "cells": [
        "jacek",
        "jacek"
      ],
      "line": 12,
      "id": "google-search;user-can-search-any-keyword;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "user can search any keyword",
  "description": "",
  "id": "google-search;user-can-search-any-keyword;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "an open browser with google.com",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "a keyword karol is entered in input field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the first one should contain karol",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "googleSearch.openGoogleSearch()"
});
formatter.result({
  "duration": 4947603945,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "karol",
      "offset": 10
    }
  ],
  "location": "googleSearch.enterKeyword(String)"
});
formatter.result({
  "duration": 1676167671,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "karol",
      "offset": 29
    }
  ],
  "location": "googleSearch.theFirstOneShouldContainKeyword(String)"
});
formatter.result({
  "duration": 146455,
  "status": "passed"
});
formatter.match({
  "location": "googleSearch.closeBrowser()"
});
formatter.result({
  "duration": 591229454,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "user can search any keyword",
  "description": "",
  "id": "google-search;user-can-search-any-keyword;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "an open browser with google.com",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "a keyword jacek is entered in input field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the first one should contain jacek",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "googleSearch.openGoogleSearch()"
});
formatter.result({
  "duration": 3998941263,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jacek",
      "offset": 10
    }
  ],
  "location": "googleSearch.enterKeyword(String)"
});
formatter.result({
  "duration": 1446049788,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jacek",
      "offset": 29
    }
  ],
  "location": "googleSearch.theFirstOneShouldContainKeyword(String)"
});
formatter.result({
  "duration": 145271,
  "status": "passed"
});
formatter.match({
  "location": "googleSearch.closeBrowser()"
});
formatter.result({
  "duration": 581830692,
  "status": "passed"
});
formatter.uri("registration.feature");
formatter.feature({
  "line": 1,
  "name": "registration",
  "description": "",
  "id": "registration",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "tytul",
  "description": "",
  "id": "registration;tytul",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "pierwsza instrukcja",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "druga instrukcja",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "trzecia instrukcja \u003cfirstName\u003e \u003clastName\u003e \u003cemailAddress\u003e \u003cusername\u003e \u003caddressa\u003e \u003caddressb\u003e \u003cphoneNumber\u003e \u003ccity\u003e \u003cstate\u003e \u003czip\u003e \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "czwarta instrukcja",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "piata instrukcja",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "szosta instrukcja",
  "keyword": "And "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "registration;tytul;",
  "rows": [
    {
      "cells": [
        "firstName",
        "lastName",
        "emailAddress",
        "username",
        "addressa",
        "addressb",
        "phoneNumber",
        "city",
        "state",
        "zip",
        "password"
      ],
      "line": 13,
      "id": "registration;tytul;;1"
    },
    {
      "cells": [
        "Jacek",
        "Placek",
        "j.placek@gamil.com",
        "placek",
        "Slowackiego 10",
        "Mickiewicza 5",
        "450234741",
        "Warszawa",
        "PL",
        "05720",
        "iwona231"
      ],
      "line": 14,
      "id": "registration;tytul;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "tytul",
  "description": "",
  "id": "registration;tytul;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "pierwsza instrukcja",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "druga instrukcja",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "trzecia instrukcja Jacek Placek j.placek@gamil.com placek Slowackiego 10 Mickiewicza 5 450234741 Warszawa PL 05720 iwona231",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5,
    6,
    7,
    8,
    9,
    10
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "czwarta instrukcja",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "piata instrukcja",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "szosta instrukcja",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});