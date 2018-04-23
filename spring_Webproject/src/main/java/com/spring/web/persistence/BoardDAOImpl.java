package com.spring.web.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.spring.web.domain.BoardVO;
import com.spring.web.domain.Criteria;
import com.spring.web.domain.SearchCriteria;
@Repository
public class BoardDAOImpl implements BoardDAO{
	
	private static final String namespace="mappers.boardMapper";
	
	@Inject
	private SqlSession session;

	@Override
	public void create(BoardVO vo) throws Exception {
		session.insert(namespace+".create",vo);		
	}

	@Override
	public void update(BoardVO vo) throws Exception {
		session.update(namespace+".update",vo);
	}

	@Override
	public void delete(int bno) throws Exception {
		session.delete(namespace+".delete",bno);
	}

	@Override
	public BoardVO read(int bno) throws Exception {
		return session.selectOne(namespace+".read",bno);
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		return session.selectList(namespace+".listAll");
	}

	@Override
	public List<BoardVO> listCriteria(Criteria cri) throws Exception {
		return session.selectList(namespace+".listCriteria",cri);
	}

	@Override
	public int countPaging(Criteria cri) throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne(namespace+".countPaging",cri);
	}

	@Override
	public List<BoardVO> listSearch(SearchCriteria cri) throws Exception {
		return session.selectList(namespace+".listSearch",cri);
	}

	@Override
	public int listSearchCount(SearchCriteria cri) throws Exception {
		return session.selectOne(namespace+".listSearchCount",cri);
	}

}
