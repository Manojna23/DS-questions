package practice.recursion;

public class MergeSortUsingRecursion {

	static int initialArray[] = {64, 21, 33, 70, 12, 85, 44, 3, 99, 0, 108, 36};
	static int finalArray[] = new int[initialArray.length];
	
	public static void main(String args[]) {
		
		System.out.print("The initial array is:");
		for(int i = 0;i<initialArray.length; i++) {
			System.out.print(initialArray[i]+ " ");
		}
		
		mergeSort(finalArray, 0, initialArray.length-1);
		
		System.out.println();
		System.out.print("The final array is:");
		for(int i = 0;i<initialArray.length; i++) {
			System.out.print(initialArray[i]+ " ");
		}
	}
	
	public static void mergeSort(int[] finalArray, int lowerbound, int upperbound) {
		if(lowerbound == upperbound) {
			return;
		}
		else {
			int mid = (lowerbound+upperbound)/2;
			mergeSort(finalArray, lowerbound, mid);
			mergeSort(finalArray, mid+1, upperbound);
			
			merge(finalArray, lowerbound, mid+1, upperbound);
		}
	}
	
	public static void merge(int[] finalArray, int lowerbound, int uppermid, int upperbound) {
		int mid = uppermid-1;
		int index = 0;
		int lowptr = lowerbound;
		int n = upperbound-lowerbound+1;
		while(lowerbound <= mid && uppermid <= upperbound) {
			if(initialArray[lowerbound] < initialArray[uppermid]) {
				finalArray[index ++] = initialArray[lowerbound++];
			}
			else {
				finalArray[index++] = initialArray[uppermid++];
			}
		}
		
		while(lowerbound <= mid) {
			finalArray[index ++] = initialArray[lowerbound++];
		}
		
		while(uppermid <= upperbound) {
			finalArray[index++] = initialArray[uppermid++];
		}
		
		for(int j = 0;j<n;j++) {
			initialArray[lowptr+j] = finalArray[j];
		}
	}
}
