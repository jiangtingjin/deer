package com.etc.white.service;

/**
 *@author tjjiang

 */

import java.io.Serializable;
import java.util.List;

public interface BaseService<MODEL, PK extends Serializable> extends Serializable {

	void save(MODEL model);
	
	void saveOrUpdate(MODEL model);
	
	void delete(PK id);
	
	void delete(MODEL model);
	
	void update(MODEL model);
	
	MODEL get(PK id);
	
	MODEL find(PK id);
	
	List<MODEL> findAll();
}
