package br.com.leonardoboff.UpperSellerProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.leonardoboff.UpperSellerProject.entities.Order;

@Repository 
public interface OrderRepository extends JpaRepository<Order, Long> {

}
