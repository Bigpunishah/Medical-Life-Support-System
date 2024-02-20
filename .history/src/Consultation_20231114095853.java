public class Consultation {
    
    public String checkoutPatient(String patientName, String doctorName, String mecindePresribed){

        System.out.println("Logging the patients information today...");
        
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }


        return patientName + " Thanks for your time at the offices of medical services\n\n\n" + 
                                " Today's doctor: " + doctorName + "\n\n" + "Medicication: " + mecindePresribed;
    }
}
