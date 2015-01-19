package com.etc.white.service.imp;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etc.white.dao.BwIntroductionDAO;
import com.etc.white.model.BwIntroduction;
import com.etc.white.service.BwIntroductionService;
@Service("bwIntroductionService")
public class BwIntroductionServiceImp extends BaseServiceImpl<BwIntroduction, Long> implements BwIntroductionService{

    /**
     * 
     */
    private static final long serialVersionUID = 4020779802509639270L;
    
    @Resource(name="bwIntroductionDAO")
    private BwIntroductionDAO bwIntroductionDAO;

    
    @Autowired
    public void setBaseDAO(BwIntroductionDAO bwIntroductionDAO){
        super.setBaseDAO(bwIntroductionDAO);
        this.bwIntroductionDAO = bwIntroductionDAO;
        
    }
    

}
