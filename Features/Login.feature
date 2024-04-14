Feature: Login scenario

@login
Scenario: Enter only username and click on login button
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then user waits for Element "Username"
Then User Enter into text box "Username" "teena@raghav.com"
Then Click on the button "Login"
Then User verifies the message "Error" "Please enter your password."

@login 
Scenario: Enter valid username and valid password
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then user waits for Element "Username"
Then User Enter into text box "Username" "teena@raghav.com"
Then User Enter into text box "Password" "pritishtina@1"
Then Click on the button "Login"
Then User is on "HomePage"


@login
Scenario: Enter valid username and valid password and click on Remember me checkbox
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then user waits for Element "Username"
Then User Enter into text box "Username" "teena@raghav.com"
Then User Enter into text box "Password" "pritishtina@1"
Then User Checked the checkbox "RememberMe"
Then Click on the button "Login"
Then User is on "HomePage"
Then Click on the button "Usermenu"
Then Click on the button "Logout"
Then User waits to load page
Then User is on "LoginPage"

@login
Scenario: Test Forgot password link
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User Click On the Link "Forgot Your Password?"
Then User Enter into text box "Username2" "teena@raghav.com"
Then Click on the button "Continue"
Then Click on the button "ReturnToLogin"
Then User is on "LoginPage"


@login
Scenario: Enter invalid username and invalid password 
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then user waits for Element "Username"
Then User Enter into text box "Username" "teena@ragh.com"
Then User Enter into text box "Password" "pdhj"
Then Click on the button "Login"
Then User verifies the message "Error" "Please check your username and password. If you still can't log in, contact your Salesforce administrator."
