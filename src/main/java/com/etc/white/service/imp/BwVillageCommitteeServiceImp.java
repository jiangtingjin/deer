package com.etc.white.service.imp;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etc.white.dao.BwVillageCommitteeDAO;
import com.etc.white.model.BwVillageCommittee;
import com.etc.white.service.BwVillageCommitteeService;
@Service("bwVillageCommitteeService")
public class BwVillageCommitteeServiceImp extends BaseServiceImpl<BwVillageCommittee, Long> implements BwVillageCommitteeService{

    /**
     * 
     */
    private static final long serialVersionUID = -3688640161797033296L;
    
    @Resource(name="bwVillageCommitteeDAO")
    private BwVillageCommitteeDAO bwVillageCommitteeDAO;

    
    @Autowired
    public void setBaseDAO(BwVillageCommitteeDAO bwVillageCommitteeDAO){
        super.setBaseDAO(bwVillageCommitteeDAO);
        this.bwVillageCommitteeDAO = bwVillageCommitteeDAO;
        
    }
 

}
