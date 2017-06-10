package com.liangjt.webService;

import java.util.List;
import java.util.Map;

import javax.jws.WebService;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.liangjt.cxf.ws.util.MyXmlAdapter;
import com.liangjt.domain.Cat;
import com.liangjt.domain.User;

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

	// cxf无法处理map这种类型，所以才用value=* 去处理
	@XmlJavaTypeAdapter(MyXmlAdapter.class)
	Map<String, Cat> getAllCat();

}
