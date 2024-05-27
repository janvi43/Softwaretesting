package com.Softwaretesting.Dao;
import java.util.List;
import java.util.Set;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Softwaretesting.Entity.testdetails;


@Repository
@Transactional
public class modelImpltestdetails implements AlienDaotestdetails {


	@Autowired
    SessionFactory sessionFactory;

    public void saveAlien6(testdetails as){
    	try {
    		if (as.getTICKET_NO() != 0) {
    	        sessionFactory.getCurrentSession().merge(as);
    	    } else {
    	        sessionFactory.getCurrentSession().persist(as);
    	    }
    		}catch (ConstraintViolationException ex) {
    	        Set<ConstraintViolation<?>> constraintViolations = ex.getConstraintViolations();
    	        
    	        for (ConstraintViolation<?> violation : constraintViolations) {
    	            String constraintMessage = violation.getMessage();
    	            String affectedColumn = violation.getPropertyPath().toString();
    	            
    	            // Log or display the constraint message and affected column
    	            System.out.println("Constraint Violation Message: " + constraintMessage);
    	            System.out.println("Affected Column: " + affectedColumn);
    	        }
    		}
    		
    	}
    public testdetails checktestdetails(int TICKET_NO, String appearance,String tensible_strength) {
        System.out.println("Checking..........");

        CriteriaBuilder criteriaBuilder = sessionFactory.getCurrentSession().getCriteriaBuilder();
        CriteriaQuery<testdetails> criteriaQuery = criteriaBuilder.createQuery(testdetails.class);
        Root<testdetails> root = criteriaQuery.from(testdetails.class);

        criteriaQuery.select(root);
        criteriaQuery.where(
                criteriaBuilder.equal(root.get("TICKET_NO"), TICKET_NO),
                criteriaBuilder.equal(root.get("appearance"), appearance),
                criteriaBuilder.equal( root.get("tensible_strength"), tensible_strength)
        );

        List<testdetails> list = sessionFactory.getCurrentSession().createQuery(criteriaQuery).getResultList();

        if (TICKET_NO != 0 && appearance!=null && tensible_strength!=null && list != null && !list.isEmpty()) {
            return list.get(0);
        }    
        return null;
    }
}