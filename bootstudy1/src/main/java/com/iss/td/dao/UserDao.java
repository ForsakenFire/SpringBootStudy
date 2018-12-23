package com.iss.td.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iss.td.bean.User;

public interface UserDao extends JpaRepository<User, Long>{

	/**
	 * 通过sex获取user的list
	 * @param sex
	 * @return
	 */
	List<User> getAllBySex(long sex);
	
	
}
