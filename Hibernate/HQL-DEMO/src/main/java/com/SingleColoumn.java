package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.cts.product.config.DBConfig;

public class SingleColoumn {

	public static void main(String[] args) {

		Session ses = DBConfig.getSessionbFactory().openSession();

		String hql1 = "select a.actor_id from Actor as a";

		Query<Object> qry = ses.createQuery(hql1);

		List<Object> actors = qry.list();

		for (Object firstName : actors) {
			System.out.println("First Name: " + firstName);
		}

	}

}
