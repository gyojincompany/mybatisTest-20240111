package com.jbedu.mybatis.dao;

import java.util.ArrayList;

import com.jbedu.mybatis.dto.MybatisDto;

public interface MybatisDao {
	
	public ArrayList<MybatisDto> listDao(); //게시판 모든 글 목록 가져오기
	public void writeDao(String fbname, String fbtitle, String fbcontent); //게시판 글쓰기
	public MybatisDto contentDao(String fbnum); //게시판 글 내용 가져오기
	public void modifyDao(String fbtitle, String fbname, String fbcontent, String fbnum); //게시판 글 수정하기
	public ArrayList<MybatisDto> searchDao(String searchKey); //제목 또는 내용에 특정단어 포함 결과 검색
}
