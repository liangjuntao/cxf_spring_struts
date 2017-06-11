package com.liangjt.app.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.liangjt.webservice.Cat;
import com.liangjt.webservice.Entry;
import com.liangjt.webservice.HelloWorld;
import com.liangjt.webservice.StringCat;
import com.opensymphony.xwork2.ActionSupport;

public class ListCatsAction extends ActionSupport {
	// 此时的action依赖的是远程webService代理对象
	//这里注入的是接口，不是实现类，因为别人发布实现类可能会变更，一般采用面向接口编程，这样就可以理解为啥这里是接口了
	private HelloWorld hw;

	public void setHw(HelloWorld hw) {
		this.hw = hw;
	}
	
	public HelloWorld getHw() {
		return hw;
	}


	Map<String,Cat> cats;
	
	public void setCats(Map<String, Cat> cats) {
		this.cats = cats;
	}

	public String execute() throws Exception {
		//此action此处调用的是远程webservice代理的方法
		if(hw == null ){
			System.out.println(hw + "是空的");
		}
		/*强调：报hw空指针，hw spring注入总是失败；
		初步判断是包的问题，导致service注入失败。 
		先不处理这个了，以后用maven做一遍，和springmvc做整合吧。
		这个问题我搞一天了，心态爆炸！*/
		
		StringCat sc = hw.getAllCat();
		Map<String,Cat> cats = new HashMap<>();
		for(Entry entry:sc.getEntries()){
			cats.put(entry.getKey(),entry.getValue());
		}
		setCats(cats); 
		return SUCCESS;
	}

}
