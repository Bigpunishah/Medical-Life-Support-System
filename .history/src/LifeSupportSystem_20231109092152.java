

public class LifeSupportSystem {
    public static void main(String[] args) throws Exception {

        // Create new patient.
        Patient patient = new Patient();
        System.out.println(patient.newPatient());
        patient.newPatient();

        patient.getPatient("vikel@efsc.com");

        patient.updatePatient();

        //Create new medical employee.
        MedicalEmployee employee = new MedicalEmployee();
        employee.newMedicalEmployee();


    }
}
