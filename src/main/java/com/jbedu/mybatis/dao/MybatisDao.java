package com.jbedu.mybatis.dao;

import java.util.ArrayList;

import com.jbedu.mybatis.dto.MybatisDto;

public interface MybatisDao {
	
	public ArrayList<MybatisDto> listDao(); //게시판 모든 글 목록 가져오기
	public void writeDao(String fbname, String fbtitle, String fbcontent); //게시판 글쓰기
}
