package dto;

public class Product {
	private int no;
	private String pname;
	private String std;
	private int amount;
	private String comment;
	private String pic;
	private int iprice;
	private int oprice;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		this.std = std;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public int getIprice() {
		return iprice;
	}
	public void setIprice(int iprice) {
		this.iprice = iprice;
	}
	public int getOprice() {
		return oprice;
	}
	public void setOprice(int oprice) {
		this.oprice = oprice;
	}
	@Override
	public String toString() {
		return "Product [no="+no+",pname="+pname+",std="+std+",amount="+amount+",comment="+comment+",pic="+pic+",iprice="+iprice+",oprice="+oprice+"]";
	}
}
