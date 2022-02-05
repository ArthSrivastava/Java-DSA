package OOPS;

 public class Lec1 {


     //     class InnerClass{
//         void greet()
//        {
//            System.out.println("Hello I am a method of InnerClass!");
//        }
//    }
    public static void main(String[] args) {
        Student arth = new Student(40, "Arth Srivastava", 20);
//        System.out.println(arth.rno + "-" + arth.name + "-" + arth.age);
//        arth.greeting();
//    Student.greeting();
//        InnerClass obj = new InnerClass();
        System.out.println(arth instanceof Student);
    }


}
//class test{
//    public static Student st = new Student(4, "Rahul", 20);
//}
class Student{
    int rno;
    String name;
    int age;
    Student(int rno, String name, int age){
        this.rno = rno;
        this.name = name;
        this.age = age;
    }
     void greeting(){
        System.out.println("Hello my name is " + this.name);
    }
}