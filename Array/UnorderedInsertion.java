/**                           i
 *              0,1,2,3,4,5,6,7
 * int[] arr = {3,1,5,9,10,2,4};
 * 
 * item = 13
 * pos = 3
 * 
 */

import java.io.Console;

class UnorderedInsertion {
    public static void main(String[] args) {
        int[] arr = new int[20];
        
        Console con = System.console();
        System.out.println("Enter how many elements<Max:15>: ");
        int n = Integer.parseInt(con.readLine());

        // Input array
        for(int i = 0 ; i < n ; i++) {
            System.out.print("Enter element-"+ (i + 1) +": ");
            arr[i] = Integer.parseInt(con.readLine());
        }

        System.out.println("Enter the item and position to insert: ");
        int item = Integer.parseInt(con.readLine());
        int pos = Integer.parseInt(con.readLine());

        // Shifting
        int i;
        for(i = n - 1; i >= pos - 1; i--) {
            arr[i + 1] = arr[i];
        }

        // Insertion
        arr[i + 1] = item;

        // increase the size
        n = n + 1;

        // Display
        for(i  = 0; i < n; i ++) {
            System.out.print(arr[i] + " ");
        }
    }    
}
