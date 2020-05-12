Feature: sms4India login

Scenario Outline: Validate login credentials with invalid data
Given launch site using "<browser>"
When "<mobNo>" and "<password>" are entered
And login is clicked
Then respective "<error>" should be displayed
When close site

Examples:
|		browser		|				 mobNo				|				password		|									error											|
|   chrome		|				 							|				hariom			|				Enter your mobile number						|
|   chrome		|	 			99865					|				hariom			|				Enter valid mobile number						|
|   chrome		|			5632147899			|				hariom			|				 Invalid Mobile Number  						|
|   chrome		|				56321					|				hariom			|				Enter valid mobile number						|
|   chrome		|			9876879874			|				hariom			|Your mobile number is not register with us.|		
|   chrome		|			8247438096			|										|				       Enter password								|
|   chrome		|			8247438096			|				hariom			|	Incorrect number or password! Try Again.	|
|   firefox		|				 							|				hariom			|				Enter your mobile number						|
|   firefox		|	 			99865					|				hariom			|				Enter valid mobile number						|
|   firefox		|			5632147899			|				hariom			|				 Invalid Mobile Number  						|
|   firefox		|				56321					|				hariom			|				Enter valid mobile number						|
|   firefox		|			9876879874			|				hariom			|Your mobile number is not register with us.|		
|   firefox		|			8247438096			|										|				       Enter password								|
|   firefox		|			8247438096			|				hariom			|	Incorrect number or password! Try Again.	|

@smoketest
Scenario Outline: Validate login credentials with valid data
Given launch site using "<browser>"
When "<mobNo>" and "<password>" are entered
And login is clicked
Then respective user account should be displayed
When close site
Examples:
|		browser		|				 mobNo				|				password		|
|   chrome		|			8247438096			|				Sarada12@		|
#|   firefox		|			8247438096			|				Sarada12@		|