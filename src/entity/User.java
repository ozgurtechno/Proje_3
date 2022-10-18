package entity;

public class User extends BaseEntity{

    // TODO Bu class a dokunmayiniz

    //----------------------Fields ---------------------------------------------------------------------
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private Address address;

    // TODO Bu class a dokunmayiniz
    //----------------------Constructor ---------------------------------------------------------------------

    public User(int id,String firstName, String lastName, String userName, String password, Address address) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.address = address;
    }
    // TODO Bu class a dokunmayiniz

    //----------------------Getter and Setter ---------------------------------------------------------------------



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
