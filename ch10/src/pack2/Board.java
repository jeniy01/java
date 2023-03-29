package pack2;

public class Board {
	private String bno;
	private String title;
	private String content;
	private String author;
	private String resdate;
	public String getBno() {
		return bno;
	}
	public void setBno(String bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getResdate() {
		return resdate;
	}
	public void setResdate(String resdate) {
		this.resdate = resdate;
	}
	@Override
	public String toString() {
		return "Board [bno=" + bno + ", title=" + title + ", content="
				+ content + ", author=" + author + ", resdate=" + resdate + "]";
	}
	
}
