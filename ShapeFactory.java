class ShapeFactory {
    // Constants for limits
    private static final int MAX_SHAPE_COUNT = 5;
    private static final int MAX_EACH_SHAPE = 2;

    // Counters for shape instances
    private static int totalShapesCreated = 0;
    private static int circleCount = 0;
    private static int squareCount = 0;
    private static int rectangleCount = 0;

    public Shape getShape(String shapeType) {
        if (totalShapesCreated >= MAX_SHAPE_COUNT) {
            System.out.println("Shape creation limit reached! No more shapes can be created.");
            return null;
        }

        if (shapeType == null || shapeType.isEmpty()) {
            return null;
        }

        shapeType = shapeType.toUpperCase(); // Normalize case

        switch (shapeType) {
            case "CIRCLE":
                if (circleCount < MAX_EACH_SHAPE) {
                    circleCount++;
                    totalShapesCreated++;
                    return new Circle();
                } else {
                    System.out.println("Max limit reached for Circle.");
                }
                break;
            case "SQUARE":
                if (squareCount < MAX_EACH_SHAPE) {
                    squareCount++;
                    totalShapesCreated++;
                    return new Square();
                } else {
                    System.out.println("Max limit reached for Square.");
                }
                break;
            case "RECTANGLE":
                if (rectangleCount < MAX_EACH_SHAPE) {
                    rectangleCount++;
                    totalShapesCreated++;
                    return new Rectangle();
                } else {
                    System.out.println("Max limit reached for Rectangle.");
                }
                break;
            default:
                System.out.println("Invalid shape type.");
        }
        return null;
    }
}