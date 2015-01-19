package com.etc.white.dao.imp;

import org.springframework.stereotype.Repository;

import com.etc.white.dao.BwSceneryDAO;

import com.etc.white.model.BwScenery;
@Repository("bwSceneryDAO")
public class BwSceneryDAOImp extends BaseDAOImpl<BwScenery,Long> implements BwSceneryDAO{

    public BwSceneryDAOImp() {
        super(BwScenery.class);
    }

  
    private static final long serialVersionUID = -1124346443547195097L;

}
