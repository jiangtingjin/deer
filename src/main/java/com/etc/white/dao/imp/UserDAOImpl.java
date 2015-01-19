package com.etc.white.dao.imp;

import org.springframework.stereotype.Repository;


import com.etc.white.dao.UserDAO;
import com.etc.white.model.User;

/**
 * 用户dao层实现
 * @author 蒋廷金
 * 2014年7月9日 下午10:35:27
 */
@Repository("userDAO")
public class UserDAOImpl extends BaseDAOImpl<User,Long> implements UserDAO{

	public UserDAOImpl() {
		super(User.class);
	}

	private static final long serialVersionUID = -2796344492915742940L;
}
