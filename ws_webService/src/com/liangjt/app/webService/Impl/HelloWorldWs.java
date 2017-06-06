package com.liangjt.app.webService.Impl;

import java.util.Date;
import java.util.List;

import javax.jws.WebService;

import com.liangjt.app.domain.Cat;
import com.liangjt.app.domain.User;
import com.liangjt.app.service.UserService;
import com.liangjt.app.service.Impl.UserServiceImp;
import com.liangjt.app.webService.HelloWorld;

/**
 * 比较简单的实现类
 * 
 * @author Administrator
 *
 */
@WebService(endpointInterface = "com.liangjt.app.webService.HelloWorld", serviceName = "HelloWorld")
public class HelloWorldWs implements HelloWorld {

	@Override
	public String sayHi(String name) {
		return name + "，您好。现在时间是：" + new Date();
	}
	
	@Override
	public List<Cat> getCatByUser(User user) {
		//在实际项目中，web service组件不会去实现业务功能
		//它只是调用业务逻辑组件的方法来暴露webService接口
		UserService us = new UserServiceImp();
		return us.getCatByUser(user);
	}

}
