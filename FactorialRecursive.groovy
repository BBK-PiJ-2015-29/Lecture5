System.out.println("Please input integer number:");
System.out.print("> ");

String s = System.console().readLine();

int i = Integer.parseInt(s);

int  facResult = factorial(i);
 
System.out.println(i + "! is : " + facResult);
 
int factorial(int n) {
	if(n == 1) {
		return 1;
	}
	else {
		int f = n * factorial(n-1);
		n = f;
	}
}