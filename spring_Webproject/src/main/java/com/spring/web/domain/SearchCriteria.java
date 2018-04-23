package com.spring.web.domain;

public class SearchCriteria extends Criteria{
	//부모가 가지고 있는 페이지 번호와 한 페이지에 모여지는 목록의 수 외에
	//필요한 정보를 가지고 있는 객체
	private String searchType;	//검색유형
	private String keyword;		//검색키워드
	public String getSearchType() {
		return searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	
	@Override
	public String toString() {
		return "SearchCriteria [searchType=" + searchType + ", keyword=" + keyword + "]";
	}
	
	
	
}
