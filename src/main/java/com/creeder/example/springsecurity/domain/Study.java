package com.creeder.example.springsecurity.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.ToString;

@Entity
@Data
public class Study {
	@Id
	@GeneratedValue
	private Long id;

	private String name;
	
	@Column(name="accountid")
	private Long accountId;
	
	
	@ManyToOne
	@JoinTable(name = "account_study", //조인테이블명
    joinColumns = @JoinColumn(name="accountid"),  //외래키
    inverseJoinColumns = @JoinColumn(name="id") //반대 엔티티의 외래키
    )
	private Account account;

}
