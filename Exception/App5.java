class AgeException extends Exception {
    public AgeException(String msg) {
        super(msg);
    }
}

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
        try {
            if(age <= 0) {
                throw new AgeException("Invalid Age");
            }
            this.age = age;
        } catch(Exception e) {
            System.out.println(e);
        } 
    }

    public int getAge() {
        return age;
    }
}
public class App5 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Alex");
        p1.setAge(22);

        Person p2 = new Person();
        p2.setName("Smith");
        p2.setAge(-22);

        System.out.println(p1.getName()+" is " + p1.getAge() + " years old");
        System.out.println(p2.getName()+" is " + p2.getAge() + " years old");
    }
}
