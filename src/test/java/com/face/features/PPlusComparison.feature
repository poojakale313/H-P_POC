Feature: Login into Pregnancy Plus Application 
@PPlus_Shop
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
#	When Click on delete icon
#	When Should display confirmation popup
#	When Click on delete tab
#	When 2-3 Wash Cloths item should be deleted	
	 
	Examples: 
		|username	           |password |                                                    
		|dev_qa@email.com    |12345678 |
		
@PPlus_Hospital_Bag
Scenario Outline: Login using valid username and valid password and check daily text

	Given Click On Login button 
	When Click on Ok Button
	When Enter the User Name <username>
	When Enter the Password <password>
	When Click on Continue Button
  When Click on More tab 
  Then Click on Hospital Bag tab
  Then Click on Mother's Bag tab
  Then Click on Birth Plan 
  Then Click on Book Magazine
  Then Click on Breast Pads
  Then Click on My Items tab
  Then Enter the text in Add your item here text box <entertext>
  Then Deselects checkbox Birth Plan
  Then Deselects checkbox Book Magazine
  Then Deselects checkbox Breast Pads
  Then Click on Back arrow

  Then Click on Partners bag tab
	Then Click on book Magazine tab
	Then Click on Change of Cloths
	Then Click on Comfortable Shoes
	Then Click on My Items tab
	Then Enter the text in Add your item here text box <entertext>
	Then Click on Deselects checkbox Book Magazine
	Then Click on Deselects checkbox Change of Cloths
	Then Click on Deselects checkbox Comfortable Shoes
	Then Click on Back arrow

	Then Click on Babys bag tab
	Then Click on Three in All tab
	Then Click on Three Muslin Cloths
	Then Click on Bibs tab
	Then Click on My Items tab
	Then Enter the text in Add your item here text box <entertext>
	Then Click on Deselects checkbox Three in All tab
	Then Click on Deselects checkbox Three Muslin Cloths
	Then Click on Deselects checkbox Muslin Cloths
	Then Click on Back arrow

	 
	Examples: 
		|username	           |password   |entertext   |                                                 
		|dev_qa@email.com    |12345678   |Shoping     |    
		
		
@Contractions
Scenario Outline: Login using valid username and valid password and click on Contractions tab

  Given Click On Login button 
	When Click on Ok Button
	When Enter the User Name <username>
	When Enter the Password <password>
	When Click on Continue Button
  When Click on More tab 		
	Then Click on Contractions tab
	Then Click on Clock icon to start
	Then Click on Alert popup
	Then Click on Stop Button
	Then Click on OK shown on pop up
	Then Click on Clock icon to start
	Then Click on Stop Button
	Then Scroll down to view overview and Contraction Info
	Then Switch the tabs from Last 3 to Last 5 or All
	Then Swipe any record shown in session history to delete
	Then Click on back arrow

		
	Examples: 
		|username	           |password   |                                                
		|dev_qa@email.com    |12345678   | 	
		
		