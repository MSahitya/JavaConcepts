package org.example.NewFeatures;


public class SwitchPatternMatching {

    record Point(int x, int y) {}
    record Rectangle(Point topLeft, Point bottomRight) {}
    record Circle(Point center, int radius) {}
    sealed interface Shape permits Rectangle, Circle {}

    static String formatObject(Object obj) {
        return switch (obj) {
            case null -> "null";
            case String s -> "String: " + s;
            case Integer i -> "Integer: " + i;
            case Double d -> String.format("Double: %.2f", d);
            case Point(int x, int y) when x>12 && y<25 -> String.format("Point(x=%d, y=%d)", x, y);
            default -> "Unknown object";
        };
    }
    public static void main(String[] args) {
        System.out.println(formatObject("Hello"));
        System.out.println(formatObject(123));
        System.out.println(formatObject(new Point(13, 20)));
         System.out.println(calculateArea(new Rectangle(new Point(0, 0), new Point(5, 5))));
        System.out.println(describeShape(new Circle(new Point(0, 0), 5)));
         processData("Very long string");
          processData(500);
          processData(new Point(1, 2));
    }
    static double calculateArea(Shape shape) {
        return switch (shape) {
            case Rectangle(Point topLeft, Point bottomRight) -> {
                int width = Math.abs(bottomRight.x() - topLeft.x());
                int height = Math.abs(bottomRight.y() - topLeft.y());
                yield width * height;
            }
            case Circle(Point center, int radius) -> Math.PI * radius * radius;
        };
    }


    static String describeShape(Shape shape) {
        return switch (shape) {
            case Rectangle(Point topLeft, Point bottomRight) when topLeft.x() < bottomRight.x() && topLeft.y() < bottomRight.y() -> "Valid Rectangle";
            case Rectangle(Point topLeft, Point bottomRight) -> "Rectangle (invalid dimensions)";
            case Circle(Point center, int radius) when radius > 0 -> "Valid Circle";
            case Circle(Point center, int radius) -> "Invalid Circle";
        };
    }


    static void processData(Object data) {
        switch (data) {
            case String s when s.length() > 5 -> System.out.println("Long String: " + s);
            case String s -> System.out.println("Short String: " + s);
            case Integer i when i > 100 -> System.out.println("Large Integer: " + i);
            case Integer i -> System.out.println("Small Integer: " + i);
            case Point(var x, var y) -> System.out.println("Point at (" + x + ", " + y + ")");
            default -> System.out.println("Unknown data type");
        }
    }


}