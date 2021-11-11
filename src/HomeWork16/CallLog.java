package HomeWork16;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.time.LocalDateTime;
import java.util.Objects;

public class CallLog {

    private String nameSubscriber;
    private String phoneNumber;
    private LocalDateTime callTime;
    private int callDuration;
    private CallStatus callStatus;

    public CallLog(String nameSubscriber,String phoneNumber, LocalDateTime callTime,int callDuration, CallStatus callStatus){
        this.nameSubscriber = nameSubscriber;
        this.phoneNumber = phoneNumber;
        this.callTime = callTime;
        this.callDuration = callDuration;
        this.callStatus = callStatus;
    }

    public String getNameSubscriber() {
        return nameSubscriber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public LocalDateTime getCallTime() {
        return callTime;
    }

    public int getCallDuration() {
        return callDuration;
    }

    public CallStatus getCallStatus() {
        return callStatus;
    }

    public boolean equals(Object other){
        if(other == this){
            return true;
        }
        if (!(other instanceof CallLog)) {
            return false;
        }
        CallLog theOther = (CallLog) other;
        return Objects.equals(theOther.nameSubscriber,this.nameSubscriber) &&
                Objects.equals(theOther.phoneNumber,this.phoneNumber) &&
                Objects.equals(theOther.callTime,this.callTime)&&
                Objects.equals(theOther.callDuration,this.callDuration)&&
                Objects.equals(theOther.callStatus,this.callStatus);
    }

    public int hashCode(){
        return Objects.hash(nameSubscriber,phoneNumber,callTime,callDuration,callStatus);
    }
}
