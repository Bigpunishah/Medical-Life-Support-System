public class MedicalRecords {
    String medicineId;
    String medicineName;
    String dosage;
    String frequency;
    String adminInstructions;

    public String getMedicine(String medicineName){
        this.medicineName = medicineName;


        return this.medicineName + " has been located in section: 12A-B";
    }
}
