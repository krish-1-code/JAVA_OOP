package JAVA_OOP;

//Overloaded Constructors basically mean that you have multiple constructors with the same name but
//different number of arguments; 

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

    public class J2_OverloadedConstructor {

        public static void main(String[] args) {
            Rectangle r1 = new Rectangle();           // uses Constructor 1
            Rectangle r2 = new Rectangle(5.0);         // uses Constructor 2
            Rectangle r3 = new Rectangle(4.0, 6.0);    // uses Constructor 3

            System.out.println("r1 area: " + r1.getArea());
            System.out.println("r2 area: " + r2.getArea());
            System.out.println("r3 area: " + r3.getArea());
    }   
}
    

