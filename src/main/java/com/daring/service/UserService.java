package com.daring.service;

import com.daring.model.user.User;

/**
 * @author shenzucai
 * @time 2017.09.23 19:53
 */
public interface UserService {
	int deleteByPrimaryKey(String id);

	int insert(User record);

	int insertSelective(User record);

	User selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);
}
