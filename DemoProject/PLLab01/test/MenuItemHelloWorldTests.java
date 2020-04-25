import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class MenuItemHelloWorldTests {
	MenuItemHelloWorld menuItem = new MenuItemHelloWorld();
	
	@Test
	public void MenuItemHelloWorld_getTitle() {
		assertEquals("Hello world", menuItem.getTitle());
	}

}
