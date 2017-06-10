package com.liangjt.service;

import java.util.List;
import java.util.Map;

import com.liangjt.domain.Cat;
import com.liangjt.domain.User;

public interface UserService {
	List<Cat> getCatByUser(User user);
	Map<String ,Cat> getAllCat();
}
