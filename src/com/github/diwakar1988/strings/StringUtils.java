package com.github.diwakar1988.strings;

public class StringUtils {

	public static String getExcelColumnTitle(int columnNumber) {
		StringBuilder sb = new StringBuilder();
		while (columnNumber > 0) {
			int rem = columnNumber % 26;
			if (rem == 0) {
				sb.append('Z');
				columnNumber = (columnNumber / 26) - 1;
			} else {
				sb.append((char) ((rem - 1) + 'A'));
				columnNumber = (columnNumber / 26);
			}
		}
		return sb.reverse().toString();
	}

	public static int getExcelColumnNumber(String columnTitle) {
		int result = 0;
		for (int i = 0; i < columnTitle.length(); i++) {
			int ch = columnTitle.charAt(i);
			result *= 26;
			result += (ch - 'A') + 1;
		}
		return result;
	}

	public static String reverseWords(String str) {
		StringBuilder sb = new StringBuilder(str.trim());

		for (int i = 0, start = 0; i < sb.length(); i++) {
			if (sb.charAt(i) == ' ') {
				reverse(sb, start, i - 1);
				start = i + 1;
			}

		}
		return sb.reverse().toString();

	}

	public static void reverse(StringBuilder sb, int start, int end) {
		while (start < end) {
			char ch = sb.charAt(start);
			sb.setCharAt(start, sb.charAt(end));
			sb.setCharAt(end, ch);
			start++;
			end--;
		}

	}

	/***
	 *  Function for finding sum of larger numbers
	 */
	public static String addBigNumbers(String str1, String str2) {
	    // Reverse both of strings
		str1 = new StringBuilder(str1).reverse().toString();
		str2 = new StringBuilder(str2).reverse().toString();
		// Before proceeding further, make sure length
	    // of str2 is larger.
	    if (str1.length() > str2.length())
	    {
	    	String temp = str1;
	    	str1 = str2;
	    	str2=temp;
	    }
	 
	    // Take an empty string for storing result
	    StringBuilder str = new StringBuilder();
	 
	    // Calculate length of both string
	    int n1 = str1.length();
	    int n2 = str2.length();
	 	 
	    int carry = 0;
	    for (int i=0; i<n1; i++)
	    {
	        // Do school mathematics, compute sum of
	        // current digits and carry
	        int sum = ((str1.charAt(i)-'0')+(str2.charAt(i)-'0')+carry);
	        str.append(((sum%10)));
	 
	        // Calculate carry for next step
	        carry = sum/10;
	    }
	 
	    // Add remaining digits of larger number
	    for (int i=n1; i<n2; i++)
	    {
	        int sum = ((str2.charAt(i)-'0')+carry);
	        str.append(((sum%10)));
	        carry = sum/10;
	    }
	 
	    // Add remaining carry
	    if (carry>0)
	    	str.append((carry));
	 
	    
	    return str.reverse().toString();
	}


}
