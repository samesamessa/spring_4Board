package org.iclass.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class PageReqDTO {
	private int page = 1;			// 요청 페이지
	private int pageSize = 10;		// 페이지 당 글 수
	private int start;			// 시작 글 번호, 시작 rownum
	private int end;			// 끝 글 번호 , 끝 rownum
	
	private PageReqDTO() {}
	
	public static PageReqDTO of(int page, int pageSize) {
		int start = (page-1)*pageSize +1;
		int end = start + (pageSize-1);
		
		PageReqDTO dto = new PageReqDTO();
		dto.setPage(page);
		dto.setPageSize(pageSize);
		dto.setStart(start);
		dto.setEnd(end);
		return dto;
	}
}
