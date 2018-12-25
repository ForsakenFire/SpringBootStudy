package com.iss.td.service.impl;

import org.springframework.stereotype.Service;

import com.iss.td.service.TestService;

@Service
public class TestServiceImpl implements TestService{

	@Override
	public void doTest() {
		System.out.println("doTest");
	}

}
