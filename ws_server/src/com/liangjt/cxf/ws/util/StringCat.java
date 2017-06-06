package com.liangjt.cxf.ws.util;

import java.util.ArrayList;
import java.util.List;

import com.liangjt.domain.Cat;

public class StringCat {

	public static class Entry {
		private String key;
		private Cat value;

		public Entry() {

		}

		public Entry(String key, Cat value) {
			this.key = key;
			this.value = value;
		}

		public String getKey() {
			return key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public Cat getValue() {
			return value;
		}

		public void setValue(Cat value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return key + ":" + value;
		}

	}

	private List<Entry> entries = new ArrayList<>();

	public List<Entry> getEntries() {
		return entries;
	}

	public void setEntries(List<Entry> entries) {
		this.entries = entries;
	}
	
	@Override
	public String toString() {
		return Entry.class.toString() ;
	}

}
