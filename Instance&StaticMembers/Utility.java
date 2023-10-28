class Utility {
    public static int sum(int x, int y) {
        return x + y;
    }    

    public static int max(int x, int y) {
        return x > y ? x : y;
    }

    public static float avg(int x , int y) {
        return (x + y) / 2.0f;
    }
}

class TestUtitlity {
    public static void main(String[] args) {
        Utility.sum(4, 5);
        Utility.max(10, 13);
        
    }
}
