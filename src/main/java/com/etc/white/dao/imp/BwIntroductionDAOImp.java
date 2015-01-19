package com.etc.white.dao.imp;




import org.springframework.stereotype.Repository;

import com.etc.white.dao.BwIntroductionDAO;
import com.etc.white.model.BwIntroduction;

@Repository("bwIntroductionDAO")
public class BwIntroductionDAOImp extends BaseDAOImpl<BwIntroduction, Long> implements BwIntroductionDAO {

    public BwIntroductionDAOImp() {
        super(BwIntroduction.class);
  
    }

    /**
     * 
     */
    private static final long serialVersionUID = 3530242466223772019L;

   

}
