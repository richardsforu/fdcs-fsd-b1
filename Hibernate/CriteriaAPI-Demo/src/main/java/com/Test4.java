package com;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.cts.product.config.DBConfig;
import com.cts.product.entity.Actor;

public class Test4 {

	public static void main(String[] args) {

		Session ses = DBConfig.getSessionbFactory().openSession();

		CriteriaBuilder criteriaBuilder = ses.getCriteriaBuilder();
		CriteriaQuery<Actor> criteriaQuery = criteriaBuilder.createQuery(Actor.class);

		Root<Actor> root = criteriaQuery.from(Actor.class);
		criteriaQuery.select(root);
		criteriaQuery.where(criteriaBuilder.between(root.get("actor_id"), 1,10));

		Query<Actor> qry = ses.createQuery(criteriaQuery);
		// ----------------------------

		List<Actor> actors = qry.getResultList();
		
		for(Actor act:actors) {
			System.out.println(act.getActor_id());
			System.out.println(act.getFirst_name());
			System.out.println(act.getLast_name());
			System.out.println("---------------------------");
		}
		

	}

}
