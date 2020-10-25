package lab_5_example_07_05;

class Example5 {
	
	private int number;
	
	Example5(int number){
		System.out.println("Example5(int number)");
		this.setNumber(number);
	}
 
	void setNumber (int number) {
		this.number = Math.min(number, 100);
	}
	
	void setNumber() {
		this.number=0;
	}
	
	void result() {
		System.out.println("number = " + number);
	}
}
