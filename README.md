# code-challenge

Welcome to the Social Station Coding Challenge the following exercise allows you to show us what your made of. There are
no right answers here so feel free to build this challenge as you want there are a few system level requirements and
a some tests that need to pass but the rest is up to you.

## Base Requirements
- The challenge must be done in Java using the shell project provided
- You may use any java feature you like or include libraries of your choosing to help you out. The project is maven
based so if you add libraries please make sure to add them to the `pom.xml` so that the project can be run elsewhere 
- Please do not hesitate to leave comments in your code explaining what you did
- Please format your code cleanly
- You must complete at least Tasks 1 and 2, the rest are optional and give you a chance to show of other skills 

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
To keep everything reasonable only scrape in 1 Month of data or 25 reviews (which ever yields the most). 

### Task 2 Small Bonus 
Booking reviews allow the user to provide us with an overall score, calculat the average overall score of the reviews 
you parsed and return it with the dataset. 