package projectQ;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Vector;

public class Program6 {

		public static void main(String[] args) {
			//creating arraylist
			System.out.println("ArrayList");
			ArrayList empid=new ArrayList();   
		      empid.add(101);//
		      empid.add(105); 
		      empid.remove(1);
		      System.out.println(empid);  
			
			//creating vector
		      System.out.println("\n");
		      System.out.println("Vector");
		      Vector<Integer> vec = new Vector();
		      vec.addElement(15); 
		      vec.addElement(30); 
		      System.out.println(vec);
			
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





