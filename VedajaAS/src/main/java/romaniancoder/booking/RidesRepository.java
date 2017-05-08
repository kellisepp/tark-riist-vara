package romaniancoder.booking;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RidesRepository extends JpaRepository<RidesReg, Long>{
	
	List<RidesReg>findById(Integer id);
    
}

