package com.creeder.example.springsecurity;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.transaction.Transactional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.creeder.example.springsecurity.dao.AccountRepository;
import com.creeder.example.springsecurity.dao.StudyRepository;
import com.creeder.example.springsecurity.domain.Account;
import com.creeder.example.springsecurity.domain.Study;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
public class AccountController {
	private final AccountRepository accountRepository;
	private final StudyRepository studyRepository;

	@PersistenceContext
	private EntityManager entityManager;

	@GetMapping("find")
	public Account searchParamMember(@RequestParam(value = "name") String username) {
		System.out.println(entityManager.hashCode());
		return accountRepository.findByUsername(username);
	}

	@GetMapping("save")
	@Transactional
	public String saveParamMember(@RequestParam(value = "name") String name) {
		Account account = new Account();
		account.setPassword("1234");
		account.setUsername(name);
		entityManager.persist(account);
		entityManager.detach(account);
		
		account.setPassword("123456");
		account.setUsername(name);
		entityManager.persist(account);

		return "0";
	}

	@GetMapping("list")
	public String listAllAccount() {
		System.out.println(entityManager.hashCode());
		return accountRepository.findAll().toString();
	}

	@GetMapping("joinlist")
	@ResponseBody
	@Transactional
	public String joinListAllAccount() {
		Long id=  4l;
		// manytoone으로 테이블 만든후 만든테이블을 셀렉트?
		Account account = new Account();
		account.setUsername("텟트bc");
		account.setPassword("babcc");
		entityManager.persist(account);
		
		Study study = new Study();
		study.setName("과목32534");
		
		study.setAccountId(4l);
		entityManager.persist(study);
		study.setAccount(account);
		
		entityManager.close();

		return "TSET#";
	}
	
	@GetMapping("delete")
	@ResponseBody
	@Transactional
	public String joinListDeleteAccount() {
		Account account = entityManager.find(Account.class, 1l);
		
		entityManager.remove(account);
		
		account.setUsername("텟트bc123");
		account.setPassword("zxcxv");
		entityManager.persist(account);
				
		return "TSET#";
	}
}
