package com.spring.web.service;

import java.util.List;

import com.spring.web.domain.BoardVO;
import com.spring.web.domain.Criteria;
import com.spring.web.domain.SearchCriteria;

public interface BoardService {
	//게시글 등록
	public void regist(BoardVO vo) throws Exception;
	//게시글 수정
	public void modify(BoardVO vo) throws Exception;
	//게시글 삭제
	public void remove(int bno) throws Exception;
	//게시글 조회
	public BoardVO read(int bno) throws Exception;
	//게시글 전체조회
	public List<BoardVO> listAll() throws Exception;
	
	//페이지 번호에 따라 목록 가져오기, pageStart, pageNum 위해 criteria 넘김
	public List<BoardVO> listCriteria(Criteria cri) throws Exception;
	//전체 목록 수 구하기
	public int listCountCriteria(Criteria cri) throws Exception;
	
	//검색기능 추가 후
	public List<BoardVO> listSearch(SearchCriteria cri) throws Exception;
	public int listSearchCount(SearchCriteria cri) throws Exception;

}
