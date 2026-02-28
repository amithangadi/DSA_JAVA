package arrays;

class TwoDArray1{
	String[][] arr;
	
	public TwoDArray1(int rsize, int csize, String value) {
		arr = new String[rsize][csize];
		for(int row=0; row<arr.length; row++) {
			for(int col=0; col<arr[row].length; col++)
			{
				arr[row][col] = null;	//default for string
			}
		}
		
	}
	
	//Insertion
	public void insertion(int row, int col, String value) {// 2, 1, 70 ----->O(1)
		try {
			if (arr[row][col] == null) {
				arr[row][col] = value;
				System.out.println("The given value: " + value + " is inserted");
			} else {
				System.out.println("The cell is already filled");
			}
		} catch (Exception e) {
			System.out.println("Invalid index");
		}
	}
	
	//searching the element by value
		public void searchByValue(String searchValue) {
			try {
				for(int row=0; row<arr.length; row++) {
					for(int col=0; col<arr.length; col++) {
					if(arr[row][col]== searchValue) {
						System.out.println("the value is present in the index: " + row + " "+ col);
						return;
					}
				}System.out.println("The value is not present");
				}
			}catch(Exception e) {
				System.out.println("Invalid searchValue");
			}
		}
		
		//delete by value
		public void deleteByValue(String searchValue) {
			try {
				for (int row = 0; row< arr.length; row++) {	//row
					for(int col=0; col<arr.length; col++) {	//column
						if (arr[row][col]==searchValue) {
							arr[row][col]= null;
							System.out.println("The value is deleted");
							return;
						}
					}
				}
				System.out.println("The value is not present");
			} catch (Exception e) {
				System.out.println("Invalid search1value");
			}
		}
	
	//traverse
	public void treverse() {
		for (int row = 0; row < arr.length; row++) {// ------->O(N)
			for (int col = 0; col < arr.length; col++) {// ---->O(N)
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}

}

public class TwoDArrayMain {
public static void main(String[] args) {
	TwoDArray1 t2 = new TwoDArray1(4, 4, "Amith Angadi");
	t2.insertion(0, 0, "Kempi");
	t2.insertion(1, 0, "Kariya");
	t2.insertion(3, 3, "Bheema");
	t2.treverse();
	
	t2.searchByValue("Kempi");
	//t2.treverse();
	
	t2.deleteByValue("Kempi");
	t2.treverse();
	
}
}

//String in two dimenshional array
