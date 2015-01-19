package com.etc.white.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etc.white.dao.BwUserDAO;
import com.etc.white.model.BwUser;
import com.etc.white.service.BwUserService;
@Service("bwUserService")
public class BwUserServiceImp extends BaseServiceImpl<BwUser, Long> implements BwUserService{

    /**
     * 
     */
    private static final long serialVersionUID = -5351552591094988521L;
    
    
    @Autowired
    private BwUserDAO bwUserDAO;
    @Autowired
    public void setBaseDAO(BwUserDAO bwUserDAO){
      super.setBaseDAO(bwUserDAO);
        this.bwUserDAO = bwUserDAO;
        
    }
}
