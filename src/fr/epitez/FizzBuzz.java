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
		this.value = "";
		if (isMultipleOf(i, 3 * 5)) {
			this.value = "FizzBuzz";
		} else if (isMultipleOf(i, 3)) {
			this.value = "Fizz";
		} else if (isMultipleOf(i,5)) {
			this.value = "Buzz";
		}
		
		if(this.value.isBlank()){
			this.value = IntToString(i);
		}
	}

	private static boolean isMultipleOf(int value, int multiple) {
		return value % multiple == 0;
	}

	private static String IntToString(int value) {
		return String.valueOf(value);
	}

}
