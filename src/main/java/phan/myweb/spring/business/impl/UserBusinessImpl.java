package phan.myweb.spring.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import phan.myweb.spring.business.UserBusiness;
import phan.myweb.spring.dao.CommonDAO;
import phan.myweb.spring.model.User;

@Service(value ="userBusiness")
public class UserBusinessImpl implements UserBusiness{
	
	@Autowired
	CommonDAO commonDao;
	
	@Transactional
	public List<User> findAll(){
		return commonDao.findAll(User.class, null, null);
	}
}
