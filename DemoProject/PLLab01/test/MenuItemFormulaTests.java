import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MenuItemFormulaTests {
	
	MenuItemFormula menuItem = new MenuItemFormula();
		
	@Test
	public void MenuItemFormula_getTitle() 
	{
		assertEquals("Formula calculation", menuItem.getTitle());
	}
	
	@Test
	public void MenuItemFormula_calc()
	{
		assertEquals(4,  menuItem.calc(2,   2));
		assertEquals(4,  menuItem.calc(1,   3));
		assertEquals(22, menuItem.calc(20,  2));
		assertEquals(44, menuItem.calc(0,  44));
	}
}
