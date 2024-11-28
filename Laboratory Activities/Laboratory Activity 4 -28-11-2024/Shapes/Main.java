package Shapes;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(5, 6, 7.5);

        // Collection of shapes
        Shape[] shapes = { square, rectangle, triangle };
        ShapeCollection shapeCollection = new ShapeCollection(shapes);

        //for computing and printing the perimeter and area
        shapeCollection.getPropertyValues();
    }
}