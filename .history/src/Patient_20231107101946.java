import java.util.Random;
import java.util.Scanner;

public class Patient {
    int patientId;
    String name;
    int age;
    String address;
    String phoneNumber;
    String email;
    enum maritalStatusTypes {Single, Married, Widowed, Divorced};
    enum maritalStatus{}
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
        System.out.println("Phone Number:\t");
        phoneNumber = sc.nextLine();
        System.out.println("Email:\t");
        email = sc.nextLine();
        System.out.println("Marital Status:\t 1:Single, 2:Married, 3:Widowed, Divorced");
        int input = sc.nextInt();
        switch(input){
            case 1: maritalStatus = maritalStatus.Single; 
        }
        
        

        return "Patient " + name + " has been created.";
    }
}
