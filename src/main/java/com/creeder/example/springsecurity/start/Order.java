package com.creeder.example.springsecurity.start;

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

@Entity
@Table(name = "ORDERS")
public class Order {
	@Id
	@GeneratedValue
	@Column(name = "ORDER_ID")
	private Long id;
	@Column(name = "MEMBER_ID")
	private Long memberId;
	@Temporal(TemporalType.TIMESTAMP)
	private Date orderDate; // 주문 날짜 …➊
	@Enumerated(EnumType.STRING)
	private OrderStatus status;// 주문 상태 …➋
}

enum OrderStatus {
	ORDER, CANCEL
}