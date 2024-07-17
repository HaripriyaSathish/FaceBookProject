$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/AccountCreation.feature");
formatter.feature({
  "name": "To validate Account Creation Feature in Facebook",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.scenario({
  "name": "To create Account with ephone number in Fb application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To launch fb url in chrome",
  "keyword": "When "
});
formatter.match({
  "location": "SignUpMap.to_launch_fb_url_in_chrome()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click create new acc Button",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpMap.to_click_create_new_acc_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass first name in First text box",
  "rows": [
    {
      "cells": [
        "Firstname",
        "Ashok"
      ]
    },
    {
      "cells": [
        "Firstname Two",
        "Sathish"
      ]
    },
    {
      "cells": [
        "Firstname Three",
        "Arun"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "SignUpMap.to_pass_first_name_in_first_text_box(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass last name in surname text box",
  "rows": [
    {
      "cells": [
        "Lastname One",
        "Lastname Two",
        "Lastname Three"
      ]
    },
    {
      "cells": [
        "S",
        "B",
        "K"
      ]
    },
    {
      "cells": [
        "L",
        "E",
        "X"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "SignUpMap.to_pass_last_name_in_surname_text_box(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To validate the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUpMap.to_validate_the_browser()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat org.stepdefinition.SignUpMap.to_validate_the_browser(SignUpMap.java:46)\r\n\tat ✽.To validate the browser(file:src/test/resources/Features/AccountCreation.feature:43)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});