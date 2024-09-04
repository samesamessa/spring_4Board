package org.iclass.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.iclass.dto.CommunityDTO;
import org.iclass.dto.PageReqDTO;

@Mapper

public interface CommunityMapper {
	// 인터페이스 추상메소드 선언
	// mapper의 id와 같은 이름의 메소드, 리턴과 파라미터 타입도 동일하게
	// 리턴과 파라미터(메소드 인자) 타입을 동일하게
	int insert(CommunityDTO dto);
	int update(CommunityDTO dto);
	int delete(int idx);
	CommunityDTO selectByIdx(int idx);
	int getCount();
	int getCommentCount(int idx);
	int setReadCount(int idx);
	int serCommentCount(int mref);
	List<CommunityDTO> getList(PageReqDTO dto);
	
	
}
