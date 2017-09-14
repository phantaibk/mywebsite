package phan.myweb.spring.business;

import java.util.List;

import phan.myweb.spring.model.User;

public interface UserBusiness {
	List<User> findAll();
	
}
