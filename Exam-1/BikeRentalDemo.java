/*
   this program test the BikeRental class
*/
import java.util.Scanner;
import java.util.ArrayList;

public class BikeRentalDemo
{
   public static void main(String[] args)
   {
      //list to store individual customer's info
      ArrayList<BikeRental> customerLst = new ArrayList<BikeRental>();
      
      //previous processed rental units
      final int previousTotal = 37;
      //variables to store input
      String id, fName;
      int age = 0;
      double mileage = 0.0;
      char another;
   
      //scanner object to read input
      Scanner keyboard = new Scanner(System.in);
      
      //loop to get customer's info
      do
      {
         System.out.print("Enter bike's ID: ");
         id = keyboard.nextLine();
         System.out.print("Enter the name of the person renting the bike: ");
         fName = keyboard.nextLine();
         System.out.print("Enter the age of the person renting the bike: ");
         age = keyboard.nextInt();
            //input validation
            while (age < 0)
            {
               System.out.print("Please enter the valid age: ");
               age = keyboard.nextInt();
            }
         System.out.print("Enter the number of the miles that the bike was ridden: ");
         mileage = keyboard.nextDouble();
            //input validation
            while (mileage < 0)
            {
               System.out.print("Please enter the valid mileage: ");
               mileage = keyboard.nextDouble();
            }
         //create an object based off of entry and add to the list
         customerLst.add(new BikeRental(id, fName, age, mileage));
         
         //prompt for additional customer
         System.out.println();
         keyboard.nextLine();
         System.out.print("Do you wish to enter information for another bike rental(Y/N)? ");
         another = keyboard.nextLine().toLowerCase().charAt(0);
         System.out.println();
      }
      //another round of prompt validation
      while (another == 'y');
      
      //summary statement for each customer
      System.out.println("Bike Rental Tracking Service\n");
      for (int i = 0; i < customerLst.size(); i++)
      {
         //assign object to customer
         BikeRental customer = customerLst.get(i);
         //summary print out function
         summary(customer);
      }
      //number of rental print-out
      System.out.printf("Total number of bike rentals processed to this point: %d"
                        ,(previousTotal + customerLst.size()) );
   
   }
   /**
   this method print out summary from plug-in object
   @param obj BikeRental object
   */
   public static void summary(BikeRental obj)
   {
         System.out.printf("Bike ID: %s\n",obj.getID());
         System.out.printf("Renter Name: %s\n",obj.getFullName());
         System.out.printf("Renter Age: %d\n",obj.getAge());
         System.out.printf("Miles Ridden: %,.2f\n",obj.getMileage());
         System.out.printf("Cost of Rental: $%,.2f\n",obj.getRentalPrice());
         System.out.println();
   }  
}