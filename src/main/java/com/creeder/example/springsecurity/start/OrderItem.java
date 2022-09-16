package com.creeder.example.springsecurity.start;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ORDER_ITEM")
public class OrderItem {
	@Id
	@GeneratedValue
	@Column(name = "ORDER_ITEM_ID")
	private Long id;
	@Column(name = "ITEM_ID")
	private Long itemId;
	@Column(name = "ORDER_ID")
	private Long orderId;
	private int orderPrice; // 주문 가격
	private int count; // 주문 수량
}
