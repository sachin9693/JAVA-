public class DEfConstructor {

    int id  = 100 ;
    String name  = "Sachin";
    DEfConstructor(){
        System.out.println(id+" " + "Default Constructor..!"+" "+ name);
    }

    public static void main(String[] args) {
        DEfConstructor obj = new DEfConstructor();
    }

}
