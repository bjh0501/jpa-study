package com.creeder.example.springsecurity.config;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.creeder.example.springsecurity.domain.Account;
import com.creeder.example.springsecurity.domain.Address;
import com.creeder.example.springsecurity.domain.Study;

@Component
@Transactional
public class JpaRunner{
//	@PersistenceContext
//	EntityManager entityManager;

//	@Override
//	public void run(ApplicationArguments args) throws Exception {
//		// TODO Auto-generated method stub
//		Account account = new Account();
//		account.setUsername("junseo");
//		account.setPassword("hiber");
//		
//		Study study = new Study();
//		study.setName("spring data jpa");
//		
//		Session session = entityManager.unwrap(Session.class);
//		session.save(account);
//		session.save(study);
//	}
//	

}
