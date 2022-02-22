package prog;

import org.junit.Assert.*;
import org.junit.Test;

import sample.Calculations;

import static org.junit.Assert.*;
 
public class AddSubtest {
   @Test(timeout=3000)
   public void testAddPass() {
      // assertEquals(String message, long expected, long actual)
      assertEquals("error in add()",  3, Calculations.add(1, 2));
      assertEquals("error in add()", -3, Calculations.add(-1, -2));
      assertEquals("error in add()",  9, Calculations.add(9, 0));
   }
 
   @Test
   public void testAddFail() {
      // assertNotEquals(String message, long expected, long actual)
      assertNotEquals("error in add()", 0, Calculations.add(1, 2));
   }
 
   @Test
   public void testSubPass() {
      assertEquals("error in sub()",  1, Calculations.sub(2, 1));
      assertEquals("error in sub()", -1, Calculations.sub(-2, -1));
      assertEquals("error in sub()",  0, Calculations.sub(2, 2));
   }
 
   @Test
   public void testSubFail() {
      assertNotEquals("error in sub()", 0, Calculations.sub(2, 1));
   }
   
   @Test
   public void testMulPass() {
	   assertEquals("error in mul()",  2, Calculations.mul(2, 1));
	      assertEquals("error in mul()", 2, Calculations.mul(-2, -1));
	      assertEquals("error in mul()",  4, Calculations.mul(2, 2));   
   }
   @Test
   public void testMulFail() {
	   assertNotEquals("error in mul()",  1, Calculations.mul(2, 1));
   }
   @Test
   public void testDivIntPass() {
	   assertEquals("error in divInt()",  2, Calculations.divInt(4, 2));
	      assertEquals("error in divInt()",  0, Calculations.divInt(1, 2));
   }
   @Test
   public void testDivIntFail() {
	   assertNotEquals("error in divInt()",2,Calculations.divInt(4,3));
   }
   @Test
   (expected = IllegalArgumentException.class)
   public void testDivIntByZero() {
      Calculations.divInt(9, 0); // expect an IllegalArgumentException
   }
 
   @Test
   public void testDivRealPass() {
      assertEquals("error in divInt()", 0.333333, Calculations.divReal(1, 3), 1e-6);
      assertEquals("error in divInt()", 0.111111, Calculations.divReal(1, 9), 1e-6);
   }
 
   @Test(expected = IllegalArgumentException.class)
   public void testDivRealByZero() {
      Calculations.divReal(9, 0); // expect an IllegalArgumentException
   }
}
