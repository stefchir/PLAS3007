package edu.plas.testautoandci.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.List;

/**
 * Created by Stefan.Chircop on 31/10/2015.
 */
public class NewsMenu {
    @Given("^I am on the (\\w+) website$")
    public void iAmOnTheWebsite(String site) {
        //navigate to website
    }

    @Then("^I see menu items:$")
    public void iSeeMenuItems(List<String> menuItems) {
        //make sure that the menu items are available
    }
}
