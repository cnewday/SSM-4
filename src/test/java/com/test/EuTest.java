package com.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mapper.UserMapper;



public class EuTest {
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext(new String[]{"classpath:conf/spring-mybatis.xml","classpath:conf/spring-mvc.xml","classpath:conf/spring.xml"});
	@Test
	public void md(){
		@SuppressWarnings("resource")
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(new String[]{"classpath:conf/spring-mybatis.xml","classpath:conf/spring-mvc.xml","classpath:conf/spring.xml"});
          UserMapper userMapper=applicationContext.getBean(UserMapper.class);
//          System.out.println((userMapper.selectByPrimaryKey(1)).getUserName());
//		MD5 jiami =new MD5();
//		@SuppressWarnings("static-access")
//		String aString =jiami.md5("123");
	}
	@Test
	public void test1()
	{
		   UserMapper userMapper=applicationContext.getBean(UserMapper.class);
		   System.out.println("username:"+userMapper.selectByPrimaryKey(new Long(1)).getUserPhonenumber());
	}
}
