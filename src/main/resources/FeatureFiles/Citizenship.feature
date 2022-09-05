Feature: Citizenship Functionality

  Background:
    Given User is on login page
    When User enter admin credentials
    Then User should login successfully


  Scenario: Create Citizenship
    When User create Citizenship with "TestKorayCitizennn" name and "TKC" shortname
    Then Success message should be displayed


  Scenario: Edit Citizenship
    When User edit "TestKorayCitizennn" citizenship to "UpdatedTestKorayCitizennn"
    Then Success message should be displayed


  Scenario: Delete Citizenship
    When User delete "UpdatedTestKorayCitizennn" citizenship
    Then Success message should be displayed