# code-challenge

Welcome to the Social Station Coding Challenge. There are
no right answers here so feel free to build this challenge as you want there are a few system level requirements and
a some tests that need to pass but the rest is up to you.

## Base Requirements
- The challenge must be done in Java using the shell project provided
- You may use any java feature you like or include libraries of your choosing to help you out. The project is maven
based so if you add libraries please make sure to add them to the `pom.xml` so that the project can be run elsewhere 
- Please do not hesitate to leave comments in your code explaining what you did
- Please format your code cleanly
- You must complete at least Tasks 1 and 2, the rest are optional and give you a chance to show of other skills 

## Before You Code
To make it easier for review please create a branch on the project that you commit and checkin all your work to. When 
you are done with your code create a PR from that branch to `main` and email us to let us know you have completed it. 
_Note_: you are free to create the PR when ever you like if its easier for you to see changes that way but it will only 
be reviewed when you request it.  


## Task 1
Get some tweets and replies! This is a pretty straightforward use case. We want to be able to tweet back to people after 
they reply to one of our tweets. The first step is to pull in your tweets and all the replies for each tweet. All of 
this data is readily accessible through the Twitter API and you should only use the official API to pull information. 
The endpoint located at `/tweets` takes in `twitter_user_id` and should return all the tweets with responses for that 
user. 

### Note 1: 
To keep the data set reasonable and API responses snappy please only pull 1 week worth of data or the most recent 25 
tweets. 

## Task 2 
Pull in a few booking reviews! This one is a bit more complicated. Booking.com does not provide an API for pulling in 
review information but our client wants to keep tabs on how their hotel is doing. To keep tabs they want to pull in 
review data. Scrape booking.com to grab reviews for this hotel `https://www.booking.com/hotel/us/residence-inn-by-marriott-norwalk.html#tab-reviews`. 
To keep everything reasonable only scrape in 1 Month of data or 25 reviews (which ever yields the most reviews). 

### Task 2 Small Bonus 
Booking reviews allow the user to provide us with an overall score, calculate the average overall score of the reviews 
you parsed and return it with the reviews. _Hint: you will need to change the response type if you implement this_

## BONUS
If you have some extra time or want to show of your skills here are some bonus tasks you can do, you may do any 
any combination of these tasks if you chose to add them. 

## Bonus 1
Build an endpoint that allows me to tweet back at a response to my initial tweet. This endpoint should take in the 
content of the tweet and post it out to Twitter appropriately in response to the tweet response. 

## Bonus 2 
To help manage the end users twitter account build an endpoint that allows us to schedule a tweet for the user that 
will post the tweet out at a specified time. 

* DO NOT actually build a full-blown scheduler here, simply add a class to the `models` folder that represents the 
database entity you would use for such a task. 
* Keep in mind the various states the tweet can be in at any time and handle this appropriately 

## Bonus 3 
Runtimes are important as is portability so for the final bonus, build a docker image that is capable of running the 
compiled `.war` file. This will allow us to make sure every one runs it the same way locally but would also 
theoretically allow us to deploy it to the cloud easily.  

## Useful Info 
Always remember to read to the end of the README! Here are some useful things to keep in mind working through this 
- There are lots of helpful libraries for things like HTML parsing, making network requests and even interating with
particular API's. Don't hesitate to use them they are not off limits in the real world so they are not off limits here. 
- We use a service oriented architecture but you should feel free to extend that as you need, good code modularization
and demonstrations of the various things that make java great in practice are never a bad idea 
- You should handle predicable errors gracefully and unpredictable ones coherently
- Its ok to use print statements for logging purposes
