Feature: Verification of HospitalBags, Shop, Contraction, KickCounter

  #PPlus_HospitalBag
  @More
  Scenario Outline: Login using valid username and valid password and check daily text
    Given Click On Login button
    When Click on Ok Button
    When Enter the User Name <username>
    When Enter the Password <password>
    When Click on Continue Button
    When Click on More tab
    When Click on Hospital Bag tab
    When Click on Mother's Bag tab
    When Click on Birth Plan
    When Click on Book Magazine
    When Click on Breast Pads
    When Click on My Items tab
    When Enter the text in Add your item here text box <entertext>
    When Deselects checkbox Birth Plan
    When Deselects checkbox Book Magazine
    When Deselects checkbox Breast Pads
    When Click long press on Birth Plan
    When Click on delete icon
    When Click on pop up delete tab
    When Click on Suggested Button
    When Click on Book Magazine
    When Click on Breast Pads
    When Click on Back arrow
    When Click on Partners bag tab
    When Click on book Magazine tab
    When Click on Change of Cloths
    When Click on Comfortable Shoes
    When Click on My Items tab
    When Enter the text in Add your item here text box <entertext>
    When Click on Deselects checkbox Book Magazine
    When Click on Deselects checkbox Change of Cloths
    When Click on Deselects checkbox Comfortable Shoes
    When Click long press on Comfortable Shoes
    When Click on delete icon
    When Click on pop up delete tab
    When Click on Suggested Button
    When Click on book Magazine tab
    When Click on Change of Cloths
    When Click on Back arrow
    When Click on Babys bag tab
    When Click on Three in All tab
    When Click on Three Muslin Cloths
    When Click on Bibs tab
    When Click on My Items tab
    When Enter the text in Add your item here text box <entertext>
    When Click on Deselects checkbox Three in All tab
    When Click on Deselects checkbox Three Muslin Cloths
    When Click on Deselects checkbox Muslin Cloths
    When Click long press on Three in All
    When Click on delete icon
    When Click on pop up delete tab
    When Click on Suggested Button
    When Click on Three Muslin Cloths
    When Click on Bibs tab
    When Click on Back arrow
    When Click on Back arrow
    Then Suggested Items from different hospital bags are added into my items list

    Examples: 
      | username         | password | entertext |
      | dev_qa@email.com | 12345678 | Shoping   |

  #PPlus_Shop
  @More
  Scenario Outline: Login using valid username and valid password and check daily text
    Given Click On Login button
    When Click on Ok Button
    When Enter the User Name <username>
    When Enter the Password <password>
    When Click on Continue Button
    When Click on More tab
    When Click on shop tab
    When Click on baby care
    When Click on first Hooded towels
    When Click on first Wash Cloths
    When Click on My Items tab
    When Click on second Hooded towels
    When Click on second Wash Cloths
    When Click long press on  2-3 Wash Cloths
    When Click on delete icon
    When Click on pop up delete tab
    When Click on Suggested Button
    When Click on second Hooded towels
    When Click on Back arrow
    When Click on Back arrow
    Then Suggested Items from different shopping sections are added into my items list

    Examples: 
      | username         | password |
      | dev_qa@email.com | 12345678 |

  #Contractions
  @More
  Scenario Outline: Login using valid username and valid password and click on Contractions tab
    Given Click On Login button
    When Click on Ok Button
    When Enter the User Name <username>
    When Enter the Password <password>
    When Click on Continue Button
    When Click on More tab
    When Click on Contractions tab
    When Click on Clock icon to start
    When Click on Alert popup
    When Click on Stop Button
    When Click on OK shown on pop up
    When Click on Clock icon to start
    When Click on Stop Button
    When Scroll down to view overview and Contraction Info
    When Switch the tabs from Last 3 to Last 5 or All
    When Swipe any record shown in session history to delete
    When Click on Back arrow
    Then Added contraction are displayed in session history listing

    Examples: 
      | username         | password |
      | dev_qa@email.com | 12345678 |

  #KickCounter
  @More
  Scenario Outline: Check counter kicks
    Given Click On Login button
    When Click on Ok Button
    When Enter the User Name <username>
    When Enter the Password <password>
    When Click on Continue Button
    When Click on More tab
    When Click on Kick Counter tab
    When Tap on the foot icon for 2 times
    When Click on Finish button
    When Click on NO shown on alert pop up
    When Click on Finish button
    When Click on YES shown on alert pop up
    When Click on DONE shown on session ended pop up
    When Click on Back arrow
    When Tap on the foot icon for 10 times
    When Click on Undo button
    When Click on NO button shown in alert pop up
    When Click on Undo button
    When Click on YES button shown in alert pop up
    When Tap on the foot icon for 2 times
    When Click on DONE shown on session saved pop up
    When Click on Back arrow
    When Click on History
    When Swipe any entry to delete it
    When Click on Back arrow
    Then Kick counts are displayed in session history listing

    Examples: 
      | username         | password |
      | dev_qa@email.com | 12345678 |
