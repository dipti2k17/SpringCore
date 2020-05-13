package com.spring.coditioncheck;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class DevDBUtilCondition implements Condition {
	
	public DevDBUtilCondition() { };

	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		String dbname = context.getEnvironment().getProperty("database.name");
		return dbname.equalsIgnoreCase("dev");
	}

}

