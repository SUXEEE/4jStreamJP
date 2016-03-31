import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitAddress {
	public static String splitAddress(String text) { 
		//String pattern = "^(北海道|青森県|岩手県|宮城県|秋田県|山形県|福島県|茨城県|栃木県|群馬県|埼玉県|千葉県|東京都|神奈川県|)";
		String pattern2 = "(\\s...??[都県]|北海道|京都府|大阪府)";
		//太宰府…道の駅…表参道
		String pre = null;
		Pattern p = Pattern.compile(pattern2); 
		Matcher m = p.matcher(text);
		if(m.find()){ 
			pre = m.group(1);
			pre = pre.trim();
		}
		return pre;
		}
}
