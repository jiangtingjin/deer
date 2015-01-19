package com.etc.white.service.imp;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.etc.white.dao.BwCultureDAO;
import com.etc.white.model.BwCulture;
import com.etc.white.service.BwCultureService;
@Transactional
@Service("bwCultureService")
public class BwCultureServiceImp extends BaseServiceImpl<BwCulture,Long> implements BwCultureService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8302375426429823183L;
	@Autowired
	private BwCultureDAO bwCultureDAO;
	
	@Autowired
	public void setBaseDAO(BwCultureDAO bwCultureDAO){
		super.setBaseDAO(bwCultureDAO);
		this.bwCultureDAO = bwCultureDAO;
		
	}
	

}
