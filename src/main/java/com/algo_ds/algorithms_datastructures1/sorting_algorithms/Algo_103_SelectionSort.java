package com.algo_ds.algorithms_datastructures1.sorting_algorithms;

// Java program for implementation of Selection Sort
class Algo_103_SelectionSort
{ 
	void sort(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i = 0; i < n-1; i++)
		{ 
			// Find the minimum element in unsorted array 
			int min_idx = i; 
			for (int j = i+1; j < n-1; j++){
					System.out.println("------------------------------");
				if (arr[j] < arr[min_idx]) 
					min_idx = j;
			}
			// Swap the found minimum element with the first 
			// element 
			int temp = arr[min_idx]; 
			arr[min_idx] = arr[i]; 
			arr[i] = temp; 
		} 
	} 

	// Prints the array 
	void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i]+" "); 
		System.out.println(); 
	} 

	// Driver code to test above 
	public static void main(String args[]) 
	{ 
		Algo_103_SelectionSort ob = new Algo_103_SelectionSort();
		int arr[] = {64,25,12,22,11}; 
		ob.sort(arr); 
		System.out.println("Sorted array"); 
		ob.printArray(arr); 
	} 
} 
/* This code is contributed by Rajat Mishra*/
