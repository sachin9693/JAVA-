
class bank {
    float getRateOfIntrest(){
        return 0;
    }
}
class SBI extends  bank  {
    @Override
    float getRateOfIntrest() {
        return 8.4f;
    }
}
class HDFC extends  bank  {
    @Override
    float getRateOfIntrest() {
        return 9.4f;
    }
}
class ICICI extends  bank  {
    @Override
    float getRateOfIntrest() {
        return 9.4f;
    }
}





public class JavaRuntimePolymorphism {

    public static void main(String[] args) {
        bank b;
        b = new SBI();
        System.out.println("SBI Rate of Interest: "+b.getRateOfIntrest());
        b = new HDFC();
        System.out.println("HDFC Rate of Interest: "+b.getRateOfIntrest());
        b = new ICICI();
        System.out.println("ICICI Rate of Interest: "+b.getRateOfIntrest());
    }
}
