System.out.println("Input a string of characters: ");
System.out.print("> ");

String s = System.console().readLine();
String reversed = reversal(s);


System.out.println(s + " reversed is: " + reversed);

String reversal(String input) {
	String temp = "";
	if (input.length() == 0) {
		return temp.concat("");
	}
	else {
		int length = input.length();
		String lastChar = input.charAt(length-1).toString();
		String trimmed = input.substring(0, length-1);
		temp = temp.concat(lastChar);
		temp = temp.concat(reversal(trimmed));
		return temp;
	}
}
if (s.equals(reversed)) {
	System.out.println("Your input is a palindrome");
}
else {
	System.out.println("Your input is not a palindrome");
}