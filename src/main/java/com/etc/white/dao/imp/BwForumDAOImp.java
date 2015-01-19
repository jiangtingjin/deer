package com.etc.white.dao.imp;

import org.springframework.stereotype.Repository;

import com.etc.white.dao.BwForumDAO;
import com.etc.white.model.BwForum;

@Repository("bwForumDAO")
public class BwForumDAOImp extends BaseDAOImpl<BwForum, Long> implements BwForumDAO{

    public BwForumDAOImp() {
        super(BwForum.class);
       
    }

    /**
     * 
     */
    private static final long serialVersionUID = -5729902468150165528L;

}
