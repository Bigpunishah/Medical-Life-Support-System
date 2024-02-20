import java.util.Scanner;

public class LifeSupport {
    Scanner sc  = new Scanner(System.in);
    
    public void oxygenVentilation(){
        System.out.println("Welcome to the Oxygen Ventilation - Please enter the number of breaths in 1 minute:  ");
        sc.nextLine();
        System.out.println("Calculating oxygen flow for patient...");
        try {
            wait(1000);
            System.out.println("\nCalculated & ready to start!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void heartRateMonitor(){

    }


}
