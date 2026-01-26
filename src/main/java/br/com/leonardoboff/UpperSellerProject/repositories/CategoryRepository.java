package br.com.leonardoboff.UpperSellerProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.leonardoboff.UpperSellerProject.entities.Category;

@Repository 
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
