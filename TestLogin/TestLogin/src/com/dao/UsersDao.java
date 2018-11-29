package com.dao;

import com.model.Users;
/***
 * 根据username查询记录
 * @param  username 用户名
 * @return 查询结果
 *
 */

public interface UsersDao {
	//登录验证的方法
	public Users findByUsername(String username);

}
