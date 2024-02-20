import java.util.Random;
import java.util.Scanner;

public class MedicalEmployee{
    int employeeId;
    String name;
    int age;
    String address;
    String phoneNumber;
    String email;
    enum maritalStatusTypes {Single, Married, Widowed, Divorced};
    String maritalStatus;
    enum profession {Doctor, Nurse, Receptionist};
    String professionTitle;

    Random random = new Random();
    Scanner sc = new Scanner(System.in);


    public String newMedicalEmployee(){
        employeeId = random.nextInt(1000);
        System.out.println("New patientId = " + employeeId);
        System.out.println("Name:\t");
        name = sc.nextLine();
        System.out.println("Age:\t");
        age = sc.nextInt();
        System.out.println("Street Address:\t");
        address = sc.nextLine();
        System.out.println("Phone Number:\t");
        phoneNumber = sc.nextLine();
        System.out.println("Email:\t");
        email = sc.nextLine();
        System.out.println("Marital Status:\t 1:Single, 2:Married, 3:Widowed, Divorced");
        int input = sc.nextInt();
        switch(input){
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
        professionSelect();
        return "New " + professionTitle + " - " + name + " has been created with id " + employeeId;
    }


    public void professionSelect(){
        System.out.println("Choose profession: \n1.) Doctor \n2.) Nurse \n3.)Receptionist");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                professionTitle = profession.Doctor.toString();
                break;
        
            case 2:
                professionTitle = profession.Nurse.toString();
                break;
            
            case 3:
                professionTitle = profession.Receptionist.toString();
        }
    }


    public String getEmployee(int empId){
        

        return "Searching for employee with id: " + empId + " please wait...";
    }

    public String updateEmplyoee(int empId){
        
        return "Updating employee with id: " + empId;
    }

}