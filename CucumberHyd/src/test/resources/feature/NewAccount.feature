#Feature: Registration functionality
#
#Scenario: User creates an account only with mandatory fields
#Given User navigates to Register Account page
#When User enters the details into below fields
#|firstName	|Allam												|
#|lastName		|purushotham										|
#|emailId      |purushothamallam10@gmail.com|
#|telephone	|8886945004									|
#|password		|888@Hello											|
#And User selects Privacy Policy
#And User clicks on Continue button
#Then User account should get created successfully
#
#Scenario: User creates an account with all fields
#Given User navigates to Register Account page
#When User enters the details into below fields
#|firstName	|Allam												|
#|lastName		|purushotham										|
#|emailId      |purushothamallam11@gmail.com|
#|telephone	|8886945004									|
#|password		|888@Hello									|
#And User selects Yes for Newsletter
#And User selects Privacy Policy
#And User clicks on Continue button
#Then User account should get created successfully
#
#
#Scenario: User creates an account with duplicate email fields
#Given User navigates to Register Account page
#When User enters the details into below fields with duplicate email
#|firstName	|Allam												|
#|lastName		|purushotham										|
#|emailId      |purushothamallam54@gmail.com|
#|telephone	|8886945004									|
#|password		|888@Hello									|
#And User selects Yes for Newsletter
#And User selects Privacy Policy
#And User clicks on Continue button
#Then User should get a proper warning about duplicate email
#
#Scenario: User creates an account without filling any details
#Given User navigates to Register Account page
#When User dont enter any details into fields
#And User clicks on Continue button
#Then User should get proper warning messages for every mandatory field