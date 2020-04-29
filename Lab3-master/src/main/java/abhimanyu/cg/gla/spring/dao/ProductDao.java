package abhimanyu.cg.gla.spring.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import abhimanyu.cg.gla.spring.entity.Product;



public interface ProductDao extends JpaRepository<Product, Integer> {

}