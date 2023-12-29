package Assisted;

interface First 
{  
    default void show() 
    { 
        System.out.println("Default First method"); 
    } 
} 
interface Second 
{  
    default void show() 
    { 
        System.out.println("Default Second Method"); 
    } 
}  


public class DiamondEx implements First, Second  
{
	 public void show() 
	    {  
	        First.super.show(); 
	        Second.super.show(); 
	    } 
	    public static void main(String args[]) 
	    { 
	    	DiamondEx ob = new DiamondEx(); 
	        ob.show(); 
	    } 
}


   

