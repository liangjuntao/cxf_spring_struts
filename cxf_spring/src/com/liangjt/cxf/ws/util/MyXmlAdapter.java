package com.liangjt.cxf.ws.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.text.html.HTMLDocument.Iterator;
import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.liangjt.cxf.ws.util.StringCat.Entry;
import com.liangjt.domain.Cat;

public class MyXmlAdapter extends XmlAdapter<StringCat, Map<String,Cat>> {

	@Override
	public Map<String, Cat> unmarshal(StringCat v) throws Exception {
		Map<String ,Cat> result = new HashMap<>();
		List<Entry> en = v.getEntries();
		for(Entry e :en){
			result.put(e.getKey(), e.getValue());
		}
		return result;
	}

	@Override
	public StringCat marshal(Map<String, Cat> v) throws Exception {
		StringCat sc = new StringCat();
		
		List<Entry> en = new ArrayList();
		for(String key :v.keySet()){
			sc.getEntries().add(new Entry(key,v.get(key)));
		}
		return sc;
	}
	
	
	

}
