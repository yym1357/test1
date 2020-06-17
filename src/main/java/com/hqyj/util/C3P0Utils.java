package com.hqyj.util;
/**
 * 
 * @author zhangjie


  java的设计模式中的一种： 单例模式
     单例模式： 就是不允许外界随意创建对象  只有一个对象
 *
 */


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3P0Utils {
	//得到数据源
	private static DataSource dataSource = new ComboPooledDataSource();
	
	//外部获取数据源的方法
	public static DataSource getDataSource() {
		return dataSource;
	}
	
	//获取连接
	public static Connection getConnection() {
		 try {
			return dataSource.getConnection();
		} catch (SQLException e) {
			 throw new RuntimeException("服务器忙....");
		}
		
	}
	
	//释放资源
	public static void release(Connection conn, Statement stamt, ResultSet rs ) {
		  if(conn !=null) {
			  try {
				conn.close();
				conn =null;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }
		
		  if(stamt !=null) {
			  try {
				stamt.close();
				stamt = null;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }
		  if(rs !=null) {
			  try {
				  rs.close();
				  rs = null;
			  } catch (SQLException e) {
				  // TODO Auto-generated catch block
				  e.printStackTrace();
			  }
		  }
		
	}
	

}
