class over{
    static int add(int a,int b){
        return  a - b;
    }


    static  int add(int a , int b , int c){
        return a + b + c ;
    }
}






public class Overloading {

    public static void main(String[] args) {
        System.out.println(over.add(10,20));
        System.out.println(over.add(10,20,30));
    }
}
