System.out.println("Input number of Hanoi disks: ");
System.out.print("> ");

String s = System.console().readLine();
int disks = Integer.parseInt(s);
int moves;

int result = hanoiMoves(disks);
System.out.println("Minimum number of moves for " + disks + " disks is: " + result);

int hanoiMoves(int n) {
	if (n == 1) {
		return 2;
	}
	else {
		moves = ((3*(hanoiMoves(n - 1))) + 2);
		return moves;
	}
}
