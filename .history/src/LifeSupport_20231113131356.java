import java.util.Scanner;

public class LifeSupport {
    Scanner sc  = new Scanner(System.in);
    
    public void oxygenVentilation(){
        System.out.println("Welcome to the Oxygen Ventilation - Please enter the number of breaths in 1 minute:  ");
        sc.nextLine();
        System.out.println("Calculating oxygen flow for patient...");
        try {
            wait(2000);
            System.out.println("\nCalculated & ready to start!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void heartRateMonitor(){
        System.out.println("Welcome to the Heart Rate Monitor - Please connect the device to the patient of finger.");
        try {
            wait(2000);
            System.out.println("Thanks! - Reading...");
            for(int i = 0; i < 5; i++){
                System.out.println("BEEP");
                wait(1000);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
