package org.iclass.controller;

import java.util.Map;

import org.iclass.dto.CommunityDTO;
import org.iclass.service.CommunityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/community")
@RequiredArgsConstructor
public class CommunityController {
	private final CommunityService service;
	@GetMapping("/list")
	public String list(@RequestParam(defaultValue="1")
		int page, String columns, String keyword, Model model) {
		Map<String, Object> map = service.pageSearchList(page);
		model.addAttribute("list", map.get("list"));
		model.addAttribute("pageDto", map.get("pageDto"));
			return "community/list";
	}
	
	@GetMapping("/write")
	public String write(int page) {
		log.info(":::::" + page);
		return "community/write";
	}
	
	@PostMapping("/write") // 글 저장 후 글 목록으로 url 이동
	public String save(CommunityDTO dto) {
		log.info("제목 : {}", dto.getTitle());
		log.info("내용 : {}", dto.getContent());
		return "redirect:list";
	}
	
	@GetMapping("/modify")
	public String modify(int idx, int page, CommunityDTO dto) {
		
		return "community/modify";
	}
	
	@GetMapping("/read")
	public String read(int idx, int page, Model model) {
		CommunityDTO dto = service.readDetail(idx);
		model.addAttribute("dto", dto);
		model.addAttribute("page", page);
		return "community/read";
	}
	
	@GetMapping("/remove") // 글 삭제 후 글 목록으로 url 이동
	public String remove(int idx, int page) {
		
		return "redirect:list";
	}
}
