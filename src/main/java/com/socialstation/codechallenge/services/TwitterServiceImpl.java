package com.socialstation.codechallenge.services;

import com.socialstation.codechallenge.models.Tweet;
import org.hibernate.cfg.NotYetImplementedException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by davidcolangelo on 12/16/21 for codechallenge. All rights reserved, this code
 * may be subject to copywright or other associated protections. Do not copy without
 * permission from the publisher.
 */
@Service
public class TwitterServiceImpl implements TwitterService{

    @Override
    public List<Tweet> getTweets(String twitterUserId) {
        // TODO - Implement as described
        throw new NotYetImplementedException("Nothing here");
    }
}
