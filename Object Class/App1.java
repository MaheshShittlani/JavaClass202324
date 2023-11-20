import java.util.ArrayList;

class Person {
    private String name;
    private int age;

    public Person() {
        name = "Untitle";
        age = 1;
    }


    public void setName(String name) {
        this.name = name;
    } 

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age; 
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return name + " - " + age;
    }
}

class App1 {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        p1.setName("Alex"); p1.setAge(22);
        p2.setName("Clark"); p2.setAge(33);
        System.out.println(p1);
        System.out.println(p2);

        ArrayList list = new ArrayList<>();
        list.add(1);list.add(2);list.add(3);

        System.out.println(list);
    }    
}
