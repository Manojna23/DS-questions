
public class ActualInsertionSort {

	public static void main(String args[]) {
		int[] arr = {77, 99, 44, 55, 22, 88, 11, 00, 66, 33};
		
		insertionSort(arr);
		System.out.println("The initial array after insertion sort is:");
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void insertionSort(int[] arr) {
		int temp = 0;
		int j;
		
		for(int i = 1; i<arr.length; i++) {
			temp = arr[i];
			j = i;
			while(j > 0 && arr[j-1] >= temp) {
				arr[j] = arr[j-1];
				--j;
			}
			arr[j] = temp;
		}
	}
}
