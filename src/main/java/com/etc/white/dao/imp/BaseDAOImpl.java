package com.etc.white.dao.imp;


import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;
import com.etc.white.dao.BaseDAO;
/**
 * 
 * @author tjjiang
 *
 * @param <MODEL>
 * @param <PK>
 */
@Transactional
public class BaseDAOImpl<MODEL,PK extends Serializable> implements BaseDAO<MODEL,PK>{
	private static final long serialVersionUID = 7655615690311866624L;

	protected Class<MODEL> entityClass;
	
	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;
	
	public BaseDAOImpl (Class<MODEL> entityClass){
		this.entityClass = entityClass;
	}
	
	public Session getSession(){
		return this.sessionFactory.getCurrentSession();
	}
	

	public void save(MODEL model){
		this.getSession().save(model);
	}
	
	public void saveOrUpdate(MODEL model){
		this.getSession().saveOrUpdate(model);
	}
	
	public void delete(PK id){
		this.getSession().delete(this.get(id));
	}
	
	public void delete(MODEL model){
		this.getSession().delete(model);;
	}
	
	public void update(MODEL model){
		this.getSession().update(model);
	}

	@SuppressWarnings("unchecked")
	public MODEL get(PK id){
		return (MODEL) this.getSession().get(entityClass, id);
	}
	
	@SuppressWarnings("unchecked")
	public MODEL find(PK id){
		return (MODEL) this.getSession().load(this.entityClass,id);
	}
	
	@SuppressWarnings("unchecked")
	public List<MODEL> findAll(){
		return this.getSession().createCriteria(this.entityClass).list();
		
	}
	

}
