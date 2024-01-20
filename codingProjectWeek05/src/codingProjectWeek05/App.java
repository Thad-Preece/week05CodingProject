package codingProjectWeek05;

public class App {

	public static void main(String[] args) {
		String str = "Testing123";	// Here i instantiate the string i want to pass through my methods.
		AsteriskLogger a = new AsteriskLogger(); // Here i instantiate two instances of each class and call upon their methods.
		System.out.println(a.log(str));
		System.out.println("--------------------------------------------");
		System.out.println(a.error(str));
		System.out.println("--------------------------------------------");
		SpacedLogger b = new SpacedLogger();
		System.out.println(b.log(str));
		System.out.println("--------------------------------------------");
		System.out.println(b.error(str));
		
	}

}
