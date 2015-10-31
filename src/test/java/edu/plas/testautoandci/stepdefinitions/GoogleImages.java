package edu.plas.testautoandci.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

/**
 * Created by Stefan.Chircop on 29/10/2015.
 */
public class GoogleImages {
    @Given("^I am on (\\w+)$")
    public void navigateToWebsite(String site) {
        //navigate to website
    }

    @When("^I search for (\\w+)$")
    public void searchForString(String search) {
        //search for string
    }
}
