package romaniancoder.booking;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ItemsReg {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String lahteKoht;
	private String sihtKoht;
	private String date;
	private String time;
	private String item;
	private String uhik;
	private String additionalInfo;
    public ItemsReg(){}

    public ItemsReg(long id, String lahteKoht, String sihtKoht, String date, String time, String item, String uhik,
	String additionalInfo){
    	this.id = id;
		this.sihtKoht = sihtKoht;
		this.lahteKoht = lahteKoht;
		this.date = date;
		this.time = time;
		this.item =  item;
		this.uhik = uhik;
		this.additionalInfo = additionalInfo;
    }

	public long getId() {
		return id;
	}

	public String getLahteKoht() {
		return lahteKoht;
	}

	public String getSihtKoht() {
		return sihtKoht;
	}

	public String getDate() {
		return date;
	}

	public String getTime() {
		return time;
	}

	public String getItem() {
		return item;
	}

	public String getUhik() {
		return uhik;
	}

	public String getAdditionalInfo() {
		return additionalInfo;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setLahteKoht(String lahteKoht) {
		this.lahteKoht = lahteKoht;
	}

	public void setSihtKoht(String sihtKoht) {
		this.sihtKoht = sihtKoht;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public void setUhik(String uhik) {
		this.uhik = uhik;
	}

	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}
    
}
