package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class FindIntersection {

	public static void main(String[] args) {
		int[] x = {3,2,11,4,6,7}; 
		int[] y = {1,2,8,4,9,7};
		
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> set1 = new HashSet<Integer>();
		
		for (Integer integer : x) {
			set.add(integer) ;
		}
		System.out.println(set);
		for (Integer integer1 : y) {
			set1.add(integer1);
		}
		System.out.println(set1);
		
		set.retainAll(set1);
		System.out.println(set);
		
	}

}
