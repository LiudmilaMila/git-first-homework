package HomeWork21;

import java.io.Serializable;

public class Contact implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private String surname;
    private String phoneNumber;
    private int yearOfBirth;

    public Contact(String name, String surname, String phoneNumber, int yearOfBirth) {

        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }


}
