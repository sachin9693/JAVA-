 interface weopan{
   void use();
}
interface character{
    void attack();
}

class warrior implements weopan,character{


    public void attack() {
        System.out.println("Attackk.......");
    }


    public void use() {
        System.out.println("Weopne use......");
    }
}
class war implements character,weopan{
    public void attack() {
        System.out.println("Attackk.......!!!!!!!!");
    }


    public void use() {
        System.out.println("Weopne use......!!!!!!!!!!!");
    }
}



public class Multipaleinheritance {
    public static void main(String[] args) {


        warrior obj = new warrior();
        war obj1 = new war();

        obj.attack();
        obj.use();
        obj1.attack();
        obj1.use();

    }
}
