public class Main {	
	
	public static void main(String[] args)
	{
		while(true)
		{
			Menu.print();
			MenuItem menuItem = Menu.getSelectedMenuItem();
			menuItem.execute();
		}
	}
}