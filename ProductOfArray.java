package leetcode_problems;

import java.util.Arrays;

public class ProductOfArray {
	public static int[] productExceptionSelf(int[] nums) {
		int[] arr = new int[nums.length];
		
		for(int i=0; i<arr.length; i++)		
		{
			arr[i] = 1;
		}
			
			for(int i=0; i<nums.length; i++)
			{
				for(int j=0; j<nums.length; j++) {
					if(i != j) {
						arr[i] = arr[i]*nums[j];
				}
			}
		}
		
		return arr;
	}
public static void main(String[] args) {
	int[] arr = {1,2,3,4};
	System.out.println(Arrays.toString(productExceptionSelf(arr)));
	
}
}

//product of two array problems