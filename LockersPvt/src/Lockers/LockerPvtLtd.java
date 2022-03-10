package Lockers;

import java.util.Scanner;

class LockerPvtLtd {
	public static void main(String[] args) {

        System.out.println("**********************");
        System.out.println("Welcome to LOCK ME :) ");
        System.out.println(" LockerMe.com");
        System.out.println("Develop by Anjali");
        System.out.println("**********************");
        
 Scanner sc=new Scanner(System.in);
        BusinessOperations.mainMenu();
        while(true) {
            
            
                try {
        	
              int option=sc.nextInt();
              switch(option) {
                case 1 :// listing the files in ascending order.
                    System.out.println("These are the files in ascending");
                    BusinessOperations.listingFile();
                    break;
                case 2 :
                	BusinessOperations.fileMenuOperations();
                	break;
                    
                case 3 :
            	   System.out.println("Thank you for using Lockers, Have a nice day!! ");
                   System.out.println("Application closed");

                   System.exit(option);
                    break;
                default:
                    System.out.println(" Invalid Input !! please enter valid number");
                    break;

            }
        }catch(Exception e){
          System.out.println("Invalid Input !! Please Enter valid number");
          LockerPvtLtd.main(args);
     }
}
}

}
