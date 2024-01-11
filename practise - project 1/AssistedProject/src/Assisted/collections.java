package Assisted;
import java.util.*;

public class collections
{

	public static void main(String[] args) 
	{
				//creating arraylist
				System.out.println("ArrayList");
				ArrayList<String> names =new ArrayList<String>();   
			      names.add("karthik");
			      names.add("krishna");    	
			      names.add("yash"); 
			      names.add("sumanth");
			      System.out.println(names); 
			      names.remove(3);
			      System.out.println(names);  
				
			//creating vector
			      System.out.println("\n");
			      System.out.println("Vector");
			      Vector<Integer> v = new Vector();
			      v.addElement(15); 
			      v.addElement(30); 
			      v.addElement(45);
			      System.out.println(v);
			      System.out.println("size:"+v.size());
			      v.removeElement(30);
			      System.out.println(v);
			      System.out.println("size:"+v.size());
			      
				
			//creating linkedlist
			      System.out.println("\n");
			      System.out.println("LinkedList");
			      LinkedList<String> name=new LinkedList<String>();  
			      name.add("karthik");
			      name.add("krishna");    	
			      name.add("yash"); 
			      name.add("sumanth");	
			      name.add(2,"janu");
			      Iterator<String> itr=name.iterator();  
			      while(itr.hasNext()){  
			       System.out.println(itr.next());  
			      }
			      //creating hashset
			       System.out.println("\n");
			       System.out.println("HashSet");
			       HashSet<Integer> set=new HashSet<Integer>();  
			       set.add(101);  
			       set.add(103);  
			       set.add(102);
			       set.add(104);
			       System.out.println(set);
			      
			       
			     //creating linkedhashset
			       System.out.println("\n");
			       System.out.println("LinkedHashSet");
			       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
			       set2.add(11);  
			       set2.add(13);  
			       set2.add(12);
			       set2.add(14);	       
			       System.out.println(set2);
			      	
			      }  
}


