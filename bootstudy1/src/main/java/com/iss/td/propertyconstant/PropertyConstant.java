package com.iss.td.propertyconstant;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * 属性常量类，完成和property文件的属性映射。
 * 属性前缀均为constant，设置每个session使用一个
 * @author TD
 *
 */
@Component()
@Scope(scopeName=org.springframework.web.context.WebApplicationContext.SCOPE_SESSION,
proxyMode=ScopedProxyMode.TARGET_CLASS)
@ConfigurationProperties("constant")
public class PropertyConstant {

	private String name;
	private String phone;
	private long age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public long getAge() {
		return age;
	}
	public void setAge(long age) {
		this.age = age;
	}
	
	
}
