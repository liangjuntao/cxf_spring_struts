package com.liangjt.webService.Impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;

import com.liangjt.domain.Cat;
import com.liangjt.domain.User;
import com.liangjt.service.UserService;
import com.liangjt.service.Impl.UserServiceImp;
import com.liangjt.webService.HelloWorld;

/**
 * 比较简单的实现类
 * 
 * @author Administrator
 *
 */
@WebService(endpointInterface = "com.liangjt.webService.HelloWorld", serviceName = "HelloWorld")
public class HelloWorldWs implements HelloWorld {
	
	
	private UserService us ;
	//采用set注入
	public void setUs(UserService us){
		this.us = us;
	}

	@Override
	public String sayHi(String name) {
		return name + "，您好。现在时间是：" + new Date();
	}
	
	@Override
	public List<Cat> getCatByUser(User user) {
		//在实际项目中，web service组件不会去实现业务功能
		//它只是调用业务逻辑组件的方法来暴露webService接口
		//UserService us = new UserServiceImp();
		return us.getCatByUser(user);
	}
	
	
	@Override
	public Map<String, Cat> getAllCat() {
		//UserService us = new UserServiceImp();
		return us.getAllCat();
	}
	

}
