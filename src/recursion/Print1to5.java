package recursion;

public class Print1to5 {
	static void print(int no) {
		if(no<=5) {		//1 is less than 5 it runs till the 5 is equals to 5
			System.out.print(" "+no);
			print(++no);	//pre-increment
		}
	}
public static void main(String[] args) {
	print(1);	//calling the print method
	
	}
}

//printing the numbers from 1 to 5
