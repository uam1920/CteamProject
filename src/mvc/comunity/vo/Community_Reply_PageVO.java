package mvc.comunity.vo;

public class Community_Reply_PageVO {
	private int nowPage, startPage, endPage, total, cntPerPage, lastPage, start, end;
	
	private int cntPage = 10;
	
	private int wnum;
	
	public int getWnum() {
		return wnum;
	}

	public void setWnum(int wnum) {
		this.wnum = wnum;
	}

	public Community_Reply_PageVO() {
	}

	public Community_Reply_PageVO(int total, int nowPage, int cntPerPage, int wnum) {
		this.nowPage = nowPage;
		this.cntPerPage = cntPerPage;
		this.total = total;
		this.wnum = wnum;
		memberLastPage(total, cntPerPage);
		memberStartEndPage(nowPage, cntPage);
		memberStartEnd(nowPage, cntPerPage);
	}

	private void memberLastPage(int total, int cntPerPage) {
		lastPage = (int) Math.ceil((double) total / (double) cntPerPage);
	}

	private void memberStartEndPage(int nowPage, int cntPage) {
		endPage = ((int) Math.ceil((double) nowPage / (double) cntPage)) * cntPage;
		if (getLastPage() < getEndPage()) {
			endPage = getLastPage();
		}
		startPage = getEndPage() - cntPage + 1;
		if (getStartPage() < 1) {
			startPage = 1;
		}
	}

	private void memberStartEnd(int nowPage, int cntPerPage) {
		end = nowPage * cntPerPage;
		start = end - cntPerPage + 1;
	}

	public int getNowPage() {
		return nowPage;
	}

	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getCntPerPage() {
		return cntPerPage;
	}

	public void setCntPerPage(int cntPerPage) {
		this.cntPerPage = cntPerPage;
	}

	public int getLastPage() {
		return lastPage;
	}

	public void setLastPage(int lastPage) {
		this.lastPage = lastPage;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public int setCntPage() {
		return cntPage;
	}

	public void getCntPage(int cntPage) {
		this.cntPage = cntPage;
	}

	@Override
	public String toString() {
		return "PagingVO [nowPage=" + nowPage + ", startPage=" + startPage + ", endPage=" + endPage + ", total=" + total
				+ ", cntPerPage=" + cntPerPage + ", lastPage=" + lastPage + ", start=" + start + ", end=" + end
				+ ", cntPage=" + cntPage + "]";
	}
}
