import java.util.Scanner;

public class MedicalDevice {
    Scanner sc = new Scanner(System.in);

    // BUG: Used `wait` instead of `Thread.sleep` causing an error.
    public void oxygenVentilation() {
        System.out.println("Welcome to the Oxygen Ventilation - Please enter the number of breaths in 1 minute:  ");
        sc.nextLine();
        System.out.println("Calculating oxygen flow for patient...");
        try {
            Thread.sleep(2000);
            System.out.println("\nCalculated & ready to start!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void heartRateMonitor() {
        System.out.println("Welcome to the Heart Rate Monitor");
        System.out.println("Please enter pulse: ");
        sc.nextInt();

        System.out.println(" - Please connect the device to the patient of finger.");

        try {
            Thread.sleep(2000);
            System.out.println("Connection established! - Reading...");
            for (int i = 0; i < 5; i++) {
                System.out.println("\nBEEP");
                Thread.sleep(1500);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getTidalVolumeRate() {
        return "200";
    }

    public String getABGBloodTest() {
        return "25AB";
    }

    public String getFiO2() {
        return "FiO2";
    }

    public String alert(int rate) {
        if (rate < 15) {
            return "Emergency!";
        }

        return "Rate is above threshold";
    }

}
