/*
   policy class demo
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
   
      //policy object to store data
      Policy policy1 = new Policy();
      
      //Scanner object to read input
      Scanner keyboard = new Scanner(System.in);
      
      //get input from user
      //set policy number
      System.out.print("Please enter the Policy Number: ");
      policyNum = keyboard.nextLine();
      policy1.setPolicyNum(policyNum);
      System.out.println();
      
      //set provider name
      System.out.print("Please enter the Provider Name: ");
      providerName = keyboard.nextLine();
      policy1.setProviderName(providerName);
      System.out.println();
      
      //set policyholder's first name
      System.out.print("Please enter the Policyholder's First Name: ");
      pHolderFirstName = keyboard.nextLine();
      policy1.setPolicyholderFirstName(pHolderFirstName);
      System.out.println();
      
      //set policyholder's last name
      System.out.print("Please enter the Policyholder's Last Name: ");
      pHolderLastName = keyboard.nextLine();
      policy1.setPolicyholderLastName(pHolderLastName);
      System.out.println();
      
      //set policyholder's age 
      System.out.print("Please enter the Policyholder's Age: ");
      pHolderAge = keyboard.nextInt();
      policy1.setPolicyholderAge(pHolderAge);
      System.out.println();
      
      //buffer for next data entry
      keyboard.nextLine();
      
      //set policyholder's smoking status
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      pHolderSmokingStatus = keyboard.nextLine();
      policy1.setPolicyholderSmokingStatus(pHolderSmokingStatus);
      System.out.println(); 
      
      //set policyholder's height
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      pHolderHeight = keyboard.nextDouble();
      policy1.setPolicyholderHeight(pHolderHeight);
      System.out.println();
      
      //set policyholder's weight
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      pHolderWeight = keyboard.nextDouble();
      policy1.setPolicyholderWeight(pHolderWeight);
      System.out.println();
      
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