package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Customer;
@Repository
public interface CustomerRegisterRepository extends JpaRepository<Customer, Integer> {
	public Customer findByUserName(String userName);
	public Customer findByUserNameAndPassword(String userName,String password);
}
