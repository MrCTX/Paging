package com.panda.util;
/*
* @author MrC
* @date 2016年11月23日上午9:32:43
* @parameter
* @version
*/
public class PagerUtil {
	private int pageNow ;//当前页数
	private int pageSize  = 4;//每页显示记录数
	private int totalSize ;//共有多少记录
	private int totalPage ;//共有多少页
	private boolean hasFirst ;//是否是第一页
	private boolean hasPre ;//是否有前一页
	private boolean hasNext ;//是否有下一页
	private boolean hasLast ;//是否有最后一页
	
	//传入参数，pageNow为当前页数，totalSize表示所有记录
	public PagerUtil(int pageNow , int totalSize) {
		this.pageNow = pageNow;
		this.totalSize = totalSize ;
	}
	
	public int getPageNow() {
		return pageNow;
	}
	public void setPageNow(int pageNow) {
		this.pageNow = pageNow;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalSize() {
		return totalSize;
	}
	public void setTotalSize(int totalSize) {
		this.totalSize = totalSize;
	}
	
	/*
	 * 返回所有页数
	*/
	public int getTotalPage() {
		totalPage = this.getTotalSize()/pageSize ;
		//如果不能整除，页数加1
		if (this.getTotalSize() % pageSize != 0) {
			totalPage += 1 ;
		}
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	
	/*
	 * 查看是否有首页,如果有第一页，就没有首页，否则就是有首页
	*/
	public boolean isHasFirst() {
		if (pageNow == 1) {
			return false ;
		}
		return true;
	}
	
	public void setHasFirst(boolean hasFirst) {
		this.hasFirst = hasFirst;
	}
	
	/*
	 * 查看是否有前一页,如果有首页，就有前一页
	*/
	public boolean isHasPre() {
		if (isHasFirst()) {
			return true ;
		}
		return false;
	}
	
	
	public void setHasPre(boolean hasPre) {
		this.hasPre = hasPre;
	}
	
	/*
	 * 如果有尾页就有下一页
	*/
	public boolean isHasNext() {
		if (isHasLast()) {
			return true ;
		}
		return false;
	}
	
	
	public void setHasNext(boolean hasNext) {
		this.hasNext = hasNext;
	}
	
	/*
	 *如果不是最后一页就说明有尾页
	*/
	public boolean isHasLast() {
		if (pageNow == this.getTotalPage()) {
			return false ;
		}
		return true ;
	}
	public void setHasLast(boolean hasLast) {
		this.hasLast = hasLast;
	}
	
	
}
