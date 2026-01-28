package recursion;

public class FibonacciRange {
static int fib(int no)
 { 
	if(no==0)
	{
		return 0;
	}else if(no==1 || no==2)
		return 1;
	else {
		return fib(no-1) + fib(no-2);
	}
 }
public static void main(String[] args) {
	for(int i=0; i<=7; i++)
	{
		System.out.println(i + "->" +  fib(i));
	}
}
}

//range of fibonacci numbers/series without using looping
