package com.etc.white.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etc.white.dao.BwNewsDAO;
import com.etc.white.model.BwNews;
import com.etc.white.service.BwNewsService;
@Service("bwNewsService")
public class BwNewsServiceImp extends BaseServiceImpl<BwNews, Long>implements BwNewsService {

    /**
     * 
     */
    private static final long serialVersionUID = 7439963024106421651L;
    
    @Autowired
    private BwNewsDAO bwNewsDAO;
    @Autowired
    public void setBaseDAO(BwNewsDAO bwNewsDAO){
      super.setBaseDAO(bwNewsDAO);
        this.bwNewsDAO = bwNewsDAO;
        
    }

}
