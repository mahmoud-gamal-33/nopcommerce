Feature: User Registration
I want to check that user can register successfully

Scenario Outline: User Registration 
Given user in homepage
When user click on register button
And input "<firstname>" ,"<lastname>","<email>" , "<password>"
Then user is registered now  
Examples:
|firstname |lastname |email|password|

|aa|ss|aa@ss.com|123123123|
|ww|dd|dd@ww.com|147147147|