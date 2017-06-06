package com.liangjt.domain;

public class Cat {
	private Integer id;
	private String name;
	private String color;
	public Cat(Integer id, String name, String color) {
		this.id = id;
		this.name = name;
		this.color = color;
	}
	public Cat() {

	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	//有个疑问，这里重写后，为什么客户端不能取出这个string
	@Override
	public String toString() {
		return name;
	}
	
}
