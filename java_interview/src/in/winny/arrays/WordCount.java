package in.winny.arrays;

public class WordCount {
	void fullname(String fname, String lname) {
		String name = fname + lname;
		System.out.println(name);
	}
  
	boolean check (int age ){
		if ( age >= 18 ) {
		 return true;
		} else {
		 return false;
		}
	}
	public static void main(String... args) {
		WordCount wc = new WordCount();
		String s = " Hello Hello My Friend";
		String[] arr = s.trim().split("\\s+");

		System.out.println(arr.length);
		wc.fullname("chandra", "shekar");
		 
		System.out.println(wc.check(15));
	}

}
