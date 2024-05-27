package com.Softwaretesting.Dao;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Softwaretesting.Entity.table;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

@Repository
@Transactional
public class modelImpl implements AlienDao {

    
    @Autowired
	SessionFactory sessionFactory;

	public void saveAlien(table as) {
		
		sessionFactory.getCurrentSession().persist(as);
	
	}

	public table checkLogin(String email, String pwd) {
		
		System.out.println("Checking..........");
		CriteriaBuilder criteriaBuilder = sessionFactory.getCurrentSession().getCriteriaBuilder();
        CriteriaQuery<table> criteriaQuery = criteriaBuilder.createQuery(table.class);
        Root<table> root = criteriaQuery.from(table.class);

        criteriaQuery.select(root);
        criteriaQuery.where(
                criteriaBuilder.equal(root.get("email"), email),
                criteriaBuilder.equal(root.get("pwd"), pwd)
        );

        List<table> list = sessionFactory.getCurrentSession().createQuery(criteriaQuery).getResultList();

        if (email != null && !pwd.isEmpty()  && list != null && !list.isEmpty()) {
            return list.get(0);
        }
        return null;
}


		
	}
