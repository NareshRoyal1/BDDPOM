
Feature: Google page search functionality

  Scenario: java search
    Given user is on google page
    When user search java tutorial
    Then should display java tutorial
    
     Scenario: selenium search
    Given user is on google page
    When user search selenium tutorial
    Then should display selenium tutorial
