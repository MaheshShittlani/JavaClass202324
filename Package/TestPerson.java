package p2;

import p1.Person;

class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person(22, "Alex");
        System.out.println(p1.getName()+" "+p1.getAge() + " years old");
    }
}
