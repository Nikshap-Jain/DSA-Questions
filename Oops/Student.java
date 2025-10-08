package Oops;

public class Student {
    String name;
    int age;

    public void Intro() {
        System.out.println("My name is" + name + "and age is " + age);
    }

    public static void mentorName() {
        System.out.println("Monu bhaiya");
    }

    static {
        System.out.println("I am always first when first obj of Student is created");
    }
}
