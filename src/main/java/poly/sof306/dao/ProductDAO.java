package poly.sof306.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import poly.sof306.entity.Product;

public interface ProductDAO extends JpaRepository<Product, Integer> {
	
@Query("SELECT p FROM Product p WHERE p.category.id=:cid")
	List<Product> findCategoryById(String cid);

}
