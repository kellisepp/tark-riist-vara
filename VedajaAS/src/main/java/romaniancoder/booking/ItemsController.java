package romaniancoder.booking;

import java.util.List;

import org.jsondoc.core.annotation.Api;
import org.jsondoc.core.annotation.ApiMethod;
import org.jsondoc.core.pojo.ApiStage;
import org.springframework.beans.factory.annotation.Autowired;
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


}
