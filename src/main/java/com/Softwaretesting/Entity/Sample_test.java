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
@Table(name="TicketBarcode" ,schema="testing_soft")

public class Sample_test {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	int TICKET_NO;
	@Column
	int LINE_NO;
	@Column
	int SAMPLE_NO;
	@Column
	int TEST_ID;
	@Column
	int BARCODE_NO;
	public Sample_test(int TICKET_NO, int LINE_NO,int SAMPLE_NO, int TEST_ID, int BARCODE_NO) {
		super();
		this.TICKET_NO =TICKET_NO;
		this.LINE_NO = LINE_NO;
		this.SAMPLE_NO = SAMPLE_NO;
		this.TEST_ID = TEST_ID;
		this.BARCODE_NO = BARCODE_NO;
	}
	
	public Sample_test() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getTICKET_NO() {
		return TICKET_NO;
	}
	public void setTICKET_NO(int TICKET_NO) {
		this.TICKET_NO = TICKET_NO;
	}
	
	
	
	
	
	public int getLINE_NO() {
		return LINE_NO;
	}
	public void setLINE_NO(int LINE_NO) {
		this.LINE_NO = LINE_NO;
	}
	public int getSAMPLE_NO() {
		return SAMPLE_NO;
	}
	public void setSAMPLE_NO(int SAMPLE_NO) {
		this.SAMPLE_NO = SAMPLE_NO;
	}
	public  int getTEST_ID() {
		return TEST_ID;
	}
	public void setTEST_ID(int TEST_ID) {
	this.TEST_ID = TEST_ID;
	}
	public int getBARCODE_NO() {
		return BARCODE_NO;
	}
	public void setBARCODE_NO(int BARCODE_NO) {
		this.BARCODE_NO = BARCODE_NO;
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
