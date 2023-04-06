package sec1;

public class Member {
	private int seq;	//member_seq
	private String no;	//c_no
	private String name;	//c_name
	private String phone;	//phone
	private String address;	//address
	private String regdate;	//regist_date
	private String ctype;	//c_type
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String i) {
		this.no = i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getCtype() {
		return ctype;
	}
	public void setCtype(String ctype) {
		this.ctype = ctype;
	}
	@Override
	public String toString() {
		return "Member [seq=" + seq + ", no=" + no + ", name=" + name
				+ ", phone=" + phone + ", address=" + address + ", regdate="
				+ regdate + ", ctype=" + ctype + "]";
	}
}
