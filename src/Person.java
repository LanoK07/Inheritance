// Private and protected

public class Person {
    // height, age, color, name, weight: instance variable

    double height;

    int age;

    String color;

    String name;

    double weight;

    // Cronstructors can have private, protected, public access modifiers

   public Person(){
        // Default constructor can be empty
        height = 48;
        age = 18;
        color = "black";
        name = "";
        weight = 140;
    }

    // Protected members are accessible within the same package-Java files under same directory

    protected Person(double height, int age){
        //Parameters are local variables to the constructor
        this.height= height;
        this.age = age;
    }
    // Overloaded constructor

   private Person(double height, int age, String color, String name, double weight){
        //Parameters are local variables to the constructor
        this.height= height;
        this.age = age;
        this.color = color;
        this.name = name;
        this.weight = weight;

    }

    public Person Call_Private(){
       Person p3 = new Person(72, 70, "Black", "Barack Obama", 170);
       return p3;

    }
}
