package phan.myweb.spring.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import phan.myweb.spring.dao.CommonDAO;
import phan.myweb.spring.exception.MyWebException;
import phan.myweb.spring.model.User;

@Repository(value="commonDao")
public class CommonDAOImpl {
	
	@Autowired
	static SessionFactory sessionFactory;
	
	public static List findAll(Class clazz, Integer firstResult, Integer maxResult) throws MyWebException{
		/*System.out.println("dfdfdssssss");
		Session session = sessionFactory.getCurrentSession();
		System.out.println("dfsdfsdfsdffs");
		
		System.out.println("dfdfd");*/
		try {
			Criteria criteria = sessionFactory.getCurrentSession().createCriteria(clazz);
			if (firstResult != null && maxResult != null) {
				criteria.setFirstResult(firstResult);
				criteria.setMaxResults(maxResult);
			}
			System.out.println("Success!");
			return (List) criteria.list();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Loi khong xac dinh");
			throw new MyWebException();
		}
	}
	/*public static void main(String[] args) {
		findAll(User.class, null, null);
	}*/
	
}
