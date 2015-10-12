class PSize {
	int width;
	int length;
	int area;
	
	//set methods
	void setWidth(int width) {
		this.width = width;
	}
	
	void setLength(int length) {
		this.length = length;
	}
	
	int setArea(int width, int length) {
		this.area = width * length;
	}
	
	int setArea() {
		this.area = this.width * this.length;
	}
	
	//get methods
	
	int getWidth() {
		return width;
	}
	
	int getLength() {
		return length;
	}
	
	int getArea() {
		return area;
	}
	
}
PSize a0 = new PSize();
a0.width = 841;
a0.length = 1189;
a0.setArea();

String input = "";
boolean validInput = false;
while (!validInput) {
	System.out.println("Please input paper size: A0, A1, A00 etc.: ");
	System.out.print("> ");
	input = System.console().readLine();

	if (input.charAt(0) != 'A') {
		System.out.println("Not a valid input");
	}
	else{
		validInput = true;
		break
	}
}
//Remove the A
String trimmed = input.substring(1, input.length());

PSize newSize = new PSize();
newSize = newPaper(trimmed, a0);

PSize newPaper(String trimmed, PSize a) {
	PSize temp = new PSize();
	temp.setWidth(0);
	temp.setLength(0);
	temp.setArea();
	
	int value = Integer.parseInt(trimmed);
	if (value == 0) {
		if (trimmed.length() == 1) {
			return a;
		}
		else {
			
		}
	}
	else {
		//insert code for smaller than A0
	}
}


System.out.println();