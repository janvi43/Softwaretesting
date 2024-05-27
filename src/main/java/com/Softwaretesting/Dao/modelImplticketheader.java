package com.Softwaretesting.Dao;

import java.sql.Date;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Fetch;
import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.JoinType;
import jakarta.persistence.criteria.Root;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Softwaretesting.Entity.Customer_verf;
import com.Softwaretesting.Entity.Sample_test;
import com.Softwaretesting.Entity.ticketdetails;
import com.Softwaretesting.Entity.ticketheader;


@Repository
@Transactional
public class modelImplticketheader implements Aliendaoheader {
	 @Autowired
	    SessionFactory sessionFactory;

	    public void saveAlien2(ticketheader as) {
	    
	    	if (as.getTicket_NO() != 0) {
    	        sessionFactory.getCurrentSession().merge(as); 
    	    } else {
    	        sessionFactory.getCurrentSession().persist(as);
    	    }
    	
    }
    	    
    
	    public ticketheader checkheader(int Ticket_NO, Date ticketDate, int Cust_ID, String Status) {
	        System.out.println("Checking..........");

	        CriteriaBuilder criteriaBuilder = sessionFactory.getCurrentSession().getCriteriaBuilder();
	        CriteriaQuery<ticketheader> criteriaQuery = criteriaBuilder.createQuery(ticketheader.class);
	        Root<ticketheader> root = criteriaQuery.from(ticketheader.class);

	        criteriaQuery.select(root);
	        criteriaQuery.where(
	                criteriaBuilder.equal(root.get("Ticket_NO"), Ticket_NO),
	                criteriaBuilder.equal(root.get("Ticket_Date"), ticketDate),
	                criteriaBuilder.equal(root.get("Cust_ID"), Cust_ID),
	                criteriaBuilder.equal(root.get("Status"), Status)
	        );

	        List<ticketheader> list = sessionFactory.getCurrentSession().createQuery(criteriaQuery).getResultList();

	        if (Ticket_NO != 0 && ticketDate != null && Cust_ID != 0 && Status != null && list != null && !list.isEmpty()) {
	            return list.get(0);
	        }    
	        return null;
	    }
	    public List<ticketheader> findTicketsWithDetails(int Ticket_NO, Date Ticket_Date, String Name) {
	        CriteriaBuilder criteriaBuilder = sessionFactory.getCurrentSession().getCriteriaBuilder();
	        CriteriaQuery<ticketheader> criteriaQuery = criteriaBuilder.createQuery(ticketheader.class);
	        Root<ticketheader> root = criteriaQuery.from(ticketheader.class);
	        Join<ticketheader, Customer_verf> customerJoin = root.join("customer", JoinType.INNER);
                  root.fetch("details", JoinType.LEFT);
	        root.fetch("sample", JoinType.LEFT);
	        root.fetch("labtests",JoinType.LEFT);
	        root.fetch("testdetail" ,JoinType.LEFT);

	        criteriaQuery.select(root).distinct(true).where(
	                criteriaBuilder.and(
	                        criteriaBuilder.equal(root.get("Ticket_NO"), Ticket_NO),
	                        criteriaBuilder.equal(root.get("Ticket_Date"), Ticket_Date),
	                        criteriaBuilder.equal(customerJoin.get("Name"), Name)
	                )
	        );

	        return sessionFactory.getCurrentSession().createQuery(criteriaQuery).getResultList();
	    
}
}