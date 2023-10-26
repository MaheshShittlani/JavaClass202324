public class TestPerson3 {
    public static void main(String[] args) {
        Person p1 = new Person();// name, age
        Person p2 = new Person(); // name, age


        p1.setName("Alex");
        p1.setAge(32);

        p2.setName("Clark");
        p2.setAge(-35);

        // p1.age = -29; error, becoz age is primvate

        // System.out.println(p1.getName() + " is " + p1.getAge() + " years old");
        // System.out.println(p2.getName() + " is " + p2.getAge() + " years old");

        p1.display();
        p2.display();


        Person p3 = new Person();
        // p3.name = p2.name; Error
        p3.setName(p2.getName());
        // p3.age = p2.age;
        p3.setAge(p2.getAge());
    }
}
