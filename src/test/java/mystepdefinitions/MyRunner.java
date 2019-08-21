package mystepdefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(features="myfeatures",glue="mystepdefinitions")

@CucumberOptions(features="C:\\Users\\training_h2a.06.15\\Desktop\\selenium\\cucumber_demo1\\myfeatures\\DemoOnTags.feature",glue="mystepdefinitions",tags= {"@Regression,@Sanity"},plugin={"json:target/cucumber.json"})
///cucumber_demo1/myfeatures/login.feature



public class MyRunner {

}
