class App1 {
    public static void main(String[] args) {
        String s = "Hello how are you";

        // for(int i = 0; i < s.length(); i++) {
        //     System.out.println(s.charAt(i));
        // }

        // char[] carr = s.toCharArray();

        // for(int i = 0; i < carr.length; i++) {
        //     System.out.println(carr[i]);
        // }

        char[] arr = new char[5];

        s.getChars(6, 9, arr, 2);

        System.out.println(String.valueOf(arr));
    }
}