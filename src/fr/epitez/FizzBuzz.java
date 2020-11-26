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
		if (isMultipleOf3(i)) {
			this.value = "Fizz";
		} else if (isMultipleOf5(i)) {
			this.value = "Buzz";
		} else {
			this.value = String.valueOf(i);
		}
	}

	private static boolean isMultipleOf3(int value) {
		return value % 3 == 0;
	}

	private static boolean isMultipleOf5(int value) {
		return value % 5 == 0;
	}

}
