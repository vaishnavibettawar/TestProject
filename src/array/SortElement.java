package array;

public class SortElement { 
	public static void main(String[] args) {
		int[] arr = {2, 34, 9, 22, 17}; 
		
		
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
    
 
    System.out.println("Sorted array:");
    for (int num : arr) {
        System.out.print(num + " ");
    }
}

}
