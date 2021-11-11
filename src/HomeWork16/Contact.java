package HomeWork16;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Contact {

    private String name;
    private String phoneNumber;
    private LocalDate birthDay;


    public Contact(String name,String phoneNumber, LocalDate birthDay){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public boolean equals(Object other){
        if(other == this){
            return true;
        }
        if (!(other instanceof Contact)) {
            return false;
        }
        Contact theOther = (Contact) other;
        return Objects.equals(theOther.name,this.name) &&
                Objects.equals(theOther.phoneNumber,this.phoneNumber) &&
                Objects.equals(theOther.birthDay,this.birthDay);
    }

    public int hashCode(){
        return Objects.hash(name,phoneNumber,birthDay);
    }
}
