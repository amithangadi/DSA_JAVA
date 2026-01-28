package leetcode_problems;

import java.util.ArrayList;
import java.util.Arrays;

public class BuyandSell {
	public static int maximumProfit(ArrayList<Integer> prices) {
		int maxProfit = 0;		//initial max profit is zero
		int minPrice = Integer.MAX_VALUE;	//2147
		
		for(int price : prices) {		//main code logics
			if(price < minPrice)	//17<2147(true) then minPrice=17, 20<17 (false) it moves to else part
			{
				minPrice = price;
			}else {
				maxProfit = Math.max(maxProfit, price - minPrice);
			}
		}
		
		return maxProfit;
	
	}
		
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>(Arrays.asList(17,20,11,9,12,6));
		System.out.println(maximumProfit(a1));
		}
}

//buy and sell problem