package mvc.commercial.vo;

public class PageVO {

    // nowPage - 현재페이지
    // startPage - 시작페이지
    // endPage - 끝페이지
    // total - 게시글 총 갯수
    // cntPerPage - 페이지당 글 갯수, 마지막페이지
    // lastPage - 마지막페이지
    // start, end  - 페이지 분할 값
 private int nowPage, startPage, endPage, total, cntPerPage, lastPage, start, end;
 private int cntPage = 5;
 private String searchType,searchValue, searchType2, searchValue2;
 
 
 public String getSearchType2() {
	return searchType2;
}
public void setSearchType2(String searchType2) {
	this.searchType2 = searchType2;
}
public String getSearchValue2() {
	return searchValue2;
}
public void setSearchValue2(String searchValue2) {
	this.searchValue2 = searchValue2;
}
public int getCntPage() {
  return cntPage;
 }
 public void setCntPage(int cntPage) {
  this.cntPage = cntPage;
 }
 public String getSearchType() {
  return searchType;
 }
 public void setSearchType(String searchType) {
  this.searchType = searchType;
 } 
 public String getSearchValue() {
  return searchValue;
 }
 public void setSearchValue(String searchValue) {
  this.searchValue = searchValue;
 }
 public PageVO() {
 }
 public PageVO(int total, int nowPage, int cntPerPage) {
  this.nowPage=nowPage;
  this.cntPerPage=cntPerPage;
  this.total=total;
  memberLastPage(total, cntPerPage);
  memberStartEndPage(nowPage, cntPage);
  memberStartEnd(nowPage, cntPerPage);
 }
 public PageVO(int total, int nowPage, int cntPerPage,String searchType,String searchValue) {
  this.searchType=searchType;
  this.searchValue=searchValue;
  this.nowPage=nowPage;
  this.cntPerPage=cntPerPage;
  this.total=total;
  memberLastPage(total, cntPerPage);
  memberStartEndPage(nowPage, cntPage);
  memberStartEnd(nowPage, cntPerPage);
 }
 public PageVO(int total, int nowPage, int cntPerPage,String searchType,String searchValue, String searchType2, String searchValue2) {
	  this.searchType=searchType;
	  this.searchValue=searchValue;
	  this.nowPage=nowPage;
	  this.cntPerPage=cntPerPage;
	  this.total=total;
	  this.searchType2 = searchType2;
	  this.searchValue2 = searchValue2;
	  memberLastPage(total, cntPerPage);
	  memberStartEndPage(nowPage, cntPage);
	  memberStartEnd(nowPage, cntPerPage);
 }

 public PageVO(int nowPage, int total, int cntPerPage, String searchType2, String searchValue2, int a) {
	super();
	this.nowPage = nowPage;
	this.total = total;
	this.cntPerPage = cntPerPage;
	this.searchType2 = searchType2;
	this.searchValue2 = searchValue2;
}
// 제일 마지막 페이지 계산
 private void memberLastPage(int total, int cntPerPage) {
  // 1.1page 올림처리 -> 2페이지 , 갯수 10 당 -> 11 개라면 
  lastPage = (int) Math.ceil((double)total / (double)cntPerPage);
 }
 // 시작, 끝 페이지 계산
 private void memberStartEndPage(int nowPage, int cntPage) {
  endPage = ((int)Math.ceil((double)nowPage / (double)cntPage)) * cntPage;
  if (getLastPage() < getEndPage()) {
   endPage = getLastPage();
  }
  startPage =getEndPage() - cntPage + 1;
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