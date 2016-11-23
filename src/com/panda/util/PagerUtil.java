package com.panda.util;
/*
* @author MrC
* @date 2016��11��23������9:32:43
* @parameter
* @version
*/
public class PagerUtil {
	private int pageNow ;//��ǰҳ��
	private int pageSize  = 4;//ÿҳ��ʾ��¼��
	private int totalSize ;//���ж��ټ�¼
	private int totalPage ;//���ж���ҳ
	private boolean hasFirst ;//�Ƿ��ǵ�һҳ
	private boolean hasPre ;//�Ƿ���ǰһҳ
	private boolean hasNext ;//�Ƿ�����һҳ
	private boolean hasLast ;//�Ƿ������һҳ
	
	//���������pageNowΪ��ǰҳ����totalSize��ʾ���м�¼
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
	 * ��������ҳ��
	*/
	public int getTotalPage() {
		totalPage = this.getTotalSize()/pageSize ;
		//�������������ҳ����1
		if (this.getTotalSize() % pageSize != 0) {
			totalPage += 1 ;
		}
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	
	/*
	 * �鿴�Ƿ�����ҳ,����е�һҳ����û����ҳ�������������ҳ
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
	 * �鿴�Ƿ���ǰһҳ,�������ҳ������ǰһҳ
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
	 * �����βҳ������һҳ
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
	 *����������һҳ��˵����βҳ
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
