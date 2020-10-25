package lab_5_example_07_04;

class Example4 {
	
	private final char ch;
	private final int a;

	Example4(int a, char ch) {
		System.out.println("Example4(int a, char ch)");
		 this.a = a;
		 this.ch = ch;
	}
	
	Example4(double aFloat){
		
		System.out.println("Example4(double aFloat)");

        String aStr = String.valueOf(aFloat);
        String[] aParts = aStr.split("\\.");

        int charCode = Integer.parseInt(aParts[0]);
        String aPartStr = aParts[1];
        String aPart = aPartStr.length() > 2 ? aPartStr.substring(0, 2) : aPartStr;

        this.ch = (char) charCode;
        this.a = Integer.parseInt(aPart);
	}
	
	void result() {
        System.out.println("ch = " + ch);
        System.out.println("a = " + a);
}
}