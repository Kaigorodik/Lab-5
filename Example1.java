package lab_5_example_07_01;

public class Example1 {
	
	private char ch1;
	
	public void Set (char ch)
	{
       ch1=ch;
    }
	
	public int getCodeSymbol (char ch)
	{
		return ch;
	}
	
	public void viewCode()
	{
		System.out.println("ch1= " +ch1);
		int code = ch1;
		System.out.println("ch1= " +code);
	}
}