package practice.advanced.sorting;

public class QuickSortBest {

	public static int[] arr = {69, 0, 70, 6, 38, 38, 24, 56, 44, 26, 73, 77, 30, 45, 97, 65};
	public static void main(String args[]) {
		
		System.out.println("Array before sort:");
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
		quickSort(0, arr.length-1);
		System.out.println();
		System.out.println("ArrayAfter sort:");
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+ " -> ");
		}
	}
	
	public static void quickSort(int left, int right) {
		recQuickSort(left, right);
	}
	
	public static void recQuickSort(int left, int right) {
		int size = right-left+1;
		
		if(size <= 10) {
			insertionSort(left, right);
		}
		else {
			int median = findMedian(left, right);
			int partition = doPartition(left, right, median);
			
			recQuickSort(left, partition-1);
			recQuickSort(partition+1, right);
		}
	}
	
	public static int doPartition(int left, int right, int pivot) {
		int leftPtr = left;
		int rightPtr = right-1;
		
		while(true) {
			
			while(arr[++leftPtr] < pivot) {
				; //do nothing
			}
			
			while(arr[--rightPtr] > pivot) {
				; //do Nothing
			}
			
			if(leftPtr >= rightPtr) {
				break;
			}
			else {
				swap(leftPtr, rightPtr);
			}
		}
		swap(leftPtr, right-1); //being the median to leftPtr;
		return leftPtr;
	}
	
	public static int findMedian(int left, int right) {
		int center = (left+right) / 2;
		
		if(arr[left] > arr[right]) {
			swap(left, right);
		}
		if(arr[left] > arr[center]) {
			swap(left, center);
		}
		if(arr[center] > arr[right]) {
			swap(center, right);
		}
		swap(center, right-1); //bring median to right-1
		return arr[right-1];
	}
	
	public static void swap(int firstIndex, int secondIndex) {
		int temp = 0;
		temp = arr[firstIndex];
		arr[firstIndex] = arr[secondIndex];
		arr[secondIndex] = temp;
	}
	
	public static void insertionSort(int left, int right) {
		int temp = 0;
		int i, j;
		
		for(i = left+1; i<=right; i++) {
			temp = arr[i];
			j = i;
			
			while(j > left && arr[j-1] >= temp) {
				arr[j] = arr[j-1];
				--j;
			}
			arr[j] = temp;
		}
	}
}
