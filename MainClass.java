package leetcode_problems;

import java.util.Stack;

class Sample{
	static String valid(String str)
	{
		if(str.length()%2 != 0 )
		{
			return "Invalid";
		}else {
			Stack<Character> stack = new Stack();
			for(int i=0; i<str.length(); i++)
			{
				char ch = str.charAt(i);
				if(ch =='{' || ch == '(' || ch == '[')
				{
					stack.push(ch);
				}else if((ch == ']' && stack.pop() != '[')
				
					|| (ch == '}' && stack.pop() != '{') 
					|| (ch == ')' && stack.pop() != '(')) {
					
					return "Invalid";
				}
			}
			if(stack.isEmpty()) {
				return "valid";
			}
		}
		return str;
	}
}

public class MainClass {
public static void main(String[] args) {
	  System.out.println(Sample.valid("({[]})")); // Valid
      System.out.println(Sample.valid("({[})"));  // Invalid
}
}

//Valid parenthiesis
