package com.Softwaretesting.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
@Entity
@Table(name="customer" ,schema="testing_soft")

public class Customer_verf {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
    int ID;
	@Column
	String Name;
	@Column
	String Address;
	@Column
	int StateID;
	@Column
	String State;
	public Customer_verf(int ID, int StateID, String Name, String Address, String State) {
		super();
		this.ID = ID;
		this.StateID = StateID;
		this.Name =Name; 
		this.Address = Address;
		this.State = State;
	}
	public Customer_verf() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public int getStateID() {
		return StateID;
	}
	public void setStateID(int StateID) {
		this.StateID = StateID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String Address) {
		this.Address = Address;
	}
	
	
	public String getState() {
		return State;
	}
	public void setState(String State) {
		this.State = State;
	}

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ticketheader> ticketheaders = new ArrayList<>();

}