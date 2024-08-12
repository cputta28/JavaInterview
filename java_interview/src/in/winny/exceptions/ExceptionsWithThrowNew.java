package in.winny.exceptions;

public class ExceptionsWithThrowNew {
	public static void main(String[] args) {

		try {
			NumberFormatException ex = new NumberFormatException(); // Creating an object to NumberFormatException
																	// explicitly

			throw ex; // throwing NumberFormatException object explicitly using throw keyword, it will create exception.
		} catch (NumberFormatException ex) {
			System.out.println("explicitly thrown NumberFormatException object will be caught here");
		}
	}

}
