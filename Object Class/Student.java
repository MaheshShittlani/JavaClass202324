import java.util.Arrays;

public class Student implements Cloneable {
    private String name;
    private int age;
    private int[] marks;
    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        marks = new int[3];
    }

    public void setMarks(int ...numbers) {
        for(int i = 0; i < 3; i++) {
            marks[i] = numbers[i];
        }
    }


    @Override
    public Object clone() throws CloneNotSupportedException {
        Student obj = new Student(this.name, this.age);
        for(int i = 0; i < this.marks.length; i++) {
            obj.marks[i] = this.marks[i];
        }

        return obj;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void display() {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Marks: " + Arrays.toString(marks));

        System.out.println(marks);
        System.out.println("----------------------------------");
    }
}


class TestStudent {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student("Alex", 22);
        Student s2 = (Student) s1.clone();

        s1.display();
        s2.display();

        s1.setName("Tony");
        s1.setMarks(33,66,88);
        s1.display();
        s2.display();
    }
}