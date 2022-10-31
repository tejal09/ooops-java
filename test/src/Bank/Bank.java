package Bank;

//Package
// Access modifiers> which thing is accessible to whom 

class Account {
    public String name;
    // public access modifier> Access by any class and other package as well

    protected String email;
    // protected> within the package and outside the package by child class

    private String password;
    // Private> Access within the class only,
    // getter & setters

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }
}

// default> within the package, without any access name
// for eg: String name

public class Bank {
    public static void main(String[] args) {
        Account account = new Account();
        account.name = "Jhon doe";
        account.email = "Jhon@gmail.com";
        account.setPassword("abc");
        System.out.println(account.getPassword());
    }
}
