import java.util.Random;
import java.util.Scanner;

public class Patient {
    int patientId;
    String name;
    int age;
    String address;
    String phoneNumber;
    String email;

    enum maritalStatusTypes {
        Single, Married, Widowed, Divorced
    };

    String maritalStatus;
    // For the patient Id
    Random random = new Random();
    Scanner sc = new Scanner(System.in);

    public String newPatient() {
        // Giving patient random Id number
        // If connected to DB could check to make sure the patient Id is unique.
        patientId = random.nextInt(100000);
        System.out.println("New patientId = " + patientId);
        System.out.print("Name:\t");
        name = sc.nextLine();
        System.out.print("Age:\t");
        age = sc.nextInt();
        // Bug 1: Street address & Phone number prints on same line. Casued by ... =
        // sc.nextInt()
        System.out.print("Street Address:\t");
        address = sc.nextLine();
        System.out.print("Phone Number:\t");
        phoneNumber = sc.nextLine();
        System.out.print("Email:\t");
        email = sc.nextLine();
        System.out.print("Marital Status:\t 1:Single, \n2:Married, \n3:Widowed, \n4:Divorced");
        int input = sc.nextInt();
        switch (input) {
            case 1:
                maritalStatus = maritalStatusTypes.Single.toString();
                break;

            case 2:
                maritalStatus = maritalStatusTypes.Married.toString();
                break;

            case 3:
                maritalStatus = maritalStatusTypes.Widowed.toString();
                break;

            case 4:
                maritalStatus = maritalStatusTypes.Divorced.toString();
                break;

        }

        return "Patient " + name + " has been created.";
    }

    public String updatePatient() {
        // Make the updates necessary.

        return "Patient " + name + " has been updated";
    }

    public String getPatient(String name) {
        // Return the actual patient tied name
        this.name = name;
        return "Patient " + name + " has been located.";
    }
}
