package com.gura.spring05.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.gura.spring05.domain.MemberDto;

public class AdminInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest req,
	      HttpServletResponse res, Object obj) throws Exception {
	    
	    HttpSession session = req.getSession();
	    MemberDto member = (MemberDto)session.getAttribute("member");
	    
	    if(member == null) {
	    	res.sendRedirect("/member/signin");
	    	return false;
	    }
	    
	    if(member.getVerify()!=9) {
	    	res.sendRedirect("/");
	    	return false;
	    }
	    
	    return true;
	}
}

