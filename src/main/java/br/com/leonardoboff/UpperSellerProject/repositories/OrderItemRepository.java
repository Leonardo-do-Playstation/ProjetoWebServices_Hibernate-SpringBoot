package br.com.leonardoboff.UpperSellerProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.leonardoboff.UpperSellerProject.entities.OrderItem;
import br.com.leonardoboff.UpperSellerProject.entities.pk.OrderItemPK;

@Repository 
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
