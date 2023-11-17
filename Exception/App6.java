import java.io.IOException;

class AgeException extends Exception {
    public AgeException(String msg) {
        super(msg);
    }

    public AgeException(String msg, Exception causeException) {
        super(msg, causeException);
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

    public void setAge(int age) throws AgeException {
        if(age <= 0) {
            // AgeException e = new AgeException("Invalid Age");
            // e.initCause(new IOException("Invalid Input"));
            // throw e;

            throw new AgeException("Invalid Age", new IOException("Invalid Input"));
        }
        this.age = age; 
    }

    public int getAge() {
        return age;
    }
}
public class App6 {
    public static void main(String[] args) {
        Person p1 = new Person();
        try {
            p1.setName("Alex");
            p1.setAge(22);
            System.out.println(p1.getName()+" is " + p1.getAge() + " years old");
        } catch(AgeException e) {
            System.out.println(e);
        }

        Person p2 = new Person();
        try {
            p2.setName("Smith");
            p2.setAge(-22);
            System.out.println(p2.getName()+" is " + p2.getAge() + " years old");
        } catch(AgeException e) {
            System.out.println("Original: "+ e);
            System.out.println("Background: " + e.getCause());
        }
    }
}
