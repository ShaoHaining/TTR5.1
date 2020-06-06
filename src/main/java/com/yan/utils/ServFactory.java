package com.yan.utils;

import com.yan.biz.IUserServ;
import com.yan.biz.UserServImpl;

public class ServFactory {
	public static IUserServ getUserServ() {
		return new UserServImpl();
	}
}
