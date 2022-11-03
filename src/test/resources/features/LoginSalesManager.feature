
Feature: User can login "upgenix" page
  @BRT-694 @BRT-748
Scenario:Users can log in with valid credentials
Given user username and user password.
  When user go to main page
  And user enters username "salesmanager100@info.com"
  And user enters password "salesmanager"
    And user enters username "posmanager15@info.com"
    And user enters password "posmanager"
  And  User should see the password in bullet signs
  And user clicks login button
  Then Verify if the ‘Enter’ key of the keyboard is working correctly on the login page.
  And user can see top on the screen him|her username
  Then user can see expected title on the page




  @BRT-749
Scenario: Users enter "Wrong login/password" message should be displayed for invalid credentials
  When user enters wrong username "salesmanager@info.com"
  And user enters wrong password "salesmanager100"
  And user clicks login button
  Then "Wrong login/password" message should be displayed

  When user enters wrong username "posmanager@info.com"
  And user enters wrong password "posmanager100"
  And user clicks login button
  Then "Wrong login/password" message should be displayed


Scenario: Users enter valid username-invalid password and invalid username-valid password
  When user enters valid username "salesmanager100@info.com"
  And user enters invalid password "posmanager100";
  And user clicks login button
  Then "Wrong login/password" message should be displayed

  When user enters invalid username "posmanager@info.com"
  And user enters valid password "posmanager"
  And user clicks login button
  Then "Wrong login/password" message should be displayed

  Scenario: "Please fill out this field" message should be displayed if the password or username is empty
    When user without filling the blanks click login button
    Then "Please fill out this field" message should be displayed

    When user without filling the username blank
    And user enters valid password "salesmanager"
    And user clicks login button
    Then "Please fill out this field" message should be displayed

    And user enters valid username "salesmanager100@info.com"
    When user without filling the password blank
    And user clicks login button
    Then "Please fill out this field" message should be displayed




