class Student{
    String name;
    int age;
    public void info(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class oops_student {
    public static void main(String[] args) {
         Student s1 = new Student();
        s1.name = "hari";
        s1.age = 54;
         s1.info();
         Student s2 = new Student();
        s2.name = "harish";
        s2.age = 34;
         s2.info();
    }
}
