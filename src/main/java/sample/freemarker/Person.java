package sample.freemarker;

public class Person {

	private String name;
	private boolean reservedLuckyBagFlag;
	//private boolean reservedLuckyBag = false;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setReservedLuckyBagFlag(boolean flag) {
		this.reservedLuckyBagFlag = flag;
	}
	public boolean getReservedLuckyBagFlag() {
		return reservedLuckyBagFlag;
	}

	public boolean getReservedLuckyBag() {
		return false;
	}
}
