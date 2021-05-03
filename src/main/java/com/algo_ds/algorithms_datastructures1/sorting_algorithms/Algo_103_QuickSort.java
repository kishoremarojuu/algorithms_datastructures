package com.algo_ds.algorithms_datastructures1.sorting_algorithms;

class Algo_103_QuickSort
{ 
	/* This function takes last element as pivot, 
	places the pivot element at its correct 
	position in sorted array, and places all 
	smaller (smaller than pivot) to left of 
	pivot and all greater elements to right 
	of pivot */
	int partition(int arr[], int low, int high)
	{ 
		int pivot = arr[low];
		int i = low; // index of smaller element
		int j=high;
		
//		while(i<j) {
		
		for(;i<j;) {
	
			if(arr[i]<pivot) {
			i++;	
			}
			if(arr[j]>pivot) {
				j--; 
			}
			
			int temp = arr[i];
			arr[i] = arr[j]; 
			arr[j] = temp; 
		}
		
		int temp = arr[i];
		arr[i] = arr[j]; 
		arr[j] = temp; 
		
		
		return j;
		
	
	} 


	/* The main function that implements QuickSort() 
	arr[] --> Array to be sorted, 
	low --> Starting index, 
	high --> Ending index */
	void sort(int arr[], int low, int high)
	{ 
		if (low<high) 
		{ 
			/* pi is partitioning index, arr[pi] is 
			now at right place */
			int pi = partition(arr, low, high);

			// Recursively sort elements before 
			// partition and after partition 
			sort(arr, low, pi); 
			sort(arr, pi+1, high); 
		} 
	} 

	/* A utility function to print array of size n */
	static void printArray(int arr[])
	{ 
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i]+" "); 
		System.out.println(); 
	} 

	// Driver program 
	public static void main(String args[])
	{ 
		int arr[] = {10, 7,9, 1,11,12,13,45,55,66,88};
		int n = arr.length;

		Algo_103_QuickSort ob = new Algo_103_QuickSort();
		ob.sort(arr, 0, n-1); 

		System.out.println("sorted array"); 
		printArray(arr); 
	} 
} 
