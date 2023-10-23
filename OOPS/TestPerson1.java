class TestPerson1 {
    public static void main(String[] args) {
        Person p1 = new Person(); // name,age
        Person p2 = new Person(); // name, age

        p1.name = "Alex";
        p1.age = 28;

        p2.name = "Clark";
        p2.age = -21;

        System.out.println(p1.name + " is " + p1.age + " years old");
        System.out.println(p2.name + " is " + p2.age + " years old");
    }    
}
