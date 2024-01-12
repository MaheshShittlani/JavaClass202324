class SingletonDemo {
    private String name;
    private int age;

    private static SingletonDemo obj = null;

    private SingletonDemo() {

    }

    public static SingletonDemo getInstance() {
        if(obj == null)
            obj = new SingletonDemo();

        return obj;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "["+ name +"  -  " + age + "]";
    }
}


class Test {
    public static void main(String[] args) {
        SingletonDemo s1 = SingletonDemo.getInstance() ;
        SingletonDemo s2 = SingletonDemo.getInstance();

        System.out.println(s1);
        System.out.println(s2);

        s1.setName("Alex"); s1.setAge(22);

        System.out.println(s1);
        System.out.println(s2);
    }
}