package Assignment;
    abstract class Shapes{
        double side1;
        double side2;
        double side3;
        double side4;
        String shape;
    }
    class Shape extends Shapes {


        Shape(double side1){
            this.side1=side1;
            shape = "Circle";
        }
        Shape(double side1, double side2){
            this.side1=side1;
            this.side2=side2;
            shape = "Rectangle";
        }
        Shape(double side1, double side2, double side3){
            this.side1=side1;
            this.side2=side2;
            this.side3=side3;
            shape = "Triangle";
        }
        Shape(double side1, double side2, double side3, double side4){
            this.side1=side1;
            this.side2=side2;
            this.side3=side3;
            this.side4=side4;
            shape = "Rhombus";
        }
    }
    public class Shaping {
        public static void main(String[] args) {
            Shape sh = new Shape(4, 4, 4);
            System.out.println(sh.shape);
        }
    }

