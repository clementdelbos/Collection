package collection;

import java.util.HashMap;
import java.util.Map;

public class MainMapContactAdresse {

	public static void main(String[] args) 
	{
	Map<Contact,Adresse>map= new HashMap <Contact,Adresse>();
	
	Contact c1 = new Contact("gaston");
	Contact c2 = new Contact("adele");
	
	map.put(c1, new Adresse("rue de Paris"));
	map.put(c2, new Adresse("rue de juds"));
	map.put(c1, new Adresse("rue de furit"));
	
	System.out.println("map.size() : "+map.size());
	
	Adresse a = map.get(c1);
	System.out.println(a);
	
	}

}
