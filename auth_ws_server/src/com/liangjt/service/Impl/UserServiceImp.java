package com.liangjt.service.Impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.liangjt.domain.Cat;
import com.liangjt.domain.User;
import com.liangjt.service.UserService;

public class UserServiceImp implements UserService {

	// 用HashMap模拟数据库
	static Map<User, List<Cat>> catDb = new HashMap<>();

	static {
		List<Cat> catList1 = new ArrayList<>();
		catList1.add(new Cat(1, "机器猫1", "蓝色1"));
		catList1.add(new Cat(2, "机器猫2", "蓝色2"));
		catList1.add(new Cat(3, "机器猫3", "蓝色3"));
		catDb.put(new User(1, "sun", "22", "杭州"), catList1);

		List<Cat> catList2 = new ArrayList<>();
		catList2.add(new Cat(12, "机器猫12", "蓝色12"));
		catList2.add(new Cat(22, "机器猫22", "蓝色22"));
		catList2.add(new Cat(32, "机器猫32", "蓝色32"));
		catDb.put(new User(2, "sun2", "23", "北京"), catList2);
	}

	@Override
	public List<Cat> getCatByUser(User user) {

		return catDb.get(user);
	}

	@Override
	public Map<String, Cat> getAllCat() {
		Map<String, Cat> result = new HashMap<>();
		int i = 1;
		for (List<Cat> cats : catDb.values()) {
			for (Cat cat : cats) {
				result.put("第" + i++ + "只", cat);
			}
		}
		return result;
	}

}
