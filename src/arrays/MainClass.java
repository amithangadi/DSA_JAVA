package arrays;

class TwoDArray {
	int[][] arr;

	public TwoDArray(int rsize, int csize) {// 4, 4-------->O(N^2)
		arr = new int[rsize][csize];
		for (int row = 0; row < arr.length; row++) {// ------->O(N)
			for (int col = 0; col < arr.length; col++) {// ---->O(N)
				arr[row][col] = Integer.MIN_VALUE;
			}
		}
	}

	public void insertion(int row, int col, int value) {// 2, 1, 70 ----->O(1)
		try {
			if (arr[row][col] == Integer.MIN_VALUE) {
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
	public void searchByValue(int searchValue) {
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
	
	//searching the element by index
	public void searchByIndex(int row, int col) {
		try {
			if(arr[row][col]!= Integer.MIN_VALUE) {
				System.out.println("The value present in the index is: " + arr[row][col]);
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
			for (int row = 0; row< arr.length; row++) {	//row
				for(int col=0; col<arr.length; col++) {	//column
					if (arr[row][col]==searchValue) {
						arr[row][col]=Integer.MIN_VALUE;
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
	
	//delete by index
	public void deleteByIndex(int row, int col) {
		try {
				if (arr[row][col]!=Integer.MIN_VALUE) {
					arr[row][col]=Integer.MIN_VALUE;
					System.out.println("The value is deleted");
				}else {
			System.out.println("The cell is empty");
			}
		} catch (Exception e) {
			System.out.println("Invalid index");
		}
	}

	//traversing 
	public void treverse() {
		for (int row = 0; row < arr.length; row++) {// ------->O(N)
			for (int col = 0; col < arr.length; col++) {// ---->O(N)
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}

}

public class MainClass {
	public static void main(String[] args) {
		TwoDArray td = new TwoDArray(4, 4);
		td.insertion(0, 0, 10);
		td.insertion(0, 1, 20);
		td.insertion(0, 2, 30);
		td.insertion(0, 3, 40);
		td.insertion(1, 0, 50);
		td.insertion(1, 1, 15);
		td.insertion(1, 2, 25);
		td.insertion(1, 3, 35);
		td.insertion(2, 0, 45);
		td.insertion(2, 1, 55);
		td.insertion(2, 2, 16);
		td.insertion(2, 3, 17);
		td.insertion(3, 0, 18);
		td.insertion(3, 1, 19);
		td.insertion(3, 2, 21);
		td.insertion(3, 3, 22);
		td.treverse();
		td.searchByValue(30);
		
		td.searchByIndex(1, 3);
		
		td.deleteByValue(55);
		td.treverse();
		
		td.deleteByIndex(3, 3);
		td.treverse();
		
	}
}




//class TwoDArray{
//	int[][] arr;		//global variable
//	
//	TwoDArray(int rowsize, int columnsize){	//initialization	O(N*2)
//		arr = new int[rowsize][columnsize];
//		for(int row=0; row<arr.length; row++) {//for loop--> rowwise	O(N)
//			for(int col=0; col<arr.length; col++) {//for loop-->columnwise O(N)
//				arr[row][col] = Integer.MIN_VALUE;
//			}
//		}
//	}
//	
//	public void insertion(int row, int col, int value) {
//		try {
//			if(arr[row][col] == Integer.MIN_VALUE);
//				arr[row][col] = value;
//				System.out.println("The given vlaue " + value + "is inserted");
//				
//		} else {
//			System.out.println("The cell is already filled");
//		}
//	catch (Exception e) {
//			System.out.println();
//		}
//	}
//	
//}
//
//
//public class MainClass {
//public static void main(String[] args) {
//	TwoDArray td = new TwoDArray(4,4);
//}
//}

//Two dimensional array problem