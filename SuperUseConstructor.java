//
//class Address {
//    Address(){
//        System.out.println("Gopalpura Jaipur Rajsthan ");
//    }
//}
//class Address_2 extends Address{
//    Address_2(){
//        super();
//        System.out.println("Pratap Nagar Jaipur Rajsthan ");
//    }
//}
//class Address_3 extends Address{
//    Address_3(){
//        super();
//
//        System.out.println("Pratap Nagar Jaipur  ");
//    }
//}
//
//public class SuperUseConstructor {
//    public static void main(String[] args) {
//        Address_3 ad = new Address_3();
//
//    }
//
//}
class Bike8{
    int speed;

    Bike8(){System.out.println("constructor is invoked");}

    {System.out.println("instance initializer block invoked");}

    public static void main(String args[]){
        Bike8 b1=new Bike8();
        Bike8 b2=new Bike8();
    }
}