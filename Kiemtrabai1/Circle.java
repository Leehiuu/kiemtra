package Kiemtrabai1;

public class Circle {
    private double radius=1.0;

    public Circle() {
    }

    public Circle(double radius) {
        if(radius <= 0) {
            throw new RuntimeException("Error");
        }else {
            this.radius = radius;
        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {

        this.radius = radius;
    }
    public double getArena()
    {
        return this.radius*this.radius*Math.PI;
    }
    public  double Circumfernce()
    {
        return 2*Math.PI*this.radius;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius + '}';
    }
}