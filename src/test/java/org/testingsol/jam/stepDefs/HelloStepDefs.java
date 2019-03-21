package org.testingsol.jam.stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HelloStepDefs {

    @Given("{string} is a new community user")
    public void a_new_community_user(String memberName) {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("(he|she) says {string} to the community")
    public void he_welcomes_the_community(String welcomeMessage) {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("community replies with {string}")
    public void community_replies_with_greetings(String greetingMessage) {
        // Write code here that turns the phrase above into concrete actions
    }

    @Given("{string} is an existing community member")
    public void an_existing_community_member(String memberName) {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("{string} shares a new story in {string} section saying {string}")
    public void member_shares_a_new_story_in_section_with_message(String member, String section, String message) {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("the story is added to {string} section")
    public void the_story_is_added_to_section(String string) {
        // Write code here that turns the phrase above into concrete actions
    }
}
