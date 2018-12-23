package com.iss.td.conditional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

/**
 * 
 * @author td
 * 通过conditional注解和Condition接口实现条件化生成bean
 * 同时也是springboot自动配置的主要原理
 *
 */
@Conditional(value = { UserCondition.class })
@Component
public class UserConditionTest {
	private Logger logger = LoggerFactory.getLogger(UserConditionTest.class);
	public UserConditionTest() {
		logger.info("UserConditionTest_Initializer。。。");
	}
}
