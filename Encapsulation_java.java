
class Accoun{
    private  long acco_no;
    private String name , email_id ;
    private double amount;

    public long getAcco_no() {
        return acco_no;
    }

    public void setAcco_no(long acco_no) {
        this.acco_no = acco_no;
    }

    public String getEmail_id() {
        return email_id;
    }
//    public String setEmail_id(String email_id){
//
//         this.email_id = email_id;
//    }


    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}

public class Encapsulation_java {

    public static void main(String[] args) {
        Accoun ac = new Accoun();

        ac.setAcco_no(123456789);
        ac.setName("Sachin Singh");
        ac.setEmail_id("sachin9693@gmail.com");
        ac.setAmount(100000);

    }
}
