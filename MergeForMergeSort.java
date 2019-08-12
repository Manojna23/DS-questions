package practice.recursion;

public class MergeForMergeSort {

	public static void main(String args[]) {
		int arrA[] = {23, 47, 81, 95};
		int arrB[] = {7, 14, 39, 55, 62, 74};
		int arrC[] = new int[10];
		
		for(int i = 0; i<trial1.length; i++) {
			System.out.println(trial1[i]);
		}
		merge(arrA, arrA.length, arrB, arrB.length, arrC);
		for(int i = 0;i<arrC.length; i++) {
			System.out.print(arrC[i] +" ");
		}
	}
	
	public static void merge(int arrA[], int sizeA, int arrB[], int sizeB, int arrC[]) {
		int indexA = 0, indexB = 0, indexC = 0;
		
		while(indexA < sizeA && indexB < sizeB) {  //when neither array is empty
			if(arrA[indexA] < arrB[indexB]) {
				arrC[indexC++] = arrA[indexA++];
			}
			else {
				arrC[indexC++] = arrB[indexB++];
			}
		}
		
		while(indexA < sizeA) { //when B gets empty
			arrC[indexC++] = arrA[indexA++];
		}
		
		while(indexB < sizeB) {  //when A gets empty
			arrC[indexC++] = arrB[indexB++];
		}
	}
}
