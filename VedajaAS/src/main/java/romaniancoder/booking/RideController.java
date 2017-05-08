package romaniancoder.booking;

import org.jsondoc.core.annotation.Api;
import org.jsondoc.core.annotation.ApiMethod;
import org.jsondoc.core.annotation.ApiPathParam;
import org.jsondoc.core.pojo.ApiStage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rides")
@Api(
        name = "Rides API",
        description = "Provides a list of methods that manage ride registrations",
        stage = ApiStage.RC)
public class RideController {
//ah
    private RidesRepository ridesRepository;

    @Autowired
    public RideController(RidesRepository ridesRepository){
        this.ridesRepository = ridesRepository;
    }
    
    
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ApiMethod(description = "Get all registrated rides from the database")
    public List<RidesReg> getAll(){
        return ridesRepository.findAll();
    }

  
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ApiMethod(description = "Get all registrated rides from the database")
    public List<RidesReg> findById(@ApiPathParam(name = "id") @PathVariable Integer id){
        return ridesRepository.findById(id);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST,consumes = "application/json")
    @ApiMethod(description = "Create a ride and save it to database")
    public List<RidesReg> create(@RequestBody RidesReg ridesReg){
        ridesRepository.save(ridesReg);

        return ridesRepository.findAll();
    }

    
    
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    @ApiMethod(description = "Remove registrated ride with the provided ID from the database")
    public List<RidesReg> remove(@ApiPathParam(name = "id") @PathVariable long id){
        ridesRepository.delete(id);

        return ridesRepository.findAll();
    }
}
