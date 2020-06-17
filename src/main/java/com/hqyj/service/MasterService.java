package com.hqyj.service;

import java.sql.SQLException;

import com.hqyj.dao.MasterDao;
import com.hqyj.domain.Master;

public class MasterService {
//登录代码
	public Master login(String account, String pwd) throws SQLException {
		// TODO Auto-generated method stub
		//调用dao里的真实操作
		System.out.println("任务到我这了 ,MasterService ");
		MasterDao md=new MasterDao();
		Master master=md.login(account, pwd);
		
		return master;
	}

}
