package JAVA_OOP;

 class Rectangle {
        private double width;
        private double height;

    // Constructor 1: no arguments
        public Rectangle() {
            this.width = 1.0;
            this.height = 1.0;
        }

    // Constructor 2: one argument
        public Rectangle(double side) {
            this.width = side;
            this.height = side;
        }

    // Constructor 3: two arguments
        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double getArea() {
            return width * height;
        }
    }


public class J3_ArrayOfObjects{
    public static void main(String[] args) {
        
        Rectangle[] rectangles = new Rectangle[3]; //Declaring a array of object of size 3

        rectangles[0] = new Rectangle();         
        rectangles[1] = new Rectangle(5.0);       
        rectangles[2] = new Rectangle(4.0, 6.0);  

        // Step 3: Loop through the array and use the objects
        for (int i = 0; i < rectangles.length; i++) {
            System.out.println("Rectangle " + i + " area: " + rectangles[i].getArea());
        }

       
        System.out.println("\n--- Using for-each ---");
        for (Rectangle r : rectangles) {
            System.out.println("Area: " + r.getArea());
        }
    }
}