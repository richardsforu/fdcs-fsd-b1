package com.cts.product.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Random;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomPKGenerator implements IdentifierGenerator{

	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {

		Random r=new Random(1000);
		
		String key=null;
		LocalDateTime customId=LocalDateTime.now();
		ZonedDateTime zdt = customId.atZone(ZoneId.of("America/Los_Angeles"));
		long millis = zdt.toInstant().toEpochMilli();
		

		
		key=millis+"";
		
		
		return "CUST01"+key+Math.abs(r.nextInt())+"";
	}
	
	

}
