package com.Softwaretesting.Entity;

import jakarta.persistence.Table;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;

@Entity
@Table(name="TICKET_DETAILS")



public class ticketdetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ticketNO", insertable = false, updatable = false)
	int ticketNO;
    @Column
	int LINE_NO;
	@Column
	int Sample_NO;
	@Column
	String Sample_Description;
	@Column
	String Sample_Status;
	
	public ticketdetails(int ticketNO, int LINE_NO, int Sample_NO, String Sample_Description,String Sample_Status) {
	    super();
	    this.ticketNO = ticketNO;
	    this.LINE_NO = LINE_NO;
	    this.Sample_NO = Sample_NO;
	    this.Sample_Description = Sample_Description;
	    this.Sample_Status= Sample_Status;
	}
	
	public ticketdetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getticketNO() {
		return ticketNO;
	}
	public void setTicketNO(int ticketNO) {
		this.ticketNO = ticketNO;
	}
	public int getLINE_NO() {
		return LINE_NO;
	}
	public void setLINE_NO(int lINE_NO) {
		LINE_NO = lINE_NO;
	}
	public int getSample_NO() {
		return Sample_NO;
	}
	public void setSample_NO(int sample_NO) {
		Sample_NO = sample_NO;
	}
	public String getSample_Description() {
		return Sample_Description;
	}
	public void setSample_Description(String sample_Description) {
		Sample_Description = sample_Description;
	}
public String getSample_Status() {
	return Sample_Status;
}
public void setSample_Status(String sample_Status) {
	 Sample_Status=sample_Status;
}
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "ticketNO", referencedColumnName = "Ticket_NO", insertable = false, updatable = false)
private ticketheader ticketHeader;

// Existing methods...

public ticketheader getTicketHeader() {
    return ticketHeader;
}

public void setTicketHeader(ticketheader ticketHeader) {
    this.ticketHeader = ticketHeader;
}


}