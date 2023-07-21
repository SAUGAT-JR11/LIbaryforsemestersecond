class Animal {
    String noise;
    int age;
    String name;
    public Animal(String noise, int age, String name){
        this.noise = noise;
        this.age = age;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void speak(){
        System.out.println("My name is " + name);
        System.out.println("I am " + age + " years old");
        System.out.println("I say " + noise);
    }
}
class Bird extends Animal {
    public double height;
    public String color;
    public Bird(String noise, int age, String name, double height, String color){
        super(noise, age, name);
        this.height = height;
        this.color = color;
    }
public void printBird(){
        System.out.printf("Hello! I am "+ this.getName()+ "and I am a" +this.color+" Bird!"+this.noise);
}
public void speak(){
    super.speak();
    System.out.println("I am " + color);
    System.out.println("I am " + height + " inches tall");
}
}
public class Mammal{
    public static void main(String[] args){
    Bird b=new Bird("ka ka ", 2,"Crow", 2.43,"black");
    b.printBird();
    b.speak();
    }
}

