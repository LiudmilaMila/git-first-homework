package HomeWork16;

import java.time.LocalDateTime;
import java.util.Objects;

public class Message {

    private String nameSubscriber;
    private String phoneNumber;
    private String text;
    private LocalDateTime messageTime;

    public Message(String nameSubscriber, String phoneNumber, String text, LocalDateTime messageTime) {
        this.nameSubscriber = nameSubscriber;
        this.phoneNumber = phoneNumber;
        this.text = text;
        this.messageTime = messageTime;
    }

    public String getNameSubscriber() {
        return nameSubscriber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getText() {
        return text;
    }

    public LocalDateTime getMessageTime() {
        return messageTime;
    }
    public boolean equals(Object other){
        if(other == this){
            return true;
        }
        if (!(other instanceof Message)) {
            return false;
        }
       Message theOther = (Message) other;
        return Objects.equals(theOther.nameSubscriber,this.nameSubscriber) &&
                Objects.equals(theOther.phoneNumber,this.phoneNumber) &&
                Objects.equals(theOther.text,this.text) &&
                Objects.equals(theOther.messageTime,this.messageTime);
    }

    public int hashCode(){
        return Objects.hash(nameSubscriber,phoneNumber,text,messageTime);
    }
}
