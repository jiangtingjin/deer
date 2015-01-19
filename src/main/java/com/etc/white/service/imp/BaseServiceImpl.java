package com.etc.white.service.imp;


import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.etc.white.dao.BaseDAO;
import com.etc.white.service.BaseService;

/**
 * 
 * @author tjjiang
 *
 * @param <T>
 * @param <PK>
 */

@Service
@Transactional
public class BaseServiceImpl<MODEL,PK extends Serializable> implements BaseService<MODEL,PK>{
	
	private static final long serialVersionUID = 1738828121491218291L;

	
	private BaseDAO<MODEL,PK> baseDAO;

	public BaseDAO<MODEL, PK> getBaseDAO() {
		return baseDAO;
	}

	public void setBaseDAO(BaseDAO<MODEL, PK> baseDAO) {
		this.baseDAO = baseDAO;
	}

	@Override
	public void save(MODEL model) {
		this.baseDAO.save(model);
	}

	@Override
	public void saveOrUpdate(MODEL model) {
		this.baseDAO.saveOrUpdate(model);
	}

	@Override
	public void delete(PK id) {
		this.baseDAO.delete(id);		
	}

	@Override
	public void delete(MODEL model) {
		this.baseDAO.delete(model);
	}

	@Override
	public void update(MODEL model) {
		this.baseDAO.update(model);		
	}

	@Transactional(readOnly=true)
	public MODEL get(PK id) {
		return this.baseDAO.get(id);
	}

	@Transactional(readOnly=true)
	public MODEL find(PK id) {
		return this.baseDAO.find(id);
	}

	@Transactional(readOnly=true)
	public List<MODEL> findAll() {
		return this.baseDAO.findAll();
	}
	
	
}
