package com.hqyj.service;

import java.sql.SQLException;

import com.hqyj.dao.MasterDao;
import com.hqyj.domain.Master;

public class MasterService {
//��¼����
	public Master login(String account, String pwd) throws SQLException {
		// TODO Auto-generated method stub
		//����dao�����ʵ����
		System.out.println("���������� ,MasterService ");
		MasterDao md=new MasterDao();
		Master master=md.login(account, pwd);
		
		return master;
	}

}
