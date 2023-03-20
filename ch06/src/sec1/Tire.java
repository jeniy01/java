package sec1;

public class Tire {
	String name = "한국타이어";
	int count = 4;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	@Override
	public String toString() {
		return "Tire [name=" + name + ", count=" + count + "]";
	}
}
