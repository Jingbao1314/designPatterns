package decorator.demo;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    public void draw(){
        shape.draw();
        decorator();
    }

    public void decorator(){
        System.out.println("RedShapeDecorator OK");
    }
}
