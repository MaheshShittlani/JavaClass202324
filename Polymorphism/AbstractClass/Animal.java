abstract class Animal {
    public static final int NO_OF_LEGS = 4;
    private String name;

    public void set(String name) {
        this.name = name;
    }

    public String get() {
        return name;
    }
    abstract public void eat(); 
    abstract public void speak(); 
    abstract public void run(); 
}

class Cat extends Animal {
    public void eat() {
        System.out.println("Cat eat milky food");
    }

    public void speak() {
        System.out.println("Cat speak meow meow");
    }

    public void run() {
        System.out.println("Cat runs behind the rat very fast");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("Dog eats paddygree");
    }

    public void speak() {
        System.out.println("Dog speak bow bow");
    }

    public void run() {
        System.out.println("Dog runs behind the cat very fast");
    }
}

class Horse extends Animal {
    public void eat() {
        System.out.println("Horse eats grass");
    }

    public void speak() {
        System.out.println("Horse neighs");
    }

    public void run() {
        System.out.println("Horse runs extremly fast");
    }
}

class Jungle {
    private Animal[] animals;
    private int capacity;
    private int size;

    public Jungle(int capacity) {
        this.capacity = capacity;
        animals = new Animal[this.capacity];
        size = 0;
    }

    public void add(Animal animal, String name) {
        if(size >= capacity) {
            System.out.println("Jungle is full");
            return;
        }
        animal.set(name);
        animals[size] = animal;
        size++;
    }

    public void displayInfo() {
        System.out.println("Welcome to jungle and we all are Animal having "+ Animal.NO_OF_LEGS +" legs");
        System.out.println("*********************************************************");
        for(int i = 0; i < size; i++) {
            Animal animal = animals[i];
            System.out.println("Hi All!!! I am " + animal.get());
            System.out.println("I am a " + animal.getClass().getName());
            animal.speak();
            animal.eat();
            animal.run();
            System.out.println("--------------------------");
        }
    }

    public static void main(String[] args) {
        Jungle j1 = new Jungle(10);
        j1.add(new Cat(), "Lucy");
        j1.add(new Dog(), "Jimmy");
        j1.add(new Dog(), "Alex");
        j1.add(new Horse(), "Tome");

        j1.displayInfo();
    }
}