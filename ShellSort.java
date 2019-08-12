package practice.advanced.sorting;

public class ShellSort {

    public static void main(String args[]) {
        int arr[] = {20, 89, 6, 42, 55, 59, 41, 69, 75, 66};

        System.out.println("Array before sorting:");
        for(int i = 0;i <arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }

        shellSort(arr);
        System.out.println();
        System.out.println("After after sorting is:");
        for(int i = 0;i <arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

    public static void shellSort(int[] arr) {
        int h = 1;
        int temp, i, j;
        int size = arr.length;

        while(h <= size/3) {
            h = 3*h + 1;
        }

        while(h > 0) {
            for(i = h; i<size;i ++) {
                temp = arr[i];
                j = i;
                while(j > h-1 && arr[j-h] >= temp) {
                    arr[j] = arr[j-h];
                    j = j-h;
                }
                arr[j] = temp;
            }
            h = (h-1)/3;
        }
    }
}
