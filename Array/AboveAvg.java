import java.io.Console;

public class AboveAvg {
    public static void main(String[] args) {
    
        Console con = System.console();
        System.out.print("Enter How many elements? ");
        int n = Integer.parseInt(con.readLine()); // 20

        int[] arr = new int[n];

        // Input
        
        int sum = 0;
        for(int i = 0; i < n; i++) {
            System.out.print("Enter element "+ (i + 1)+": ");
            arr[i] = Integer.parseInt(con.readLine());
            sum = sum + arr[i];
        }

        float avg = (float)sum / arr.length;

        System.out.println("Array Sum: " + sum);
        System.out.println("Array Avg: " + avg);

        System.out.println("Element above than avg...");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > avg) {
                System.out.print(arr[i]+" ");
            }
            
        }
    }    
}
