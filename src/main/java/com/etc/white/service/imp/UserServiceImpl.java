package com.etc.white.service.imp;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.etc.white.dao.UserDAO;
import com.etc.white.model.User;
import com.etc.white.service.UserService;


/**
 * 
 * @author 蒋廷金
 *
 */
@Transactional
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User,Long> implements UserService{

	private static final long serialVersionUID = -2196327037744286310L;
	
	@Resource(name="userDAO")
	private UserDAO userDAO;

	
	@Autowired
	public void setBaseDAO(UserDAO userDAO){
		super.setBaseDAO(userDAO);
		this.userDAO = userDAO;
		
	}
	
}
