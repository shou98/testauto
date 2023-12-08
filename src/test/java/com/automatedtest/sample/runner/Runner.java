package com.automatedtest.sample.runner;

import org.junit.runner.RunWith;

//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/com/automatedtest/sample/",
        glue = {"com.automatedtest.sample"})
public class Runner {

}