package com.yan.utils;

import com.yan.dao.IUserDao;
import com.yan.dao.UserDaoImpl;

public class DaoFactory {
public static IUserDao getUserDao(){
	return new UserDaoImpl();
}
}
