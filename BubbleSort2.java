import java.util.*;
public class BubbleSort2 {
        public static void main(String[] args) {
            int[] arr = {6, 2, 4, 10};
            bubbleSort(arr);
            System.out.println("Sorted array:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    
        public static void bubbleSort(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
    }
    

