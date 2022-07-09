package com.hibernateCache;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.transaction.TransactionScoped;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class Student {
	@Id
	private int id;
	@Column(name="fname")
	private String first_name;
	@Column(name="lname")
	private String last_name;
	@TransactionScoped
	private String email;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", email=" + email
				+ ", age=" + age + "]";
	}

}
