package com.etc.white.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.etc.white.dao.BwSceneryDAO;
import com.etc.white.model.BwScenery;
import com.etc.white.service.BwSceneryService;

@Service("bwSceneryService")
public class BwSceneryServiceImp extends BaseServiceImpl<BwScenery, Long> implements BwSceneryService{

 /**
  * 
  */
    private static final long serialVersionUID = -7844125113139315218L;
    
    @Autowired
    private BwSceneryDAO bwSceneryDAO;
    @Autowired
    public void setBaseDAO(BwSceneryDAO bwSceneryDAO){
      super.setBaseDAO(bwSceneryDAO);
        this.bwSceneryDAO = bwSceneryDAO;
        
    }

    
   
}
