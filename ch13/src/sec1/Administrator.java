package sec1;

public class Administrator {
	private String grade;
	private int ano;
	private String name;
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Administrator [grade=" + grade + ", ano=" + ano + ", name="
				+ name + "]";
	}
}
