package prog;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import sample.Sample;

import org.junit.Before;
class Sample_test {
	Sample obj=new Sample();

	
@Before
public void before()
{
	System.out.println("Running");
}
	@Test
	void testadd() {
		obj.add("Sheela");
		obj.add("Sheethal");
		assertEquals(2,obj.size());
	}
	@Test
	void testremove()
	{
	obj.add("Raju");
	obj.add("Priyanka");
	obj.add("Pavni");
	obj.remove("Pavni");
	assertEquals(2,obj.size());
	}

@Test
void testget()
{
	obj.add("Amir");
	obj.add("Niroop");
	obj.get();
	assertEquals(0,obj.get());
}
@Test
void testremoveall()
{
	obj.removeAll();
}
}
