System.out.println("Please enter number of character in Fibonacci sequence you want:");
System.out.print("> ");

String s = System.console().readLine();
int input = Integer.parseInt(s);

int a = 1;
int b = 1;
int result;
if (input <= 1) {
	result = 1;
}
else {
	for (int i = 0; i < (input - 2); i++) {
		result = a + b;
		b = a;
		a = result;
	}
}

System.out.println("F(" + input + ") is: " + result);