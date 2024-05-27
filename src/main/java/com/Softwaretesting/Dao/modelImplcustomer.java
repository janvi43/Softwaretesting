package com.Softwaretesting.Dao;
import java.util.List;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Softwaretesting.Entity.Customer_verf;

@Repository
@Transactional
public class modelImplcustomer  implements Aliendaocustomer{
    @Autowired
    SessionFactory sessionFactory;

    public void saveAlien1(Customer_verf as) {
    	
    	    if (as.getID() != 0) {
    	        sessionFactory.getCurrentSession().merge(as); 
    	    } else {
    	        sessionFactory.getCurrentSession().persist(as);
    	    }
    	
    }

    public Customer_verf checkCustomer(int ID, String Name,String Address,int StateID,String State) {
        System.out.println("Checking..........");

        CriteriaBuilder criteriaBuilder = sessionFactory.getCurrentSession().getCriteriaBuilder();
        CriteriaQuery<Customer_verf> criteriaQuery = criteriaBuilder.createQuery(Customer_verf.class);
        Root<Customer_verf> root = criteriaQuery.from(Customer_verf.class);

        criteriaQuery.select(root);
        criteriaQuery.where(
                criteriaBuilder.equal(root.get("ID"), ID),
                criteriaBuilder.equal(root.get("Name"), Name),
                criteriaBuilder.equal(root.get("Address"), Address),
                criteriaBuilder.equal(root.get("StateID"), StateID),
                criteriaBuilder.equal(root.get("State"), State)
        );

        List<Customer_verf> list = sessionFactory.getCurrentSession().createQuery(criteriaQuery).getResultList();

        if (ID != 0 && !Name.isEmpty() && !Address.isEmpty() && StateID != 0 && !State.isEmpty() && list != null && !list.isEmpty()) {
            return list.get(0);
        }
        return null;
    }
}
