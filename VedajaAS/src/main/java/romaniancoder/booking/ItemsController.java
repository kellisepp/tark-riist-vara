package romaniancoder.booking;

import java.util.Calendar;
import java.util.List;

import org.jsondoc.core.annotation.Api;
import org.jsondoc.core.annotation.ApiMethod;
import org.jsondoc.core.annotation.ApiPathParam;
import org.jsondoc.core.pojo.ApiStage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/items")
@Api(
        name = "Rides API",
        description = "Provides a list of methods that manage ride registrations",
        stage = ApiStage.RC)
public class ItemsController {
	
	 private ItemsRepository itemsRepository;
	 
	 @Autowired
	    public ItemsController(ItemsRepository itemsRepository){
	        this.itemsRepository = itemsRepository;
	    }
	
	 @RequestMapping(value = "/create", method = RequestMethod.POST,consumes = "application/json")
	    @ApiMethod(description = "Create a ride and save it to database")
	    public List<ItemsReg> create(@RequestBody ItemsReg itemsReg){
	        itemsRepository.save(itemsReg);

	        return itemsRepository.findAll();
	    }
	  @RequestMapping(value = "/all", method = RequestMethod.GET)
	    @ApiMethod(description = "Get all registrated rides from the database")
	    public List<ItemsReg> getAll(){
	        return itemsRepository.findAll();
	    }

	  @RequestMapping(value = "/findbylk/{lahteKoht}", method = RequestMethod.GET)
	    @ApiMethod(description = "Get registrated rides from the database filtered by lahteKoht")
	    public List<ItemsReg> findByLahteKoht(@ApiPathParam(name="lahteKoht")@PathVariable String lahteKoht){
		  	  
	  return itemsRepository.findByLahteKoht(lahteKoht);

	  }
	  @RequestMapping(value = "/findbylksk/{lahteKoht}&{sihtKoht}", method = RequestMethod.GET)
	    @ApiMethod(description = "Get registrated rides from the database filtered by sihtKoht and lahteKoht")
	    public List<ItemsReg> findByLahteKohtAndSihtKoht(@Param("lahteKoht") String lahteKoht,@Param("sihtKoht") String sihtKoht){
		  	  
	  return itemsRepository.findByLahteKohtAndSihtKoht(lahteKoht,sihtKoht);

	  }
	  

	
	  
	  public void removeOldItems() {
	        Calendar cal = Calendar.getInstance();
	        cal.add(Calendar.DATE,-1);

	        java.sql.Date oneYear = new java.sql.Date(cal.getTimeInMillis());

	        ItemsRepository.removeOlderThan(oneYear);


	    }
}
