
public abstract class MenuItem {
	protected String _title = "Menu title";
	
	public String getTitle()
	{
		return _title;
	}
	
	public abstract void execute();
}
