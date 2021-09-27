package interfaces;

public class Customer {
    private int id;
    private String FirstName;
    private String LastName;

    public Customer(){}

    public Customer(int id, String Firstname,String LastName){
        super();
        this.id = id;
        this.LastName=LastName;
        this.FirstName=Firstname;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
