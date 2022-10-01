package com.edubridge.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "help" )
public class Help {
@Id
@Column
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private static final String HELP = "help";
	@Column
	private String name;
	@Column
	private String number;
	
	@Column
	private String email;
	@Column
	private String comment;
	
	public Help() {
	}
	
	
	


	public Help(int id, String name, String number, String email, String comment) {
		this.id = id;
		this.name = name;
		this.number = number;
		this.email = email;
		this.comment = comment;
	}





	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

}
