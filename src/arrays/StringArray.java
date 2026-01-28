package arrays;

public class StringArray {
	String[] arr;

	
	//String array creation
	public StringArray(int size, String string) {
		arr = new String[size];
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i] = null; 
		}
	}
	
	//insertion in StringArray
	public void insertion(int index, String value) {
		try {
			if(arr[index] ==null) {
				arr[index]= value;
				System.out.println("The value " + value + " is inserted");
			}else{
				System.out.println("The block is already filled");
			}
			}catch(Exception e) {
				System.out.println("Invalid value or index");
			}
		}
	
	
	//searching the elements by value
	
	
	//traversing the String array
	public void traverse()
	{
		for (int i = 0; i < arr.length; i++) //O(N)
		{
			System.out.println(arr[i]);		//O(1)
		}
	}
	
	public static void main(String[] args) {
		StringArray s1 = new StringArray(5, null);
					s1.insertion(0, "amith");
					s1.insertion(1, "angadi");
					s1.insertion(2, "kiran");
					s1.insertion(3, "sindhanur");
					s1.insertion(4, "Raichur");
					
					s1.traverse();
	}
}
