package com.pwc.demo1;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.pwc.demo1.mapper.UserMapper;
import com.pwc.demo1.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@WebAppConfiguration
public class UserTerst {

	@Autowired
	private UserMapper userMapper;

	@Test
	@Rollback
	public void findByName() throws Exception {
//		userMapper.insert(5, "AAA", 20);
		
		userMapper.updateById("玩开", 12, 1);
		
		User user = userMapper.findById(1);
		System.out.println(user.getName()+" "+user.getId()+" "+user.getAge());
		Assert.assertEquals(20, user.getAge().intValue());
	}
}
