package br.com.leonardoboff.UpperSellerProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.leonardoboff.UpperSellerProject.entities.Product;

@Repository 
public interface ProductRepository extends JpaRepository<Product, Long> {

}
