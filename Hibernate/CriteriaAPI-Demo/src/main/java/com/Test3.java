package com;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.cts.product.config.DBConfig;
import com.cts.product.entity.Actor;

public class Test3 {

	public static void main(String[] args) {

		Session ses = DBConfig.getSessionbFactory().openSession();

		CriteriaBuilder criteriaBuilder = ses.getCriteriaBuilder();
		CriteriaQuery<Object[]> criteriaQuery = criteriaBuilder.createQuery(Object[].class);

		Root<Actor> root = criteriaQuery.from(Actor.class);

		criteriaQuery.multiselect(root.get("actor_id"),root.get("first_name"), root.get("last_name"));
		//criteriaQuery.where(criteriaBuilder.between(root.get("actor_id"), 1,10));
		Query<Object[]> qry = ses.createQuery(criteriaQuery);
		// ----------------------------

		List<Object[]> actors = qry.getResultList();

		for (int i = 0; i < actors.size(); i++) {
			Object[] rows = actors.get(i);
			for (Object col : rows) {
				System.out.println(col);
			}
			System.out.println("-------------------");
		}

	}

}
