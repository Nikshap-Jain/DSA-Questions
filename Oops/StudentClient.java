package Oops;

public class StudentClient {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Nikshap";
        s1.age = 22;
        Student s2 = new Student();
        s2.name = "Vaibhav";
        s2.age = 21;
        s1.Intro();
        s2.Intro();

        // use of static. , here we don't need to create object to call static method ,
        // we can directly call them because they are class oriented.
        Student.mentorName();
    }

    static {
        System.out.println("I am always first because i am the static block of Student client");
    }
}
