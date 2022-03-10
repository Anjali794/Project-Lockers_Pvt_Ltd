package Lockers;

import java.util.Scanner;

class LockerPvtLtd {

    public static void main(String[] args) {
        int ch=0, choice=0;
        Scanner sc =new Scanner(System.in);

        System.out.println("\t**********************\n");
        System.out.println("\t Welcome to LOCK IT! ");
        System.out.println("\t By, Locker Pvt Ltd. \n");
        System.out.println("\t**********************");
        System.out.println(" Developer\t: Anjali Verma \n ");

        while(true)
        {
            System.out.println("Please choose one of the following options :");
            System.out.println("1. List Current Files");
            System.out.println("2. Business Operations");
            System.out.println("3. Close Application");
            try{
                ch = sc.nextInt();
            }
            catch(Exception e)
            {
                System.out.println("Null Exception occurred");
            }

            switch (ch) {
                case 1 -> //list all files in ascending order.
                        BusinessOperations.listFiles();
                case 2 -> {
                    System.out.println("Please choose one of the following options :");
                    System.out.println("1. Add a File");

                    System.out.println("2. Delete a File");
                    System.out.println("3. Search for a File");
                    System.out.println("4. Go Back");
                    try {
                        choice = sc.nextInt();
                    } catch (Exception e) {
                        System.out.println("Null Exception occurred");
                    }
                    switch (choice) {
                        case 1 -> {
                            //Creation of a file takes place
                            System.out.println("Enter the name of a file to be created: ");
                            String fileCreate = sc.next();

                            // Calling the function to create the file
                            BusinessOperations.createFile(fileCreate);
                        }
                        case 2 -> {
                            //deletion of a file takes place
                            System.out.print("Enter the name of a file to be deleted: ");
                            String fileDelete = sc.next();

                            // Calling the function to delete the file
                            BusinessOperations.deleteFile(fileDelete);
                        }
                        case 3 -> {
                            //Search for a file takes place
                            System.out.println("Enter the name of a file to be searched: ");
                            String fileSearch = sc.next();

                            // Calling the function to search the file
                            BusinessOperations.searchFile(fileSearch);
                        }
                        case 4 -> {
                            // go back to Main Menu
                            
                        }
                        default ->
                                //In the case of unprecedented input execute this
                                System.out.println("\n Invalid Input Given, Please Repeat the process.\n");
                    }
                }
                case 3 -> {

                    //Voluntarily exiting the application
                    sc.close();
                    System.out.println("\n It was nice having you here! Thank you..");
                    System.exit(1);
                }
                default ->
                        //In the case of unprecedented input execute this
                        System.out.println("\n\n Invalid Input! Please Select within the given range.\n");
            }
        }

    }

}
