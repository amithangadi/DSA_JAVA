package arrays;


class SingleDimension {

    int[] arr;
    // Create SDA → O(N)
    public SingleDimension(int size) {
        arr = new int[size];
        // Initialize array with MIN_VALUE
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }
    // Insert → O(1)
    public void insertion(int index, int value) {https://codeshare.io/new
        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid index");
            return;
        }
        if (arr[index] == Integer.MIN_VALUE) {
            arr[index] = value;
            System.out.println("Inserted value: " + value);
        } else {
            System.out.println("Cell already filled");
        }
    }
    // Search by value → O(N)
    public void searchByValue(int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                System.out.println("Value found at index: " + i);
                return;
            }
        }
        System.out.println("Value not found");
    }

    // Search by index → O(1)
    public void searchByIndex(int index) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid index");
            return;
        }

        if (arr[index] != Integer.MIN_VALUE) {
            System.out.println("Value at index " + index + " is: " + arr[index]);
        } else {
            System.out.println("Cell is empty (MIN_VALUE)");
        }
    }

    // Delete by value → O(N)
    public void deleteByValue(int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                arr[i] = Integer.MIN_VALUE;
                System.out.println("Value deleted and MIN_VALUE assigned");
                return;
            }
        }
        System.out.println("Value not found");
    }

    // Delete by index → O(1)
    public void deleteByIndex(int index) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid index");
            //r exerciseturn;
        }

        arr[index] = Integer.MIN_VALUE;
        System.out.println("Value deleted and MIN_VALUE assigned");
    }

    // Traverse → O(N)
    public void traverse() {
        System.out.println("Array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

public class SingleDimensionArray {

    public static void main(String[] args) {

        SingleDimension sda = new SingleDimension(5);

        sda.insertion(0, 7);
        sda.insertion(1, 3);
        sda.insertion(2, 5);
        sda.insertion(3, 18);
        sda.insertion(4, 28);

        sda.traverse();

        sda.searchByValue(18);
        sda.searchByIndex(2);

        sda.deleteByValue(18);
        sda.deleteByIndex(0);

        sda.traverse();
    
}
}

//single dimension array

















//
//class SingleDimensionArray {
//	String[] arr;
//
////	 creation of SDA         O(N)
//	public SingleDimensionArray(int size) {// 5
//		arr = new String[size]; // ---------------->O(1)
//
//	}
//
//	public void insertion(int index, String value) {// 3 18
//		try {
//			if (arr[index] == null) {
//				arr[index] = value;
//				System.out.println("The value " + value + " is inserted");
//			} else {
//				System.out.println("The block is already filled");
//			}
//		} catch (Exception e) {
//			System.out.println("Invalid value or index");
//		}
//	}
//
//	public void searchByValue(String searchValue) {
//		try {
//			for (int i = 0; i < arr.length; i++) {
//				if (arr[i].equals(searchValue)) {
//					System.out.println("The value is present in the index: " + i);
//					return;
//				}
//			}
//			System.out.println("The value is not present");
//		} catch (Exception e) {
//			System.out.println("Invalid searchvalue");
//		}
//	}
//u
//	public void searchByIndex(int index) {// 1
//		try {
//			if (arr[index] != null) {
//				System.out.println("The value present in the index is: " + arr[index]);
//			} else {
//				System.out.println("Th cell is empty");
//			}
//		} catch (Exception e) {
//			System.out.println("Invalid index");
//		}
//	}
//
//	public void deleyteByValue(String searchValue) {
//		try {
//			for (int i = 0; i < arr.length; i++) {
//				if (arr[i].equals(searchValue)) {
//					arr[i] = null;
//					System.out.println("The value is deleted");
//					return;
//				}
//			}
//			System.out.println("The value is not present");
//		} catch (Exception e) {
//			System.out.println("Invalid searchvalue");
//		}
//	}
//
//	public void deleteByIndex(int index) {// 1
//		try {
//			if (arr[index] != null) {
//				arr[index] = null;
//				System.out.println("The value is deleted ");
//			} else {
//				System.out.println("Th cell is empty");
//			}
//		} catch (Exception e) {
//			System.out.println("Invalid index");
//		}
//	}
//
//	public void traverse() {// ----------->O(N)
//		for (int i = 0; i < arr.length; i++) {// ------>O(N)
//			System.out.println(arr[i]);// ---------->O(1)
//		}
//	}
//
//
//	public static void main(String[] args) {
//		SingleDimensionArray sda = new SingleDimensionArray(5);
//		sda.insertion(0, "7");
//		sda.insertion(3, "18");
//		sda.insertion(1, "3");
//		sda.insertion(4, "28");
//		sda.insertion(2, "5");
//		sda.insertion(10, "18");
//		sda.traverse();
//		sda.searchByValue("18");
//		sda.searchByIndex(0);
//		sda.deleyteByValue("18");
//		sda.deleteByIndex(0);
//		sda.traverse();
//	}
//
//}
