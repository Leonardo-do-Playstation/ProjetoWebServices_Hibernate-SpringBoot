package br.com.leonardoboff.UpperSellerProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.leonardoboff.UpperSellerProject.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
