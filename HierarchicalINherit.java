class Animal2{
    void eat(){
        System.out.println("Eating.............");
    }
}
class cat extends Animal{
    void run(){
        System.out.println("Runing...........");
    }
}
class dog extends Animal{
    void bark(){
        System.out.println("Barking...........");
    }
}



public class HierarchicalINherit {

    public static void main(String[] args) {
        dog obj = new dog();

        obj.bark();
        obj.eat();
    }

}
