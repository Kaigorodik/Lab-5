package lab_5_example_07_06;

class Example6 {
	
	private int min;
	private int max;
	
	Example6(int a, int b){
		
		System.out.println("Example6(int a, int b)");

        this.setNumbers(a, b);
	}

	void setNumbers(int a, int b) {
        this.min = Math.min(a, b);
        this.max = Math.max(a, b);
}

	void setNumbers(int number) {
        this.min = Math.min(this.min, number);
        this.max = Math.max(this.max, number);
	}
	void result() {
        System.out.printf("min = %d, max = %d\n", min, max);
    }
}