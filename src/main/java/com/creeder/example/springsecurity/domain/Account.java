package com.creeder.example.springsecurity.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "Account")
@Table(name = "ACCOUNT", uniqueConstraints = { @UniqueConstraint( // 추가
		name = "NAME_AGE_UNIQUE", columnNames = { "NAME", "AGE" }) })
@Getter
@Setter
public class Account {
	@Id
	@Column(name = "ID")
	private String id;

	@Column(name = "NAME", nullable = false, length = 10)
	private String username;

	private Integer age;

	@Column(nullable = false, name = "password")
	private String password;

	@Enumerated(EnumType.STRING)
	private RoleType roleType;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastModifiedDate;

	private String description;

}

enum RoleType {
	ADMIN, USER
}