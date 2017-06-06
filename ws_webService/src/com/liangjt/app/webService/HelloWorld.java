package com.liangjt.app.webService;

import java.util.List;

import javax.jws.WebService;

import com.liangjt.app.domain.Cat;
import com.liangjt.app.domain.User;

/**
 * 想要暴露出去的接口
 * 
 * @author Administrator
 *
 */
@WebService
public interface HelloWorld {
	String sayHi(String name);

	List<Cat> getCatByUser(User user);
}
