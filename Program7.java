package projectQ;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Program7 {

	public static void main(String[] args) {
		Map<Integer,String>map=new HashMap<Integer,String>();
		map.put(01, "Rohit");
		map.put(02, "Ujwal");
		map.put(03, "Pushpak");
		
		Set<Integer>keys=map.keySet(); 
		for(Integer key:keys)
		{
			System.out.println(key+" "+map.get(keys));
		}
		

	}

}
