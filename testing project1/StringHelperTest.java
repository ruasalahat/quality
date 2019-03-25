package com.ashraf.junit.helper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {

	// AACD => CD 
	//ACD => CD 
	//CDEF=>CDEF 
	//CDAA => CDAA

	StringHelper helper;
	
	
	@Before
	public void before(){
		helper = new StringHelper();
		System.out.println("@before....");
	}
	

	@Test
	public void testTruncateAInFirst2Positions_AinFirst2Positions() 
	{
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
		//assertEquals(expected, actual)
	
	}

	
	

	@Test
	public void testTruncateAInFirst2Positions_AinFirstPosition() {
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}

      @Test
   public  void testareFirstAndLastTwoCharactersTheSame_BasicNegativeScenrio(){
   assertFalse(
		   helper . areFirstAndLastTwoCharactersTheSame("ABCD"));
}    
   @Test
   public void testareFirstAndLastTwoCharactersTheSame_BasicPositiveScenrio(){
	   assertTrue(
			   helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
   }


	
}
