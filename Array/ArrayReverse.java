class ArrayReverse {
    public static void reverse(int[] a) {
        int i = 0;
        int j = a.length - 1;

        int t;
        while(i < j) {
            t = a[i];
            a[i] = a[j];
            a[j] = t;

            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        reverse(arr);

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}