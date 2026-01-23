package arrays;

public class SingleDimensionalArray {
	int[] arr;
	
	//creation of single dimensional array
	public SingleDimensionalArray(int size) {	//size is 5
		arr = new int[size];	//--> O(1) TC
		
		for (int i = 0; i < arr.length; i++) 	//O(N)
		{
			arr[i] = Integer.MAX_VALUE;			//O(1)
		}
	}
	
	
	//inserting the elements
	public void insertion(int index, int value) {
		try {
			if(arr[index]==Integer.MIN_VALUE) {
				arr[index]=value;
				System.out.println("The value" + value + "is inserted");
			}else{
				System.out.println("The block is already filled");
			}
			}catch(Exception e) {
				System.out.println("Invalid value or index");
			}
		}
	
	//searching the elements by value
	public void searchByValue(int searchValue) {
		try {
			for(int i=0; i<arr.length; i++) {
				if(arr[i]== searchValue) {
					System.out.println("the value is present in the index: " + i);
					return;
				}
			}
			System.out.println("The value is not present");
		}catch(Exception e) {
			System.out.println("Invalid searchValue");
		}
	}
	
	//searching the element by index
	public void searchByIndex(int index) {
		try {
			if(arr[index]!= Integer.MIN_VALUE) {
				System.out.println("The value present in the index is: " + arr[index]);
			}else {
				System.out.println("The cell is empty");
			}
		} catch (Exception e) {
			System.out.println("Invalid index");
		}
	}
	
	//delete by value
	public void deleteByValue(int searchValue) {
		try {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i]==searchValue) {
					arr[i]=Integer.MIN_VALUE;
					System.out.println("The value is deleted");
					return;
				}
			}
			System.out.println("The value is not present");
		} catch (Exception e) {
			System.out.println("Invalid search1value");
		}
	}
	
	//delete by index
	public void deleteByIndex(int index) {
		try {
				if (arr[index]!=Integer.MIN_VALUE) {
					arr[index]=Integer.MIN_VALUE;
					System.out.println("The value is deleted");
				}else {
			System.out.println("The cell is empty");
			}
		} catch (Exception e) {
			System.out.println("Invalid index");
		}
	}
	
	public void traverse()
	{
		for (int i = 0; i < arr.length; i++) //O(N)
		{
			System.out.println(arr[i]);		//O(1)
		}
	}
	
	public static void main(String[] args) {
		SingleDimensionalArray s1 = new SingleDimensionalArray(5);
								s1.insertion(0, 10);
								s1.insertion(2, 30);
								s1.insertion(3, 40);
								s1.insertion(4, 50);
								s1.traverse();
	}
}
