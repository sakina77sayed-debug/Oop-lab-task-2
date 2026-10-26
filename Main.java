/* ==========================================================
   OOP Lab Task - 2
   Name: Bibi Sakina 
   Roll no : 2260051
   GitHub ID: sakina77sayed-debug
   
    Description:
   1. Class Shape is created with a draw() method that prints "Drawing a shape".
   2. Class Circle extends Shape and overrides the draw() method to print "Drawing a circle".
   3. In the main method, polymorphism is used to create 'Shape shape = new Circle();' and call draw().
   ========================================================== */

class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
    }
}
