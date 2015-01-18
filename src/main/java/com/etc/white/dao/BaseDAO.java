package com.etc.white.dao;


import java.io.Serializable;

import java.util.List;
/**
 * 
 * @author tjjiang
 *
 * @param <MODER>
 * @param <PK>
 */
public interface BaseDAO<MODER,PK extends Serializable> extends Serializable {

	void save(MODER model);
	
	void saveOrUpdate(MODER model);
	
	void delete(PK id);
	
	void delete(MODER model);
	
	void update(MODER model);
	
	MODER get(PK id);
	
	MODER find(PK id);
	
	List<MODER> findAll();

}
