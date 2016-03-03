import java.util.ArrayList;
import java.util.Date;

import twitter4j.FilterQuery;
import twitter4j.GeoLocation;
import twitter4j.StallWarning;
import twitter4j.Status;
import twitter4j.StatusDeletionNotice;
import twitter4j.StatusListener;
import twitter4j.TwitterException;
import twitter4j.TwitterStream;
import twitter4j.TwitterStreamFactory;

public class Streams {
	  
    public static void main(String[] args) throws TwitterException {
        TwitterStream twitterStream = new TwitterStreamFactory().getInstance();
//        Query query = new Query();
//        GeoLocation geo = new GeoLocation(35.69384, 139.703549);
//        query.setGeoCode(geo, 10.0, Query.KILOMETERS);
//        query.setCount(10);
        

        ArrayList[] prefectures=new ArrayList[47];
        for(ArrayList prf :prefectures){
        	prf = new ArrayList();
        }
        
        StatusListener listener = new StatusListener() {
            @Override
            public void onStatus(Status status) {
                Double lat = null;
                Double lng = null;
                String[] urls = null;
                String[] medias = null;
                
                GeoLocation location = status.getGeoLocation();
                              
                if( location != null ){
                    double dlat = location.getLatitude();
                    double dlng = location.getLongitude();
                    lat = dlat;
                    lng = dlng;
                }
                long id = status.getId(); 
                String text = status.getText();
                StringBuilder strbText = new StringBuilder();
                long userid = status.getUser().getId();
                String username = status.getUser().getScreenName();
                Date created = status.getCreatedAt();
                yahooReverseGeoCoder.setter(lat,lng);

                //swarm
//                if(text.matches(".*I'm at.*")){
//                	strbText.append("hoge "+text);
//                }
//                
//                else{
//                
//                }
                
                
                if(location != null){
                System.out.println( " loc" + "\n"
                					+ "lat= "  + lat + "\n"
                					+ "long= " + lng + "\n"
                					+ "username = " + username + "\n" +" text = " + text );
                }else{
                	//System.out.println( " No geo loc.");
                }
         }

            @Override
            public void onDeletionNotice(StatusDeletionNotice statusDeletionNotice) {
                System.out.println("Got a status deletion notice id:" + statusDeletionNotice.getStatusId());
            }

            @Override
            public void onTrackLimitationNotice(int numberOfLimitedStatuses) {
                System.out.println("Got track limitation notice:" + numberOfLimitedStatuses);
            }

            @Override
            public void onScrubGeo(long userId, long upToStatusId) {
                System.out.println("Got scrub_geo event userId:" + userId + " upToStatusId:" + upToStatusId);
            }

            @Override
            public void onStallWarning(StallWarning warning) {
                System.out.println("Got stall warning:" + warning);
            }

            @Override
            public void onException(Exception ex) {
                ex.printStackTrace();
            }
        };
        twitterStream.addListener(listener);
        //twitterStream.sample();
        
        
        //String[] track = { "東京" };
        double[][] locations = {new double[]{132.2,29.9},new double[]{146.1,46.20}};
        FilterQuery filter = new FilterQuery();	
        //filter.track( track );
        filter.locations( locations );
        twitterStream.filter( filter );
        
        
        
//        File file = new File("export.txt");
//		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
//		pw.println(hatenaMsg.toString());
//		pw.close();
    }
}
