
public class ActaulSelectionSort {

	public static void main(String args[]) {
		int[] arr = {77, 99, 44, 55, 22, 88, 11, 00, 66, 33};
		
		selectionSort(arr);
		System.out.println("Initial array after selection sort is:");
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void selectionSort(int[] arr) {
		int temp = 0;
		int min=0;
		for(int i = 0; i<arr.length-1; i++) {
			min = i;
			for(int j = i+1; j<arr.length; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}
}
