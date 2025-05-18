public class OverloadConstructor {

    int id ;
    String name ;
    int  age;

    OverloadConstructor(int i , String n){
        id = i;
        name = n;
    }
    OverloadConstructor(int Id , String na, int  agee){
        id = Id;
        name = na;
        age = agee;
    }

    void display (){
        System.out.println("id is : "+ id+ " \n"+ "name is : "+name+" \n"+ "age is : "+ age);
    }

    public static void main(String[] args) {
        OverloadConstructor obj = new OverloadConstructor(01,"Sachin",21);
        OverloadConstructor obj1 = new OverloadConstructor(10,"Sachin");


        obj.display();
        obj1.display();
    }


}
