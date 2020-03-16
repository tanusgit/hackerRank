package passwordStrength;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class PasswordStrength {

	/*
	 * Complete the 'getStrength' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. STRING password 2. INTEGER weight_a
	 */

	public static int getStrength(String password, int w) {
		// Complete the function

		int l = password.length();
		int res = 0;
		if(w < 0 || w > 25) {
			return -1;
		}
		if (l < 1 || l > 100) {
			return -1;
		} else {
			for (char c : password.toCharArray()) {
				// System.out.println(c);
				int intc = c;
				
				if (intc != intc) {
					res = res + Math.abs(97 - intc);
				}

				if (w == 0) {
					res = res + Math.abs(97 - intc);
				} else {
					
					if((w - 1) + Math.abs(97 - intc) + 1 > 25){
						res = res + 1;
					}
					else {

						res = res + (w - 1) + Math.abs(97 - intc) + 1;
					}
					
				}

			}
			return res;

		}

	}

	public static void main(String[] args) throws IOException {
		String password = "hellomrz";
		int weight_a = 2;

		int strength = getStrength(password, weight_a);
		System.out.println(strength);

	}
}
