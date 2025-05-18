
class Shape{
    void drowing(){
        System.out.println("Drowing.....");
    }
}
class recta extends Shape{

    @Override
    void drowing() {
        System.out.println("Rect......");
    }
}
class Circle extends Shape{
    @Override
    void drowing() {
        System.out.println("Circle...");
    }
}

public class JavaRuntimePolymorphismExampleShape {

    public static void main(String[] args) {
        Shape s;
        s = new recta();
        s.drowing();
        s = new Circle();
        s.drowing();
        System.out.println(s instanceof Circle);
        s = new Shape();
        s.drowing();


    }
}
