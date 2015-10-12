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

	if (input.charAt(0).toUpperCase() != 'A') {
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
double newAreaDouble = (double) newArea;
double metreArea = newAreaDouble / (1000000);

PSize newPaper(String trimmed, PSize basic) {
	int value = Integer.parseInt(trimmed);
	int length = trimmed.length();
	PSize temp = new PSize();
	if (value == 0) {
		
		temp = biggerPaper(length, basic); 
	}
	else {
		temp = smallerPaper(value, basic);
	}
}

PSize biggerPaper(int length, PSize basic) {
	if (length == 1) {
		return basic;
	}
	else {
		PSize temp = new PSize();
		temp = biggerPaper(length-1, basic);
		
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

PSize smallerPaper(int value, PSize basic) {
	if (value == 0) {
		return basic;
	}
	else {
		PSize temp = new PSize();
		temp = smallerPaper(value - 1, basic);
		
		if (temp.getWidth() > temp.getLength()) {
			int newWidth = (int) (temp.getWidth() /2);
			temp.setWidth(newWidth);
			return temp;
		}
		else {
		    int newLength = (int) (temp.getLength() / 2);
			temp.setLength(newLength);
			return temp;
		}
	}
}

System.out.println("Area of paper size " + input + " is " + metreArea + "sq metres");