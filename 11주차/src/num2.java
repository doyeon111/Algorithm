import java.io.*;
import java.util.*;
 
public class num2 {
       static int findElement(int[] arr, int n)
       {
              int[] leftMax = new int[n];
              leftMax[0] = Integer.MIN_VALUE;
 
              for (int i = 1; i < n; i++)
                   leftMax[i] = Math.max(leftMax[i - 1], arr[i - 1]);
                    
              int rightMin = Integer.MAX_VALUE;
 
              for (int i = n - 1; i >= 0; i--)
              {
                   if (leftMax[i] < arr[i] && rightMin > arr[i])
                       return i;
 
                   rightMin = Math.min(rightMin, arr[i]);
              }
                
              return -1;
 
               
       }
 
       public static void main(String args[])
       {
              int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
              int n = arr.length;
              System.out.println("Input: arr[] = " + Arrays.toString(arr));
              System.out.println("Output: " + Arrays.toString(arr));
       }
 
}