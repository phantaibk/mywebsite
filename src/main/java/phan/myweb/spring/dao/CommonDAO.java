package phan.myweb.spring.dao;

import java.util.List;

import phan.myweb.spring.exception.MyWebException;

public interface CommonDAO {
	
	public List findAll(Class clazz, Integer firstResult, Integer maxResult) throws MyWebException;
	
}
