package recursion;

public class Fibonacci {
static int fib(int no)
{
	if(no==0)
	{
		return 0;
	}else if(no==1 || no==2)
		return 1;
	else {
		return fib(no-1) + fib(no-2);	//divide and conquer approach
	}
}
public static void main(String[] args) 
{
	System.out.println(fib(7));
}
}

//program to print fibonacci numbers without using looping