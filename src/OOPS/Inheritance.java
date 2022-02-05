package OOPS;

public class Inheritance {
    public static void main(String[] args) {
        Child obj = new Child("Arth",20,"5Feet 11Inches", 80);
        obj.greeting();

        Human ob = new Child("Arth",20,"5Feet 11Inches", 80);
        ob.greeting();
    }
}

class Human{
    String name;
    int age;
    String height;
    void greeting()
    {
        System.out.println("Human greeting");
    }
}

class Child extends Human{

    int weight;
    Child(String name, int age, String height, int weight)
    {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    @Override
    void greeting()
    {
        System.out.println("Child greeting:Hello " + this.name);
    }
}