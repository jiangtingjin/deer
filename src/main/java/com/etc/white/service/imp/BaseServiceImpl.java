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
public class BaseServiceImpl<T,PK extends Serializable> implements BaseService<T,PK>{
	
	private static final long serialVersionUID = 1738828121491218291L;

	
	private BaseDAO<T,PK> baseDAO;

	public BaseDAO<T, PK> getBaseDAO() {
		return baseDAO;
	}

	public void setBaseDAO(BaseDAO<T, PK> baseDAO) {
		this.baseDAO = baseDAO;
	}

	@Override
	public void save(T model) {
		this.baseDAO.save(model);
	}

	@Override
	public void saveOrUpdate(T model) {
		this.baseDAO.saveOrUpdate(model);
	}

	@Override
	public void delete(PK id) {
		this.baseDAO.delete(id);		
	}

	@Override
	public void delete(T model) {
		this.baseDAO.delete(model);
	}

	@Override
	public void update(T model) {
		this.baseDAO.update(model);		
	}

	@Transactional(readOnly=true)
	public T get(PK id) {
		return this.baseDAO.get(id);
	}

	@Transactional(readOnly=true)
	public T find(PK id) {
		return this.baseDAO.find(id);
	}

	@Transactional(readOnly=true)
	public List<T> findAll() {
		return this.baseDAO.findAll();
	}
	
	
}
