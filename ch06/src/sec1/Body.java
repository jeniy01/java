package sec1;

public class Body {
	String style = "RV";
	String frendar = "앵글";
	String bumper = "쉐드";
	
	
	public String getStyle() {
		return style;
	}


	public void setStyle(String style) {
		this.style = style;
	}


	public String getFrendar() {
		return frendar;
	}


	public void setFrendar(String frendar) {
		this.frendar = frendar;
	}


	public String getBumper() {
		return bumper;
	}


	public void setBumper(String bumper) {
		this.bumper = bumper;
	}

	@Override
	public String toString() {
		return "Body [style=" + style + ", frendar=" + frendar + ", bumper="
				+ bumper + "]";
	}
}
