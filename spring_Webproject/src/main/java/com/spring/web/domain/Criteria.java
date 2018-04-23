package com.spring.web.domain;

public class Criteria {
	//페이지번호와 페이지당 보여줄 목록 갯수 정보를 담는 객체
	private int page;
	private int perPageNum;
	
	public Criteria() {
		this.page=1;
		this.perPageNum=10;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		if(page<=0) {
			this.page=1;
			return;
		}
		this.page = page;
	}

	public int getPerPageNum() {
		return perPageNum;
	}

	public void setPerPageNum(int perPageNum) {
		
		if(perPageNum<=0||perPageNum>100)
			this.perPageNum=10;
		
		this.perPageNum = perPageNum;
	}
	public int getPageStart(){
		return (this.page-1)*perPageNum;
	}

		
}
