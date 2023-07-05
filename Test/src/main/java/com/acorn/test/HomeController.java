package com.acorn.test;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home(HttpServletRequest request) {
		List<String> noticeList=new ArrayList<String>();
		noticeList.add("공지사항");
		request.setAttribute("noticList", noticeList);
		
		return "home";
	}
	
}
