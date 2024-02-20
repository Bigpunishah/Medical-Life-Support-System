public class Medicine {
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

    public String getMedicineId() {
        return medicineId;
    }
    
    public void setMedicineId(String medicineId) {
        this.medicineId = medicineId;
    }
    
    public String getMedicineName() {
        return medicineName;
    }
    
    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }
    
    public String getDosage() {
        return dosage;
    }
    
    public void setDosage(String dosage) {
        this.dosage = dosage;
    }
    
    public String getFrequency() {
        return frequency;
    }
    
    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }
    
    public String getAdminInstructions() {
        return adminInstructions;
    }
    
    public void setAdminInstructions(String adminInstructions) {
        this.adminInstructions = adminInstructions;
    }
}
