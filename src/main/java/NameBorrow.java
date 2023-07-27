public class NameBorrow {

    private String firstName;
    private String lastName;

    public NameBorrow() {
    }

    public String fullName(){
        return firstName.toUpperCase() + " " + lastName.toUpperCase();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}
