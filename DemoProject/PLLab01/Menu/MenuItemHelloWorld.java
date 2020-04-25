
public class MenuItemHelloWorld  extends MenuItem {
	
	public MenuItemHelloWorld()
	{
		_title = "Hello world";
	}
	
	public void execute()
	{
		Output.println("Hello world!!!");
	}
}
