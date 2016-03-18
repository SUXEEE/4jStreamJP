import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitAddress {
	public static String splitAddress(String text) { 
		//String pattern = "^(北海道|青森県|岩手県|宮城県|秋田県|山形県|福島県|茨城県|栃木県|群馬県|埼玉県|千葉県|東京都|神奈川県|)";
		String pattern2 = "(...??[都道府県])";
		String pre = null;
		Pattern p = Pattern.compile(pattern2); 
		Matcher m = p.matcher(text);
		List<String> list = new ArrayList<String>();
		
		if(m.find()){ 
			//System.out.println("suxeee");
			pre = m.group(1);
		}
		return pre;
		}
}
