package lab_5_example_07_02;

class Example2 {
	
	private char ch1;
	private char ch2;
	
	Example2 (char ch1,char ch2) {
		
	this.ch1=ch1;
	this.ch2=ch2;
	
	}

	void result() {
	
		int ch1Code=(int)ch1;
		int ch2Code=(int)ch2;
		
		for (int i=ch1;i<=ch2;i++) {
			System.out.println("The symbols of the code table between " +ch1 +" and " +ch2 +" : " +(char)i);
		}
}
	}
