package com.Softwaretesting.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="TEST_MASTER" , schema="testing_soft")
public class lab_test {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    @Column(name="TICKET_NO")
    int TICKET_NO;
    
    @Column(name="TEST_Name")
    String TEST_Name;
    
    @Column(name="test_type")
    String test_type;
    
    @Column(name="test_result")
     String test_result;
    
    public lab_test(int TICKET_NO, String TEST_Name,String test_type,String test_result) {
        super();
        this.TICKET_NO = TICKET_NO;
        this.TEST_Name = TEST_Name;
        this.test_type=test_type;
        this.test_result = test_result;
        
    }
    
    // getters and setters
    public lab_test() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    // getters and setters
    public int getTICKET_NO() {
        return TICKET_NO;
    }
    public void setTICKET_NO(int TICKET_NO) {
        this.TICKET_NO = TICKET_NO;
    }
    
        public String getTEST_Name() {
        return TEST_Name;
    }
    public void setTEST_Name(String TEST_Name) {
        this.TEST_Name = TEST_Name;
    }
    public String gettest_type() {
        return test_type;
    }
    public void settest_type(String test_type) {
        this.test_type = test_type;
    }

    public String gettest_result() {
        return test_result;
    }
    public void setTest_result(String test_result) {
        this.test_result = test_result;
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