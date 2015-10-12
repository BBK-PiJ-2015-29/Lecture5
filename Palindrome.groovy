System.out.println("Input a string of characters: ");
System.out.print("> ");

String s = System.console().readLine();



int length = s.length();
//find character number before middle
int half = length/2;
//find character number after middle for even string
int half1 = (length/2) + 1;
//find character number after middle for odd string
int half2 = (length/2) + 2;

if (palindromeCheck(half, half1, half2, s)){
	System.out.println("The string you input is a palindrome");
}
else {
	System.out.println("The string you input is not a palindrome");
}

boolean palindromeCheck(int a, int b, int c, String s) {
	boolean palindrome = true;
	int length = s.length();
	//even string length
	if (!(b <= length) && !(c <= length)) {
		if ((length % 2) == 0) {
			if ((s.charAt(a)) ==(s.charAt(b))) {
				System.out.println("even: " + a + " " + b)
				palindromeCheck(a-1, b+1, c, s);
			}
			else {
				palindrome = false;
			}
		}
		//odd string length
		else {
			if ((s.charAt(a)) ==(s.charAt(c))) {
				System.out.println("odd: " + a + " " + c)
				palindromeCheck (a-1, b, c+1, s)
			}
			else {
				palindrome = false;
			}	
		}
	}
	return palindrome;
}

 