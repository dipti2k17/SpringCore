package com.springmvc.datasource.main;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springmvc.datasource.config.BeansConfig;

public class TestJndiLookup {

	public static void main(String[] args) throws NamingException {

		//ApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);
		Context ctx = new InitialContext();
		Context initCtx  = (Context) ctx.lookup("java:/comp/env");
		DataSource ds = (DataSource) initCtx.lookup("jdbc/test");
		System.out.println("-----------: "+ds);
	}

}
