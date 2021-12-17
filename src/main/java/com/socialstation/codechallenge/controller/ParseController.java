package com.socialstation.codechallenge.controller;

import com.socialstation.codechallenge.controller.responses.InfoResponse;
import com.socialstation.codechallenge.models.BookingReview;
import com.socialstation.codechallenge.models.Tweet;
import org.hibernate.cfg.NotYetImplementedException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by davidcolangelo on 12/16/21 for codechallenge. All rights reserved, this code
 * may be subject to copywright or other associated protections. Do not copy without
 * permission from the publisher.
 */
@RestController
public class ParseController {

    /**
     * Make sure the system is up and running
     */
    @RequestMapping(method = RequestMethod.GET, path ="/info")
    public InfoResponse getInfo(){
        return new InfoResponse("Hello!");
    }


    @RequestMapping(method=RequestMethod.GET, path="/tweets")
    public List<Tweet> getTweets(String twitter_user_id){
        // TODO - Implement this function as described in the readme
        throw new NotYetImplementedException("Nothing Here!");
    }

    @RequestMapping(method=RequestMethod.GET, path="/booking-reviews")
    public List<BookingReview> getBookingReviews(){
        // TODO - Implement this function as described in the readme
        throw new NotYetImplementedException("Nothing Here!");
    }

    /**
     * BONUS
     *
     * The endpoints below are optional, this is a good way to show off your skills if you have some extra time.
     */

    @RequestMapping(method=RequestMethod.POST, path="/tweet")
    public Tweet TweetResponse(){
        // TODO - Implement this function as described in the readme
        throw new NotYetImplementedException("Nothing Here!");
    }

}
