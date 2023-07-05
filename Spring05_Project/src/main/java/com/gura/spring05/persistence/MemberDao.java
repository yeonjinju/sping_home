package com.gura.spring05.persistence;

import com.gura.spring05.domain.MemberDto;

public interface MemberDao {
	// 회원가입
	public void signup(MemberDto dto) throws Exception;
	
	// 로그인
	public MemberDto signin(MemberDto dto) throws Exception; 

}
