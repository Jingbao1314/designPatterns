package decorator.demo;

public class Test {
    public static void main(String[] args) {
        Shape shape=new Circle();
        ShapeDecorator decorator=new RedShapeDecorator(shape);
        decorator.draw();
    }
}
