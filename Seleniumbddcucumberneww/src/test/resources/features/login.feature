Feature: Login functionality


Scenario: Valid Login
  Given User launches application
  When User logs in with valid credentials
  Then User should see products page

# Feature	High-level functionality
# Scenario	Single test case
#Given	Precondition
#When	Action
#Then	Expected result
#And	Additional steps