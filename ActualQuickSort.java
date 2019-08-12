
public class ActualQuickSort {

	private static int[] arr = {77, 99, 44, 55, 22, 88, 11, 00, 66, 33};
	public static void main(String args[]) {
		
		recQuickSort(0, arr.length-1);
		
		System.out.println("The initial array after quick sort is:");
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void recQuickSort(int left, int right) {
		int size = right-left+1;
		if(size < 10) {
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
				; //do absolutely nothing
			}
			while(arr[--rightPtr] > pivot) {
				; //do absolutely nothing
			}
			if(leftPtr >= rightPtr) {
				break;
			}
			else {
				swap(leftPtr, rightPtr);
			}
		}
		swap(leftPtr, right-1); //bring the center point from right-1 to leftPtr, which has actually become the center point
		return leftPtr;
	}
	
	public static int findMedian(int left, int right) {
		int center = (left+right) / 2;
		
		if(arr[center] > arr[right]) {
			swap(center, right);
		}
		if(arr[left] > arr[right]) {
			swap(left, right);
		}
		if(arr[left] > arr[center]) {
			swap(left, center);
		}
		swap(center, right-1);   //putting the median in right-1 position for now
		return arr[right-1];
	}
	
	public static void swap(int firstIndex, int secondIndex) {
		int temp = arr[firstIndex];
		arr[firstIndex] = arr[secondIndex];
		arr[secondIndex] = temp;
	}
	
	
	public static void insertionSort(int left, int right) {
		int temp = 0;
		int j;
		
		for(int i = left+1; i<=right; i++) {
			temp = arr[i];
			j = i;
			while( j > left && arr[j-1] >= temp) {
				arr[j] = arr[j-1];
				--j;
			}
			
			arr[j] = temp;
		}
	}
}
