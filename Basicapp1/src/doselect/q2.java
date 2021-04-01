package doSelect;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Activity {
	// Implement Activity class here..
	String string1;
	String string2;
	String operator;

	Activity() {
	}

	Activity(String string1, String string2, String operator) {
		this.string1 = string1;
		this.string2 = string2;
		this.operator = operator;
	}
}

public class Source {
	// Implement the two function given in description in here...
	public String handleException(Activity a) {
		try {
			if (a.string1 == null || a.string2 == null)
				throw new NullPointerException();
		} catch (NullPointerException np) {
			return "Null values found";
		}
		try {
			if (a.operator.equals("+") || a.operator.equals("-")) {

			} else {
				throw new Exception();
			}
		} catch (Exception ex) {
			return "Default exception" + a.operator;
		}
		return "No Exception Found";
	}

	public String doOperation(Activity a) {
		String result = "";
		switch (a.operator) {
		case "+":
			result = a.string1 + a.string2;
			break;
		case "-":
			result = a.string1.replace(a.string2, "");
			break;
		}
		return result;
	}

}