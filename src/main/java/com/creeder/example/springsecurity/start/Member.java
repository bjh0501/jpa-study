package com.creeder.example.springsecurity.start;

import javax.persistence.*; //**

/**
 * User: HolyEyE Date: 13. 5. 24. Time: 오후 7:43
 */
@Entity
public class Member {
	@Id
	@GeneratedValue
	@Column(name = "MEMBER_ID")
	private Long id;
	private String name;
	private String city;
	private String street;
	private String zipcode;

}