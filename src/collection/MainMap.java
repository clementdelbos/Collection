package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;//Entry est une classe publique interne a la classe Map

public class MainMap {

	public static void main(String[] args) 
	{
		Map<String,Point> map = new HashMap<String,Point>();
		
		for(int i=0; i<5 ;i++)
		{
			String key = "point"+i;
			Point value = new Point(i,i);
			map.put(key,  value);
			
					
		}
		
		Point p4 = map.get("point4");
		System.out.println(p4);
		
		
		//iteration sur les clé
		
		for(String key : map.keySet())
		{
			System.out.println(key + " =" + map.get(key));
			
		}
		
		//iteration sur les values
		for (Point p : map.values())
		{
			System.out.println(p);
		}
		
		// itération sur entry
		for(Entry<String, Point> entry : map.entrySet()) {
			String k = entry.getKey();
			Point v=entry.getValue();
			System.out.println(k + "=" + v);
		}
		
	}

}
