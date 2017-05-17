package romaniancoder.booking;

import org.junit.runners.Parameterized.Parameters;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.*;

import static org.hamcrest.BaseMatcher.*;



public class RideTest {
	 private RidesRepository ridesRepository;
	 
	RidesReg viljandiTartu;
     RidesReg kuressaareTallinn;
	@Before
	public void initObjects() {
		viljandiTartu = new RidesReg("Viljandi","Tartu","2017-05-30","12:30",7,"kg","kaubik","Helistada 1234567");
		kuressaareTallinn = new RidesReg("Kuressaare","Tallinn","2017-06-15","16:30",7,"EA","kaubik","Helistada 1234567");
		
	}

	   

	    @Test
	    public void SihtkohtShouldReturnSihtkoht() {
	        
	    	
	        assertThat(viljandiTartu.getSihtKoht(),is(equalTo("Tartu")));
	    }
	    @Test
	    public void SihtkohtSReturnSihtkoht() {
	        
	    	
	        assertThat(viljandiTartu.getLahteKoht(),is(equalTo("viljandi")));
	    }


	}


