package Oops;

public class Person {
    // String name = "Nikshap";
    // int age = 20;
    private String name = "Nikshap";
    private int age = 20;

    public Person() {
        // Non parameterised constructor
    }

    public Person(String name, int age) {
        // parameterised constructor
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void updateName(String name) {
        this.name = name;
    }
}
