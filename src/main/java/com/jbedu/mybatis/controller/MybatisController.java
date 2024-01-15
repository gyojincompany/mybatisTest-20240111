package com.jbedu.mybatis.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jbedu.mybatis.dao.MemberDao;
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
	public String write_form(HttpSession session, Model model) {
		
		String sid = (String) session.getAttribute("sessionId");
		MemberDao dao = sqlSession.getMapper(MemberDao.class);
		
		if(sid == null) { //로그인 상태여부 확인->참이면 로그인하지 않은 상태
			return "redirect:login";
		} else { //로그인된 상태		
			
			model.addAttribute("memberDto", dao.checkIdDao(sid));
			
			return "write_form";
		}	
	}
	
	@RequestMapping(value = "/write")
	public String write(HttpServletRequest request) {
		
		MybatisDao dao = sqlSession.getMapper(MybatisDao.class);//dao 객체 분리 생성
		dao.writeDao(request.getParameter("fbname"), request.getParameter("fbtitle"), request.getParameter("fbcontent"));
		
		return "redirect:list";
	}
	
	@RequestMapping(value = "/content_view")
	public String content_view(HttpServletRequest request, Model model) {
		
		MybatisDao dao = sqlSession.getMapper(MybatisDao.class);//dao 객체 분리 생성
		dao.uphitDao(request.getParameter("fbnum"));//조회수 증가 함수 호출
		model.addAttribute("fboardDto", dao.contentDao(request.getParameter("fbnum")));
		
		return "content_view";
	}
	
	@RequestMapping(value = "/modify_form" )
	public String modify_form(HttpServletRequest request, Model model) {
		
		MybatisDao dao = sqlSession.getMapper(MybatisDao.class);//dao 객체 분리 생성
		model.addAttribute("fboardDto", dao.contentDao(request.getParameter("fbnum")));
		
		return "modify_form";
	}
	
	@RequestMapping(value = "/modify")
	public String modify(HttpServletRequest request, Model model) {
		
		MybatisDao dao = sqlSession.getMapper(MybatisDao.class);
		dao.modifyDao(request.getParameter("fbtitle"), request.getParameter("fbname"), request.getParameter("fbcontent"), request.getParameter("fbnum"));
		
		return "redirect:list";
	}
	
	@RequestMapping(value = "/search")
	public String search(HttpServletRequest request, Model model) {
		
		MybatisDao dao = sqlSession.getMapper(MybatisDao.class);//dao 객체 분리 생성
		model.addAttribute("fboardDtos", dao.searchDao(request.getParameter("searchKey")));
		
		return "list";
	}
	
	@RequestMapping(value = "/delete")
	public String delete(HttpServletRequest request, Model model) {
		
		MybatisDao dao = sqlSession.getMapper(MybatisDao.class);
		dao.deleteDao(request.getParameter("fbnum"));
		
		return "redirect:list";
	}

}
