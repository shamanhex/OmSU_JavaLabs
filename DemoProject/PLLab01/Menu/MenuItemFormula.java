
public class MenuItemFormula extends MenuItem {
	
	public MenuItemFormula()
	{
		_title = "Formula calculation";
	}
	
	public void execute()
	{
		int x = Input.getInt("X");
		int y = Input.getInt("Y");
		int result = calc(x, y);
		Output.println("X + Y = "+x+" + "+y+" = "+result);
	}
	
	public int calc(int x, int y)
	{
		return x + y;
	}
}
