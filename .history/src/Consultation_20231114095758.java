public class Consultation {
    
    public String checkoutPatient(String patientName, String doctorName, String mecindePresribed){

        return patientName + " Thanks for your time at the offices of medical services\n\n\n" + 
                                " Today's doctor: " + doctorName + "\n\n" + "Medicication: " + mecindePresribed;
    }
}
