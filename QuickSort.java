package practice.advanced.sorting;

public class QuickSort {

	public static int[] arr = {69, 0, 70, 6, 38, 38, 24, 56, 44, 26, 73, 77, 30, 45, 97, 65};
	public static void main(String args[]) {
		
		System.out.println("Array before sort:");
		for(int i = 0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		quickSort(0, arr.length-1);
		System.out.println();
		System.out.println("Quick sorted array is:");
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	
	public static void quickSort(int low, int high) {
		recQuickSort(low, high);
	}
	
	public static void recQuickSort(int left, int right) {
		if(right - left <= 0) {   //this means that both are 1 
			return;
		}
		else {
			int pivot = arr[right];
			
			int partition = doPartition(left, right, pivot);
			
			recQuickSort(left, partition-1);
			recQuickSort(partition+1, right);
		}
	}
	
	public static int doPartition(int low, int high, int pivot) {
		int lowPtr = low - 1;
		int highPtr = high;
		
		while(true) {
			
			while(arr[++lowPtr] < pivot) {
				; //do Nothing
			}
			
			while(highPtr > 0 && arr[--highPtr] > pivot) {
				; //do Nothing
			}
			
			if(lowPtr >= highPtr) {
				break;
			}
			else {
				swap(lowPtr, highPtr);
			}
		}
		swap(lowPtr, high);
		return lowPtr;
	}
	
	public static void swap(int firstIndex, int secondIndex) {
		int temp = 0;
		temp = arr[firstIndex];
		arr[firstIndex] = arr[secondIndex];
		arr[secondIndex] = temp;
	}
}
