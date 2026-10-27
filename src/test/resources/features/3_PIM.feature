Feature: Addition and Deletion of Employees  
  
  Scenario: To view the Employees Info and to Edit their details
  	When User clicks the Employee List link
  	And User clicks on the search button
  	Then User should be logged out from the application

  Scenario: User navigate to Admin page from PIM page
  	When User clicks on the Admin page icon from the PIM page
  	Then User should be navigated to the Admin page