class VerticalHistogram {
    public static void main(String[] args) {
        int[] arr = {3,5,6,2,9};

        int max = arr[0];
        for(int i = 1; i < arr.length; i ++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        for(int i = 0; i < max; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(arr[j] > 0 ) {
                    System.out.print(" * ");
                    arr[j]--;
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}