
class Shape {
     
}
class TwoDimensionalShape extends Shape {
}

class Circle extends TwoDimensionalShape {
    double r;
    Circle(double r) {
        this.r=r;
    }
    void area() {
        double area =3.1416*r*r;
        System.out.println("area of Circle: "+area);
    }
}
class Square extends TwoDimensionalShape {
    double l,w;
    Square(double l, double w) {
        this.l=l;
        this.w=w;
    }
    void area() {
        double area = l*w;
        System.out.println("area of Square: "+area);
    }
}
class Triangle extends TwoDimensionalShape {
    double b, h;
    Triangle(double b, double h) {
        this.b =b;
        this.h=h;
    }

    void area() {
        double area = 0.5*b*h;
        System.out.println("area of Triangle: " + area);
    }
}

class ThreeDimensionalShape extends Shape {
}
class Sphere extends ThreeDimensionalShape {
    double r;
    Sphere(double r){
        this.r=r;
    }

    void area(){
        double area = 4*3.1416*r*r;
        System.out.println("area of Sphere: " + area);
    }
}
class Cube extends ThreeDimensionalShape {
    double s;
    Cube(double s){
        this.s=s;
    }

    void area() {
        double area=6*s*s;
        System.out.println("area of Cube: "+area);
    }
}
class Tetrahedron extends ThreeDimensionalShape {
    double s;

    Tetrahedron(double s) {
        this.s=s;
    }
    void area() {
        double area = Math.sqrt(3)*s*s;
        System.out.println("area of Tetrahedron: "+area);
    }
}
public class ShapeAll {
    public static void main(String[] args) {
        Circle c= new Circle(5);
        c.area();
        Square s = new Square(4,6);
        s.area();
        Triangle t= new Triangle(3, 7);
        t.area();
    }
}
