package romaniancoder.booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DatabaseSeeder implements CommandLineRunner {
    private RidesRepository ridesRepository;

    @Autowired
    public DatabaseSeeder(RidesRepository ridesRepository){
        this.ridesRepository = ridesRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
    	
        List<RidesReg> rides = new ArrayList<>();

        
		
		
        ridesRepository.save(rides);
    }
}
