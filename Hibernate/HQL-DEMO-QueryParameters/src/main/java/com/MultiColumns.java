package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.cts.product.config.DBConfig;

public class MultiColumns {

	public static void main(String[] args) {

		Session ses = DBConfig.getSessionbFactory().openSession();

		String hql1 = "select a.actor_id,a.first_name from Actor as a";

		Query<Object[]> qry = ses.createQuery(hql1);

		List<Object[]> actors = qry.list();

		for (int i = 0; i < actors.size(); i++) {

			Object row[] = actors.get(i);

			for (Object column : row) {
				System.out.println(column);
			}
			System.out.println("-----------------------");

		}

	}

}
