import java.io.Console;

class TestPerson2 {
    public static void main(String[] args) {
        int x;
        Person p1 = new Person();
        Person p2 = new Person();

        p1.name = "Alex";
        p2.name = "Clark";

        Console con = System.console();
        System.out.print("Enter person-1  Age: ");
        x = Integer.parseInt(con.readLine());

        
        if(x > 0) {
            p1.age = x;
        } else {
            p1.age = 1;
        }

        System.out.print("Enter person-2  Age: ");
        x = Integer.parseInt(con.readLine());

        if(x > 0) {
            p2.age = x;
        } else {
            p2.age = 1;
        }
        System.out.println(p1.name + " is " + p1.age + " years old");
        System.out.println(p2.name + " is " + p2.age + " years old");
    }    
}
