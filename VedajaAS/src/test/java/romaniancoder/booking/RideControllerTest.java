package romaniancoder.booking;

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

@RunWith(SpringJUnit4ClassRunner.class)   // 1
@SpringApplicationConfiguration(classes = BookingDemoApplication.class)   // 2

@WebIntegrationTest("localhost:8084")   // 4
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
     
 
        // 8
        ridesRepository.deleteAll();
        ridesRepository.save(Arrays.asList(viljandiTartu, kuressaareTallinn));
 
        // 9
        //RestAssured.port = port;
    }
 
    // 10
    @Test
    public void canFetchMickey() {
    	
        long viljandiTartuId = viljandiTartu.getId();

                 ridesRepository.delete(viljandiTartuId);
                 assertEquals(1,ridesRepository.count());
                
                
              
    }
}
   //@Test
   /* public void canFetchAll() {
        when().
                get("rides/all").
        then().
                
                body("name", Matchers.hasItems("Mickey Mouse", "Minnie Mouse", "Pluto"));
    }
 
    @Test
    public void canDeletePluto() {
        Integer plutoId = pluto.getId();
 
        when()
                .delete("/characters/{id}", plutoId).
        then().
                statusCode(HttpStatus.SC_NO_CONTENT);
    }
}
*/