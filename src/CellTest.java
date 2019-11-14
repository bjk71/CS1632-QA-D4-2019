import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;

import org.mockito.*;

public class CellTest
{
  // Both tests are for Cell.toString()
	
  // Ensures that cell that is alive is displayed that way.
  @Test
  public void testAlive()
  {
    Cell c = new Cell(true);
    assertEquals("X", c.toString());
  }

  // Ensures that cell that is dead is displayed that way.
  @Test
  public void testDead()
  {
    Cell c = new Cell(false);
    assertEquals(".", c.toString());
  }
  
  // Ensures that the cell that was alive and has become dead is displayed that way.
  @Test
  public void testWasAlive()
  {
    Cell c = new Cell(true);
    c.setAlive(false);
    assertEquals(".", c.toString());
  }
}