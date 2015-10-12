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
newSize.setArea();
int newArea = newSize.getArea();

PSize newPaper(String trimmed, PSize basic) {
	int value = Integer.parseInt(trimmed);
	int length = trimmed.length();
	if (value == 0) {
		PSize temp = new PSize();
		temp = biggerPaper(length, basic); 
	}
	else {
		//call smaller method
	}
}

PSize biggerPaper(int length, PSize basic) {
	if (length == 1) {
		return basic;
	}
	else {
		PSize temp = new PSize();
		temp.setWidth(biggerPaper().getWidth);
		temp.setLength(biggerPaper().getLength);
		
		if (temp.getWidth() < temp.getLength())	{
			temp.setWidth(temp.getWidth() * 2);
			return temp;
		}		
		else {
			temp.setLength(temp.getLength() *2)
			return temp;
		}		
	}
}

System.out.println(newArea);