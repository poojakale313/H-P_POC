Feature: Verification of BirthPlan, Appoinment, ToDo, MyWeight

  #PPlus_BirthPlan
  @Me
  Scenario Outline: Login using valid username and valid password and check Birth Plan module from Me Menu
    Given Click On Login button
    When Click on Ok Button
    When Enter the User Name <username>
    When Enter the Password <password>
    When Click on Continue Button
    When Click on Me menu
    When Click on Birth Plan tab
    When Click on Environment tab
    When Click on I prefer a female doctor
    When Click on I prefer a private room
    When Click on I would like to give birth at home
    When Click on My Items tab1
    When Birth Plan Enter the text in Type your task text box <text>
    When Click on Back arrow
    When Click on Companions tab
    When Click on I don`t want any students or other hospital staff in the room
    When Click on I only want my partner
    When Click on I would like my partner or companion to be with me during labor
    When Click on Item button
    When Click on Back arrow
    When Click on Back arrow
    Then Birth Plan Items are selected from listing

    Examples: 
      | username         | password | text |
      | dev_qa@email.com | 12345678 | test |

  #Appointment
  @Me
  Scenario Outline: Add and select questions on appointment module
    Given Click On Login button
    When Click on Ok Button
    When Enter the User Name <username>
    When Enter the Password <password>
    When Click on Continue Button
    When Click on Me menu
    When Click on appointment tab
    When Click on questions tab
    When Select first question
    When Select second question
    When Select third question
    When Click on My items tab
    When Enter a question in Add question section <Question>
    When Click on down arrow to type answer
    When Enter a text in answer tab <Answer>
    When Click on up arrow
    When Click on Add
    When Enter a name <NewName>
    When Select a drop down from doctor tab
    When click on date
    When Click on OK
    When Click on Time
    When Perform horizontal swipe for time
    When Click on OK of time
    When Click on My weight
    When Perform horizontal swipe for weight in KG
    When Perform horizontal swipe for weight in GM
    When Click on save weight
    When Click on BP
    When Perform horizontal swipe for BP
    When Perform horizontal swipe for BP2
    When Click on save for BP
    When Click on baby's heart
    When Perform horizontal swipe for baby's heart
    When Click on save for baby's heart
    When Perform vertical swipe
    When Click on OFF
    When Click on ON
    When Click on Final save
    When Perform horizontal swipe to delete the record
    Then Added Appointment get displayed on listing screen

    Examples: 
      | username         | password | Question               | Answer           | NewName |
      | dev_qa@email.com | 12345678 | What needs to be done? | No need to worry | Test1   |

  #ToDo
  @Me
  Scenario Outline: Check Items are getting added which are selected from To Do list and are visible under My task, also delete the added items.
    Given Click On Login button
    When Click on Ok Button
    When Enter the User Name <username>
    When Enter the Password <password>
    When Click on Continue Button
    When Click on Me menu
    When Click To Do Tab
    When Click on Discuss maternity leave
    When Click on Discuss working from home
    When Click on Book a fitting
    When Click on My Tasks tab
    When To Do Enter the text in Type your task text box <task>
    When Select check box Maternity leave
    When Select check box working from home
    When Select check box Book a fitting
    When Deselects Maternity leave
    When Deselects check box working from home
    When Deselects check box Book a fitting
    When Long Press on any item from My Items
    When Click on Delete icon
    When Click on Delete button shown on confirmation pop up
    When Click on Suggested tab
    When Select week from Week dropdown
    When Click on Arrange a water purification
    When Click on Book an appointment
    When Click on Back arrow
    Then Suggested Items are added into MyTask list

    Examples: 
      | task     | username         | password |
      | Exercise | dev_qa@email.com | 12345678 |

  #MyWeight
  @Me
  Scenario Outline: Add weight by selecting starting and current weight also delete added weight.
    Given Click On Login button
    When Click on Ok Button
    When Enter the User Name <username>
    When Enter the Password <password>
    When Click on Continue Button
    When Click on Me menu
    When Click on My Weight
    When Click on Starting Weight
    When Select weight from roller
    When Click on Save Weight button
    When Click on Back arrow
    Then Added weight get displayed on full history list

    Examples: 
      | username         | password |
      | dev_qa@email.com | 12345678 |
