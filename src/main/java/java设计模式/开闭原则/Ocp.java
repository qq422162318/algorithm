package java设计模式.开闭原则;

public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
    }
}
class GraphicEditor{
    public void drawShape(Shape s){
        s.draw();
    }
}
abstract class Shape{
    int m_type;
    public abstract void draw();
}
class Rectangle extends Shape{
    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}
class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}
class Triangle extends Shape{
    @Override
    public void draw() {
        System.out.println("Triangle");
    }
}
