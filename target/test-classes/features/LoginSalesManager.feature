@BRT-694
Feature: User can login "upgenix" page


Scenario: user can login page and can see expected title
  Given User username and password
When user go to main page
And user enters username data
And user enters password data
And user can see top on the screen him|her username
Then user can see expected title on the page
