import java.util.Scanner;

public class Menu {
    
    public void MenuDashboard(){
        System.out.println("Hello, welcome to the life support system!");
        System.out.println("Here you are to select what services you would like!\n\n\n\n");

        Scanner sc = new Scanner(System.in);

        System.out.println("\tMENU:\n \t1.) New Patient\n \t2.) New Employee\n \t3.) Connect lifesupport system\n \t4.) Medicine");
        int i = sc.nextInt();

        switch (i) {
            case 1:
                
                break;
        
            case 2:

                break;
            
            case 3:
            
                break;

            case 4:

                break;
        }



        sc.close();
    }
}
