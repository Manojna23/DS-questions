
public class ActualBubbleSort {

	public static void main(String args[]) {
		int[] arr = {77, 99, 44, 55, 22, 88, 11, 00, 66, 33};
		
		bubbleSort(arr);
		System.out.println("Initial array after bubble sort is:");
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
	}
	
	public static void bubbleSort(int[] arr) {
		int temp = 0;
		
		for(int i = arr.length-1; i>1; i--) {
			for(int j = 0; j<i; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
