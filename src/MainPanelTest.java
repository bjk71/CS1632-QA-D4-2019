import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;

import org.mockito.*;

public class MainPanelTest
{
  // All tests are for MainPanel.convertToInt()
	
  MainPanel mp;
	
  // Ensures that normal int returns an int
  @Test
  public void testNormal()
  {
	int Normal = 20;
	//MainPanel mp = new MainPanel(10);
    assertEquals(Normal, mp.convertToInt(20));
  }
  
  @Test
  public void testBig()
  {
	int Big = 10000000;
	//MainPanel mp = new MainPanel(10);
	assertEquals(Big, mp.convertToInt(10000000));
  }
  
  @Test
  public void testNegative()
  {
	  int Negative = -50;
	  //MainPanel mp = new MainPanel(10);
	  assertEquals(Negative, mp.convertToInt(-50));
  }
}