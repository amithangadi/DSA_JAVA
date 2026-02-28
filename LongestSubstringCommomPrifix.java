package leetcode_problems;

public class LongestSubstringCommomPrifix {
public static void main(String[] args) 
	{
		String[] s1 = {"flower", "flow","flight"};
		String cp = s1[0];
		
		for(int i=1; i<s1.length; i++)
		{
			while(s1[i].indexOf(cp) != 0)
			{
				cp = cp.substring(0, cp.length()-1);	//cp means common prefix
			}
		}
		System.out.println(cp);
	}
}
