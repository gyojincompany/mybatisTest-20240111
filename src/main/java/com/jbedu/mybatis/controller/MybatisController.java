package com.jbedu.mybatis.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jbedu.mybatis.dao.MybatisDao;
import com.jbedu.mybatis.dto.MybatisDto;

@Controller
public class MybatisController {
	
	@Autowired //의존 자동 주입
	private SqlSession sqlSession;
	
	@RequestMapping(value = "/list")
	public String list(Model model) {
		
		//MybatisDao dao = new MybatisDao();
		MybatisDao dao = sqlSession.getMapper(MybatisDao.class);//dao 객체 분리 생성
		
		ArrayList<MybatisDto> dtos = dao.listDao();
		
		model.addAttribute("fboardDtos", dtos);
		
		return "list";
	}
	
	@RequestMapping(value = "/write_form")
	public String write_form() {
		return "write_form";
	}
	
	@RequestMapping(value = "/write")
	public String write(HttpServletRequest request) {
		
		MybatisDao dao = sqlSession.getMapper(MybatisDao.class);//dao 객체 분리 생성
		dao.writeDao(request.getParameter("fbname"), request.getParameter("fbtitle"), request.getParameter("fbcontent"));
		
		return "redirect:list";
	}

}
