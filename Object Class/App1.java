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

    @Override
    public String toString() {
        return name + " - " + age;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Person) {
            Person p = (Person)obj;
            return this.age == p.age && this.name.equals(p.name);
        }

        return false;
    }
}

class App1 {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = p1;
        Person p3 = new Person();

        p1.setName("Alex"); p1.setAge(22);
        p3.setName("Alex"); p3.setAge(22);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println(p1 == p2); // true
        System.out.println(p1 == p3); // false

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p1.equals("Hello"));

        ArrayList list = new ArrayList<>();
        list.add(1);list.add(2);list.add(3);

        System.out.println(list);

        System.out.println(p1.hashCode());
    }    
}
