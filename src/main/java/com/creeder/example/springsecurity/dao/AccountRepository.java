package com.creeder.example.springsecurity.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.creeder.example.springsecurity.domain.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, String> {
	@Query(value = "select id, password, username from account", nativeQuery=true)
	List<Account> searchParamRepo();
	
	Account findByUsername(String username);
}
