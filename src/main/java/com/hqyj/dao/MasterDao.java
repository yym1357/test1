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
		//调用dao里的真实操作
		System.out.println("任务一级一级分发");
		
		//1.获取getDataSource数据源
		DataSource dataSource=C3P0Utils.getDataSource();
		//2.使用QueryRunner创建对象
		QueryRunner qr=new QueryRunner(dataSource);
		//3.执行SQL语句
		return qr.query("select * from j2ee_master where account=? and password=?", 
				new BeanHandler<Master>(Master.class),account,pwd);
		
	}
}
