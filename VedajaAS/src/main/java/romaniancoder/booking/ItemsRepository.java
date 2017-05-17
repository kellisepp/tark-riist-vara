package romaniancoder.booking;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemsRepository extends JpaRepository<ItemsReg, Long>{

	List<ItemsReg>findByLahteKoht(String lahteKoht);
	List<ItemsReg>findBySihtKoht(String sihtKoht);
	//List<ItemsReg>findBySihtKohtLahteKohtdate(String sihtKoht, String lahteKoht);
	List<ItemsReg>findByDate(String date);
	List<ItemsReg> findByLahteKohtAndSihtKoht(String lahteKoht, String sihtKoht);
	public List<ItemsReg> findAllByOrderByDateDesc();
	List<ItemsReg>findById(Integer id);
	@Transactional
   	List<ItemsReg> removeById(Integer id);

	
	
}
