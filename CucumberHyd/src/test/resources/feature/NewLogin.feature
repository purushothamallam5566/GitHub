#Feature: Validating login page
#
#Scenario Outline: Login with valid credentials
#Given User lunch application 
#And User click login page
#When uUser enters username and password
 #| Username | Password |
#| purushothaminfo71@gmail.com | 888@Hello |
#And User click submit button
#Then User should get successfully logged in
#
#
      #
#Scenario Outline: Login with Invalid credentials
#Given User lunch application 
#And User click login page
#When uUser enters Invalidusername and Invalidpassword
 #| Username | Password |
#| amotooricap99@gmail.com | 123456 |
#And User click submit button		
#Then User should get proper warning message about credentials mismatch.
#
#
#Scenario Outline: Login with Invalid username and valid passwordcredentials
#Given User lunch application 
#And User click login page
#When uUser enters Invalidusername and password
 #| Username | Password |
#| amotooricap99@gmail.com | 12345 |
#And User click submit button		
#Then User should get proper warning message about credentials mismatch.
#
#Scenario Outline: Login with valid username and Invalid passwordcredentials
#Given User lunch application 
#And User click login page
#When uUser enters valid username and Invalid password
 #| Username | Password |
#| amotooricap9@gmail.com | 123456 |
#And User click submit button		
#Then User should get proper warning message about credentials mismatch.
#
#Scenario Outline: Login without credentials
#Given User lunch application 
#And User click login page
#When uUser enters Not username and No password
#And User click submit button		
#Then User should get proper warning message about credentials mismatch.
#
#
#
#	