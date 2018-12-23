package com.iss.td.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * 
 * @author conditional使用的条件类
 *
 */
public class UserCondition implements Condition{

	/**
	 * 从上下文中获取classpath中加载的类，出现异常时返回false，否则返回true
	 */
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		try {
			/*
			context.getClassLoader().loadClass("org.springframework.jdbc.core.JdbcTemplate");
			return true;
			*/
			//properties文件中取值决定条件是否生效
			if("2".equals(context.getEnvironment().getProperty("conditional.test"))) {
				return true;
			}else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}

}
