
public class ActualMergeSort {

	private static int[] arr = {77, 99, 44, 55, 22, 88, 11, 00, 66, 33};
	public static void main(String args[]) {
		
		mergeSort(new int[arr.length], 0, arr.length-1);
		System.out.println("The initial array merge sort is:");
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void mergeSort(int[] tempArray, int lowerbound, int upperbound) {
		if(lowerbound >= upperbound) {
			return;
		}
		else {
			int mid = (lowerbound + upperbound) / 2;
			mergeSort(tempArray, lowerbound, mid);
			mergeSort(tempArray, mid+1, upperbound);
			
			merge(tempArray, lowerbound, mid+1, upperbound);
		}
	}
	
	public static void merge(int[] tempArray, int lowerbound, int uppermid, int upperbound) {
		int lowPtr = lowerbound;
		int index = 0;
		int mid = uppermid - 1;
		int size = (upperbound - lowerbound) + 1;
		
		while(lowerbound <= mid && uppermid <= upperbound) {
			if(arr[lowerbound] < arr[uppermid]) {
				tempArray[index ++] = arr[lowerbound++];
			}
			else {
				tempArray[index++] = arr[uppermid++];
			}
		}
		
		while(lowerbound <= mid) {
			tempArray[index++] = arr[lowerbound++];
		}
		
		while(uppermid <= upperbound) {
			tempArray[index++] = arr[uppermid++];
		}
		
		for(int i = 0; i<size; i++) {
			arr[lowPtr+i] = tempArray[i];
		}
	}
}
