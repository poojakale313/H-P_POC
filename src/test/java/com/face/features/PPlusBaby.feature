Feature: Verification of Daily, Weekly, BabyNames

  #PPlus_daily
  @Baby
  Scenario Outline: Login using valid username and valid password and check daily text
    Given Click On Login button
    When Click on Ok Button
    When Enter the User Name <username>
    When Enter the Password <password>
    When Click on Continue Button
    When Click on Baby Menu tab
    When Click on daily tab
    When Get text to verify
    When Click on Back arrow
    Then Content get displayed for particular day

    Examples: 
      | username         | password |
      | dev_qa@email.com | 12345678 |

  #PPlus_weekly
  @Baby1
  Scenario Outline: Login using valid username and valid password and check weekly text
    Given Click On Login button
    When Click on Ok Button
    When Enter the User Name <username>
    When Enter the Password <password>
    When Click on Continue Button
    When Click on Baby Menu tab
    When Click on weekly tab
    When Get text to verify weekly pages
    When Click on Back arrow
    Then Content get displayed for particular week

    Examples: 
      | username         | password |
      | dev_qa@email.com | 12345678 |

  #PPlus_BabyName
  @Baby
  Scenario Outline: Login using valid username and valid password and check Baby Names module from Baby menu
    Given Click On Login button
    When Click on Ok Button
    When Enter the User Name <username>
    When Enter the Password <password>
    When Click on Continue Button
    When Click on Baby Menu tab
    When Click on Baby Name tab
    When Click on American names
    When Click on Noah
    When Click on Liam
    When Click on Mason
    When Click on Jacob
    When Click on gender icon
    When Click on Emma
    When Click on Olivia
    When Click on Sophia
    When Click on Isabella
    When Click on Back arrow
    When Click on My favourites tab
    When Click on heart icon of name1
    When Click on No
    When Click on heart icon of name1
    When Click on Yes
    When Swipe name1 to right or left to delete
    When Click on Back arrow
    Then Baby Names are added and selected from country listing into favourite listing

    Examples: 
      | username         | password | text |
      | dev_qa@email.com | 12345678 | test |
