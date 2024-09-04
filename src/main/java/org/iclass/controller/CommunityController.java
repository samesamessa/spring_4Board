package org.iclass.controller;

import org.iclass.dto.CommunityDTO;
import org.iclass.dto.PageReqDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/community")
public class CommunityController {

	@GetMapping("/list")
	public String list(@RequestParam(defaultValue="1")
		int page, String columns, String keyword) {
			
			log.info(page + " - " + keyword);
			return "community/list";
	}
	
	@GetMapping("/write")
	public String write(int page) {
		log.info(":::::" + page);
		return "community/write";
	}
	
	@PostMapping("/write") // 글 저장 후 글 목록으로 url 이동
	public String save(CommunityDTO dto) {
		log.info("입력 값 : {}", dto.getContent());
		return "redirect:list";
	}
	
	@GetMapping("/modify")
	public String modify(int idx, int page) {
		
		return "community/modify";
	}
	
	@GetMapping("/read")
	public String read(int idx, int page, Model model) {
		
		return "community/read";
	}
	
	@GetMapping("/remove") // 글 삭제 후 글 목록으로 url 이동
	public String remove(int idx, int page) {
		
		return "redirect:list";
	}
}
