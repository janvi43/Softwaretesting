package com.Softwaretesting.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
@Entity
@Table(name="TEST_DETAILS" )

public class testdetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	int TICKET_NO;
	@Column
    String appearance;
	@Column
	String tensible_strength;
	public testdetails(int TICKET_NO,String appearance,String tensible_strength) {
		super();
		this.TICKET_NO =TICKET_NO;
		this.appearance=appearance;
		this.tensible_strength=tensible_strength;
	}
	
	public testdetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getTICKET_NO() {
		return TICKET_NO;
	}
	public void setTICKET_NO(int TICKET_NO) {
		this.TICKET_NO = TICKET_NO;
	}
	
	
	public String getappearance() {
		return appearance;
	}
	public void setappearance(String appearance) {
		this.appearance=appearance;
	}
	
public String gettensible_strength() {
	return tensible_strength;
	
}
public void settensible_strength(String tensible_strength) {
    this.tensible_strength=tensible_strength;	
}
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "TICKET_NO", referencedColumnName = "Ticket_NO", insertable = false, updatable = false)
private ticketheader ticketHeader;

// Existing methods...

public ticketheader getTicketHeader() {
    return ticketHeader;
}

public void setTicketHeader(ticketheader ticketHeader) {
    this.ticketHeader = ticketHeader;
}


}
