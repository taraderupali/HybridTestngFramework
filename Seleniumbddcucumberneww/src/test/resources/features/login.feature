Feature: Login functionality

Scenario: Valid Login
  Given User launches application
  When User logs in with valid credentials
  Then User should see products page
