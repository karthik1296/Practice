package Assisted;
import java.util.*;
public class innerClass
{
	private int val = 7;
	public class Inner{
		public void display() {
			System.out.println("Inner class method: " + val);
		}
	}

	public static void main(String[] args)
	{
		innerClass Obj = new innerClass();
		innerClass.Inner innerObject = Obj.new Inner();
		innerObject.display();  
			
	}

} 

		

