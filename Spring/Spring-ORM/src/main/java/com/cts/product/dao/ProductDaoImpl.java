package com.cts.product.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.product.entity.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private SessionFactory sf;

	public void saveProduct(Product prod) {

		sf.getCurrentSession().save(prod);
		// Session ses=sf.openSession();
		// ses.save(prod);
		// ses.beginTransaction().commit();
		System.out.println("Dao: " + prod.getProdName() + " Saved");
	}

	public List<Product> listAll() {

		Query<Product> qry = sf.getCurrentSession().createQuery("from Product");
		return qry.getResultList();
	}

}
