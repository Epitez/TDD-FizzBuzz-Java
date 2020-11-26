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
		return isMultipleOf(value, 3);
	}

	private static boolean isMultipleOf5(int value) {
		return isMultipleOf(value, 5);
	}

	private static boolean isMultipleOf(int value, int multiple) {
		return value % multiple == 0;
	}
}
