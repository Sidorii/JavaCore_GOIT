package module3.homework.task3;

import java.awt.peer.ScrollbarPeer;

public class SpecialStudent extends CollegeStudent {

    private long secretKey;
    private String email;


    public SpecialStudent(String firstName, String lastName){super(firstName,lastName);}

    public SpecialStudent(String firstName){super(firstName);}

    public SpecialStudent(String firstName,long secretKey){
        super(firstName);
        this.secretKey = secretKey;
    }

    public long getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
