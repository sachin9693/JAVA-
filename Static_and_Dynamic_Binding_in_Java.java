class Animal_{
     static void sound(){
        System.out.println("Animal Sound....");
    }
}
class Dog2 extends  Animal_{

      static void sound() {
        System.out.println("Dog Sound....");
    }
}

public class Static_and_Dynamic_Binding_in_Java {

    public static void main(String[] args) {
        Animal_ a = new Dog2();
        a.sound();
    }
}
