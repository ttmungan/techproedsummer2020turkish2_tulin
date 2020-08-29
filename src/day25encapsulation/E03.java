package day25encapsulation;

public class E03 {
	
	private byte age =23;
	private float depth= 6500.0f;
	private String name= "Kemal Dogru";
	private boolean zengin = true;
	

	public static void main(String[] args) {
	
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setDepth(float depth) {
		this.depth = depth;
	}

	public boolean isZengin() {
		return zengin;
	}

	public void setZengin(boolean zengin) {
		this.zengin = zengin;
	}

}
