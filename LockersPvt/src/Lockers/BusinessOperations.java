package Lockers;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BusinessOperations {
	public static void listingFile() {
    	File fileDir = new File("C:\\locker");
        //Creating the directory
        		fileDir.mkdir();
       
        
       if(fileDir.isDirectory()){
            List <String>listFile = Arrays.asList(fileDir.list());
            Collections.sort(listFile);
            System.out.println("---------------------------------------");
            System.out.println("Sorting of file in ascending order");
            for(String s:listFile){
                System.out.println(s);
                
            }
            }
            
      

//            just for practice writing in desending order.
//            System.out.println("---------------------------------------");
//            System.out.println("Sorting by filename in descending order");
//            Collections.sort(listFile,Collections.reverseOrder());
//            for(String s:listFile){
//                System.out.println(s);
//            }

        else{
           System.out.println(fileDir.getAbsolutePath() + " is not a directory");
        }BusinessOperations.mainMenu();

  }
    public static void createFile() {
//        Scanner sc = new Scanner(System. in ); //object of Scanner class
//        System.out.println("Enter the file name : ");
//        String name = sc.nextLine(); //variable name to store the file name
        File file = new File("C:\\locker");
        //Creating the directory
        file.mkdir();
        
     
    Scanner sc = new Scanner(System. in ); //object of Scanner class
    System.out.println("Enter the file name : ");
    String name = sc.nextLine(); //variable name to store the file name
        File file1 = new File("C:\\locker\\"+name);

        try {
            if (file1.createNewFile()) {
                System.out.println("File Created! :)");
                BusinessOperations.fileMenuOperations();
            } else {
                System.out.println("File already exists :(");
                BusinessOperations.fileMenuOperations();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }



    
    public static void deleteMethod() {
        String filename;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Name of File to Delete: ");
        filename = scan.nextLine();

        File file= new File("C:\\locker\\"+filename);

        if (file.delete()) {
            System.out.println("File deleted successfully");
            BusinessOperations.fileMenuOperations();
        }
        else {
            System.out.println("File not found !! Please try again. ");
            BusinessOperations.fileMenuOperations();
        }

    }
    public static void searchMethod() {
        System.out.println("Enter the name of the file to Search");
        Scanner s1 = new Scanner(System.in);
        String folderName = s1.next();
        File file = new File("C:\\locker\\"+folderName);

        if (file.exists()) {
            System.out.println("File found!! :)"+"\n"+"This is the file location");
            System.out.println(file.getAbsolutePath());
            BusinessOperations.fileMenuOperations();
        } else {
            System.out.println("Sorry, File Not Found :(");
            BusinessOperations.fileMenuOperations();
        }

//        try {
//            PrintWriter pw = new PrintWriter(file);
//            pw.println("saved");
//            pw.close();
//        } catch (FileNotFoundException e) {
//            System.out.println(e);
//        }

    }
    public static void mainMenu() {
    	System.out.println("Please select one the following");
        System.out.println("1. Listing file names in ascending order ");
        System.out.println("2. Business Operation");
        System.out.println("3. Exit application");
    	
    }
    
    public static void fileMenuOperations() {
    	
    	System.out.println("Please choose one of the following options :");
        System.out.println("1. Create a file");
        System.out.println("2. Delete a File");
        System.out.println("3. Search for a File");
        System.out.println("4. Go Back to Main menu");
        Scanner sc2=new Scanner(System.in);
    	try {
    		
            int choice=sc2.nextInt();
             switch(choice) {
             case 1:
                 System.out.println("You have selected to create file");
                 createFile();

                 break;
             case 2:
                 System.out.println("You have selected to Delete file");
                 deleteMethod();
                 break;
             case 3:
                 System.out.println("You have Selected to search file");
                 searchMethod();
                 break;
             case 4:
                 System.out.println("Go back to MainMenu");
                 BusinessOperations.mainMenu();
                  break;
         }

        }catch(Exception e) {
           System.out.println("Invalid Input!! Please Enter valid number.");
           BusinessOperations.fileMenuOperations();
        }
}
}
