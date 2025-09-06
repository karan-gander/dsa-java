

public class Access {


    public static void main(String args[]){

        Bank myAccount = new Bank();

        // System.out.print();

    }
    
}



class Bank{
    
    public String username = "Karan";
    private String password = "pass@123";

    void setPassword(String password){
        this.password= password;
    }


}
