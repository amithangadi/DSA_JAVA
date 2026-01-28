package recursion;

public class StringReverse {
static String reverse(String str)
 {
	if(str.isEmpty())
	{
		return str;
	}else {
		return reverse(str.substring(1)) + str.charAt(0);
	}
 }
public static void main(String[] args) {
	System.out.println(reverse("Method"));
 }
}

//program to reverse a string without looping