package fr.epitez;

public class FizzBuzz {
	private String value;

	public FizzBuzz() {
		super();
		this.value = new String();
	}

	@Override
	public String toString() {
		return this.value;
	}

	public void setValue(int i) {
		if(i % 3 == 0) {
			this.value = "Fizz";
		} else {
			this.value = String.valueOf(i);
		}
	}

}
