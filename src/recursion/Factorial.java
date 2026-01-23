package recursion;

public class Factorial {
	static int fact(int no) {
		if(no<=1) {
			return no;
		}else {
			return no*(fact(no-1));	//base condition
		}
	}
public static void main(String[] args) {
	System.out.println(fact(5));	//calling the fact method
	}
}

//factorial of a given numbers using recursion
