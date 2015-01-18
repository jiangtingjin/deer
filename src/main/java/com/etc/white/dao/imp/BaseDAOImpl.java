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
 * @param <T>
 * @param <PK>
 */
@Transactional
public class BaseDAOImpl<T,PK extends Serializable> implements BaseDAO<T,PK>{
	private static final long serialVersionUID = 7655615690311866624L;

	protected Class<T> entityClass;
	
	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;
	
	public BaseDAOImpl (Class<T> entityClass){
		this.entityClass = entityClass;
	}
	
	public Session getSession(){
		return this.sessionFactory.getCurrentSession();
	}
	

	public void save(T model){
		this.getSession().save(model);
	}
	
	public void saveOrUpdate(T model){
		this.getSession().saveOrUpdate(model);
	}
	
	public void delete(PK id){
		this.getSession().delete(this.get(id));
	}
	
	public void delete(T model){
		this.getSession().delete(model);;
	}
	
	public void update(T model){
		this.getSession().update(model);
	}

	@SuppressWarnings("unchecked")
	public T get(PK id){
		return (T) this.getSession().get(entityClass, id);
	}
	
	@SuppressWarnings("unchecked")
	public T find(PK id){
		return (T) this.getSession().load(this.entityClass,id);
	}
	
	@SuppressWarnings("unchecked")
	public List<T> findAll(){
		return this.getSession().createCriteria(this.entityClass).list();
		
	}
	

}
