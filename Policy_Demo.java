/*
   policy class demo___
*/

import java.util.Scanner; //scanner class to read input

public class Policy_Demo
{
   public static void main(String[] args)
   {
      //variables to hold input
      String pHolderFirstName,pHolderLastName;
      String pHolderSmokingStatus;
      int pHolderAge = 0;
      double pHolderWeight, pHolderHeight;
      String policyNum, providerName;
      
      //Scanner object to read input
      Scanner keyboard = new Scanner(System.in);
      
      //get input from user
      //set policy number
      System.out.print("Please enter the Policy Number: ");
      policyNum = keyboard.nextLine();
      System.out.println();
      
      //set provider name
      System.out.print("Please enter the Provider Name: ");
      providerName = keyboard.nextLine();
      System.out.println();
      
      //set policyholder's first name
      System.out.print("Please enter the Policyholder's First Name: ");
      pHolderFirstName = keyboard.nextLine();
      System.out.println();
      
      //set policyholder's last name
      System.out.print("Please enter the Policyholder's Last Name: ");
      pHolderLastName = keyboard.nextLine();
      System.out.println();
      
      //set policyholder's age 
      System.out.print("Please enter the Policyholder's Age: ");
      pHolderAge = keyboard.nextInt();
      System.out.println();
      
      //buffer for next data entry
      keyboard.nextLine();
      
      //set policyholder's smoking status
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      pHolderSmokingStatus = keyboard.nextLine();
      System.out.println(); 
      
      //set policyholder's height
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      pHolderHeight = keyboard.nextDouble();
      System.out.println();
      
      //set policyholder's weight
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      pHolderWeight = keyboard.nextDouble();
      System.out.println();
      
      //policy object to store data
      Policy policy1 = new Policy(pHolderFirstName, pHolderLastName, pHolderSmokingStatus, pHolderAge, 
                                  pHolderWeight, pHolderHeight, policyNum, providerName);
      
      //print out relevant statements
      System.out.printf("Policy Number: %s\n",policy1.getPolicyNum());
      System.out.printf("Provider Name: %s\n",policy1.getProviderName());
      System.out.printf("Policyholder's First Name: %s\n",policy1.getPolicyholderFirstName());
      System.out.printf("Policyholder's Last Name: %s\n",policy1.getPolicyholderLastName());
      System.out.printf("Policyholder's Age : %d\n",policy1.getPolicyholderAge());
      System.out.printf("Policyholder's Smoking Status: %s\n",policy1.getPolicyholderSmokingStatus());
      System.out.printf("Policyholder's Height: %,.2f inches\n",policy1.getPolicyholderHeight());
      System.out.printf("Policyholder's Weight: %,.2f lb\n",policy1.getPolicyholderWeight());
      System.out.printf("Policyholder's BMI: %,.2f\n",policy1.BMI(pHolderWeight,pHolderHeight));
      System.out.printf("Policy Price: $%,.2f \n",policy1.premium(pHolderAge, pHolderSmokingStatus, pHolderWeight, pHolderHeight));
      
   }
}