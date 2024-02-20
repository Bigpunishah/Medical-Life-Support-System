import java.util.Scanner;

public class Menu {
    
    public void MenuDashboard(){
        System.out.println("Hello, welcome to the life support system!");
        System.out.println("Here you are to select what services you would like!\n\n\n\n");

        Scanner sc = new Scanner(System.in);

        System.out.println("\tMENU:\n \t1.) New Patient\n \t2.) New Employee\n \t3.) Life-Support System\n \t4.) Medicine\n \t5.) Quit");
        int i = sc.nextInt();

        switch (i) {
            case 1:
                newPatientSelection();
                break;
        
            case 2:
                newEmployeeSelection();

                break;
            
            case 3:
            
                break;

            case 4:

                break;

            case 5:
                System.out.println("\tGoodbye!");
                sc.close();
                return;
        }




        sc.close();
    }

    public void newPatientSelection(){
        System.out.println("\tNew patient: ");
        Patient patient = new Patient();
        System.out.println(patient.newPatient());

        System.out.println("________________________________________________________________");

    }


    public void newEmployeeSelection(){
        System.out.println("\t New Employee: ");
        MedicalEmployee medicalEmployee = new MedicalEmployee();
        System.out.println(medicalEmployee.newMedicalEmployee());
    }

    public void lifeSupportSelection(){
        //..
    }

    public void medicineSelection(){
        //..
    }
}
