package com.pluralsight.proxy;

import java.util.List;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterExample {

	private static final String TWITTER_CONSUMER_KEY = "NcoaBPbSKxkCJhbDyqzjQKVjr";
	private static final String TWITTER_SECRET_KEY = "23V1G25UTDjeWZTNU3maGfeLrVigSPK6JnJHDIBNDRR5FC9cHS";
	private static final String TWITTER_ACCESS_TOKEN = "15022283-LBY37j2wmYiqhtPNixqVJv0B84FZEroyxvmsjaywl";
	private static final String TWITTER_ACCESS_TOKEN_SECRET = "bmclfpFMqKnmzoqztnSm41WxXalkW5K2tUdnXVxIAG1Es";
	
	public static void main (String args[]) {
		
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true)
		    .setOAuthConsumerKey(TWITTER_CONSUMER_KEY)
		    .setOAuthConsumerSecret(TWITTER_SECRET_KEY)
		    .setOAuthAccessToken(TWITTER_ACCESS_TOKEN)
		    .setOAuthAccessTokenSecret(TWITTER_ACCESS_TOKEN_SECRET);
		TwitterFactory tf = new TwitterFactory(cb.build());
		Twitter twitter = tf.getInstance();
		try {
		    Query query = new Query("bh5k");
		    QueryResult result;
		    do {
		        result = twitter.search(query);
		        List<Status> tweets = result.getTweets();
		        for (Status tweet : tweets) {
		            System.out.println("@" + tweet.getUser().getScreenName() + " - " + tweet.getText());
		        }
		    } while ((query = result.nextQuery()) != null);
		    System.exit(0);
		} catch (TwitterException te) {
		    te.printStackTrace();
		    System.out.println("Failed to search tweets: " + te.getMessage());
		    System.exit(-1);
		}
	}
	
}
