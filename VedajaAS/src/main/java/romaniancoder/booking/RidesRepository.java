package romaniancoder.booking;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import javax.transaction.Transactional;

@Repository
public interface RidesRepository extends JpaRepository<RidesReg, Long>{
	
	List<RidesReg>findById(Integer id);
	public List<RidesReg> findAllByOrderByDateDesc();
	List<RidesReg>findBySihtKoht(String sihtKoht);
	@Transactional
   	List<RidesReg> removeById(Integer id);
    
}

