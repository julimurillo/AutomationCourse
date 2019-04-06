Feature: Search jobs on the page elempleo
		I want to find jobs with a keyword
	
	Scenario: Search Successful
		Given I want to find jobs with a keyword	
		When I search for jobs containing contador
		Then I should only see items related to contador 
		And save this in a .txt file