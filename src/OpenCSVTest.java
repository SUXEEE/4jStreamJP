import java.util.List;

public class OpenCSVTest {
	private  Opencsv sut = null;
    
    String userProfile=System.getProperty("user.home");
//    	fos = new FileOutputStream(userProfile+"/Documents/GitHub/tweetOfPrefecture.csv");  

	
    public void setUp() {
        sut = new Opencsv();
    }
    
    public void tearDown() {
        sut = null;
    }

    public void testReadFromCsvFile() {
    	List<TweetParameter>  list =sut.readFromCsvFile(userProfile+"/Documents/GitHub/tweetOfPrefecture.csv");
    }

}
