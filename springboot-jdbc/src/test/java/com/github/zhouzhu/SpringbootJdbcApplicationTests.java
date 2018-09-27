package com.github.zhouzhu;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootJdbcApplicationTests {

	@Autowired
	private UserService userService;

	@Before
	public void setUp(){
		//准备，清空user表
		userService.deleteAllUsers();
	}

	@Test
	public void contextLoads() {
		userService.create("a",1);
		userService.create("b",1);
		userService.create("c",1);
		userService.create("d",1);
		userService.create("e",1);

		Assert.assertEquals(5,userService.getAllUsers().intValue());

		userService.deleteByName("a");
		userService.deleteByName("e");

		Assert.assertEquals(3,userService.getAllUsers().intValue());
	}

}
