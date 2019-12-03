package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.cts.product.config.DBConfig;
import com.cts.product.entity.Actor;

public class Test {

	public static void main(String[] args) {

		Session ses = DBConfig.getSessionbFactory().openSession();

		
		String hql1="from Actor";
		
		Query<Actor> qry=ses.createQuery(hql1);
		
		List<Actor> actors=qry.list();
		
		for(Actor act:actors) {
			System.out.println("Id: "+act.getActor_id());
			System.out.println("Fist Name: "+act.getFirst_name());
			System.out.println("Last Name: "+act.getLast_name());
			System.out.println("--------------------------------------");
		}
		
		
		
		
		
	}

}
