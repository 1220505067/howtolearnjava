package entities;

public class Instructor {
    private String firstName;
    private String lastName;

    public Instructor(String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);



}

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
}
