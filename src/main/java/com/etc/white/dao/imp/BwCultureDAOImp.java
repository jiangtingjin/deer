package com.etc.white.dao.imp;

import org.springframework.stereotype.Repository;


import com.etc.white.dao.BwCultureDAO;

import com.etc.white.model.BwCulture;

/**
 * 用户dao层实现
 * @author 蒋廷金
 * 2014年7月9日 下午10:35:27
 */

@Repository("bwCultureDAO")
public class BwCultureDAOImp extends BaseDAOImpl<BwCulture,Long> implements BwCultureDAO {

	public BwCultureDAOImp() {
		super(BwCulture.class);
	}

	
	private static final long serialVersionUID = 1903939908291715076L;

	

}
