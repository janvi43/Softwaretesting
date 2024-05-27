package com.Softwaretesting.Dao;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Softwaretesting.Entity.ticketdetails;

import jakarta.persistence.criteria.Root;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public class modelImplticketdetails implements Aliendaodetails {
	@Autowired
    SessionFactory sessionFactory;

    public void saveAlien2(ticketdetails as) {
        
    	if (as.getticketNO() != 0) {
	        sessionFactory.getCurrentSession().merge(as); 
	    } else {
	        sessionFactory.getCurrentSession().persist(as);
	    }
	
    }

   

    public ticketdetails checkdetails(int ticketNO, int LINE_NO, int Sample_NO, String Sample_Description,String Sample_Status) {
        System.out.println("Checking..........");

        CriteriaBuilder criteriaBuilder = sessionFactory.getCurrentSession().getCriteriaBuilder();
        CriteriaQuery<ticketdetails> criteriaQuery = criteriaBuilder.createQuery(ticketdetails.class);
        Root<ticketdetails> root = criteriaQuery.from(ticketdetails.class);

        criteriaQuery.select(root);
        criteriaQuery.where(
                criteriaBuilder.equal(root.get("ticketNO"), ticketNO),
                criteriaBuilder.equal(root.get("LINE_NO"), LINE_NO),
                criteriaBuilder.equal(root.get("Sample_NO"), Sample_NO),
                criteriaBuilder.equal(root.get("Sample_Description"), Sample_Description),
                criteriaBuilder.equal(root.get("Sample_Status"), Sample_Status)
        );

        List<ticketdetails> list = sessionFactory.getCurrentSession().createQuery(criteriaQuery).getResultList();

        if (ticketNO != 0 && LINE_NO != 0 && Sample_NO != 0 && Sample_Description != null && Sample_Status!=null && list != null && !list.isEmpty()) {
            return list.get(0);
        }    
        return null;
    }






}