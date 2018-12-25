package com.iss.td;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.iss.td.service.TestService;

import org.springframework.test.web.servlet.result.*;
import org.springframework.test.web.servlet.request.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceTest {
	@Autowired
	private WebApplicationContext webContext;
	
	private MockMvc mockMvc;
	/**
	 * 在所有测试方法执行前首先执行的内容
	 */
	@Before
	public void setupMockMvc() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webContext).build();
	}
	
	@Test
	public void testTestService() throws Exception {
		mockMvc.perform(get("/test1"))
		.andExpect(status().isOk())
		.andExpect(model().attributeExists("userList"));
		
		
		
	}
}
