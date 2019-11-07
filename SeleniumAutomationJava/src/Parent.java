
public class Parent {
//highlighted purple words are key words for Java
	public static void main(String[] args) {
		//main method is where program begins to run (heart of the program)
		// TODO Auto-generated method stub
		
		//this step prints out in the console "Test Print"
		//System.out.println("Test Print");
		/*
		//Add 2 numbers 2,3 = 5
		int a = 2;
		int b = 3;
		int Sum = a+b; 
		System.out.println("The Sum is "+ Sum);
		*/
		System.out.println("I Navigated to home page");
		//Class, object name = new class()
		Methods m = new Methods();
		//Classobject.methodname
		//returns just the print statement in the method
		m.ValidateHeader();
		//returns the print statement and the return of the method
		System.out.println(m.ValidateHeader());
		/*
		 * Syntax for calling methods
		 * ClassB cb = new classB();
		 * CLassB is class name, cb is just a variable
		 */

	}

}
