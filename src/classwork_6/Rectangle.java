package classwork_6;

import homework_6.Main;

public class Rectangle {
    double width = 0;
    double height = 0;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void getArea() {
        System.out.println("Area: " + (width * height));
    }

    public void getPerimeter() {
        System.out.println("Perimeter: " + 2 * (width + height));
    }

    public void printInfo() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + (width * height));
        System.out.println("Perimeter: " + 2 * (width + height));
    }
        
        public static void main(String[] args) {
            Rectangle rex = new Rectangle(6, 5);
            rex.printInfo();
        }
    }
