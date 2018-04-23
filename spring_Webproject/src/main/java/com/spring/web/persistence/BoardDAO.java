package com.spring.web.persistence;

import java.util.List;

import com.spring.web.domain.BoardVO;
import com.spring.web.domain.Criteria;
import com.spring.web.domain.SearchCriteria;

public interface BoardDAO {
	//게시글 등록
	public void create(BoardVO vo) throws Exception;
	//게시글 수정
	public void update(BoardVO vo) throws Exception;
	//게시글 삭제
	public void delete(int bno) throws Exception;
	//게시글 조회
	public BoardVO read(int bno) throws Exception;
	//게시글 전체조회
	public List<BoardVO> listAll() throws Exception;
	//페이지 번호에 따라 목록 가져오기, pageStart, pageNum 위해 criteria 넘김
	public List<BoardVO> listCriteria(Criteria cri) throws Exception;
	
	//하단의 페이지 처리를 위해 전체 목록 수 가쟈ㅇ괴
	public int countPaging(Criteria cri) throws Exception;
	
	
	//검색 기능이 들어간 후
	public List<BoardVO> listSearch(SearchCriteria cri) throws Exception;
	public int listSearchCount(SearchCriteria cri) throws Exception;
}
