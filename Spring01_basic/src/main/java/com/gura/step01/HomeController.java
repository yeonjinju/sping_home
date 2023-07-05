package com.gura.step01;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	 
		// �� ������Ʈ�� �ֻ��� ��� ��û�� ����
	   @RequestMapping("/")
	   public String home(HttpServletRequest request) {
		   // ���信 �ʿ��� ������(Model) �̶�� ��������
		   List<String> noticeList=new ArrayList<String>();
		   noticeList.add("������ ���� �������� �־��");
		   noticeList.add("��¼��...");
		   noticeList.add("��¼��...");
		   
		   // home.jsp ���������� �ʿ��� ��(data) �� HttpServletRequest ��ü�� ��Ƶα�
		   request.setAttribute("noticeList", noticeList);
		   
		   // /WEB-INF/views/home.jsp �������� forward �̵��ؼ� �����ϰڴٴ� �ǹ�
		   // "home" �̶�� ���ڿ��� �����ϸ� �տ� "/WEB-INF/views/" �ڿ� ".jsp" �� �ڵ����� �ٴ´�.
	      return "home";
	   }
}