package codingProjectWeek05;

public class SpacedLogger implements Logger { // I implement the logger class to define the SpacedLoggers function

	@Override
	public String log(String str) {
		String str1 = "";							// I use a for loop to iterate of the string str and separate each character with
		for (int i = 0; i < str.length(); i++) {	// a space and return it within the string str1
				str1 = str1 + str.charAt(i) + " ";
			
		}
		return str1;
	}

	@Override
	public String error(String str) {	
		
		return "ERROR: " + log(str);	// Here i call type a string literal and add it to the str seperated by spaces by calling on
	}									// the previous method

}
