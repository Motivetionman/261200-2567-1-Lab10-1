public class Lab10 {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Attempt to create 6 shapes (1 more than the total allowed limit)
        Shape shape1 = shapeFactory.getShape("circle");
        if (shape1 != null) shape1.draw();

        Shape shape2 = shapeFactory.getShape("circle");
        if (shape2 != null) shape2.draw();

        Shape shape3 = shapeFactory.getShape("Square");
        if (shape3 != null) shape3.draw();

        Shape shape4 = shapeFactory.getShape("Square");
        if (shape4 != null) shape4.draw();

        Shape shape5 = shapeFactory.getShape("Rectangle");
        if (shape5 != null) shape5.draw();

        // This shape should NOT be created due to the total limit of 5
        Shape shape6 = shapeFactory.getShape("Rectangle");
        if (shape6 != null) shape6.draw();
    }
}