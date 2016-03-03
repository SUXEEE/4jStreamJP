import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "逆ジオ")
public class ReverseGeoJp {

    @XmlElement(name = "住所")
    public String name;

    @XmlElement(name = "年齢")
    public int age;
}
