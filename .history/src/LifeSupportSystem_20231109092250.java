

public class LifeSupportSystem {
    public static void main(String[] args) throws Exception {

        // Create new patient.
        Patient patient = new Patient();
        System.out.println(patient.newPatient());

        System.out.println(patient.getPatient("vikel@efsc.com"));

        System.out.println(patient.updatePatient());

        //Create new medical employee.
        MedicalEmployee employee = new MedicalEmployee();
        System.out.println(employee.newMedicalEmployee());


    }
}
