package com.etc.white.dao.imp;

import org.springframework.stereotype.Repository;

import com.etc.white.dao.BwLifeDAO;
import com.etc.white.model.BwLife;

@Repository("bwLifeDAO")
public class BwLifeDAOImp extends BaseDAOImpl<BwLife, Long> implements BwLifeDAO {

    public BwLifeDAOImp() {
        super(BwLife.class);
        // TODO Auto-generated constructor stub
    }

    /**
     * 
     */
    private static final long serialVersionUID = 5792458316888152875L;

}
