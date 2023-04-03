package sec1;

public class User {
	private int uno;
	private String uname;
	private String uid;
	public int getUno() {
		return uno;
	}
	public void setUno(int uno) {
		this.uno = uno;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	@Override
	public String toString() {
		return "User [uno=" + uno + ", uname=" + uname + ", uid=" + uid + "]";
	}
}
