package com.liangjt.clientMain;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingOutInterceptor;

import com.liangjt.auth.AddHeaderInterceptor;
import com.liangjt.webservice.Entry;
import com.liangjt.webservice.StringCat;
import com.liangjt.webservice.impl.HelloWorld;

public class ClientMain {

	public static void main(String[] args) {
		HelloWorld factory = new HelloWorld();
		com.liangjt.webservice.HelloWorld hw = factory.getHelloWorldWsPort();
		Client client = ClientProxy.getClient(hw);
		
		//添加自定义拦截器 
		client.getOutInterceptors().add(new AddHeaderInterceptor("1111","1111"));
		client.getOutInterceptors().add(new LoggingOutInterceptor());
		
		System.out.println(hw.sayHi("zhangsan"));

		StringCat sc = hw.getAllCat();
		for (Entry en : sc.getEntries()) {
			System.out.println(en.getKey() + ":" + en.getValue().getName());
		}
	}
}
