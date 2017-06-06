package com.liangjt.app.service;

import java.util.List;

import com.liangjt.app.domain.Cat;
import com.liangjt.app.domain.User;

public interface UserService {
	List<Cat> getCatByUser(User user);

}
