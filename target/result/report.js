$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/feature10.feature");
formatter.feature({
  "name": "sms4India login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Validate login credentials with valid data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "name": "launch site using \"\u003cbrowser\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "\"\u003cmobNo\u003e\" and \"\u003cpassword\u003e\" are entered",
  "keyword": "When "
});
formatter.step({
  "name": "login is clicked",
  "keyword": "And "
});
formatter.step({
  "name": "respective user account should be displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "close site",
  "keyword": "When "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "browser",
        "mobNo",
        "password"
      ]
    },
    {
      "cells": [
        "chrome",
        "8247438096",
        "Sarada12@"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validate login credentials with valid data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoketest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "launch site using \"chrome\"",
  "keyword": "Given "
});
formatter.match({
  "location": "glue.StepDefs.method2(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"8247438096\" and \"Sarada12@\" are entered",
  "keyword": "When "
});
formatter.match({
  "location": "glue.StepDefs.method3(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login is clicked",
  "keyword": "And "
});
formatter.match({
  "location": "glue.StepDefs.method4()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "respective user account should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "glue.StepDefs.method7()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:87)\r\n\tat org.junit.Assert.fail(Assert.java:96)\r\n\tat glue.StepDefs.method7(StepDefs.java:124)\r\n\tat ✽.respective user account should be displayed(file:///E:/batch246/sms4India-Cucumber/src/test/resources/features/feature10.feature:32)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "close site",
  "keyword": "When "
});
formatter.match({
  "location": "glue.StepDefs.method6()"
});
formatter.result({
  "status": "skipped"
});
});