import java.util.ArrayList;
import java.util.List;

public class Menu {
	
	private static List<MenuItem> _menuItems = null;
	
	public static List<MenuItem> getMenuItems()
	{
		if (_menuItems == null)
		{
			_menuItems = new ArrayList<MenuItem>();
			_menuItems.add(new MenuItemExit());
			_menuItems.add(new MenuItemHelloWorld());
			_menuItems.add(new MenuItemFormula());
		}
		return _menuItems;
	}
	
	public static void print()
	{
		List<MenuItem> menuItems = getMenuItems();
		Output.println("=====================================");
		Output.println("MAIN MENU:");
		for (int iMenu = 0; iMenu < menuItems.size(); iMenu++)
		{
			Output.println("  "+iMenu+": "+menuItems.get(iMenu).getTitle());
		}
	}
	
	public static MenuItem getSelectedMenuItem()
	{
		List<MenuItem> menuItems = getMenuItems();
		int iMenuItem = 0;
		while (true)
		{
			iMenuItem = Input.getInt("menu item");
			if ((iMenuItem < 0) || (iMenuItem >= menuItems.size()))
			{
				Output.println("ERROR: Number must be >=0 and <"+menuItems.size());
				continue;
			}
			
			return menuItems.get(iMenuItem);
		}
	}
}
