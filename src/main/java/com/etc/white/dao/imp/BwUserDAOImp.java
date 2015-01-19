package com.etc.white.dao.imp;

import org.springframework.stereotype.Repository;

import com.etc.white.dao.BwUserDAO;
import com.etc.white.model.BwUser;
@Repository("bwUserDAO")
public class BwUserDAOImp extends BaseDAOImpl<BwUser, Long> implements BwUserDAO{

    public BwUserDAOImp() {
        super(BwUser.class);
    }

    /**
     * 
     */
    private static final long serialVersionUID = -342871209299700753L;

}
