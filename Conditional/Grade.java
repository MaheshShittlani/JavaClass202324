public class Grade {
    public static void main(String[] args) {
        int m1 = (int)(Math.random() * 100);
        int m2 = (int)(Math.random() * 100);
        int m3 = (int)(Math.random() * 100);
    
        float per = (m1 + m2 + m3)/3.0f;
        char grade;

        if(per >= 85) {
            grade = 'S';
        } else if(per >=75) {
            grade = 'A';
        } else if(per >= 65) {
            grade = 'B';
        } else if(per >= 55) {
            grade = 'C';
        } else if(per >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Per = " + per + "\nGrade = "+grade);
    }
}
