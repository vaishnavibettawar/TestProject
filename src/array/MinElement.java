package array;

public class MinElement{
    public static void main(String[] args) {
       int arr[] = {12 , 34, 5, 28, 8, 19};
        int min = arr[0];
       
   
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            
        }
        
        System.out.println("Minimum value: " + min);
  
  
    }
}
