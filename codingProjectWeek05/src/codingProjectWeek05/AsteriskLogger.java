package codingProjectWeek05;

public class AsteriskLogger implements Logger { // I use the implements keyword to implement my methods in logger
	@Override
	public String log(String str) {		// Here i define the log method to return the Asterisks between the string
		return "***" + str + "***";
	}
	@Override
	public String error(String str ) {
		String newLine = System.getProperty("line.separator"); // Here i create a string newLine to return the values of strings
		String s = "***********************";					   // s, g, and p on their own lines of output
		String g =  "***********************";
		String p = "***Error: " + str + "***";
		return  s 
				+ newLine
				+ p
				+ newLine
				+ g;
		}
	}

