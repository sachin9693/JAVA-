
class S {
    S get() {
        return this;
    }
}
class SS extends S{

    SS get(){
        return this;
    }
    void print (){
        System.out.println("Covriant return type. ");
    }
}
public class Covriant {
    public static void main(String[] args) {


        new SS().get().print();
    }
}