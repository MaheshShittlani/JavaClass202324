class Max {
    public static void main(String[] args) {
        int a, b, max;

        a = (int)(Math.random() * 100);
        b = (int)(Math.random() * 100);

        if(a > b) {
            max = a;
        } else {
            max = b;
        }
        
        System.out.println("a = " + a + " b = " + b);
        System.out.println("Max = "+max);
    }
}