/*package romaniancoder.booking;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.aspectj.lang.annotation.Before;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.*;
import org.springframework.test.context.web.WebAppConfiguration;

import com.jayway.restassured.RestAssured;

@RunWith(SpringJUnit4ClassRunner.class)   // 1
@SpringApplicationConfiguration(classes = BookingDemoApplication.class)   // 2
@WebAppConfiguration
@IntegrationTest("server.port:0")   // 4
public class RideControllerTest {
 
    @Autowired   // 5
    RidesRepository ridesRepository;
 
    RidesReg viljandiTartu;
    RidesReg kuressaareTallinn;

    @Value("${local.server.port}")   // 6
    int port;
 
    @Before(value = "")
    public void setUp() {
        // 7
        viljandiTartu = new RidesReg(0,"Viljandi","Tartu","2017-05-30","12:30",7,"kg","kaubik","Helistada 1234567");
        kuressaareTallinn = new RidesReg(0,"Kuressaare","Tallinn","2017-06-15","16:30",7,"EA","kaubik","Helistada 1234567");
     
        ridesRepository.deleteAll();
        ridesRepository.save(Arrays.asList(viljandiTartu, kuressaareTallinn));

        RestAssured.port = port;
}
  
 @Test
    public void canFetchRides() {
    	
        long viljandiTartuId = viljandiTartu.getId();

	        when().
	        	get("/rides/{id}", viljandiTartuId).
	        then().
		     
		        body("sihtKoht", Matchers.is("Viljandi")).
		        body("id", Matchers.is(viljandiTartuId));
}

   @Test
	public void canFetchAll() {
		   
	        when().
	                get("rides/all").
	        then().
	                
	                body("sihtKoht", Matchers.hasItems("Viljandi", "Kuressaare"));
	    }
	 
    @Test
    public void canDeleteKureTln() {
        long kuressaareTallinnId = kuressaareTallinn.getId();
 
        when()
                .delete("/characters/{id}", kuressaareTallinnId).
        then().
                statusCode(HttpStatus.SC_NO_CONTENT);
    }
}
*/