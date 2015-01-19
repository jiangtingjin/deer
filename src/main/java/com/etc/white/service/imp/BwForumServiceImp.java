package com.etc.white.service.imp;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etc.white.dao.BwForumDAO;
import com.etc.white.model.BwForum;
import com.etc.white.service.BwForumService;
@Service("bwForumService")
public class BwForumServiceImp extends BaseServiceImpl<BwForum, Long> implements BwForumService {

    /**
     * 
     */
    private static final long serialVersionUID = -7287785418775150230L;
    
    @Resource(name="bwForumDAO")
    private BwForumDAO bwForumDAO;

    
    @Autowired
    public void setBaseDAO(BwForumDAO bwForumDAO){
        super.setBaseDAO(bwForumDAO);
        this.bwForumDAO = bwForumDAO;
        
    }
    
}

