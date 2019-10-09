/* Matthew Galvan
 * 1206578967
 * Homework 2
 * CSE 360: W 9:40am-10:30am
 * AddingMachine: This project is design to implement a basic calculator that can do basic addition and
 * subtraction. This project is also supposed to remember operations and also clear it. 
 * 
 * CODE REPOSITORY INFORMATION
 * USER: mjgalvan2
 * PASSWORD: 13079Bz 
 * URL https://github.com/mjgalvan2/AddingMachine.git
 * 
 * */

package cse360assign2;

public class AddingMachine {

	private int total;
	private String history; //stores history of operations
	
	//constructor
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		history="0"; //implements history 
	}
	
	//getter method. returns the total
	public int getTotal () {
		return total; //returns total
	}
	
	//mutator method. adds to the total
	public void add (int value) {
		total=total+value; //updates new total
		history=history+" + "+value; //builds history
	}
	
	//mutator method. subtracts from the total
	public void subtract (int value) {
		total=total-value; //updates new total
		history=history+" - "+value; //builds history
	}
	
	//returns the operation history.
	public String toString () {
		return history; //returns history
	}
	
	//mutator method. clears the operation history
	public void clear() {
		history="0"; //clears history
		total=0; //resets total
	}
}