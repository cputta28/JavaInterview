package in.winny.exceptions;

public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("Hello Starting");
		int fNumber = 9;
		int lNumber = 0;

		int result = 0;
		try {
			result = fNumber / lNumber;
		} catch (ArithmeticException | NullPointerException ex) {
			ex.printStackTrace();
			System.out.println(ex);
		}catch (Exception e) {
			 System.out.println(e);
		} 
		finally {
			System.out.println("finally block");
		}
		System.out.println(result);
		System.out.println("Hello Ending");
	}

}
