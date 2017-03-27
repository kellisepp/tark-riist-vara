package romaniancoder.booking;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RidesReg {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String lahtekoht;
	private String sihtkoht;
	private long kuupaev;
	private long kellaaeg;
	private int vabaruum;
	private String yhik;
	private String soidukiliik;
	private String lisainfo;
    public RidesReg(){}

    public RidesReg(String lahtekoht, String sihtkoht, long kuupaev, long kellaaeg, int vabaruum, String yhik,
			String soidukiliik, String lisainfo){
    	this.lahtekoht = lahtekoht;
		this.sihtkoht = sihtkoht;
		this.kuupaev = kuupaev;
		this.kellaaeg = kellaaeg;
		this.vabaruum = vabaruum;
		this.yhik = yhik;
		this.soidukiliik = soidukiliik;
		this.lisainfo = lisainfo;
    }



    public String getLahtekoht() {
		return lahtekoht;
	}

	public String getSihtkoht() {
		return sihtkoht;
	}

	public long getKuupaev() {
		return kuupaev;
	}

	public long getKellaaeg() {
		return kellaaeg;
	}

	public int getVabaruum() {
		return vabaruum;
	}

	public String getYhik() {
		return yhik;
	}

	public String getSoidukiliik() {
		return soidukiliik;
	}

	public String getLisainfo() {
		return lisainfo;
	}

	public long getId() {
        return id;
    }
}
