package com.Softwaretesting.Dao;
import java .util.List;
import java.util.Set;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Softwaretesting.Entity.lab_test;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;

@Repository
@Transactional
public class modelImpllab implements AlienDaotest {
	@Autowired
    SessionFactory sessionFactory;

    
    	public void saveAlien5(lab_test as) {
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
    	            System.out.println("Constraint Violation Message: " + constraintMessage);
    	            System.out.println("Affected Column: " + affectedColumn);
    	        }
    		}
    		
    	}

    public lab_test checktest(int TICKET_NO, String TEST_Name,String test_type,String test_result) {
        System.out.println("Checking..........");
    
        CriteriaBuilder criteriaBuilder = sessionFactory.getCurrentSession().getCriteriaBuilder();
        CriteriaQuery<lab_test> criteriaQuery = criteriaBuilder.createQuery(lab_test.class);
        Root<lab_test> root = criteriaQuery.from(lab_test.class);

        criteriaQuery.select(root);
        criteriaQuery.where(
                criteriaBuilder.equal(root.get("TICKET_NO"), TICKET_NO),
                criteriaBuilder.equal(root.get("TEST_Name"), TEST_Name),
                criteriaBuilder.equal(root.get("test_type"), test_type), 
                criteriaBuilder.equal(root.get("test_result"), test_result)
        );

        List<lab_test> list = sessionFactory.getCurrentSession().createQuery(criteriaQuery).getResultList();

        if (TICKET_NO != 0 &&  TEST_Name !=null &&test_type!=null && test_result!= null && list != null && !list.isEmpty()) {
            return list.get(0);
        }    
        return null;
    }

	public List<lab_test> getLabTestsByTicketNo(int ticket_NO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public lab_test checktest(int TICKET_NO, String test_type, String test_result) {
		// TODO Auto-generated method stub
		return null;
	}
    
}
