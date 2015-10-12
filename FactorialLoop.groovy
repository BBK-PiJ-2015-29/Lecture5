System.out.println("Please input integer number:");
System.out.print("> ");

String s = System.console().readLine();

int input = Integer.parseInt(s);

int loopResult = 1;

for(int i = 1; i < (input + 1); i++) {
	loopResult = loopResult * i;
	
}
System.out.println(input + "! is: " + loopResult);