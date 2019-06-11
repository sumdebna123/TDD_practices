import static org.junit.Assert.*;

import org.junit.Test;

import com.tdd.prac.BaseClass;
import junit.framework.Assert;
import org.junit.Assert.*;

public class TestLeepYearClass {
	
	@Test
	public void positiveScenario1() {
		assertTrue(BaseClass.checkLeepYear(2000));
		
	}
	
	@Test
	public void positiveScenario() {
		Assert.assertEquals(true, BaseClass.checkLeepYear(2000));
		
	}
	
	@Test
	public void negativeScenario() {
		Assert.assertEquals(false, BaseClass.checkLeepYear(2001));
		
	}
	
	@Test
	public void negativeScenarioWithCharValue() {
		char test ='c' ;
		int val = test;
		Assert.assertEquals(false, BaseClass.checkLeepYear(val));
		
	}
	
	@Test
	public void negativeScenarioWithFloat() {
		float test =22.0033f ;
		int val = (int)test;
		Assert.assertEquals(false, BaseClass.checkLeepYear(val));
		
	}
	
	@Test
	public void negativeScenarioWithNegetiveInt() {
		Assert.assertEquals(true, BaseClass.checkLeepYear(-20));
		
	}

}
