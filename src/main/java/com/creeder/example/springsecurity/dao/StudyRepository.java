package com.creeder.example.springsecurity.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.creeder.example.springsecurity.domain.Study;

@Repository
public interface StudyRepository extends JpaRepository<Study, String> {
//	Study findByUsername(String username);
	Study findByAccountId(Long accountId);
}
