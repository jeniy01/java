package sec1;

public class Engine {
	String fue1 = "가솔린";	//연료
	int cc = 3000;	//연료주입량
	int displace = 4;	//배기량
	public String getFue1() {
		return fue1;
	}
	public void setFue1(String fue1) {
		this.fue1 = fue1;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public int getDisplace() {
		return displace;
	}
	public void setDisplace(int displace) {
		this.displace = displace;
	}
	
	@Override
	public String toString() {
		return "Engine [fue1=" + fue1 + ", cc=" + cc + ", displace=" + displace
				+ "]";
	}
}
