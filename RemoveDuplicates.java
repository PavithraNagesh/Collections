package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");//split the string

		List<String> lst = new ArrayList<String>(); 
		Set<String> set = new LinkedHashSet<String>();//to remove duplicates
		for (String string : split) {
			lst.add(string);
			set.add(string);
		}
		System.out.println("Array of text : "+lst);
		
		String replace = " ";
		for (String output : set) {
			replace += output + " ";
			
		}
		System.out.println("Without Duplicates : "+replace);
		
	}

}
