package cn.itcast.user;


import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//@Service(value="userService")
public class UserService {

	//得到dao对象
	//1 定义dao类型属�??
	//在dao属�?�上面使用注�? 完成对象注入
//	@Autowired
//	private UserDao userDao;
	// 使用注解方式时�?�不�?要set方法
	// name属�?��?? �? 注解创建dao对象 value�?
	@Resource(name="userDao")
	private UserDao userDao;
	@Resource(name="student")
	private Student sd;
	public void add() {
		System.out.println("service...........");
		userDao.add();
		sd.add();
	}
}
