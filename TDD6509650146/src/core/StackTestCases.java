package core;

import junit.framework.TestCase;

public class StackTestCases extends TestCase {
	
	
	//TC1
	public void testCreateNewEmptyStack() {
		Stack s1 = new Stack(10);
		assertEquals(true,s1.isEmpty());
	}
	//TC2
	public void testPushStackToTop() {
		Stack s1 = new Stack(10);
		
		boolean full = s1.isFull();
		
		if(!full) {
			try {
				s1.push(1);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Object x = s1.top();
			assertEquals(1,x);
		}
		
	}
	//TC3
	public void testPushElmSameTypeStack() {
		Stack s1 = new Stack(10);
		
		try {
			s1.push(10);
			s1.push("dw");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertEquals("All elements in the stack must be of the same type.", e.getMessage());
		}
		
	}
	//TC4
	public void testLIFOStack() {
		Stack s1 = new Stack(5);
		try {
			s1.push(10);
			s1.push(20);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(20, s1.pop());
		assertEquals(10, s1.pop());
	}
	//TC5
	public void testElmToLimitedSizeStack() {
		Stack s1 = new Stack(5);
		try {
			s1.push(10);
			s1.push(10);
			s1.push(10);
			s1.push(10);
			s1.push(10);
			assertEquals(true, s1.isFull());
			s1.push(10);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertEquals("Stack is full", e.getMessage());
		}
	}
}
