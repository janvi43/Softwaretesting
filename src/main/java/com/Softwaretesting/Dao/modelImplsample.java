
package com.Softwaretesting.Dao;
import java.util.List;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Softwaretesting.Entity.Sample_test;

@Repository
@Transactional
public class modelImplsample implements Aliendaobarcode {
	@Autowired
    SessionFactory sessionFactory;

    public void saveAlien3(Sample_test as){
    	if (as.getTICKET_NO() != 0) {
	        sessionFactory.getCurrentSession().merge(as); 
	    } else {
	        sessionFactory.getCurrentSession().persist(as);
	    }
	
}
    public Sample_test checkbarcode(int TICKET_NO , int LINE_NO,int SAMPLE_NO,int TEST_ID, int BARCODE_NO) {
        System.out.println("Checking..........");

        CriteriaBuilder criteriaBuilder = sessionFactory.getCurrentSession().getCriteriaBuilder();
        CriteriaQuery<Sample_test> criteriaQuery = criteriaBuilder.createQuery(Sample_test.class);
        Root<Sample_test> root = criteriaQuery.from(Sample_test.class);

        criteriaQuery.select(root);
        criteriaQuery.where(
                criteriaBuilder.equal(root.get("TICKET_NO"), TICKET_NO),
                criteriaBuilder.equal(root.get("LINE_NO"), LINE_NO),
                criteriaBuilder.equal(root.get("SAMPLE_NO"), SAMPLE_NO),
                criteriaBuilder.equal(root.get("TEST_ID"), TEST_ID),
                criteriaBuilder.equal(root.get("BARCODE_NO"), BARCODE_NO)
        );

        List<Sample_test> list = sessionFactory.getCurrentSession().createQuery(criteriaQuery).getResultList();

        if (TICKET_NO != 0 && LINE_NO != 0 && SAMPLE_NO != 0 && TEST_ID != 0 && BARCODE_NO!=0 && list != null && !list.isEmpty()) {
            return list.get(0);
        }    
        return null;
    
    }

    }
