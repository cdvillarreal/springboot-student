package com.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String lastname;
	private long telephone;
	private String email;
	private String address;
	
	public Student(String name, String lastname, long telephone, String email, String address) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.telephone = telephone;
		this.email = email;
		this.address = address;
	}
}
