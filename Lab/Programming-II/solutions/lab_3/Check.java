import java.lang.Math.*;
class Circle
{
int radius;
double area(int r) {
return Math.PI*r*r;
}
}
class Cylinder extends Circle {
Cylinder() {
}
int height;
double volume(int r, int h)
{
return (Math.PI*r*r*h);
}
}
class Check {
public static void main(String[] args)
{
Cylinder c=new Cylinder();
Circle cr= new Circle();
System.out.println("circle area is:" +cr.area(5));
System.out.println("cylinder volume is:" + c.volume(2,3));
}
}