package colm.test.customexception;

public class InvalidAgeException extends Exception {

	public InvalidAgeException(String str) {
		super(str);

	}

	public class TestCustomException1 {
		public static void validate(int age) throws InvalidAgeException {
			if (age < 18) {
				throw new InvalidAgeException("age is not valid to vote");
			} else {
				System.out.println("welcome to vote");
			}

		}

		
	}
	public static void main(String[] args) {
		try {
			TestCustomException1.validate(13);
		} catch (InvalidAgeException e) {
			System.out.println("caught the Exception");
			System.out.println("Exception Occur " + e);
		}
		System.out.println("remaining code .......!");
	}
}
