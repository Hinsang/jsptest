package model;

public class BoardDto {
	
	private int bno;
	private String btitle;
	private String bcontent;
	private String bid;
	private String bpw;
	private String bdate;
	private int bpoint;
	
	public BoardDto() {
		
	}
	
	public BoardDto(int bno, String btitle, String bcontent, String bid, String bpw, String bdate, int bpoint) {
		super();
		this.bno = bno;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bid = bid;
		this.bpw = bpw;
		this.bdate = bdate;
		this.bpoint = bpoint;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getBtitle() {
		return btitle;
	}

	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}

	public String getBcontent() {
		return bcontent;
	}

	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public String getBpw() {
		return bpw;
	}

	public void setBpw(String bpw) {
		this.bpw = bpw;
	}

	public String getBdate() {
		return bdate;
	}

	public void setBdate(String bdate) {
		this.bdate = bdate;
	}

	public int getBpoint() {
		return bpoint;
	}

	public void setBpoint(int bpoint) {
		this.bpoint = bpoint;
	}

	@Override
	public String toString() {
		return "BoardDto [bno=" + bno + ", btitle=" + btitle + ", bcontent=" + bcontent + ", bid=" + bid + ", bpw="
				+ bpw + ", bdate=" + bdate + ", bpoint=" + bpoint + "]";
	}

}
