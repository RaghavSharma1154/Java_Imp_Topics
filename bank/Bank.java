package bank;

class Account{
    //public 
    public String name;
    //default -->package in private ( only this package can access)
    // String name;
    //protected --> this package and the sub classes of other package can access
    protected String email;
    //private -->only his origin class ca access
    private String password;
    //To set and get private properties getters and setters are used-->
    public String getPass(){
        return this.password;
    }
    public void setPass(String pass){
        this.password = pass;
    }
}
public class Bank {
    public static void main(String args[]){
        Account acc = new Account();
        acc.name = "Jack";
        acc.email = "jack@123";
        // acc.password = "123";//error
        acc.setPass("1234");
        System.out.println(acc.getPass());
    }
}
