class Parent
{
int a=10;
void show()
{
System.out.println("Parent class");
}
}
class Child extends Parent
{
int b=20;
void show()
{
System.out.println("Derived class");
System.out.println(super.a);
super.show();
}
}
public class Inherit
{
public static void main(String[] args)
{
Child c=new Child();
System.out.println(c.b);
c.show();
System.out.println(c.a);
}
}