public class Max41 {
    public static void main(String[] args) {
        int a = (int)(Math.random() * 10);
        int b = (int)(Math.random() * 10);
        int c = (int)(Math.random() * 10);
        int d = (int)(Math.random() * 10);

        int max;

        if(a > b) {
           if(a > c) {
                if(a > d) {
                    max = a;
                } else {
                    max = d;
                }
           } else {
               if(c > d) {
                    max = c;
               }else {
                    max = d;
               }
           } 
        }else {
            if(b > c) {
                if(b > d) {
                    max = b;
                } else {
                    max = d;
                }
            } else {
                if(c > d) {
                    max = c;
                } else {
                    max = d;
                }
            } 
        }

        System.out.println("Max " + max);
    }
}
