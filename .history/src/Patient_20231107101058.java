import java.util.Date;
import java.util.Random;
import java.util.Scanner;

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
    Scanner sc = new Scanner(System.in);

    public String newPatient(){
        System.out.println("Name:\t");
        name = sc.nextLine();
        System.out.println("Date of Birth:\t mm dd yyyy");
        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();

        return "Patient " + name + " has been created.";
    }
}
