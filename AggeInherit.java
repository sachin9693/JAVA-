

class ADdress{
    int ZipCode ;
    String city,country,state;

    public ADdress(int ZipCode,String country,String state ,String city) {

        this.ZipCode = ZipCode;
        this.city = city;
        this.state = state;
        this.city = country;

    }
}
    class Empl{
        int id ;
        String name;
        int mob;
        ADdress addr;

        public Empl(int id,String name,int mob ,ADdress  addr){

            this.id = id;
            this.name = name;
            this.mob = mob;
            this.addr = addr;

        }

        void  display (){
            System.out.println("Id is : "+id+" "+"name is : "+name+"Mob.No : "+mob);
            System.out.println(addr.city +" "+addr.state+" "+addr.country+" "+addr.ZipCode);
        }
    }







public class AggeInherit {

    public static void main(String[] args) {


        ADdress adres1 = new ADdress(841503, "India", "Bihar", "patna");
        ADdress ade2 = new ADdress(302033, "India", "Rajsthan", "Jaipur");
        Empl em = new Empl(101, "Sachin Singh", 1234567891, adres1);
        Empl em1 = new Empl(102, "Lucky Singh", 1234567891, ade2);


        em.display();
        em1.display();

    }
}
