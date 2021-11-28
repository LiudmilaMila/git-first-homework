package HomeWork21;

public class Contact {
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
