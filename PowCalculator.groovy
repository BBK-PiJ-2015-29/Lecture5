System.out.println("Input base integer:");
System.out.print("> ");

String s = System.console().readLine();
int base = Integer.parseInt(s);

System.out.println("Input exponent integer:");
System.out.print("> ");

s = System.console().readLine();
int exp = Integer.parseInt(s);

int powInt = pow(base, exp);

System.out.println(base + " to the power of " + exp + " is: " + powInt)
int pow(int base, int exp) {
	if (exp == 0) {
		return 1;
	}
	else {
		int result = base * pow(base, exp-1)
	}
}