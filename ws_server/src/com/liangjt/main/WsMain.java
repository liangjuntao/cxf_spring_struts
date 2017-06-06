package com.liangjt.main;

import javax.xml.ws.Endpoint;

import com.liangjt.webService.Impl.HelloWorldWs;

/**
 * WsMain以RunAs java Application即可发布这个接口
 * 
 * @author Administrator
 *
 */
public class WsMain {

	public static void main(String[] args) {
		HelloWorldWs hw = new HelloWorldWs();
		// 低啊用Endpoint的发布web service方法
		// 第一个参数是访问的地址，第二个参数是实现类
		Endpoint.publish("http://127.0.0.1:9999/webservice", hw);
		System.out.println("web Service暴露成功！");
	}

}
