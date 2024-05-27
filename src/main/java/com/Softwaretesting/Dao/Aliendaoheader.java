package com.Softwaretesting.Dao;


import java.sql.Date;
import java.util.List;

import com.Softwaretesting.Entity.ticketheader;

public interface Aliendaoheader {
	public void saveAlien2(ticketheader as);
	public ticketheader checkheader(int Ticket_NO, Date Ticket_Date, int Cust_ID, String Status);
	public List<ticketheader> findTicketsWithDetails(int Ticket_NO, Date Ticket_Date, String Name);

	}
