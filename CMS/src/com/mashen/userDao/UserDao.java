package com.mashen.userDao;

import java.util.List;

import com.mashen.domian.PageBean;
import com.mashen.domian.User;

public interface UserDao {
	public List<User> userLogin(User user);
	public User userRegister(User user);
	public List<User> userShow(User user);
	public int userLike(Integer articleId);
	public int userReport(Integer articleId);
	public int userCollection(Integer articleId);
	public List<User> userCheck(User user);
}
