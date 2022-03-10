package Lockers;

import java.util.Scanner;

class LockerPvtLtd {

       public static void main(String[] args) {

        System.out.println("\t**********************\n");
        System.out.println("\t Welcome to LOCK IT! ");
        System.out.println("\t By, Locker Pvt Ltd. \n");
        System.out.println("\t**********************");
        System.out.println(" Developer\t: Anjali Verma \n ");
        
 Scanner sc=new Scanner(System.in);
        BusinessOperations.mainMenu();
        while(true) {
            
            
                try {
        	
              int option=sc.nextInt();
              switch(option) {
                case 1 :
                    System.out.println("These are the files in ascending");
                    BusinessOperations.listingFile();
                    break;
                case 2 :
                	BusinessOperations.fileMenuOperations();
                	break;
                    
                case 3 :
            	   System.out.println("Have a nice day!! Thanks for using locker ");
                   System.out.println("Application closed");

                   System.exit(option);
                    break;
                default:
                    System.out.println("Oops!! please enter the valid number");
                    break;

            }
        }catch(Exception e){
          System.out.println("Oops!! Please Enter valid number");
         LockerPvtLtd.main(args);
     }
}
}

	
}
