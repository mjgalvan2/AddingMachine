/* Matthew Galvan
 * 1206578967
 * Homework 2
 * CSE 360: W 9:40am-10:30am
 * AddingMachine_test: This project is design to test various conditions of the program 
 * AddingMachine.java. It uses basic test cases to see and determine if the program matches
 * expected results.
 * 
 */

package cse360assign2;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddingMachine_test {

	@Test
	//tests the add method of the AddingMachine. also tests getTotal
	public void test() {
		AddingMachine test=new AddingMachine();
		test.add(4);
		int value=test.getTotal();
		assertTrue(value==4);
	}
	@Test
	//tests the subtract method of the AddingMachine. also tests getTotal
	public void test2() {
		AddingMachine test=new AddingMachine();
		test.subtract(5);
		int value=test.getTotal();
		assertTrue(value==-5);
	}
	@Test
	//tests the toString method of the AddingMachine.
	public void test3() {
		AddingMachine test=new AddingMachine();
		test.subtract(5);
		test.add(14);
		test.add(3);
		String term=test.toString();
		assertTrue(term.equals("0 - 5 + 14 + 3"));
	}
	@Test
	public void test4() {
		AddingMachine test=new AddingMachine();
		test.subtract(5);
		test.subtract(12);
		test.clear();
		String term=test.toString();
		assertTrue(term.equals("0"));
	}
	@Test
	//tests the clear method of the AddingMachine. also tests getTotal
	public void test5() {
		AddingMachine test=new AddingMachine();
		test.subtract(5);
		test.subtract(12);
		test.add(4);
		test.clear();
		int term=test.getTotal();
		assertTrue(term==0);
	}

}
