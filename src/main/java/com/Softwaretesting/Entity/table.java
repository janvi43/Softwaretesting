package com.Softwaretesting.Entity;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name="admin", schema="testing_soft")

public class table{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	int Id;
	@Column
	String fullname;
	@Column
	String email;
	@Column
	String pwd;
	@Column
	String cpwd;
	@Column
	String photo;
	@Column
	String gender;
	@Column
	String specialization;

	
	
	public table(int Id, String fullname, String email, String pwd, String cpwd, String photo,
			String gender, String specialization) {
		super();
		this.Id = Id;
		this.fullname = fullname;
		this.email = email;
		this.pwd = pwd;
		this.cpwd = cpwd;
		this.photo = photo;
		this.gender = gender;
		this.specialization = specialization;
	}
	public table() {
		super();
	}
	public int getAlienId() {
		return Id;
	}
	public void setAlienId(int Id) {
		this.Id = Id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getCpwd() {
		return cpwd;
	}
	public void setCpwd(String cpwd) {
		this.cpwd = cpwd;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	
	
}
