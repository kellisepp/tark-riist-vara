package romaniancoder.booking;
import static org.hamcrest.Matchers.not;

import java.util.Arrays;


import org.apache.http.HttpStatus;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.*;
import org.springframework.boot.test.SpringApplicationConfiguration;


import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.jayway.restassured.RestAssured;
import static com.jayway.restassured.RestAssured.when;


@RunWith(SpringJUnit4ClassRunner.class)   // 1
@SpringApplicationConfiguration(classes = BookingDemoApplication.class)   // 2
@WebAppConfiguration
@IntegrationTest("server.port:0")   // 4
public class ItemsControllerTest {
 
    @Autowired   // 5
    ItemsRepository itemsRepository;
 
    ItemsReg viljandiTartu;
    ItemsReg kuressaareTallinn;

    @Value("${local.server.port}")   // 6
    int port;
 
    @Before
    public void setUp() {
        // 7
        viljandiTartu = new ItemsReg("Viljandi","Tartu","2017-04-20","12:30","külmik","kg","kaubik","Helistada 1234567");
        kuressaareTallinn = new ItemsReg("Kuressaare","Tallinn","2017-04-19","16:30","kartul","sdsds","sd","Helistada 1234567");
     

        itemsRepository.save(Arrays.asList(viljandiTartu, kuressaareTallinn));
        

        RestAssured.port = port;
}
  
 @Test
    public void canFetchRides() {
    	
        Integer viljandiTartuId = viljandiTartu.getId();

        when().
	        	get("/items/{id}", viljandiTartuId).
	        then().
		     
		        
		        body("id", Matchers.hasItems(viljandiTartuId));
}

   @Test
	public void canFetchAll() {
		   
	        when().
	                get("items/all").
	        then().
	        statusCode(HttpStatus.SC_OK).
	                body("sihtKoht", Matchers.hasItems("Tallinn", "Tartu"));
	    }
   @Test
   public void WrongSihtKohtFilterBySihtKoht(){
	   when().
	   			get("items/destination/Tallinn").
	   	then().
	   		statusCode(HttpStatus.SC_OK).body("sihtKoht", Matchers.not(Matchers.hasItem("Tartu")));
   }
   @Test
   public void FilterBySihtKoht(){
	   when().
	   			get("items/destination/Tallinn").
	   	then().
	   		statusCode(HttpStatus.SC_OK).body("sihtKoht", Matchers.hasItem("Tallinn"));
   }
	 
    @Test
    public void canDeleteKureTln() {
        Integer kuressaareTallinnId = kuressaareTallinn.getId();
 
        when()
                .get("items/delete/{id}", kuressaareTallinnId).
        then().
        statusCode(HttpStatus.SC_OK);
    }
    
}
