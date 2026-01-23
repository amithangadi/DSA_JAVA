package recursion;

public class MainClass {
	static int Sum(int no) {
		if(no<=1) {
			return no;
		}else {
			
			return no+Sum(no-1);
		}
	}
public static void main(String[] args) {
	//Sum(5);
	System.out.println(Sum(5));
	}
}

//Sum of natural numbers
