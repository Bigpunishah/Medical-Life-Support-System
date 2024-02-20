import java.util.Date;
import java.util.Random;

public class Patient {
    int patientId;
    String name;
    Date DOB;
    String address;
    String phoneNumber;
    String email;
    enum maritalStatus {Single, Married, Widowed, Divorced};
    //For the patient Id
    Random random = new Random();

    public String newPatient(){
        

        return "Patient " + name + " has been created.";
    }
}
