import java.util.Random;
import java.util.Scanner;

public class Patient {
    int patientId;
    String name;
    int age;
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
        System.out.println("Age:\t");
        age = sc.nextInt();
        System.out.println("Street:\t");
        address = sc.nextLine();
        

        return "Patient " + name + " has been created.";
    }
}
