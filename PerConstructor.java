public class PerConstructor {

    int id ;
    String name;

    PerConstructor(int id , String name){
      this.id= id;
      this.name = name;


    }
    void Display (){
        System.out.println("id is === "+ id);
        System.out.println("Name is === "+ name);
    }


    public static void main(String[] args) {
        PerConstructor obj = new PerConstructor(10,"Sachin");

        obj.Display();
    }
}
