public class ArrayReversev2 {
    public static int[] reverse(int[] arr) {
        int[] temp = new int[arr.length];
        for(int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            temp[j] = arr[i];
        }
        return temp;
    }
    public static void main(String args[]) {
        int[]  arr = {1, 2, 3, 4, 5};

        System.out.println("Original array...");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int[] revArr = reverse(arr);

        System.out.println("\nReverse array...");
        for(int i = 0; i < revArr.length; i++) {
            System.out.print(revArr[i] + " ");
        }
    }
}
