System.out.println("Please enter number of character in Fibonacci sequence you want:");
System.out.print("> ");

String s = System.console().readLine();
int input = Integer.parseInt(s);

int result = fibonacci(input);

System.out.println("The character in the " + input + 
		"th position in the Fibonacci sequence is: " + result);

int fibonacci(int n) {
	System.out.println(n);
	if (n <= 2) {
		return 1;
	}
	else {
		int r = fibonacci(n-1) + fibonacci(n-2);
		System.out.println(r);
		return r;
	}
	
}