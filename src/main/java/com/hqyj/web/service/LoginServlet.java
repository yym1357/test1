package com.hqyj.web.service;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hqyj.domain.Master;
import com.hqyj.service.MasterService;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*// TODO Auto-generated method stub
		response.getWriter().append("Served at: //页面输出").append(request.getContextPath());
		System.out.println("111");*/
		//模拟登陆
		//通过请求获取请求带来的信息
		try {
		String account=request.getParameter("name");
		String pwd=request.getParameter("password");
		
		
		//登录
		//创建MasterService对象调用MasterService里的login方法
		MasterService ms=new MasterService();
		//登录方法
		System.out.println("我是领导，我不干活");
		
			Master master=ms.login(account,pwd);
			
			if(master != null) {
				System.out.println("登录成功");
				//跳转页面1.请求转发
				//2.重定向
				request.getRequestDispatcher("/index.jsp").forward(request,response);
			}else {
				
				System.out.println("登录失败");
				request.getRequestDispatcher("/login.jsp").forward(request,response);
				
			}
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
