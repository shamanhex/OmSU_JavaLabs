import java.util.Scanner;

public class Input {
	protected static Scanner _scanner = null;
	
	public static Scanner getScanner()
	{
		if (_scanner == null)
		{
			_scanner = new Scanner(System.in);
		}
		return _scanner;
	}
	
	public static int getInt(String varName)
	{
		Scanner scan = getScanner();
		
		Output.print("Enter "+varName+": ");
		
		while(!scan.hasNextInt())
		{
			scan.nextLine();
			Output.println("ERROR: Input in not integer!");
			Output.print("Enter "+varName+": ");
		}
		
		return scan.nextInt();
	}
}
