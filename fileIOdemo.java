//file input-output demo
import java.util.Scanner;
import java.io.*;

public class fileIOdemo{
   
   public static void main(String[] args)throws IOException
   {
      Scanner keyboard = new Scanner(System.in);
      //Menu of actions
      System.out.println("What would you like to do today?\n\tChoose from below\n"
                        + "\t\t1.Add to the existing file\n"
                        + "\t\t2.Create a new file\n"
                        + "\t\t3.Read Grade file");
                        ;
      int action = keyboard.nextInt();
      //validate user input
      while ( action < 1 || action > 3 )
      {
         System.out.print("Choose the valid option: ");
         action = keyboard.nextInt();
      }
      //clear the input space
      keyboard.nextLine();
      //writing to an existing file 
      if (action == 1) {  fileWriter(); }
      //writing to a new file
      else if (action == 2) {  newFile(); }
      //read input file
      else
      {
         readFile();
      }
   
   }
   /**
   this method opens the existing file and write to it
   */
   public static void fileWriter()throws IOException
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter the file you want to open: ");
      File fName = new File(keyboard.nextLine());
         //file name existence validation
         while(!fName.exists())
         {
            System.out.print("File you are looking for doesn't exist.\n"
                             + "Enter the correct file name: ");
            fName = new File(keyboard.nextLine());
         }
      //instance to read file
      Scanner inputFile = new Scanner(fName);
      System.out.println("Existing data in the file \n***********************");
      //print loop
      while(inputFile.hasNextLine())
      {
         System.out.println(inputFile.nextLine());
      }
      //instance to write to file
      FileWriter f = new FileWriter(fName,true);
      PrintWriter outputFile = new PrintWriter(f);
      //loop control
      System.out.println("Input line is open");
      String control = "y";
      do{
         System.out.print("Enter the data here: ");
         String data = keyboard.nextLine();
         outputFile.println(data);
         
         System.out.print("Enter y to continue or any key to quit: ");
         control = keyboard.nextLine();
         
      }while(control.equalsIgnoreCase("y"));
      
      outputFile.close();   
   }
   /**
   this method creates a new file and write to it
   */
   public static void newFile()throws IOException
   {
         Scanner keyboard = new Scanner(System.in);
         File file;
         System.out.print("Enter the file name you want to create: ");
         file = new File(keyboard.nextLine());
            while(file.exists())
            {
               System.out.print("File name exists. Enter a new name: ");
               file = new File(keyboard.nextLine());
            }
         //instance to write to new file
         PrintWriter outputFile = new PrintWriter(file);
         String control = null;
         
         System.out.println("Data input line is open");
         do
         {
            System.out.println("Enter the data here: ");
            String data = keyboard.nextLine();
            outputFile.println(data);
            System.out.print("Enter \"y\" to continue or any key to quit: ");
            control = keyboard.nextLine();
         }while (control.equalsIgnoreCase(control));
         
         outputFile.close();   
   }
   /**
   this method reads the input file
   */
   public static void readFile()throws IOException
   {     
         Scanner keyboard = new Scanner(System.in);
         File file;
         System.out.print("Enter the file name you want to read: ");
         file = new File(keyboard.nextLine());
            while(!file.exists())
            {
               System.out.print("File name does not exist. Enter a new name: ");
               file = new File(keyboard.nextLine());
            }
         //instance to read the input file
         Scanner inputFile = new Scanner(file);
         
         System.out.println("Opening file....");
         
         while(inputFile.hasNextLine())
         {
            String fName = inputFile.next();
            String lName = inputFile.next();
            int test1 = inputFile.nextInt();
            int test2 = inputFile.nextInt();
            int test3 = inputFile.nextInt();
            double avg = (test1 + test2 + test3) / 3.0;
            
            System.out.println("Name:\t\t\t" + fName + " " + lName);
            System.out.println("Test1: " + test1);
            System.out.println("Test2: " + test2);
            System.out.println("Test3: " + test3);
            System.out.printf("\nAverage:\t\t\t%,.2f\n", avg);
            if (avg <= 100 && avg >= 90) {System.out.println("Grade:\t\t\tA\n");}
            else { System.out.println("Please pack up and leave\n");}

         }
                  
         inputFile.close();   
   }

}