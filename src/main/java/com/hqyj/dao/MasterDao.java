package com.hqyj.dao;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.hqyj.domain.Master;
import com.hqyj.util.C3P0Utils;

public class MasterDao {
	public Master login(String account, String pwd) throws SQLException {
		// TODO Auto-generated method stub
		//����dao�����ʵ����
		System.out.println("����һ��һ���ַ�");
		
		//1.��ȡgetDataSource����Դ
		DataSource dataSource=C3P0Utils.getDataSource();
		//2.ʹ��QueryRunner��������
		QueryRunner qr=new QueryRunner(dataSource);
		//3.ִ��SQL���
		return qr.query("select * from j2ee_master where account=? and password=?", 
				new BeanHandler<Master>(Master.class),account,pwd);
		
	}
}
