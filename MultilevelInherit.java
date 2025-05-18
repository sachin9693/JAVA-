class  Animal{
    void eat(){
        System.out.println("Eating.......");
    }

}
class  Cow extends Animal{
    void runing(){
        System.out.println("Runing....");
    }
}

class BabyCow extends Cow{
    void eating(){
        System.out.println("Eat........");
    }
}

public class MultilevelInherit {
    public static void main(String[] args) {
        BabyCow obj = new BabyCow();

        obj.eating();
        obj.eat();
        obj.runing();
    }

}
