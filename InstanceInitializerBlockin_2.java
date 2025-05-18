
class A2 {
    A2(){
        System.out.println("Address.......");
    }

    {
        System.out.println("Techinnovation Gopalpura jaipur ");
    }
}
class A3 extends A2{

    A3(){
        super();
        System.out.println("Address-2.....");
    }
    {
        System.out.println("Techinnovation");
    }
    A3(int c){
        System.out.println("Valur : "+ c);
    }
}





public class InstanceInitializerBlockin_2 {

    public static void main(String[] args) {
        A3 a = new A3();
//        A3 a1 = new A3(20);


    }
}
