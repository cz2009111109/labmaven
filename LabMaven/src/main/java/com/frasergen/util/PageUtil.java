package com.frasergen.util;

import java.util.List;

public class PageUtil {
	private int pageindex = 1; // 页码
	private int pagesize = 50; // 每页显示条数
	private int totalnum; // 总页数
	private long totalcount; // 总条数
	private List list = null;
	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	/**
	 * 激活分页
	 * 
	 * @param count 总条数
	 */
	public void factory(int count) {
		totalcount = count;
		totalnum = count % pagesize == 0 ? (count / pagesize)
				: (count / pagesize) + 1;

		if (pageindex > totalnum) {
			pageindex = totalnum;
		}
		if (pageindex < 1) {
			pageindex = 1;
		}
		
	}
	
	public int frist(){
		return (pageindex-1)*pagesize;
	}
	
	public int last(){
		return pagesize;
	}

	public int getPageindex() {
		return pageindex;
	}

	public void setPageindex(int pageindex) {
		this.pageindex = pageindex;
	}

	public int getPagesize() {
		return pagesize;
	}

	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}

	public int getTotalnum() {
		return totalnum;
	}

	public void setTotalnum(int totalnum) {
		this.totalnum = totalnum;
	}

	public long getTotalcount() {
		return totalcount;
	}

	public void setTotalcount(long totalcount) {
		this.totalcount = totalcount;
	}
}
