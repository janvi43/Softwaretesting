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
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
@Table(name="ticket_header" ,schema="testing_soft")
@Entity

public class ticketheader {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Ticket_NO")
	 private int Ticket_NO;
	@Column(name="Ticket_Date")
	private Date Ticket_Date;
	@Column(name=" Cust_ID",insertable=false, updatable=false)
	 private  int Cust_ID;
	@Column(name="Status")
	  private String Status;
	public ticketheader(int Ticket_NO, Date Ticket_Date, int Cust_ID, String Status) {
		super();
		this.Ticket_NO = Ticket_NO;
		this.Ticket_Date = Ticket_Date;
		this.Cust_ID = Cust_ID;
		this.Status = Status;
	}

	public ticketheader() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getTicket_NO() {
		return Ticket_NO;
	}
	public void setTicket_NO(int Ticket_NO) {
		this.Ticket_NO = Ticket_NO;
	}
	public Date getTicket_Date() {
		return Ticket_Date;
	}
	public void setTicket_Date(Date Ticket_Date) {
		this.Ticket_Date = Ticket_Date;
	}
	public int getCust_ID() {
		return Cust_ID;
	}
	public void setCust_ID(int Cust_ID) {
		this.Cust_ID = Cust_ID;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String Status) {
		this.Status = Status;
	}
	
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Cust_ID", referencedColumnName = "ID")
    private Customer_verf customer;
    public String getName() {
        return customer.getName();
    }


    @OneToMany(mappedBy="ticketHeader", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<ticketdetails> details = new HashSet<>();
    
    // Existing methods...

    public Set<ticketdetails> getDetails() {
        return details;
    }

    public void setDetails(Set<ticketdetails> details) {
        this.details = details;
    }
    @OneToMany(mappedBy="ticketHeader" , fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Sample_test> sample = new HashSet<>();
     public Set<Sample_test> getSample(){
    	 return sample;
     }
     public void setSample(Set<Sample_test> sample) {
    	 this.sample=sample;
     }
     @OneToMany(mappedBy="ticketHeader",fetch=FetchType.LAZY, cascade=CascadeType.ALL)
     private List<lab_test> labtests=new ArrayList<>();
     public List<lab_test> getLabtests(){
    	 return labtests;	 
     }
     public void setLabtests(List<lab_test> labtests)
     {
    	 this.labtests=labtests;
     }
     @OneToMany(mappedBy="ticketHeader",fetch=FetchType.LAZY, cascade=CascadeType.ALL)
     private Set<testdetails> testdetail =new HashSet<>() ;
    	 public Set<testdetails> getTestdetail(){
    		 return testdetail;
    	 }
    	 public void setTestDetail(Set<testdetails> testdetail) {
    		 this.testdetail= testdetail;
    	 }
    	 
}
