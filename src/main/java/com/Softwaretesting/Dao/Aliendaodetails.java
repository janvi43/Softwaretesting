package com.Softwaretesting.Dao;
import com.Softwaretesting.Entity.ticketdetails;

public interface Aliendaodetails {
	 public void saveAlien2(ticketdetails as);
	 public ticketdetails checkdetails(int ticketNO, int LINE_NO, int Sample_NO, String Sample_Description,String Sample_Status);
}