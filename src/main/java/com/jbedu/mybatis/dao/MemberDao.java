package com.jbedu.mybatis.dao;

import com.jbedu.mybatis.dto.MemberDto;

public interface MemberDao {
	
	public void joinDao(String mid, String mpw, String mname, String memail);//회원가입
	public MemberDto checkIdDao(String checkId);//아이디 중복체크
	public int checkIdPwDao(String mid, String mpw);
	//아이디와 비밀번호 존재 및 일치여부 확인->아이디와 비밀번호 일치하면(로그인 성공) 1이 반환되고 아니면 0이 반환
	
	//아이디로 멤버테이블을 검색해서 회원 정보 가져오기

}
