
  Feature: User can logout "upgenix" page
    Background: User can enters main page
    @BRT-754
      Scenario: User can log out and ends up in login page.
        Given user go to login page
        When user enters username "salesmanager100@info.com"
        And user enters password "salesmanager"
        And user clicks login button
        When user clicks username
        And user clicks log out button
        Then user can see expected title on the page "Login | Best solution for startups"

    @BRT-757
        Scenario: User can not go to the home page again
          When user clicks back button
          And user see the description on the page
          And user can not go to the home page
          Then user can see logo the login page



