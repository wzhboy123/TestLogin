package com.service;

import com.model.Users;


public interface UsersService {
/*
 *根据username进行登录查询验证
 *return 返回查询结果
 */
	
	public Users loginValidate(String username);
}
