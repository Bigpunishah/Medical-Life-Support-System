import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);

    public void MenuDashboard() {
        System.out.println("Hello, welcome to the life support system!");
        System.out.println("Here you are to select what services you would like!\n\n\n\n");

        System.out.println(
                "\tMENU:\n \t1.) New Patient\n \t2.) New Employee\n \t3.) Medical Device\n \t4.) Medicine\n \t5.) Consultation\n \t6.)Quit");
        int i = sc.nextInt();

        switch (i) {
            case 1:
                patientSelection();
                break;

            case 2:
                employeeSelection();

                break;

            case 3:
                medicalDeviceSelection();
                break;

            case 4:
                medicineSelection();
                break;

            case 5:
                //Consultation
                break;

            case 6:
                System.out.println("\tGoodbye!");
                return;

            default:
                System.out.println("You did not choose a correct option: Please try again later.");
                break;
        }

    }

    public void patientSelection() {
        System.out.println("\tPatient Selection: \n1.) New Patient \n2.) Find Patient");

        int i = sc.nextInt();
        Patient patient = new Patient();    
        switch (i) {
            case 1:
                System.out.println("\tNew patient: ");
                System.out.println(patient.newPatient());
                System.out.println("________________________________________________________________");
                break;
        
            case 2:
                System.out.println("Enter Patient Name: ");
                System.out.println(patient.getPatient(sc.nextLine()));
                System.out.println("________________________________________________________________");
                break;
            
            default:
                System.out.println("You did not choose a correct option: Please try again later.");
                break;
        }

        

        System.out.println("________________________________________________________________");

    }

    public void employeeSelection() {
        MedicalEmployee medicalEmployee = new MedicalEmployee();

        System.out.println("Employee Selection: \n1.) New Employee \n2.) Find Employee");

        int i = sc.nextInt();
        switch (i) {
            case 1:
                System.out.println("\t New Employee: ");
                System.out.println(medicalEmployee.newMedicalEmployee());
                System.out.println("________________________________________________________________");
                break;
        
            case 2:
            System.out.println("Please enter Employee Id (INTEGERS ONLY): ");
            int employeeId = sc.nextInt();
            medicalEmployee.getEmployee(employeeId);
            System.out.println("________________________________________________________________");
            break;

            default:
                System.out.println("You did not choose a correct option: Please try again later.");
                System.out.println("________________________________________________________________");
                break;
        }


        


        
        
    }

    public void medicalDeviceSelection() {
        System.out.println("\tLife Support: ");
        MedicalDevice medicalDevice = new MedicalDevice();
        System.out.println("1: Oxygen Ventilation \n2: Heart Rate Monitor");
        int i = sc.nextInt();
        switch (i) {
            case 1:
                medicalDevice.oxygenVentilation();
                System.out.println("________________________________________________________________");
                break;

            case 2:
                medicalDevice.heartRateMonitor();
                System.out.println("________________________________________________________________");
                break;
            
            default:
                System.out.println("You did not choose a correct option: Please try again later.");
                System.out.println("________________________________________________________________");
                break;
        }
    }

    public void medicineSelection() {
        // ..
    }



    public void consultationSelection() {
        Consultation consultation = new Consultation();
        String name;
        System.out.println("Consulation:\nPlease enter the name of the patient to checkout: ");
        name = sc.nextLine();

        System.out.println(consultation.checkoutPatient(name, "Dr.Miller", 
                                        "Exoplotin - 30ct - AE28502334847"));

    }
}
