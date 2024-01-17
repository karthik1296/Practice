package Assisted;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class mapPractice 
{

	public static void main(String[] args)
	{
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"karthik");    
	      hm.put(2,"janu");    
	      hm.put(3,"yashu");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }     
	      
	      
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"bmhk");    
	      map.put(9,"yesh");    
	      map.put(10,"sumanth");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      


	}

}
