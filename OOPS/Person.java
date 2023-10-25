class Person {
    private String name;
    private int age;

   public void setAge(int a) {
        if(a > 0 && a < 100) {
            age = a;
        } else {
            age = 1;
        }
   }

   public void setName(String n) {
        name = n;
   }

   public int getAge() {
    return age;
   }

   public String getName() {
       return name;
   }

   public void display() {
    System.out.println(name+"  is " + age + " years old");
   }
}
