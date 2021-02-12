package term1.lesson5;

public class Name {
    private String firstName;
    private String middleName;
    private String lastName;

    public Name(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public String getInit() {
        return "" + firstName.charAt(0) + middleName.charAt(0) + lastName.charAt(0);
    }

    public String getUserName() {
        return firstName.substring(0, 3).toUpperCase() + middleName.length()
                + lastName.substring(lastName.length() - 2).toLowerCase();
    }
}
