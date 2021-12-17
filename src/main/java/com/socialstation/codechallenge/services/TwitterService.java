package com.socialstation.codechallenge.services;

import com.socialstation.codechallenge.models.Tweet;

import java.util.List;

/**
 * Created by davidcolangelo on 12/16/21 for codechallenge. All rights reserved, this code
 * may be subject to copywright or other associated protections. Do not copy without
 * permission from the publisher.
 */
public interface TwitterService {
    List<Tweet> getTweets(String twitterUserId);
}
