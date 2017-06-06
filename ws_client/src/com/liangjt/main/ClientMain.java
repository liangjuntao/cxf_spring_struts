package com.liangjt.main;

import com.liangjt.webservice.Entry;
import com.liangjt.webservice.StringCat;
import com.liangjt.webservice.impl.HelloWorld;

public class ClientMain {

	public static void main(String[] args) {
		HelloWorld factory = new HelloWorld();
		// hw是远程web service的代理
		com.liangjt.webservice.HelloWorld hw = factory.getHelloWorldWsPort();
		System.out.println(hw.sayHi("zhangsan"));
		
		StringCat sc = hw.getAllCat();
		for(Entry en : sc.getEntries()){
			System.out.println(en.getKey()+":"+en.getValue().getName());
		}
	}

}
