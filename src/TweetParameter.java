
public class TweetParameter {
	private String prefecture, tweet1, tweet2, tweet3;
	private int tweetAll;
	public TweetParameter(String prefecture, String tweet1, String tweet2, String tweet3, int tweetAll) {
		this.prefecture = "";
		this.tweet1 = "";
		this.tweet2 = "";
		this.tweet3 = "";
		this.tweetAll = 0;
	}
//    public static final String[] getFieldName() {
//        return new String[]{"prefecture","tweetAll","tweet1","tweet2","tweet3"};
//    }
	public String getPrefecture() {
		return prefecture;
	}
	public void setPrefecture(String prefecture) {
		this.prefecture = prefecture;
	}
	public String getTweet1() {
		return tweet1;
	}
	public void setTweet1(String tweet1) {
		this.tweet1 = tweet1;
	}
	public String getTweet2() {
		return tweet2;
	}
	public void setTweet2(String tweet2) {
		this.tweet2 = tweet2;
	}
	public String getTweet3() {
		return tweet3;
	}
	public void setTweet3(String tweet3) {
		this.tweet3 = tweet3;
	}
	public int getTweetAll() {
		return tweetAll;
	}
	public void setTweetAll(int tweetAll) {
		this.tweetAll = tweetAll;
	}

}
