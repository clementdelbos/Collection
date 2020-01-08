package collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class MainList {

	

	public static void main(String[] args) {
		List<Point> points = new ArrayList<Point>();
		
		
		points.add(new Point(1,1));
		points.add(new Point(1,1));
		points.add(new Point(2,2));
		points.add(new Point(3,3));
		
		// "for each" on ne peut pas supprimer des éléments dans la liste
		for(Point p : points) {
			System.out.println(p);
		}
		System.out.println("============================");
		
		// parcrous classique
		for (int i =0; i<points.size(); i++) {
			Point p = points.get(i);
			System.out.println(p);
		}
		System.out.println("============================");
		
		// parcours par itérateur
		Iterator<Point> it = points.iterator();
		while(it.hasNext()) {
			Point p =it.next(); 
			System.out.println(p);
		}
		

	}

}
