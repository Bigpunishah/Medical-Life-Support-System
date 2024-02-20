public class MedicalRecords {
    String medicineId;
    String medicineName;
    String dosage;
    String frequency;
    String adminInstructions;

    public String getMedicineByName(String medicineName){
        this.medicineName = medicineName;

        return this.medicineName + " has been located in section: 12A-B";
    }

    public String getMedicineById(String medicationId){
        this.medicineId = medicationId;

        return this.medicineName + " has been located in section: 05C-J";

    }
}
