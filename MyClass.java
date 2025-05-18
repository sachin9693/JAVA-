abstract class AbsDemo {

    abstract  void display ();

}
public class myClass extends AbsDemo{


    void display() {

        System.out.println("Abstract Methot in java .......!");

    }
}

public void main(String[] args) {

     AbsDemo obj = new myClass();

     obj.display();
}