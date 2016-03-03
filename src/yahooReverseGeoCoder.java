import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

//import org.apache.http.client.HttpClient;
//import org.apache.http.client.methods.HttpGet;
//import org.apache.http.impl.client.DefaultHttpClient;

public class yahooReverseGeoCoder {

	public static void setter(Double lat, Double lng) {
		// TODO Auto-generated method stub
		
		try {
			URL url = new URL("http://reverse.search.olp.yahooapis.jp/OpenLocalPlatform/V1/reverseGeoCoder?lat="+lat+"&lon="+lng+"&appid=dj0zaiZpPTRITWljcDkzdExTaCZzPWNvbnN1bWVyc2VjcmV0Jng9ZGE-");
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			String strTemp = "";
			while (null != (strTemp = br.readLine())) {
				System.out.println(strTemp);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		//("http://reverse.search.olp.yahooapis.jp/OpenLocalPlatform/V1/reverseGeoCoder?lat="+lat+"&lon="+lng+"&appid=dj0zaiZpPTRITWljcDkzdExTaCZzPWNvbnN1bWVyc2VjcmV0Jng9ZGE-");
				
	}

}
