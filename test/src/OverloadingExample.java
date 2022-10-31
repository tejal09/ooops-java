//Polymorphism> Overloading
//Same fun, same class, diff argument
//Data type diff, no of argu diff
class Student {
    String name;
    int age;

    public void show(String name) {
        System.out.println(name);
    }

    public void show(int age) {
        System.out.println(age);
    }

    public void show(String name, int age) {
        System.out.println(name + " " + age);

    }
}

public class OverloadingExample {
    public static void main(String args[]) {
        Student s = new Student();
        s.name = "Emily";
        s.age = 18;

        s.show(s.name, s.age);
    }

}