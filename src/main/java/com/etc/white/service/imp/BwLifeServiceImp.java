package com.etc.white.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etc.white.dao.BwLifeDAO;
import com.etc.white.model.BwLife;
import com.etc.white.service.BwLifeService;
@Service("bwLifeService")
public class BwLifeServiceImp extends BaseServiceImpl<BwLife, Long> implements BwLifeService{

    /**
     * 
     */
    private static final long serialVersionUID = -294070638131039155L;
    
    @Autowired
    private BwLifeDAO bwLifeDAO;
    
    @Autowired
    public void setBaseDAO(BwLifeDAO bwLifeDAO){
        super.setBaseDAO(bwLifeDAO);
        this.bwLifeDAO = bwLifeDAO;
        
    }

}
