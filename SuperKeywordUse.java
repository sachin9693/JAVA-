
class Car{
    String color = " black ";
    void carname (){
        System.out.println("TATA");
    }
}
class CarCompany extends Car{
    String color = " white ";
    void carname_2 (){
        System.out.println("MAHINDRA");
        System.out.println(super.color);
        System.out.println(color);
    }
    void usecar(){
        super.carname();
        carname_2();
    }

}
public class SuperKeywordUse {

    public static void main(String[] args) {

        CarCompany obj = new CarCompany();

        obj.carname_2();
        obj.usecar();
    }


}
