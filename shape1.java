import java.util.*;
interface shape{
double pi = 3.14;
public double getArea();
public double getPerimeter();
}
class rectangle implements shape{
double l;
double b;
public rectangle(){
Scanner sc = new Scanner(System.in);
System.out.println("enter length");
l = sc.nextDouble();
System.out.println("enter bredth");
b = sc.nextDouble();
}
public double getArea(){
return l*b;
}
public double getPerimeter(){
return 2*(l+b);
}
}

class triangle implements shape{
double a;
double b;
double c;
public triangle(){
Scanner sc = new Scanner(System.in);
System.out.println("enter side");
a = sc.nextDouble();
b = sc.nextDouble();
c = sc.nextDouble();

}
public double getArea(){
return (b*c)/2;
}
public double getPerimeter(){
return a+b+c;
}
}

class circle implements shape{
double r;

public circle(){
Scanner sc = new Scanner(System.in);
System.out.println("enter radius");
r = sc.nextDouble();


}
public double getArea(){
return pi*r*r;
}
public double getPerimeter(){
return 2*pi*r;
}
}

class shape1{
public static void main(String[] args){
rectangle r = new rectangle();
System.out.println("the area is :" +r.getArea());
System.out.println("the area is :" +r.getPerimeter());

circle c = new circle();
System.out.println("the area is :" +c.getArea());
System.out.println("the area is :" +c.getPerimeter());

triangle t = new triangle();
System.out.println("the area is :" +t.getArea());
System.out.println("the area is :" +t.getPerimeter());

}
}


