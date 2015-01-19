package com.etc.white.dao.imp;

import org.springframework.stereotype.Repository;

import com.etc.white.dao.BwVillageCommitteeDAO;
import com.etc.white.model.BwVillageCommittee;
@Repository("bwVillageCommitteeDAO")
public class BwVillageCommitteeDAOImp extends BaseDAOImpl<BwVillageCommittee, Long> implements BwVillageCommitteeDAO {

    public BwVillageCommitteeDAOImp( ) {
        super(BwVillageCommittee.class);
    }

    /**
     * 
     */
    private static final long serialVersionUID = -627915590790420492L;

}
