Feature: Adatin Hotel booking Site

@reg1
Scenario: User Should enter the Valid Data to login
Given : user should Enter the valid url
And : As a user should enetr the valid username "<username>"
And : As user should enter the Valid Password  "<password>"
And : AS user should Click login button
Then : From Login page it will navigate to next page


Examples:
|username|password|
| kabilan|kabilan@1234|
|Kabilan|Kabilan@123|


@def
Scenario: User Should enter the Valid Data to login
Given : user should Enter the valid url
And : As a user should enetr the valid username "Kabilan"
And : As user should enter the Valid Password  "kabilan@123"
And : AS user should Click login button
Then : From Login page it will navigate to next page






















