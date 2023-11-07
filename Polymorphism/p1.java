class Animal {
    public void makeSound() {
        System.out.println("Animal make some sound");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat speaks Meow Meow");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }

    public void run() {
        System.out.println("Dog runs behind the cat");
    }
}


// class Jungle {
//     public static void main(String[] args) {
//         // Animal a;

//         // a = new Animal();
//         // a.makeSound();

//         // a = new Cat();
//         // a.makeSound(); // Cat's makesound

//         // a = new Dog();
//         // a.makeSound(); // Dog's makesound


//         Animal[] animals = new Animal[5];// - - - - - 
//         animals[0] = new Cat();
//         animals[1] = new Dog();
//         animals[2] = new Cat();
//         animals[3] = new Cat();
//         animals[4] = new Dog();

//         for(Animal animal: animals) {
//             animal.makeSound();
//         }
//     }
// }


class Jungle {
    private Animal[] animals;
    private int capacity;
    private int size;

    public Jungle(int capacity) {
        this.capacity = capacity;
        animals = new Animal[this.capacity];
        size = 0;
    }

    public void add(Animal a) {
        animals[size] = a;
        size++;
    }

    public void displayInfo() {
        for(int i = 0; i < size; i++) {
            System.out.println("H.No. "+ i);
            System.out.println("I am a " + animals[i].getClass().getName());
            animals[i].makeSound();
            // animals[i].run(); Error
            System.out.println("---------------------------------");
        }
    }

    public static void main(String[] args) {
        Jungle j1 = new Jungle(10);

        j1.add(new Dog());
        j1.add(new Cat());
        j1.add(new Cat());
        j1.add(new Dog());

        j1.displayInfo();
    }
}
 