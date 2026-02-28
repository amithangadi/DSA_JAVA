package leetcode_problems;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeating {
public static void main(String[] args) 
	{
		String s = "fwwkew";
		Set<Character> s1 = new HashSet<Character>();	//hastset allows duplicate values
		int j = 0, max = 0, n = s.length();
		if(s == null || s.length() == 0) {
			System.out.println("0");
		}
		for(int i=0; i<n; i++) {
			while(s1.contains(s.charAt(i))) {
				s1.remove(s.charAt(j));
				j++;
			}
			//adding the elements
			s1.add(s.charAt(i));
			max = Math.max(max, (i-j) + 1);
		}
		System.out.println(max);
	}
}
