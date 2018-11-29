package com.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.UsersDao;
import com.model.Users;
import com.service.UsersService;
@Service("usersService")
@Transactional  //注入事务
public class UsersServiceImpl implements UsersService {
//注入usersDao
@Resource(name="usersDao")	
	private UsersDao usersDao;

	public UsersDao getUsersDao() {
	return usersDao;
}


	@Override
	public Users loginValidate(String username) {
		return usersDao.findByUsername(username);
		
	}

}
