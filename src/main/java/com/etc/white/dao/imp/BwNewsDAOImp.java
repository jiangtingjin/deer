package com.etc.white.dao.imp;

import org.springframework.stereotype.Repository;

import com.etc.white.dao.BwNewsDAO;
import com.etc.white.model.BwNews;

@Repository("bwNewsDAO")
public class BwNewsDAOImp extends BaseDAOImpl<BwNews, Long>implements BwNewsDAO {

    public BwNewsDAOImp() {
        super(BwNews.class);
    }

    /**
     * 
     */
    private static final long serialVersionUID = 4604231874195356848L;

}
