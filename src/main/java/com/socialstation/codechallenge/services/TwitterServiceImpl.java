package com.socialstation.codechallenge.services;

import com.socialstation.codechallenge.models.Tweet;

import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by davidcolangelo on 12/16/21 for codechallenge. All rights reserved, this code
 * may be subject to copywright or other associated protections. Do not copy without
 * permission from the publisher.
 */
@Service
public class TwitterServiceImpl implements TwitterService{
	String key;

	TwitterServiceImpl(){
		try {
			BufferedReader keyReader = new BufferedReader(new FileReader("src/main/resources/twitterKey.txt")); //pull key from src/main/resources
			key = keyReader.readLine();
			keyReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
    @Override
    public List<Tweet> getTweets(String twitterUserId) {
    	String result = "";
    	try {
			URL url = new URL("https://api.twitter.com/2/users/15028747/mentions"); //pull required data
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestProperty("Authorization", String.format("Bearer %s", key));
			BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			
			result = in.readLine().split("\\[")[1].split("\\]")[0]; //split up data into usable information
			
			
			in.close();
		} catch (IOException e) {
			return null;
		} 
    	finally {
    		
    	}
    	String[] rawTweets = result.substring(1, result.length() - 1).split("\\},\\{");
    	List<Tweet> tweets = new ArrayList<Tweet>();
    	for(int i = 0; i < Math.min(rawTweets.length, 25); i++) { //compile as Tweet objects
			tweets.add(new Tweet(rawTweets[i].substring(6, 25), rawTweets[i].substring(37)));
		} 
        
        return tweets;
    }
}
