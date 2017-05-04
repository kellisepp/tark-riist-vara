package romaniancoder.booking;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemsRepository extends JpaRepository<ItemsReg, Long>{

	List<ItemsReg>findByLahteKoht(String lahteKoht);
	
	
}
