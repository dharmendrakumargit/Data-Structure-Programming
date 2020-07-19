package com.programming.array;

// Stock Buy Sell to Maximize The Profit Algorithm
// Author @ Dharmendra Kumar 19 July 2020

public class StockBuySellMaxProfit {

	public static int getMaxProfitFromStock(int arr[]) {

		int lowestBuyingPrice = arr[0];
		int highestSellingPrice = Integer.MIN_VALUE;
		int maxProfit = Integer.MIN_VALUE;
		int len = arr.length;
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > lowestBuyingPrice) {

				int profit = arr[i] - lowestBuyingPrice;
				if (profit > maxProfit) {
					maxProfit = profit;
					highestSellingPrice = arr[i];
				}

			} else {
				lowestBuyingPrice = arr[i];
			}

		}
		System.out
				.println("lowestBuyingPrice : " + lowestBuyingPrice + "  highestSellingPrice : " + highestSellingPrice);

		return maxProfit;

	}

	public static void main(String[] args) {

		int arr[] = { 14, 12, 70, 15, 99, 65, 21, 90 };
		System.out.println("Maximum profit :" + getMaxProfitFromStock(arr));

		// OUT PUT

		/*
		  lowestBuyingPrice : 12 highestSellingPrice : 99 
		  Maximum profit :87
		 */
	}

}
