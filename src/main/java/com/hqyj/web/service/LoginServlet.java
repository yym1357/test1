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
		response.getWriter().append("Served at: //ҳ�����").append(request.getContextPath());
		System.out.println("111");*/
		//ģ���½
		//ͨ�������ȡ�����������Ϣ
		try {
		String account=request.getParameter("name");
		String pwd=request.getParameter("password");
		
		
		//��¼
		//����MasterService�������MasterService���login����
		MasterService ms=new MasterService();
		//��¼����
		System.out.println("�����쵼���Ҳ��ɻ�");
		
			Master master=ms.login(account,pwd);
			
			if(master != null) {
				System.out.println("��¼�ɹ�");
				//��תҳ��1.����ת��
				//2.�ض���
				request.getRequestDispatcher("/index.jsp").forward(request,response);
			}else {
				
				System.out.println("��¼ʧ��");
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
