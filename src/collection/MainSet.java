package collection;

import java.util.HashSet;
import java.util.Set;

public class MainSet {

	public static void main(String[] args) {
		Set<Point> points = new HashSet<Point>();
		
		Point p1 = new Point(10,10);
		
		points.add(new Point(1,1));
		points.add(new Point(1,1));
		points.add(new Point(2,2));
		points.add(new Point(3,3));
		points.add(p1);
		points.add(p1);
		
		for(Point p : points) {
			System.out.println(p);
		}

	}

}
