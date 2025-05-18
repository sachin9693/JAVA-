public class InstanceInitializerBlockin {

    String bikename;

    InstanceInitializerBlockin(){
        System.out.println("Splandor Plus ....."+ bikename);
    }
    {bikename = "Yamha";}

    public static void main(String[] args) {
        InstanceInitializerBlockin Inw = new InstanceInitializerBlockin();

    }

}
